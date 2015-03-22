package com.anneke.projecteuler;

import java.util.Arrays;

public class CircularPrimes {

    public static void main(String[] args) {
        int size = 1000000;
        //int size = 100;
        boolean[] primes = new boolean[size];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i < size; i++) {
            if (primes[i]) {
                for (int j = 2; i * j < size; j++) {
                    primes[i * j] = false;
                }
            }
        }

        int count = 4;
        for (int i = 11; i < size; i++) {
            if (primes[i]) {
                int[] circulars = getCircular(i);
                boolean isCircularPrime = true;
                for (int j = 0; j < circulars.length; j++) {
                    if (circulars[j] != 0) {
                        if (!primes[circulars[j]]) {
                            isCircularPrime = false;
                        }
                    }
                }
                if (isCircularPrime) {
                    System.out.println(i);
                    count ++;
                }
            }
        }
        System.out.println(count);
    }

    private static int[] getCircular(int i) {
        String number = Integer.toString(i);
        String newNumber = number;
        int[] numbers = new int[number.length()];
        int k = 0;
        do {
            newNumber = newNumber.substring(1) + newNumber.substring(0, 1);
            //System.out.println(newNumber);
            numbers[k] = Integer.parseInt(newNumber);
            k++;
        } while (!number.equals(newNumber));

        return numbers;
    }
}

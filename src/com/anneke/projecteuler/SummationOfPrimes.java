package com.anneke.projecteuler;

import java.util.Arrays;

public class SummationOfPrimes {
    public static void main(String[] args) {
        int size = 2000000;
        //int size = 10;
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

        long sum = 0;
        for (int i = 2; i < size; i++) {
            if (primes[i]) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
    
}

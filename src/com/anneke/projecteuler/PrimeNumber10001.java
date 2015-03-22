package com.anneke.projecteuler;

import java.util.Arrays;

public class PrimeNumber10001 {

    public static void main(String[] args) {
        int size = 120000;
        boolean[] primes = new boolean[size];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i * i <= size; i++) {
            if (primes[i]) {

                for (int j = 2; i * j < size; j++) {
                    primes[i * j] = false;

                }
            }
        }

        int count = 0;
        for (int i = 2; i < size; i++) {
            if (primes[i]) {
                count++;
                if (count == 10001) {
                    System.out.println(i);
                }

            }
        }
        //System.out.println(count);

    }
}
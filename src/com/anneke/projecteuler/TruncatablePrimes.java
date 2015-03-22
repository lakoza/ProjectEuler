package com.anneke.projecteuler;

import java.util.Arrays;

public class TruncatablePrimes {

    public static void main(String[] args) {
        int size = 1200000;
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
//                String prime = String.valueOf(i);
//                if (prime.endsWith("7") || prime.endsWith("3") ) {
//                    if (prime.startsWith("7") || prime.startsWith("3") ) {
//                        if (prime.indexOf("4") < 0 && prime.indexOf("0") < 0 && prime.indexOf("2") < 0 && prime.indexOf("5") < 0
//                                && prime.indexOf("6") < 0  && prime.indexOf("8") < 0) {
//                            System.out.println(i);
//                        }
//                    }
//                }
                System.out.println(i);
                count++;
                if (count == 10001) {
                    System.out.println(i);
                }

            }
        }
        //System.out.println(count);

    }
}

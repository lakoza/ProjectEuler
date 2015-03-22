package com.anneke.projecteuler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class PandigitalPrime {

    public static final char[][] pandigits = new char[][]{
        "1".toCharArray(),
        "12".toCharArray(),
        "123".toCharArray(),
        "1234".toCharArray(),
        "12345".toCharArray(),
        "123456".toCharArray(),
        "1234567".toCharArray(),
        "12345678".toCharArray(),
        "123456789".toCharArray(),};

    public static final int size = 987654321;

    public static void main(String[] args) {

        for (int i = size; i > 0; i -= 2) {
            //if ( i%100001 == 0) System.out.println(i);
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                continue;
            }
            char[] numbers = String.valueOf(i).toCharArray();
            Arrays.sort(numbers);
            if (Arrays.equals(numbers, pandigits[numbers.length - 1])) {
                if (isPrime(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private static boolean isPandigit(int number) {
        Set set = new HashSet();
        while (number > 0) {
            if (!set.add(number % 10)) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}

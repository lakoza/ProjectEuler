package com.anneke.projecteuler;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        //long number =  600851475143L;
        long number = 6857;
        long i = 2;
        while ((number / i != 1) || (number % i != 0)) {
            if (number % i == 0) {
                number = number / i;
            } else {
                i++;
            }
        }
        System.out.println(i);

    }
}

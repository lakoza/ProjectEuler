package com.anneke.projecteuler;

public class SumSquareDifference {

    public static void main(String[] args) {
        int sum = 0;
        int square = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i; 
            square += i*i;
        }
        System.out.println(sum*sum);
        System.out.println(square);
        System.out.println(sum*sum-square);

    }

}

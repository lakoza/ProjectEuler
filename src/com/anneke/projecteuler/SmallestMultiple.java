package com.anneke.projecteuler;

public class SmallestMultiple {

    public static void main(String[] args) {
        int sum = 1;
        int square = 0;
        long result = 1;
        for (int i = 1; i <= 10; i++) {
            //sum *= i;
            //square += i * i;
            result = lcm(result, i);
        }
        //System.out.println(sum * sum);
        System.out.println(result);
        //System.out.println(sum * sum - square);

    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    private static long lcm(long[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }

}

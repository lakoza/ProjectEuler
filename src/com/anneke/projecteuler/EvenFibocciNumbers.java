package com.anneke.projecteuler;

public class EvenFibocciNumbers {

    public static void main(String[] args) {
        int limit = 4000000; 
        int sum = 0;
        for ( int i=1; i < limit; i++ ){
            int number = fibonacci(i);
            if ( number > limit ) break;
            //System.out.println(number);
            if ( number%2 == 0 ){
                sum += number;
            }
        }
        System.out.println(sum);

    }
    
    private static int fibonacci(int number){
        if ( number == 1 ){
            return 1;
        } else if ( number == 2 ){
            return 2;
        } else {
            return fibonacci(number-1) + fibonacci(number-2);
        }
    }
}

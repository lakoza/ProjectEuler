package com.anneke.projecteuler;

public class LargestPalindrom {

    public static void main(String[] args) {
        long largest = 1;
        int mult1 = 0;
        int mult2 = 0;
        for (int i = 1; i < 999; i++) {
            for (int j = 1; j < 999; j++) {
                long mult = i * j;
                //long mult = 990099; 
                char[] array = Long.toString(mult).toCharArray();
                int length = array.length;
                if (length % 2 == 0) {
                    boolean polindrom = true;
                    for (int k = 0; k < length / 2; k++) {
                        if (array[k] != array[length - 1 - k]) {
                            polindrom = false;
                        }
                    }
                    if (polindrom && (mult > largest)) {
                        largest = mult;
                        mult1 = i;
                        mult2 =j;
                    }
                }
            }

        }
        System.out.println(mult1);
        System.out.println(mult2);
        System.out.println(largest);
        

    }

}

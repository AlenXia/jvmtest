package com;

import java.util.Arrays;

//1.递归方法
public class test2 {
    //1.用递归方法
    public static void main(String[] args) {
        for (int counter = 1; counter <= 10000; counter++){
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
        }
    }
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
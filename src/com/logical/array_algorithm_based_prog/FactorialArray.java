package com.logical.array_algorithm_based_prog;

public class FactorialArray 
{
    public static int factorial(int n) 
   {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) 
   {
        int[] arr = {3, 4, 5};

        for (int n : arr)
            System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}
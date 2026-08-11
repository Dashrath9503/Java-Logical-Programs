package com.logical.array_algorithm_based_prog;

public class ArrayLCM 
{
    public static int gcd(int a, int b) 
   {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) 
   {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) 
   {
        int[] arr = {4, 6, 8};
        int result = arr[0];

        for (int i = 1; i < arr.length; i++)
            result = lcm(result, arr[i]);

        System.out.println("LCM of array elements = " + result);
    }
}
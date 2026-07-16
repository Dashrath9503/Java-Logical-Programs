package com.logical.array_basic;

public class SumArray 
{
    public static void main(String[] args) 
   {
        int[] arr = {5, 15, 10, 0, 9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) 
	{
            sum += arr[i];
        }

        System.out.println("Sum of all elements = " + sum);
    }
}
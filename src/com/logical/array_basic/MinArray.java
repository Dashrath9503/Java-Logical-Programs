package com.logical.array_basic;

public class MinArray 
{
    public static void main(String[] args) 
   {
        int[] arr = {7, 2, 9, 4, 1};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) 
	{
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println("Minimum element = " + min);
    }
}
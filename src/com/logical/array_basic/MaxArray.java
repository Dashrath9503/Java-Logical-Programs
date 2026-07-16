package com.logical.array_basic;

public class MaxArray 
{
    public static void main(String[] args) 
   {
        int[] arr = {3, 8, 1, 9, 5};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) 
	{
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Maximum element = " + max);
    }
}
package com.logical.array_advance_logicalprograms;

import java.util.Arrays;

public class MinAbsPair 
{
    public static void main(String[] args) 
   {
        int[] arr = {5, 2, 3, 7, 9};
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        int a = 0, b = 0;

        for (int i = 1; i < arr.length; i++) 
	{
            int diff = arr[i] - arr[i - 1];

            if (diff < minDiff) 
	    {
                minDiff = diff;
                a = arr[i - 1];
                b = arr[i];
            }
        }

        System.out.println("Pair with min absolute difference = (" + a + ", " + b + ")");
        System.out.println("Minimum difference = " + minDiff);
    }
}
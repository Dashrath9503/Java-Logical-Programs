package com.logical.array_bonus_prog;

public class MaxDifference 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int min = arr[0], maxDiff = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) 
	{
            maxDiff = Math.max(maxDiff, arr[i] - min);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Maximum Difference: " + maxDiff);
    }
}
package com.logical.array_pair_triplet_subarray_programs;

public class MinSubarraySum 
{
    public static void main(String[] args) 
   {
        int[] arr = {3, -4, 2, -3, -1, 7, -5};
        int minSoFar = arr[0];
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) 
	{
            currSum = Math.min(arr[i], currSum + arr[i]);
            minSoFar = Math.min(minSoFar, currSum);
        }

        System.out.println("Minimum subarray sum = " + minSoFar);
    }
}
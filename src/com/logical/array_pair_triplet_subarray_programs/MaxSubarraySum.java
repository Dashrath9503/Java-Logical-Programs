package com.logical.array_pair_triplet_subarray_programs;

public class MaxSubarraySum 
{
    public static void main(String[] args) 
   {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSoFar = arr[0];
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) 
	{
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSoFar = Math.max(maxSoFar, currSum);
        }

        System.out.println("Maximum subarray sum = " + maxSoFar);
    }
}
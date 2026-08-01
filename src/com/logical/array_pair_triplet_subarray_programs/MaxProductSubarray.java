package com.logical.array_pair_triplet_subarray_programs;

public class MaxProductSubarray 
{
    public static void main(String[] args) 
    {
        int[] arr = {2, 3, -2, 4};
        int maxProd = arr[0];
        int minProd = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) 
	{
            int temp = maxProd;
            maxProd = Math.max(arr[i], Math.max(arr[i] * maxProd, arr[i] * minProd));
            minProd = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * minProd));
            result = Math.max(result, maxProd);
        }

        System.out.println("Maximum product subarray = " + result);
    }
}
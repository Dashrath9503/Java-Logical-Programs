package com.logical.array_pair_triplet_subarray_programs;

public class AllPairs 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 2, 3, 4};

        System.out.println("All pairs:");

        for (int i = 0; i < arr.length; i++) 
	{
            for (int j = i + 1; j < arr.length; j++) 
	    {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}

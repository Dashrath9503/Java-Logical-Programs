package com.logical.array_pair_triplet_subarray_programs;

public class PairSumK 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;
        int count = 0;

        for (int i = 0; i < arr.length; i++) 
	{
            for (int j = i + 1; j < arr.length; j++) 
	    {
                if (arr[i] + arr[j] == k)
                    count++;
            }
        }

        System.out.println("Number of pairs with sum " + k + " = " + count);
    }
}
package com.logical.array_pair_triplet_subarray_programs;

public class TripletSumK 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 10;

        System.out.println("Triplets with sum " + k + ":");

        for (int i = 0; i < arr.length - 2; i++) 
	{
            for (int j = i + 1; j < arr.length - 1; j++) 
	    {
                for (int l = j + 1; l < arr.length; l++) 
		{
                    if (arr[i] + arr[j] + arr[l] == k)
		    {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[l] + ")");
		    }
                }
            }
        }
    }
}
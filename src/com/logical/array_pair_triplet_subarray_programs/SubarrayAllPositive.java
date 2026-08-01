package com.logical.array_pair_triplet_subarray_programs;

public class SubarrayAllPositive 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, -3, 4, 5, 6, -2, 7};
        int start = 0, maxLen = 0, s = 0, e = 0;

        for (int i = 0; i < arr.length; i++) 
	{
            if (arr[i] < 0) 
	    {
                start = i + 1;
            } 
	    else 
	   {
                if (i - start + 1 > maxLen) 
		{
                    maxLen = i - start + 1;
                    s = start;
                    e = i;
                }
            }
        }

        System.out.print("Longest positive subarray: ");

        for (int i = s; i <= e; i++)
            System.out.print(arr[i] + " ");
    }
}
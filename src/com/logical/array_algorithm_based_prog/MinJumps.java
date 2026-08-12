package com.logical.array_algorithm_based_prog;

public class MinJumps 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 3, 1, 1, 4};
        int jumps = 0, currEnd = 0, farthest = 0;

        for (int i = 0; i < arr.length - 1; i++) 
	{
            farthest = Math.max(farthest, i + arr[i]);
            if (i == currEnd) 
	    {
                jumps++;
                currEnd = farthest;
            }
        }

        System.out.println("Minimum jumps = " + jumps);
    }
}
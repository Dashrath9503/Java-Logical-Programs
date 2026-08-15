package com.logical.array_bonus_prog;

import java.util.Arrays;

public class SmallestMissingPositive 
{
    public static void main(String[] args) 
   {
        int[] arr = {0, -1, 3, 1};
        Arrays.sort(arr);
        int missing = 1;
        for (int x : arr) 
	{
            if (x == missing) 
	       missing++;
        }
        System.out.println("Smallest Missing Positive: " + missing);
    }
}
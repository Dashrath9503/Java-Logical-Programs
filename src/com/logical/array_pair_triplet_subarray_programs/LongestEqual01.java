package com.logical.array_pair_triplet_subarray_programs;

import java.util.HashMap;

public class LongestEqual01 
{
    public static void main(String[] args) 
   {
        int[] arr = {0, 1, 0, 1, 1, 0, 0};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) 
	{
            sum += (arr[i] == 0) ? -1 : 1;
            if (sum == 0)
                maxLen = i + 1;
            if (map.containsKey(sum))
                maxLen = Math.max(maxLen, i - map.get(sum));
            else
                map.put(sum, i);
        }

        System.out.println("Longest subarray length with equal 0s and 1s = " + maxLen);
    }
}
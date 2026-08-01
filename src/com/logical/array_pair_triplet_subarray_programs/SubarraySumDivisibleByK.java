package com.logical.array_pair_triplet_subarray_programs;

import java.util.HashMap;

public class SubarraySumDivisibleByK 
{
    public static void main(String[] args) 
   {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;
        for (int num : arr) 
	{
            sum += num;
            int rem = ((sum % k) + k) % k;

            if (map.containsKey(rem))
	    {
                count += map.get(rem);
	    }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        System.out.println("Number of subarrays with sum divisible by " + k + " = " + count);
    }
}
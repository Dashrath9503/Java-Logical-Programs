package com.logical.array_algorithm_based_prog;

public class TrappingRainwater 
{
    public static void main(String[] args) 
   {
        int[] height = {3, 0, 2, 0, 4};
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = height[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], height[i]);

        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], height[i]);

        int water = 0;
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - height[i];

        System.out.println("Trapped water = " + water);
    }
}
package com.logical.array_algorithm_based_prog;

public class MaxCircularSubarray 
{
    public static int kadane(int[] arr) 
   {
        int max = arr[0], curr = arr[0];

        for (int i = 1; i < arr.length; i++) 
	{
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) 
   {
        int[] arr = {8, -4, 3, -5, 4};
        int maxNormal = kadane(arr);

        if (maxNormal < 0) 
	{
            System.out.println("Maximum circular sum = " + maxNormal);
            return;
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) 
	{
            sum += arr[i];
            arr[i] = -arr[i];
        }

        int maxCircular = sum + kadane(arr);

        System.out.println("Maximum circular subarray sum = " + Math.max(maxNormal, maxCircular));
    }
}
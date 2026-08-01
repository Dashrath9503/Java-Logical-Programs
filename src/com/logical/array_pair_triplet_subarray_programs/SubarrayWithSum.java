package com.logical.array_pair_triplet_subarray_programs;

public class SubarrayWithSum 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int k = 33;
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) 
	{
            sum += arr[end];
            while (sum > k && start < end) 
	    {
                sum -= arr[start++];
            }
            if (sum == k) 
	    {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found");
    }
}
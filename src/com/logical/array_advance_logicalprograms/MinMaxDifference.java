package com.logical.array_advance_logicalprograms;

import java.util.Arrays;

public class MinMaxDifference 
{
    public static void main(String[] args) 
   {
        int[] arr = {10, 2, 8, 6, 4};
        Arrays.sort(arr);

        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++)
            smallest = Math.min(smallest, arr[i] - arr[i - 1]);

        int largest = arr[arr.length - 1] - arr[0];

        System.out.println("Smallest difference = " + smallest);
        System.out.println("Largest difference = " + largest);
    }
}
package com.logical.sorting_algorithms;

public class CountingSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int max = 8;
        countingSort(arr, max);

        System.out.println("Sorted array (Counting Sort):");

        for (int num : arr)
            System.out.print(num + " ");
    }

     public static void countingSort(int[] arr, int max) 
     {
        int[] count = new int[max + 1];
        int[] output = new int[arr.length];

        for (int num : arr)
            count[num]++;

        for (int i = 1; i <= max; i++)
            count[i] += count[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) 
	{
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }
}

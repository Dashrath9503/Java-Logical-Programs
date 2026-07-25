package com.logical.sorting_algorithms;

public class SelectionSort 
{
    public static void main(String[] args) 
   {
        int[] arr = {29, 10, 14, 37, 13};

        for (int i = 0; i < arr.length - 1; i++) 
	{
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) 
	   {
                if (arr[j] < arr[minIndex])
		{
                    minIndex = j;
		}
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array (Selection Sort):");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
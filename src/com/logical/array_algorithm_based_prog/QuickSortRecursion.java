package com.logical.array_algorithm_based_prog;

public class QuickSortRecursion 
{
    public static int partition(int[] arr, int low, int high) 
   {
        int pivot = arr[high], i = low - 1;

        for (int j = low; j < high; j++) 
	{
            if (arr[j] < pivot) 
	    {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) 
   {
        if (low < high) 
	{
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) 
   {
        int[] arr = {9, 4, 6, 2, 7};
        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");

        for (int x : arr)
            System.out.print(x + " ");
    }
}
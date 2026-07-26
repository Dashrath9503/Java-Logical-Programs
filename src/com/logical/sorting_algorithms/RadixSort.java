package com.logical.sorting_algorithms;

public class RadixSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);

        System.out.println("Sorted array (Radix Sort):");
        for (int num : arr)
            System.out.print(num + " ");
    }

    public static void radixSort(int[] arr) 
    {
        int max = getMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10)
            countingSort(arr, exp);
    }

    public static int getMax(int[] arr) 
    {
        int max = arr[0];
        for (int num : arr)
	{
            if (num > max)
	    {
                max = num;
 	    }
        
	}
        return max;
    }

     public static void countingSort(int[] arr, int exp) 
{
        int[] output = new int[arr.length];
        int[] count = new int[10];

        for (int num : arr)
            count[(num / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) 
	{
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }
}

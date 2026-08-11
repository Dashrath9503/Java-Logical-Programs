package com.logical.array_algorithm_based_prog;

public class BinarySearchRecursion 
{
    public static int binarySearch(int[] arr, int low, int high, int key) 
   {
        if (low > high) return -1;
        int mid = (low + high) / 2;

        if (arr[mid] == key) 
	    return mid;

        else if (arr[mid] > key)
            return binarySearch(arr, low, mid - 1, key);

        else
            return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) 
   {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 8;
        int index = binarySearch(arr, 0, arr.length - 1, key);

        System.out.println(index != -1 ? "Element found at index " + index : "Not found");
    }
}
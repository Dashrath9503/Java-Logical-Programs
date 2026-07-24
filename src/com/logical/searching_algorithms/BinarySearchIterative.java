package com.logical.searching_algorithms;

public class BinarySearchIterative 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int index = binarySearch(arr, key);

        if (index != -1)
	{
            System.out.println("Element found at index " + index);
	}
        else
	{
            System.out.println("Element not found");
	}
    }

   public static int binarySearch(int[] arr, int key) 
   {
        int low = 0, high = arr.length - 1;

        while (low <= high) 
	{
            int mid = (low + high) / 2;

            if (arr[mid] == key)
	    {
                return mid;
	    }
            else if (arr[mid] < key)
	    {
                low = mid + 1;
	    }
            else
	    {
                high = mid - 1;
	    }
        }
        return -1;
    }
}
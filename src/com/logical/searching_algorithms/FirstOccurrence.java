package com.logical.searching_algorithms;

public class FirstOccurrence 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 4, 4, 4, 6, 8, 8};
        int key = 4;
        int index = findFirst(arr, key);

        if (index != -1)
            System.out.println("First occurrence of " + key + " is at index " + index);
        else
            System.out.println("Element not found");
    }

   public static int findFirst(int[] arr, int key) 
   {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) 
	{
            int mid = (low + high) / 2;

            if (arr[mid] == key) 
	    {
                result = mid;
                high = mid - 1; // search left side for first occurrence
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

        return result;
    }
}
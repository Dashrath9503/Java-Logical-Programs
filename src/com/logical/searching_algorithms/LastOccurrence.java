package com.logical.searching_algorithms;

public class LastOccurrence 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 4, 4, 4, 6, 8, 8};
        int key = 4;
        int index = findLast(arr, key);

        if (index != -1)
	{
            System.out.println("Last occurrence of " + key + " is at index " + index);
	}
        else
	{
            System.out.println("Element not found");
	}
    }

   public static int findLast(int[] arr, int key) 
  {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) 
	{
            int mid = (low + high) / 2;

            if (arr[mid] == key) 
	    {
                result = mid;
                low = mid + 1; // search right side for last occurrence
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
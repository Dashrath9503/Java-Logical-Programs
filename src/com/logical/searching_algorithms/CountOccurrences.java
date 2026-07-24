package com.logical.searching_algorithms;

public class CountOccurrences
{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 4, 4, 6, 8, 8};
        int key = 4;

        int first = findFirst(arr, key);
        int last = findLast(arr, key);

        if (first == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Count of " + key + " = " + (last - first + 1));
        }
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
                high = mid - 1;
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

    public static int findLast(int[] arr, int key)
    {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high)
        {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
            {
                result = mid;
                low = mid + 1;
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
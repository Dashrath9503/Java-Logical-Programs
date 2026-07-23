package com.logical.array_basic;

public class FindIndex 
{
    public static void main(String[] args) 
   {
        int[] arr = {5, 10, 15, 20, 25};
        int key = 20;
        int index = -1;

        for (int i = 0; i < arr.length; i++) 
	{
            if (arr[i] == key) 
	    {
                index = i;
                break;
            }
        }

        if (index != -1)
	{
            System.out.println("Element " + key + " found at index " + index);
	}
        else
	{
            System.out.println("Element not found");
	}
    }
}
package com.logical.array_advance_logicalprograms;

public class DuplicateNumber 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 4, 2, 2};

        for (int i = 0; i < arr.length; i++) 
	{
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) 
	    {
                System.out.println("Duplicate number = " + Math.abs(arr[i]));
                break;
            }
            arr[index] = -arr[index];
        }
    }
}
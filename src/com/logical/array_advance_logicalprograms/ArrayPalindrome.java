package com.logical.array_advance_logicalprograms;

public class ArrayPalindrome 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 2, 3, 2, 1};
        boolean palindrome = true;

        for (int i = 0; i < arr.length / 2; i++) 
	{
            if (arr[i] != arr[arr.length - 1 - i]) 
	    {
                palindrome = false;
                break;
            }
        }

        System.out.println("Array is palindrome: " + palindrome);
    }
}
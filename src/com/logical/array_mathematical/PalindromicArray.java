package com.logical.array_mathematical;

public class PalindromicArray 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) 
	{
            if (arr[i] != arr[j]) 
	   { 
	      isPalindrome = false; 
	      break; 
	   }
        }
        System.out.println(isPalindrome ? "Palindromic Array" : "Not Palindromic");
    }
}
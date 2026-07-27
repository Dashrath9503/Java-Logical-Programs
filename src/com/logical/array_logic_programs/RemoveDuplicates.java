package com.logical.array_logic_programs;

import java.util.Arrays;

public class RemoveDuplicates 
{
   public static void main(String[] args) 
   {
       int[] arr = {1, 2, 2, 3, 4, 4, 5};
       Arrays.sort(arr);
       int j = 0;

       for (int i = 0; i < arr.length - 1; i++) 
	{
           if (arr[i] != arr[i + 1])
               arr[j++] = arr[i];
       }
       arr[j++] = arr[arr.length - 1];

       System.out.println("Array after removing duplicates:");

       for (int i = 0; i < j; i++)
           System.out.print(arr[i] + " ");
   }
}
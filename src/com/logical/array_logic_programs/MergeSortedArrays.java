package com.logical.array_logic_programs;

public class MergeSortedArrays 
{
   public static void main(String[] args) 
   {
       int[] a = {1, 3, 5};
       int[] b = {2, 4, 6};
       int[] merged = new int[a.length + b.length];

       int i = 0, j = 0, k = 0;
       while (i < a.length && j < b.length) 
	{
           if (a[i] < b[j])
               merged[k++] = a[i++];
           else
               merged[k++] = b[j++];
       }

       while (i < a.length)
	{
           merged[k++] = a[i++];
	}
       while (j < b.length)
	{
           merged[k++] = b[j++];
	
	}

       System.out.println("Merged array:");

       for (int num : merged)
           System.out.print(num + " ");
   }
}
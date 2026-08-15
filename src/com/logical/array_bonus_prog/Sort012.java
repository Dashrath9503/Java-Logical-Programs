package com.logical.array_bonus_prog;

public class Sort012 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 0, 2, 1, 1, 0};
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) 
	{
            if (arr[mid] == 0) 
	    { 
	      int t = arr[low]; 
	      arr[low++] = arr[mid]; 
	      arr[mid++] = t; 
	    }
            else if (arr[mid] == 1) 
		mid++;
            else 
	    { 
	       int t = arr[mid]; 
	       arr[mid] = arr[high]; 
	       arr[high--] = t; 
	    }
        }
        for (int x : arr) 
	   System.out.print(x + " ");
    }
}
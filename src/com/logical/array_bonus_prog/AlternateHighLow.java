package com.logical.array_bonus_prog;

import java.util.Arrays;

public class AlternateHighLow 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 3, 2, 5, 4, 6};
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i += 2) 
	{
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int x : arr) 
	   System.out.print(x + " ");
    }
}
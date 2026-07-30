package com.logical.array_logic_programs;

public class SwapAlternate 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length - 1; i += 2) 
	{
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.println("After swapping alternate elements:");

        for (int num : arr)
            System.out.print(num + " ");
    }
}
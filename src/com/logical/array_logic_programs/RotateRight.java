package com.logical.array_logic_programs;

public class RotateRight 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 2, 3, 4, 5};
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--)
	{
            arr[i] = arr[i - 1];
	}
        arr[0] = last;

        System.out.println("After right rotation:");

        for (int num : arr)
            System.out.print(num + " ");
    }
}
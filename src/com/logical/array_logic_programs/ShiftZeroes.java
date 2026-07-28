package com.logical.array_logic_programs;

public class ShiftZeroes 
{
    public static void main(String[] args) 
   {
        int[] arr = {0, 1, 9, 8, 0, 4, 0, 2};
        int index = 0;

        for (int num : arr) 
	{
            if (num != 0)
                arr[index++] = num;
        }

        while (index < arr.length)
	{
            arr[index++] = 0;
	}

        System.out.println("After shifting zeroes:");

        for (int num : arr)
            System.out.print(num + " ");
    }
}
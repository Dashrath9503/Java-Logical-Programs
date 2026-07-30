package com.logical.array_logic_programs;

public class DeleteAtPosition 
{
    public static void main(String[] args) 
   {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2;
        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) 
	{
            if (i != pos)
                newArr[j++] = arr[i];
        }

        System.out.println("After deletion:");

        for (int num : newArr)
            System.out.print(num + " ");
    }
}
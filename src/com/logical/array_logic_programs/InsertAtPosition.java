package com.logical.array_logic_programs;

public class InsertAtPosition 
{
    public static void main(String[] args) 
   {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2, value = 25;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) 
	{
            if (i == pos)
                newArr[i] = value;
            else
                newArr[i] = arr[j++];
        }

        System.out.println("After insertion:");

        for (int num : newArr)
            System.out.print(num + " ");
    }
}
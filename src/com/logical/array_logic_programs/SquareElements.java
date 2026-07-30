package com.logical.array_logic_programs;

public class SquareElements 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 4, 6, 8};

        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] * arr[i];

        System.out.println("Array after squaring elements:");

        for (int num : arr)
            System.out.print(num + " ");
    }
}
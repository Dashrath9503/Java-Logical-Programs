package com.logical.array_advance_logicalprograms;

public class NextGreatest 
{
    public static void main(String[] args) 
   {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) 
	{
            int temp = arr[i];
            arr[i] = max;

            if (temp > max)
                max = temp;
        }

        System.out.println("Array after replacement:");

        for (int num : arr)
            System.out.print(num + " ");
    }
}
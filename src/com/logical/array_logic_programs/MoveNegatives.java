package com.logical.array_logic_programs;

public class MoveNegatives {

    public static void main(String[] args) 
   {
        int[] arr = {1, -2, 3, -4, 5, -6};
        int j = 0;

        for (int i = 0; i < arr.length; i++) 
	{
            if (arr[i] < 0) 
	    {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println("After moving negatives:");

        for (int num : arr)
            System.out.print(num + " ");
    }


}

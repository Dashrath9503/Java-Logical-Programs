package com.logical.array_logic_programs;

public class UniqueElements 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        System.out.println("Unique elements:");

        for (int i = 0; i < arr.length; i++) 
	{
            boolean unique = true;

            for (int j = 0; j < arr.length; j++) 
	    {
                if (i != j && arr[i] == arr[j]) 
		{
                    unique = false;
                    break;
                }
            }
            if (unique)
                System.out.print(arr[i] + " ");
        }
    }
}
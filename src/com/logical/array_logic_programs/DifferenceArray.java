package com.logical.array_logic_programs;

public class DifferenceArray 
{
    public static void main(String[] args) 
   {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 6};

        System.out.println("Difference of arrays (A - B):");

        for (int i : a) 
	{
            boolean found = false;
            for (int j : b) 
	   {
                if (i == j) 
		{
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.print(i + " ");
        }
    }
}
package com.logical.array_mathematical;

public class CommonElements 
{
    public static void main(String[] args) 
   {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        System.out.print("Common Elements: ");

        for (int x : a) 
	{
            for (int y : b) 
	   {
                if (x == y) System.out.print(x + " ");
            }
        }
    }
}
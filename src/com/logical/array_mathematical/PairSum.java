package com.logical.array_mathematical;

public class PairSum 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;

        System.out.println("Pairs with sum " + k + ":");

        for (int i = 0; i < arr.length; i++) 
	{
            for (int j = i + 1; j < arr.length; j++) 
	   {
                if (arr[i] + arr[j] == k)
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}
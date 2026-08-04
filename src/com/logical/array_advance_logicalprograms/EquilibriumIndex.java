package com.logical.array_advance_logicalprograms;

public class EquilibriumIndex 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 3, 5, 2, 2};
        int total = 0, leftSum = 0;

        for (int num : arr)
            total += num;

        for (int i = 0; i < arr.length; i++) 
	{
            total -= arr[i];
            if (leftSum == total) 
	    {
                System.out.println("Equilibrium index = " + i);
                return;
            }
            leftSum += arr[i];
        }

        System.out.println("No equilibrium index found");
    }
}
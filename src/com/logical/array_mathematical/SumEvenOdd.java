package com.logical.array_mathematical;

public class SumEvenOdd 
{
    public static void main(String[] args) 
   {
        int[] arr = {3, 5, 2, 8, 7, 4};
        int evenSum = 0, oddSum = 0;

        for (int x : arr) 
	{
            if (x % 2 == 0) 
	       evenSum += x;
            else 
	       oddSum += x;
        }
        System.out.println("Even Sum: " + evenSum);
        System.out.println("Odd Sum: " + oddSum);
    }
}
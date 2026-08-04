package com.logical.array_advance_logicalprograms;

public class PeakElement 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 20, 4, 1, 0};

        for (int i = 0; i < arr.length; i++) 
	{
            boolean leftOk = (i == 0) || (arr[i] > arr[i - 1]);
            boolean rightOk = (i == arr.length - 1) || (arr[i] > arr[i + 1]);
            if (leftOk && rightOk) 
	    {
                System.out.println("Peak element = " + arr[i]);
                break;
            }
        }
    }
}
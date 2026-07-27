package com.logical.array_logic_programs;

public class SecondSmallest 
{
    public static void main(String[] args) 
    {
        int[] arr = {9, 2, 5, 1, 7};
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int num : arr) 
	{
            if (num < first) 
	    {
                second = first;
                first = num;
            } 
	    else if (num < second && num != first) 
	    {
                second = num;
            }
        }

        System.out.println("Second smallest element = " + second);
    }
}
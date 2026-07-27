package com.logical.array_logic_programs;

public class SecondLargest 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 8, 12, 7, 6};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) 
	{
            if (num > first) 
	    {
                second = first;
                first = num;
            } 
	   else if (num > second && num != first) 
	   {
                second = num;
            }
        }

        System.out.println("Second largest element = " + second);
    }
}


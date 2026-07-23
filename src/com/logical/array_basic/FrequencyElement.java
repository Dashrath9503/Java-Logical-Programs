package com.logical.array_basic;

public class FrequencyElement 
{
    public static void main(String[] args) 
    {
        int[] arr = {2, 3, 2, 5, 2, 4, 3};
        int key = 2;
        int count = 0;

        for (int num : arr) 
	{
            if (num == key)
	    {
                count++;
	    }
        }

        System.out.println("Frequency of " + key + " = " + count);
    }
}
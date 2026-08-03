package com.logical.array_advance_logicalprograms;

public class MajorityElement 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) 
	{
            if (arr[i] == candidate)
                count++;
            else
                count--;

            if (count == 0) 
	   {
                candidate = arr[i];
                count = 1;
            }
        }

        // Verify

        count = 0;
        for (int num : arr)
            if (num == candidate)
                count++;

        if (count > arr.length / 2)
            System.out.println("Majority element = " + candidate);
        else
            System.out.println("No majority element");
    }
}
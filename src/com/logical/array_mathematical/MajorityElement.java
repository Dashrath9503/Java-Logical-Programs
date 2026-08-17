package com.logical.array_mathematical;

public class MajorityElement 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int count = 0, candidate = -1;

        for (int x : arr) 
	{
            if (count == 0) candidate = x;
            count += (x == candidate) ? 1 : -1;
        }

        // Verify candidate
        count = 0;
        for (int x : arr) if (x == candidate) count++;

        if (count > arr.length / 2)
            System.out.println("Majority Element: " + candidate);
        else
            System.out.println("No Majority Element");
    }
}
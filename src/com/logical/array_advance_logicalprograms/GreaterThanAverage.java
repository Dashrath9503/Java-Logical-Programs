package com.logical.array_advance_logicalprograms;

public class GreaterThanAverage 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int num : arr)
            sum += num;

        double avg = (double) sum / arr.length;
        int count = 0;

        for (int num : arr)
            if (num > avg)
                count++;

        System.out.println("Average = " + avg);
        System.out.println("Count > average = " + count);
    }
}
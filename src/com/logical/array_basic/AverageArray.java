package com.logical.array_basic;

public class AverageArray 
{
   public static void main(String[] args) 
  {
       int[] arr = {10, 20, 30, 40, 50};
       int sum = 0;

       for (int num : arr) 
	{
           sum += num;
       }

       double avg = (double) sum / arr.length;
       System.out.println("Average = " + avg);
   }
}
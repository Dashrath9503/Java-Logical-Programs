package com.logical.array_bonus_prog;

public class ArithmeticProgression 
{
    public static void main(String[] args) 
   {
        int[] arr = {3, 6, 9, 12, 15};
        int d = arr[1] - arr[0];
        boolean isAP = true;

        for (int i = 2; i < arr.length; i++) 
	{
            if (arr[i] - arr[i - 1] != d) 
	   { 
	      isAP = false; 
	      break; 
	   }
        }
        System.out.println(isAP ? "Arithmetic Progression" : "Not Arithmetic Progression");
    }
}
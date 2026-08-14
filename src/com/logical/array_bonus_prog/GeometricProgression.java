package com.logical.array_bonus_prog;

public class GeometricProgression 
{
    public static void main(String[] args) 
   {
        int[] arr = {2, 6, 18, 54};
        boolean isGP = true;

        if (arr[0] == 0) 
	   isGP = false;
        else 
	{
            int r = arr[1] / arr[0];
            for (int i = 2; i < arr.length; i++) 
	    {
                if (arr[i - 1] * r != arr[i]) 
		{ 
		   isGP = false; 
		   break; 
		}
            }
        }
        System.out.println(isGP ? "Geometric Progression" : "Not Geometric Progression");
    }
}
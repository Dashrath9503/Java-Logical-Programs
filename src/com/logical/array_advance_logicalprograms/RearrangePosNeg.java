package com.logical.array_advance_logicalprograms;


public class RearrangePosNeg 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, -2, 3, -4, -1, 4, -3, 2};
        int[] result = new int[arr.length];
        int pos = 0, neg = 1;

        for (int num : arr) 
	{
            if (num >= 0 && pos < arr.length) 
	    {
                result[pos] = num;
                pos += 2;
            } 
	    else if (num < 0 && neg < arr.length) 
	    {
                result[neg] = num;
                neg += 2;
            }
        }

        System.out.println("Rearranged array:");

        for (int n : result)
            System.out.print(n + " ");
    }
}
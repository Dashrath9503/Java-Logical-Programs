package com.logical.intermediate;

import java.util.*;

public class LargestSmallestDigit 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), max = 0, min = 9;

        while (n != 0) 
	{
            int d = n % 10;
            if (d > max) max = d;
            if (d < min) min = d;
            n /= 10;
        }
        System.out.println("Largest: " + max + ", Smallest: " + min); sc.close();
    }
}
package com.logical.basic;

import java.util.*;

public class PrimeRange 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range (start end): ");
        int start = sc.nextInt(), end = sc.nextInt();

        for (int i = start; i <= end; i++) 
	{
            boolean prime = i > 1;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) 
		{
		   prime = false; break; 
		}
            if (prime)
                System.out.print(i + " ");
            sc.close();
        }
    }
}
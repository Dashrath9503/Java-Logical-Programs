package com.logical.intermediate;

import java.util.*;

public class PerfectInRange 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start and end: ");
        int start = sc.nextInt(), end = sc.nextInt();

        System.out.println("Perfect numbers:");
        for (int n = start; n <= end; n++) 
	{
            int sum = 0;
            for (int i = 1; i <= n / 2; i++)
                if (n % i == 0) sum += i;
            if (sum == n) System.out.print(n + " ");
        }
        sc.close();
    }
}
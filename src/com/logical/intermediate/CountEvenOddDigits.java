package com.logical.intermediate;

import java.util.*;

public class CountEvenOddDigits 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), even = 0, odd = 0;
        while (n != 0) 
	{
            int d = n % 10;
            if (d % 2 == 0) even++; else odd++;
            n /= 10;
        }
        System.out.println("Even digits: " + even + ", Odd digits: " + odd); sc.close();
    }
}
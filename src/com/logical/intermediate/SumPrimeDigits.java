package com.logical.intermediate;

import java.util.*;

public class SumPrimeDigits 
{
    static boolean isPrime(int n) 
   {
        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), sum = 0;

        while (n != 0) 
	{
            int d = n % 10;
            if (isPrime(d)) sum += d;
            n /= 10;
        }
        System.out.println("Sum of prime digits = " + sum); sc.close();
    }
}
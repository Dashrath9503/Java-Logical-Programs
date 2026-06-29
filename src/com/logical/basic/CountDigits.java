package com.logical.basic;

import java.util.*;

public class CountDigits 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt(), count = 0;
        while (n != 0) 
	{
            n /= 10;
            count++;
        }
        System.out.println("Digits = " + count); sc.close();
    }
}
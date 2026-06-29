package com.logical.basic;

import java.util.*;

public class LCM 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        int gcd = a, temp = b;

        while (temp != 0) 
	{
            int t = temp;
            temp = gcd % temp;
            gcd = t;
        }
        int lcm = (a * b) / gcd;
        System.out.println("LCM = " + lcm); sc.close();
    }
}
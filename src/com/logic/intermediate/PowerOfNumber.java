package com.logic.intermediate;

import java.util.*;

public class PowerOfNumber 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt(), exp = sc.nextInt();
        long result = 1;

        for (int i = 1; i <= exp; i++) result *= base;
        System.out.println("Result = " + result); sc.close();
    }
}
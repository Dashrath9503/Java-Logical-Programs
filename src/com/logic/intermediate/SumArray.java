package com.logic.intermediate;

import java.util.*;

public class SumArray 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) sum += (arr[i] = sc.nextInt());
        System.out.println("Sum = " + sum); sc.close();
    }
}
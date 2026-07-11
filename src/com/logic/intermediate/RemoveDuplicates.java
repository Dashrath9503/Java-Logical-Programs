package com.logic.intermediate;

import java.util.*;

public class RemoveDuplicates 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < n; i++)
            if (i == 0 || arr[i] != arr[i - 1])
                System.out.print(arr[i] + " "); sc.close();
    }
}
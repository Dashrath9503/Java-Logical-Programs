package com.logic.intermediate;

import java.util.*;

public class SumOddRange 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end: ");
        int start = sc.nextInt(), end = sc.nextInt(), sum = 0;

        for (int i = start; i <= end; i++)
            if (i % 2 != 0) sum += i;
        System.out.println("Sum of odd numbers = " + sum); sc.close();
    }
}
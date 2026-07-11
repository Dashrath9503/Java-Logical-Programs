package com.logical.intermediate;

import java.util.*;

public class SumEvenRange 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start and end: ");
        int start = sc.nextInt(), end = sc.nextInt(), sum = 0;

        for (int i = start; i <= end; i++)
            if (i % 2 == 0) sum += i;
        System.out.println("Sum of even numbers = " + sum); sc.close();
    }
}
package com.logical.Logical_and_Pattern;

import java.util.*;

public class NumericPyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++) 
            	System.out.print(" ");
            for(int k=1;k<=i;k++) 
            	System.out.print(k + " ");
            System.out.println();
        }
        sc.close();
    }
}
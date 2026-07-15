package com.logical.Logical_and_Pattern;

import java.util.*;

public class FibonacciPattern 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n=sc.nextInt();
        int a=0,b=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a + " ");
                int c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
        sc.close();
    }
}
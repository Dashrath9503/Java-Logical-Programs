package com.logical.Logical_and_Pattern;

import java.util.*;

public class XPattern 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==i || j==n-i+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
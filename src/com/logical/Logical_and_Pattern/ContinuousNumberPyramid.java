package com.logical.Logical_and_Pattern;

import java.util.*;

public class ContinuousNumberPyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n=sc.nextInt();
        int num=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
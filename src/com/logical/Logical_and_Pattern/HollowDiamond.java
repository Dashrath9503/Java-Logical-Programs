package com.logical.Logical_and_Pattern;

import java.util.*;

public class HollowDiamond 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            	System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
            {
                if(k==1 || k==2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=n;j>i;j--) 
            	System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
            {
                if(k==1 || k==2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

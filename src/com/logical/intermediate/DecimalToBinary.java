package com.logical.intermediate;

import java.util.*;

public class DecimalToBinary 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        String bin = "";

        while (n > 0) 
	{
            bin = (n % 2) + bin;
            n /= 2;
        }
        System.out.println("Binary = " + bin); sc.close();
    }
}

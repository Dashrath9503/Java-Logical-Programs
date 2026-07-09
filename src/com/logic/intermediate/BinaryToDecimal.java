package com.logic.intermediate;

import java.util.*;

public class BinaryToDecimal 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String bin = sc.nextLine();
        int dec = 0, pow = 0;
        for (int i = bin.length() - 1; i >= 0; i--)
            dec += (bin.charAt(i) - '0') * Math.pow(2, pow++);
        System.out.println("Decimal = " + dec); sc.close();
    }
}
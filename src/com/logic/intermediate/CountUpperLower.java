package com.logic.intermediate;

import java.util.*;

public class CountUpperLower 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int upper = 0, lower = 0;
        for (char ch : s.toCharArray()) 
	{
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
        }
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower); sc.close();
    }
}
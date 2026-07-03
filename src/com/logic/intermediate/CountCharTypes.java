package com.logic.intermediate;

import java.util.*;

public class CountCharTypes 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int space = 0, digit = 0, alpha = 0;

        for (char ch : s.toCharArray()) 
	{
            if (Character.isLetter(ch)) alpha++;
            else if (Character.isDigit(ch)) digit++;
            else if (Character.isWhitespace(ch)) space++;
        }
        System.out.println("Alphabets: " + alpha + ", Digits: " + digit + ", Spaces: " + space); sc.close();
    }
}
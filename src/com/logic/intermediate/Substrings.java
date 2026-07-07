package com.logic.intermediate;

import java.util.*;

public class Substrings 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Substrings:");
        for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j <= s.length(); j++)
                System.out.println(s.substring(i, j)); sc.close();
    }
}
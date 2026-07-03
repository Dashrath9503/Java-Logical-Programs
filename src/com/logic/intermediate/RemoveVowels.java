package com.logic.intermediate;

import java.util.*;

public class RemoveVowels 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        s = s.replaceAll("(?i)[aeiou]", "");
        System.out.println("Without vowels: " + s);sc.close();
    }
}
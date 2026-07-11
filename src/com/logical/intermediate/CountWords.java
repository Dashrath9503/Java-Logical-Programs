package com.logical.intermediate;

import java.util.*;

public class CountWords 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        System.out.println("Word count = " + words.length); sc.close();
    }
}
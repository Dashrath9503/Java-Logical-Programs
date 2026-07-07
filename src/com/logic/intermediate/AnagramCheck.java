package com.logic.intermediate;

import java.util.*;

public class AnagramCheck 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.equals(a1, a2) ? "Anagram" : "Not Anagram"); sc.close();
    }
}
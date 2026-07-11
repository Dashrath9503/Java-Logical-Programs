package com.logical.intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine().replaceAll("\\s+", "");

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        System.out.println("Sorted: " + new String(arr)); sc.close();
    }
}

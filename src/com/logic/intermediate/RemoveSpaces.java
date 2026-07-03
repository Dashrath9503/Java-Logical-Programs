package com.logic.intermediate;


import java.util.*;

public class RemoveSpaces 
{
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Without spaces: " + s.replaceAll("\\s+", "")); sc.close();
    }
}
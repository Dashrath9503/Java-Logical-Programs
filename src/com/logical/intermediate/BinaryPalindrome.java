package com.logical.intermediate;

import java.util.*;

public class BinaryPalindrome 
{
    static String toBinary(int n) 
   {
        String bin = "";
        while (n > 0) 
	{
	   bin = (n % 2) + bin; n /= 2; 
	}
        return bin;
    }
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        String bin = toBinary(n);
        String rev = new StringBuilder(bin).reverse().toString();

        System.out.println(bin.equals(rev) ? "Binary Palindrome" : "Not Binary Palindrome"); sc.close();
    }
}
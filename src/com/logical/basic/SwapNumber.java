package com.logical.basic;

import java.util.Scanner;

public class SwapNumber {
	
	public static void main(String[] args)
	{
	
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		 System.out.println("After swapping: a = " + a + ", b = " + b);
		 sc.close();
	}

}

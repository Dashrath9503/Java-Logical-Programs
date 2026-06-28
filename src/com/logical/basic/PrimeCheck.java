package com.logical.basic;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		boolean prime = n>1;
		
		
		for(int i=2;i<=n/2;i++)
		{
			if (n % i == 0) 
		    {
	                prime = false;
	                break;
	            }
	        }
	        System.out.println(prime ? "Prime" : "Not Prime");
	        sc.close();

	}

}

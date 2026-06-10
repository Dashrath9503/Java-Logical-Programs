package com.logical.basic;

import java.util.Scanner;

public class Even_Odd 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No.: ");
		
		Integer no=sc.nextInt();
		
		if(no%2==0)
			System.out.println(no+" is Even");
		else
			System.out.println(no+" is Odd");
		sc.close();
	}
}

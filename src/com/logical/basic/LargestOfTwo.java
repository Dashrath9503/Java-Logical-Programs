package com.logical.basic;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) 
	{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter A First Number: ");
	Integer no1= Integer.parseInt(sc.nextLine());
	
	System.out.println("Enter A Second Number: ");
	Integer no2= sc.nextInt();
	
	System.out.println("Largest = " + (no1 > no2 ? no1 : no2));

	}

}

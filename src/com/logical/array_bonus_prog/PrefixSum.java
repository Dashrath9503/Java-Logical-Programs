 package com.logical.array_bonus_prog;

 public class PrefixSum 
 {
     public static void main(String[] args) 
    {
         int[] arr = {2, 4, 6, 8, 10};
         int[] prefix = new int[arr.length];
         prefix[0] = arr[0];

         for (int i = 1; i < arr.length; i++) 
 	    prefix[i] = prefix[i - 1] + arr[i];

         for (int x : prefix) 
 	    System.out.print(x + " ");
     }
 }

package com.logical.array_mathematical;

public class MissingNumber 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;  // range 1 to n
        int expected = n * (n + 1) / 2;
        int actual = 0;

        for (int x : arr) actual += x;

        System.out.println("Missing Number: " + (expected - actual));
    }
}
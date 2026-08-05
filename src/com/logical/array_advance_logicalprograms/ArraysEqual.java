package com.logical.array_advance_logicalprograms;

import java.util.Arrays;

public class ArraysEqual 
{
    public static void main(String[] args) 
   {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};

        boolean equal = Arrays.equals(a, b);
        System.out.println("Arrays are equal: " + equal);
    }
}
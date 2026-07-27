package com.logical.array_logic_programs;

import java.util.Arrays;

public class KthElement 
{
    public static void main(String[] args) 
   {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        Arrays.sort(arr);
        System.out.println(k + "rd smallest element = " + arr[k - 1]);
        System.out.println(k + "rd largest element = " + arr[arr.length - k]);
    }
}
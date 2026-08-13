package com.logical.array_algorithm_based_prog;

public class ProductExceptSelf 
{
    public static void main(String[] args) 
   {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++)
            left[i] = left[i - 1] * arr[i - 1];

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)
            right[i] = right[i + 1] * arr[i + 1];

        for (int i = 0; i < n; i++)
            prod[i] = left[i] * right[i];

        System.out.print("Product array: ");

        for (int x : prod)
            System.out.print(x + " ");
    }
}
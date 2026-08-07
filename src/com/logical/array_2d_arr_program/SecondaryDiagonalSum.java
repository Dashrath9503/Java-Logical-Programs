package com.logical.array_2d_arr_program;

public class SecondaryDiagonalSum 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0, n = matrix.length;

        for (int i = 0; i < n; i++)
            sum += matrix[i][n - 1 - i];

        System.out.println("Sum of secondary diagonal = " + sum);
    }
}
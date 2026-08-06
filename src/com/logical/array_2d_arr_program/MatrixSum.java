package com.logical.array_2d_arr_program;

public class MatrixSum 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int sum = 0;

        for (int[] row : matrix)
            for (int val : row)
                sum += val;

        System.out.println("Sum of all elements = " + sum);
    }
}
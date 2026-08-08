package com.logical.array_2d_arr_program;

public class LowerTriangleSum 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {
            {1, 0, 0},
            {2, 3, 0},
            {4, 5, 6}
        };
        int sum = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j <= i; j++)
                sum += matrix[i][j];

        System.out.println("Sum of lower triangle = " + sum);
    }
}
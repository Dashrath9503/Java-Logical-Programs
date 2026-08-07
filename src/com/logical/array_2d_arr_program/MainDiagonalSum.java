package com.logical.array_2d_arr_program;

public class MainDiagonalSum 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {{1, 2}, {3, 4}};
        int sum = 0;

        for (int i = 0; i < matrix.length; i++)
            sum += matrix[i][i];

        System.out.println("Sum of main diagonal = " + sum);
    }
}
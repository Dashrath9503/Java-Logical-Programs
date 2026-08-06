package com.logical.array_2d_arr_program; 

public class MatrixInputDisplay 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix:");

        for (int[] row : matrix) 
	{
            for (int val : row)
	   {
                System.out.print(val + " ");
	   }
            System.out.println();
        }
    }
}
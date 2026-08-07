package com.logical.array_2d_arr_program;

public class MatrixMultiplication 
{
    public static void main(String[] args) 
   {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int[][] B = {{7, 8}, {9, 10}, {11, 12}};
        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 3; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("Product of matrices:");

        for (int[] row : C) 
	{
            for (int val : row)
	   {
                System.out.print(val + " ");
	   }
            System.out.println();
        }
    }
}
package com.logical.array_2d_arr_program;

public class MatrixSubtraction 
{
    public static void main(String[] args) 
   {
        int[][] A = {{5, 7}, {9, 4}};
        int[][] B = {{2, 3}, {1, 6}};
        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                C[i][j] = A[i][j] - B[i][j];

        System.out.println("Difference of matrices:");

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
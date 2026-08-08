package com.logical.array_2d_arr_program;

public class RotateMatrix90 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) 
	    {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        // Reverse each row
        for (int i = 0; i < n; i++) 
	{
            for (int j = 0, k = n - 1; j < k; j++, k--) 
	   {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

        System.out.println("Matrix rotated by 90°:");

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
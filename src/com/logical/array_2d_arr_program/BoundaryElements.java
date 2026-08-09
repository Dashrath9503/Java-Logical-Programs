package com.logical.array_2d_arr_program;

public class BoundaryElements 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int n = matrix.length;

        System.out.println("Boundary elements:");

        for (int i = 0; i < n; i++) 
	{
            for (int j = 0; j < n; j++) 
	   {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print(matrix[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
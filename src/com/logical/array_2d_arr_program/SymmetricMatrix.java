package com.logical.array_2d_arr_program;

public class SymmetricMatrix 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        boolean symmetric = true;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] != matrix[j][i])
                    symmetric = false;

        System.out.println("Matrix is " + (symmetric ? "symmetric" : "not symmetric"));
    }
}
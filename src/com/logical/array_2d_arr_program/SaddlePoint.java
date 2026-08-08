package com.logical.array_2d_arr_program;

public class SaddlePoint 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {
            {3, 8, 9},
            {7, 5, 6},
            {9, 2, 1}
        };
        int n = matrix.length;
        boolean found = false;

        for (int i = 0; i < n; i++) 
	{  
            int minRow = matrix[i][0], colIndex = 0;

            for (int j = 1; j < n; j++)
	    {
                if (matrix[i][j] < minRow) 
		{
                    minRow = matrix[i][j];
                    colIndex = j;
                }
	     }
            int k;

            for (k = 0; k < n; k++)
                if (matrix[k][colIndex] > minRow)
                    break;

            if (k == n) 
	    {
                System.out.println("Saddle point = " + minRow);
                found = true;
            }
        }

        if (!found)
            System.out.println("No saddle point found");
    }
}
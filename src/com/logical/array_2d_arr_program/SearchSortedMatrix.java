package com.logical.array_2d_arr_program;

public class SearchSortedMatrix 
{
    public static void main(String[] args) 
   {
        int[][] matrix = {
            {1, 4, 7},
            {8, 9, 10},
            {11, 12, 15}
        };
        int key = 10, n = matrix.length, i = 0, j = n - 1;
        boolean found = false;

        while (i < n && j >= 0) 
	{
            if (matrix[i][j] == key) 
	    {
                found = true;
                break;
            }
            if (matrix[i][j] > key)
                j--;
            else
                i++;
        }

        System.out.println(found ? "Element found" : "Not found");
    }
}
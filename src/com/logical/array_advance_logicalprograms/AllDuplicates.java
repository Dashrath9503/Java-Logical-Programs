package com.logical.array_advance_logicalprograms;

import java.util.*;

public class AllDuplicates 
{
    public static void main(String[] args) 
   {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) 
	{
            if (!set.add(num))
                duplicates.add(num);
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
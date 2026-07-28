package com.logical.array_logic_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class UnionArray 
{
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);

        System.out.println("Union of arrays: " + set);
    }
}
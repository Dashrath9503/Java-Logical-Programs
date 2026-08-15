package com.logical.array_bonus_prog;

import java.util.HashSet;

public class LongestConsecutive 
{
    public static void main(String[] args) 
   {
        int[] arr = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) 
	    set.add(x);

        int longest = 0;
        for (int x : set) 
	{
            if (!set.contains(x - 1)) 
	    {
                int len = 1;

                while (set.contains(x + len)) 
		{
		     len++;
		}
                longest = Math.max(longest, len);
            }
        }
        System.out.println("Longest Sequence Length: " + longest);
    }
}
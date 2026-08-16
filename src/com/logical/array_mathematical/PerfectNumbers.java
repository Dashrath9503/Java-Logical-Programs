package com.logical.array_mathematical;

public class PerfectNumbers 
{
    public static boolean isPerfect(int n) 
   {
        if (n < 2) return false;
        int sum = 1;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum == n;
    }

    public static void main(String[] args) 
   {
        int[] arr = {6, 28, 12, 15, 496};

        System.out.print("Perfect Numbers: ");

        for (int x : arr) if (isPerfect(x)) System.out.print(x + " ");
    }
}
package com.logical.sorting_algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort 
{
    public static void main(String[] args) 
    {
        float[] arr = {0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f, 0.23f, 0.68f};
        bucketSort(arr);

        System.out.println("Sorted array (Bucket Sort):");
        for (float num : arr)
            System.out.print(num + " ");
    }

     public static void bucketSort(float[] arr) 
     {
        int n = arr.length;

        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new List[n];

        for (int i = 0; i < n; i++)
            buckets[i] = new ArrayList<>();

        for (float num : arr) 
	{
            int index = (int) (n * num);
            buckets[index].add(num);
        }

        for (int i = 0; i < n; i++)
            Collections.sort(buckets[i]);

        int idx = 0;

        for (List<Float> bucket : buckets)
	{
            for (float num : bucket)
	    {
                arr[idx++] = num;
	    }
	}
    }
}
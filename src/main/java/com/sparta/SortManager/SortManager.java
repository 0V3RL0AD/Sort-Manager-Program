package com.sparta.SortManager;

import java.util.Arrays;

public class SortManager {
    
    public int[] bubbleSort(int[] arr)
    {
        // loop to access each number in the array
        for (int i = 0; i < arr.length - 1; i++)
        {
            // loop to compare numbers in the array
            for (int y = 0; y < arr.length - i - 1; y++)
            {
                // compare numbers next to each other
                if (arr[y] > arr[y+1])
                {
                    //swap the numbers if they are not in order
                    int tempN = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = tempN;
                }
            }
        }
        return arr;
    }

    public int[] mergeSort(int[] arr, int size)
    {
        if (size > 1)
        {
            int mid = size / 2;
            int[] FirstSection = Arrays.copyOfRange(arr, 0, mid);
            FirstSection = this.mergeSort(FirstSection, mid);
            int[] SecondSection = Arrays.copyOfRange(arr, mid, size);
            SecondSection = this.mergeSort(SecondSection, size - mid);
            arr = this.mergeArray(FirstSection, SecondSection, mid, size - mid);
        }
        return arr;
    }
    
    public int[] mergeArray(int[] firstSection, int[] secondSection, int x, int y)
    {
        int[] arr = new int[x + y];
        int i = 0;
        int f = 0;
        int s = 0;
        while (f < x && s < y)
        {
            if (firstSection[f] < secondSection[s])
            {

                arr[i++] = firstSection[f++];
            }
            else
            {
                arr[i++] = secondSection[s++];
            }
        }
        while (f < x)
        {
            arr[i++] = firstSection[f++];
        }
        while (s < y)
        {
            arr[i++] = secondSection[s++];
        }
        return arr;
    }
}

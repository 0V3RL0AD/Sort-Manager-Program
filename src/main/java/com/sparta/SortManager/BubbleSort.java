package com.sparta.SortManager;

public class BubbleSort implements Sort{
    public int[] sort(int[] arr)
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
}

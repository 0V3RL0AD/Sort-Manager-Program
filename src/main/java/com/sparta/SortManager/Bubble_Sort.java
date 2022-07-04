package com.sparta.SortManager;

public class Bubble_Sort {
    public void bubbleSort(int[] array)
    {
        // loop to access each number in the array
        for (int i = 0; i < array.length - 1; i++)
        {
            // loop to compare numbers in the array
            for (int y = 0; y < array.length - i - 1; y++)
            {
                // compare numbers next to each other
                if (array[y] > array[y+1])
                {
                    //swap the numbers if they are not in order
                    int tempN = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = tempN;
                }

            }
        }
    }
}
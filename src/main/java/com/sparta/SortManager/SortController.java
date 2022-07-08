package com.sparta.SortManager;

import java.util.Arrays;

public class SortController {
    private SortData sortData;
    private SortManager sortManager;

    public SortController()
    {
        sortData = new SortData();
        sortManager = new SortManager();
    }
    public String[] Sort(String sortMethod)
    {
        String[] output = new String[2];
        if (sortMethod.equals("bubbles"))
        {
            //convert the user array into a string and print it out to the console
            output[0] = "Here are your numbers: " + Arrays.toString(sortData.getData());
            //send the user created array to the Bubble Sort class
            sortData.setData(sortManager.bubbleSort(sortData.getData()));
            //after Bubble Sort, print out the new array that has been sorted
            //called User since it is still originally the User's
            output[1] = "Sorted Array in Ascending Order: " + Arrays.toString(sortData.getData());
        }
        else if (sortMethod.equals("merge"))
        {
            output[0] = "Here are your numbers: " + Arrays.toString(sortData.getData());
            sortData.setData(sortManager.mergeSort(sortData.getData(),sortData.getData().length));
            output[1] = "Sorted Array in Ascending Order: " + Arrays.toString(sortData.getData());
        }
        else
        {
            output[0] = "error invalid sort type";
        }
        return output;
    }



    public int[] getSortData()
    {
        return this.sortData.getData();
    }

    public void setSortData(int[] sortData)
    {
        this.sortData.setData(sortData);
    }

}

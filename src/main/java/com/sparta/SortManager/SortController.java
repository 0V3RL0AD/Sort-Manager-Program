package com.sparta.SortManager;

import org.junit.jupiter.params.aggregator.ArgumentAccessException;

import java.util.Arrays;

public class SortController {
    //atributes
    private SortData sortData;
    private Sort sortManager;

    public SortController(Sort sortManager)
    {
        this.sortManager = sortManager;
        sortData = new SortData();
    }
    public String[] Sort()
    {
        String[] output = new String[2];
        //convert the user array into a string and print it out to the console
        output[0] = "Here are your numbers: " + Arrays.toString(sortData.getData());
        //send the user created array to the Bubble Sort class
        sortData.setData(sortManager.sort(sortData.getData()));
        //after Bubble Sort, print out the new array that has been sorted
        //called User since it is still originally the User's
        output[1] = "Sorted Array in Ascending Order: " + Arrays.toString(sortData.getData());

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

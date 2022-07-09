package com.sparta.SortManager;

public class SortData {

    private int[] data;

    //constructor function - same name as the class. Only function without a return type.
    public SortData()
    {

    }
    //getter function -  gets the data we need and returns it as an integer array
    public int[] getData()
    {
        return this.data;
    }

    //setter function -
    public void setData(int[] data)
    {
        this.data = data;
    }
}

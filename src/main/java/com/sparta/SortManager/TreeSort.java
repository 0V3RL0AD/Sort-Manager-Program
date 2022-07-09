package com.sparta.SortManager;

public class TreeSort implements Sort{
    private Tree tree;

    //
    public int[] sort (int[] arr)
    {
        tree = new Tree();
        tree.initTree(arr);
        return tree.toArray(arr.length);
    }


}

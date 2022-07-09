package com.sparta.SortManager;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private Node root;

    public Tree()
    {
        root = null;
    }

    //adding new values to the tree for sorting
    public void initTree(int[] arr)
    {
        for (int i =0; i < arr.length; i++)
        {
            //creating the nodes on the tree
            insertNode(arr[i]);
        }
    }

    public void insertNode(int key)
    {
        //sorting the tree nodes into order
        root = insertNodeRec(root, key);
    }

    public Node insertNodeRec(Node root, int key)
    {
        if (root == null)
        {
            root  = new Node(key);
            return root;
        }
        if (key < root.getKey())
        {
            root.setLeft(insertNodeRec(root.getLeft(), key));
        }
        else if (key > root.getKey())
        {
            root.setRight(insertNodeRec(root.getRight(), key));
        }
        return root;
    }

    public Node getRoot() {
        return this.root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //arraylist = collection (arrays of objects with more functionality)
    public int[] toArray(int size)
    {
        //Integer is a generic
        //List is type ArrayList
        //Integer = only able to recieve Integer objects
        //We need to find a way to reliably sort objects in an array and adding by index diring recursion
        ArrayList<Integer> arrList = new ArrayList<>();
        int[] arr = new int[size];
        arrList = sortRec(arrList, this.root);
        for (int i = 0; i < arrList.size(); i++)
        {
            //turning the arraylist into an array
            //more reliable to have arraylist because it knows its next entity
            arr[i] = arrList.get(i);
        }
        return arr;
    }

    public ArrayList<Integer> sortRec(ArrayList<Integer> arrList, Node root)
    {
        if (root != null)
        {
            sortRec(arrList, root.getLeft());
            arrList.add(root.getKey());
            sortRec(arrList, root.getRight());
        }
      return arrList;
    }
}

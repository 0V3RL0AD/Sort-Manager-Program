package com.sparta.SortManager;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        SortController sortController = new SortController();
        ViewController viewController = new ViewController();
        Scanner Scanner = new Scanner(System.in); // create scanner system to take in user input
        int[] User; //create array for only integers that will be from the user
        System.out.println("Hello! Welcome to The Sort Program. PLease give some numbers and we will sort them! :)");
        System.out.println("How many number would you like to sort out?");
        int n = Scanner.nextInt(); //take the array size
        User = new int[n]; //set the array size
        System.out.println("What are the numbers you wish to add?");
        //take user input for the array until the array is full
        for (int x =0; x < User.length; x++)
        {
            User[x] = Scanner.nextInt();
        }
        // check sorting method
        System.out.println("What sorting method would you like? Bubbles or Merge?");
        String SortMethod = Scanner.next();
        SortMethod.toLowerCase();
        sortController.setSortData(User);
        viewController.showOutput(sortController.Sort(SortMethod));

    }
}
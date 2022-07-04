package com.sparta.SortManager;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bubble_Sort BubbleS = new Bubble_Sort(); // create a link to the Bubble_Sort class
        Scanner Scanner = new Scanner(System.in); // create scanner system to take in user input
        int[] User; //create array for only integers that will be from the user
        System.out.println("Hello! Welcome to Bubble Sort. PLease give some numbers and we will sort them! :)");
        System.out.println("How many number would you like to sort out?");
        int n = Scanner.nextInt(); //take the array size
        User = new int[n]; //set the array size
        System.out.println("What are the numbers you wish to add?");
        //take user input for teh array until the array is full
        for (int x =0; x < User.length; x++)
        {
            User[x] = Scanner.nextInt();
        }
        //convert the user array into a string and print it out to the console
        System.out.println("Here are your numbers: " + Arrays.toString(User));
        //send the user created array to the Bubble Sort class
        BubbleS.bubbleSort(User);
        //after Bubble Sort, print out the new array that has been sorted
        //called User since it is still originally the User's
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(User));
    }
}
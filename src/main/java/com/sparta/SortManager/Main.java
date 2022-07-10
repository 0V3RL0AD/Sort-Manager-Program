package com.sparta.SortManager;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static Logger logger = LogManager.getLogger("test");
    public static void main(String[] args)
    {
        //logger.error("i exist");
        start(args, false);
    }
    public static void start(String[] args, boolean reRun){
        try {
            run(args, reRun);
        }
        catch(Exception ex){
            String message;
            switch (ex.toString()) {
                case "java.lang.IllegalA#rgumentException":
                    message = "Choose Bubbles or Merge";
                    break;
                case "java.util.InputMismatchException":
                    message = "No number entered";
                    break;
                default:
                    message = ex.getMessage();
            }
            //logger.info("I exist", ex);
            logger.error(message, ex);
            //System.out.println(message);
            reRun = true;
            start(args, reRun);
        }
    }
    public static void run(String[] args, boolean reRun) throws Exception
    {
        ViewController viewController = new ViewController();
        Scanner Scanner = new Scanner(System.in); // create scanner system to take in user input
        int[] User; //create array for only integers that will be from the user
        if (!reRun)
        {
            System.out.println("Hello! Welcome to The Sort Program. PLease give some numbers and we will sort them! :)");
        }
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
        System.out.println("What sorting method would you like? Bubbles, Merge or Tree?");
        String sortMethod = Scanner.next();
        sortMethod.toLowerCase();
        Sort sortManager;
        if (sortMethod.equals("bubbles"))
        {
            sortManager = new BubbleSort();
        }
        else if (sortMethod.equals("merge"))
        {
            sortManager = new MergeSort();
        }
        else if (sortMethod.equals("tree"))
        {
            sortManager = new TreeSort();
        }
        else
        {
            IllegalArgumentException argumentException = new IllegalArgumentException("error invalid sort type");

            throw argumentException;
        }
        SortController sortController = new SortController(sortManager);
        sortController.setSortData(User);
        long start = System.currentTimeMillis();
        viewController.showOutput(sortController.Sort());
        long diff =  (System.currentTimeMillis() - start);
        System.out.println("time taken:" + diff + " ms");

    }
}
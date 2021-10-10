package com.algods.aniruddha.arrays;

import java.util.*;
import java.util.ArrayList;
import java.lang.Integer;
public class Main {
    private Scanner scanner;
    public static void main(String[] args){
        System.out.println("This is a class to solve Array problems.");
        System.out.println("We plan to do DS and Algorithms in Java");

        int[] array = new int[6];

        Scanner scanner = new Scanner(System.in);



        for(int i=0; i<6;i++){

            array[i] = scanner.nextInt();;
           // System.out.println(scanner.nextInt());
        }
        int k = 3;


        // Testing the Array reversal

        //MinMax.RevArray newArray = new MinMax.RevArray(array);
        //newArray.reverse();

        // Testing the minMax Algorithm
        //MinMax.Pair minmax = MinMax.getMinMax(array, 0, array.length- 1);
        //System.out.printf("\nMinimum element is %d", minmax.min);
        //System.out.printf("\nMaximum element is %d", minmax.max);
        // The code works

        // Testing the kMin of the report
        kMin.kMinMethod(array,k);


        }



    }


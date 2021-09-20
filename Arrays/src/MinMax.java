// Create a class to get a minmax of an array.
/*
The class will take int array values and return the object that consists of two minimum and maximum values.
 */

import java.util.*;
import java.util.ArrayList;
import java.lang.Integer;
public class MinMax {
    //Initiate
    static class Pair{
        int max;
        int min;
    }

    //Create method to return the main and max
    // We use the tournament method to do this
    // Divide the element into two parts and compare the maximum and minimum of the parts to get the maximum

    static Pair getMinMax(int[] array,int low,int high ){
        Pair minMax = new Pair();
        // We need the pairs to be passed into the left and right comparison
        Pair arrL = new Pair();
        Pair arrR = new Pair();

        // Creating the base case if the length of the array is 1;
        if(low == high){
            minMax.max = array[low];
            minMax.min = array[high];
            return minMax;

        }

        // Creating a class where the length of the array is 2;

        if (low == high +1){
            minMax.min = array[low];
            minMax.max = array[high];
            return minMax;

        }

        // Now we need to use recursion to split the values and compare;
        // Need another variable to store the mid value and split the array;
        int mid;

        // define mid as
        mid = (low + high)/2;

        // Pass this mid as high in the left and low in the right array
        arrL = getMinMax(array,low,mid);
        arrR = getMinMax(array,mid+1,high);

        // After passing everything we need to create a comparison between the left and the right one to be returned
        // Comparos
        if(arrL.min < arrR.min){
            minMax.min = arrL.min;
        }else{
            minMax.min = arrR.min;
        }

        // Comparison for the maximum
        if(arrL.max > arrR.max){
            minMax.max = arrL.max;
        }else{
            minMax.max = arrR.max;
        }

        // Return the object to get the numbers
        return minMax;





    }


}

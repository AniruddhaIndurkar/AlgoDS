import java.util.*;
public class kMin {

    // Create a method that takes the array and an integer 0<k<array.length;
    // Return the kth min value;
    // 4 access specifier
    // 1. Private - only within
    // package private - don't specify then it is package private
    // Use the statistics
    static class Statistic{
        private int min;
        private int max;

        public int  getMin(){
            return min;
        }
    }

    public static int kMinMethod(int[] array, int k){

        //
        Statistic statistic = new Statistic();
        statistic.min = 0;
        statistic.max = array.length;

        kMin.mergeSort(array, statistic );
        return array[k];

    }

    public static void mergeSort(int[] array, Statistic stat) {
        // We need to return if the array is less than 2
        if (array.length < 2) {
            return;
        }

        // Create a mid point

        int mid = (stat.min + stat.max) / 2;

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        // Now we merge everything here so that we can combine the array
        merge(array, low, mid, high);

    }

    public static int[] merge(int[] array, int low, int mid, int high) {

        // Now first we need to create the array to store the values
        int[] leftArray = new int[mid - low + 1];
        int[] rightArray = new int[high - mid];

        // Copy the elements in the array
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[low + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mid + i + 1];
        }

        // Now we iterate to replace the values
        int leftIndex = 0, rightIndex = 0;

        for (int i = 0; i < high + 1; i++) {

            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }

        return array;


    }

}
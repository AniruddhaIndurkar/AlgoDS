import java.util.*;
import java.util.ArrayList;
import java.lang.Integer;
public class Main {
    private Scanner scanner;
    public static void main(String[] args){
        System.out.println("This is a class to solve Array problems.");
        System.out.println("We plan to do DS and Algorithms in Java");

        int[] array = new int[4];

        Scanner scanner = new Scanner(System.in);



        for(int i=0; i<4;i++){

            array[i] = scanner.nextInt();;
           // System.out.println(scanner.nextInt());
        }



        // Testing the Array reversal

        //RevArray newArray = new RevArray(array);
        //newArray.reverse();

        // Testing the minMax Algorithm
        MinMax.Pair minmax = MinMax.getMinMax(array, 0, array.length- 1);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);


    }
}

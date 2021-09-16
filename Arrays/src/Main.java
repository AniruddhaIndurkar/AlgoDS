import java.util.*;
import java.util.ArrayList;


public class Main {
    private Scanner scanner;
    public static void main(String[] args){
        System.out.println("This is a class to solve Array problems.");
        System.out.println("We plan to do DS and Algorithms in Java");

        int[] array = new int[4];

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<4;i++){
            array[i] = scanner.nextInt();
        }


        RevArray newArray = new RevArray(array);
        newArray.reverse();



    }
}

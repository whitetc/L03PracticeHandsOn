package Practicehandson;

import java.util.Arrays;

public class HandsOn {
    public static void main(String[] args) {
//        Next, open the Practicehandson.HandsOn.java file. You will be working in the main
//        method.

//        Define an integer array of size 5 with all elements initialized to the value 0.
           int[] arr = new int[5];
//      Using a for loop and the ReadInputInt() static method of the
//      Practicehandson.StudentHelper class, read in (as input) the 5 integer values and store them into the array.
           for(int i = 0; i < arr.length;i++){

               arr[i] = StudentHelper.ReadInputInt();
           }
//        Print the contents of the array to the console using a for loop to
//        iterate over the elements of the array.
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int i = arr.length -1; i >= 0 ;i--){
            System.out.println(arr[i]);
        }

    }
}

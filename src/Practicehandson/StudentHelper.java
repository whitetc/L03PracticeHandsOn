package Practicehandson;

import java.util.Scanner;
public class StudentHelper {


        @SuppressWarnings("resource")
        public static String ReadInputString(){
            // declare a new Scanner object
            Scanner scan = new Scanner(System.in);

            // read in user input and store it in the scanned variable
            String scanned = scan.nextLine();

            // return the String result to wherever the "Practicehandson.StudentHelper.ReadInputString()" is called
            return scanned;
        }

        @SuppressWarnings("resource")
        public static int ReadInputInt(){
            // declare a new Scanner object
            Scanner scan = new Scanner(System.in);

            // read in user input and store it in the scanned variable
            int scanned = scan.nextInt();

            // return the int result to wherever the "Practicehandson.StudentHelper.ReadInputInt()" is called
            return scanned;
        }

}

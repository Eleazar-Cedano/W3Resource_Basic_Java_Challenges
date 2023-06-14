package W3Resource;

import java.util.*;

public class print2BinaryNums {

    /*
    Third algorithm:
    Insert the numeric contents of an Array backwards into a second Array and print it, else exit program without throwing exceptions.
    */


        private final static int[] series_1 = new int[7];
        private final static int[] series_2 = new int[7];
        private final static Scanner input = new Scanner(System.in);

        static void binVal() {
            int c = 0;

            System.out.println("Please enter a string of numbers: ");

            while (input.hasNextInt()) {     /* using the .hasNextInt() method prevents
            the series_1 Array from taking a non-numeric
            character. */

                if (input.hasNextInt()) {
                    series_1[c] = input.nextInt();
                    c += 1;
                    if (c==7) {
                        break;
                    }
                }
            }
            if (c==0)
                System.out.println("Non-numeric value entered. The program exits.");
            else
            {
                System.out.println("This is the original array named series_1: "+ Arrays.toString(series_1) );
                    System.out.println("\nThis is the reversed vector: ");
                    for (int i = 0; c >= -1; i++) {
                        series_2[i] =
                                series_1[c - 1];
                        System.out.print(series_2[i]);
                        System.out.print(" ");
                        c--;
                        if (c==0)
                            break;

                    }
                }
            }

        public static void main(String[] args) {

        binVal();
        }
}

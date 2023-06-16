package W3Resource;

import java.util.Scanner;
public class W3Question7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" \n Please enter a number: ");

        int num = input.nextInt();
        System.out.println();

        for (int n = 1; n <= 10; n++) {
            System.out.println( num + " x " + n + " = " +( num * n ));

        }
    }
    }


//
//    7. Write a Java program that takes a number from input and prints its multiplication table up to 10. Go to the editor
//    Test Data:
//    Input a number: 8
//    Expected Output :
//            8 x 1 = 8
//            8 x 2 = 16
//            8 x 3 = 24
//            ...
//            8 x 10 = 80

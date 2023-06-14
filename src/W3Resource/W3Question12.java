package W3Resource;

import java.sql.SQLOutput;
import java.util.Scanner;

public class W3Question12 {
    public static void main(String[] args){

//        int[] ints = new int[3];
//        ints = new int[]{input.nextInt(), input.nextInt(),input.nextInt() };

        System.out.println("\nPlease 3 integers below.\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please the 1st integer: ");
        int num1 = input.nextInt();
        System.out.print("Please the 2nd integer: ");
        int num2 = input.nextInt();
        System.out.print("Please the 3rd integer: ");
        int num3 = input.nextInt();

        System.out.println("\nThe average of your 3 integers is = " + (num1+num2+num3)/3);

    }

}
// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

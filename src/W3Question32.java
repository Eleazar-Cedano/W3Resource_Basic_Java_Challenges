import java.util.Scanner;

public class W3Question32 {
public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Input the first number: ");
    int first = in.nextInt();
    System.out.print("Input the second number: ");
    int second = in.nextInt();


    if (first < second) {
        System.out.println(first + " != " + second);
        System.out.println(first + " < " + second);
        System.out.println(first + " <= " + second);
    }
    else if (first > second) {
        System.out.println(first + " != " + second);
        System.out.println(first + " > " + second);
        System.out.println(first + " >= " + second);
    }
    else if (first == second) {
        System.out.println(first + " == " + second);
        System.out.println("!(" + first + " > " + second + ")");
        System.out.println("!(" + first + " < " + second + ")");
    }


    }
}
//32. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//
//        25 != 39
//        25 < 39
//        25 <= 39

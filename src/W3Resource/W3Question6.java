package W3Resource;

import java.util.Scanner;

public class W3Question6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please input the second number: ");
        int num2 = input.nextInt();
        System.out.println();

        System.out.println((num1)+" + "+(num2)+" = "+(num1+num2));
        System.out.println((num1)+" - "+(num2)+" = "+(num1-num2));
        System.out.println((num1)+" x "+(num2)+" = "+(num1*num2));
        System.out.println((num1)+" / "+(num2)+" = "+(num1/num2));
        System.out.println((num1)+" MOD "+(num2)+" = "+(num1%num2));
    }


//    6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
//    Test Data:
//    Input first number: 125
//    Input second number: 24
//    Expected Output :
//            125 + 24 = 149
//            125 - 24 = 101
//            125 x 24 = 3000
//            125 / 24 = 5
//            125 mod 24 = 5
}

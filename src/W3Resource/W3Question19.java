package W3Resource;

import java.util.*;
public class W3Question19 {
    public static void main(String[] args) {
    // "I" means Index. The index is increased each cycle to deposit a new binary digit in the next index each iteration.
    // "C" means Cycle. The number of cycles is also the number of indexes to print from the Array that saves the Binary numbers
    // "R" means Remainder. The Remainder is the binary number deposited in index "I" on "Bin" during each iteration.
    // "N" means Number. After each iteration, N takes the value of the quotient.
    // "Q" means Quotient. After each iteration the quotient become N.
    // "D" means Divisor. N is always divided by 2 in order to get the quotient and the reminders.
    // "Bin" means Binary. This is the Array where each binary member "R" will be deposited.
    // "Input" is a variable that receives input from the user in the console to be processed into a binary expression.

        var Input = new Scanner(System.in);
        int[] Bin = new int[150];
        int Q, D = 2, N, R, C = 0, i = 0;


        /* Below you will find my code that deposits each binary member in Bin*/

        System.out.print("\nThis program will print the Binary equivalent of any number.\nSo, please, input a number:" +
                " ");
        N = Input.nextInt();


        while (N!=0) {
            C += 1;
            Q = N / D;
            R = N % D;
            N = Q;
            Bin[i] = R;
            i+=1;
        }
        /* The following lines of code reverse the order of the binary members and prints them.
        Note: The cycle total helps to print only the indexes where the binary numbers are found. */

        System.out.print("And the Binary Value per my code is: ");
        for (int n = C; n >= 1; n--) {
            System.out.print(Bin[n-1]);
        }

        System.out.println();

    }

}





//17. Write a Java program to add two binary numbers. Go to the editor
//Input Data:
//Input first binary number: 10
//Input second binary number: 11
//Expected Output
//Sum of two binary numbers: 101


/*

        Now, we can try to write our own logic for this conversion.
        Before writing the code, let's first understand how to convert a decimal number into a binary one.

        To convert a decimal number n into its binary format, we need to:

        1. Divide n by 2, noting the quotient q and the remainder r
        2. Divide q by 2, noting its quotient and remainder
        3. Repeat step 2 until we get 0 as the quotient
        4. Concatenate in reverse order all remainders

        Let's see an example of converting 6 into its binary format equivalent:

        1. First, divide 6 by 2: quotient 3, remainder 0
        2. Then, divide 3 by 2: quotient 1, remainder 1
        3. And finally, divide 1 by 2: quotient 0, remainder 1
        4. 110

        */

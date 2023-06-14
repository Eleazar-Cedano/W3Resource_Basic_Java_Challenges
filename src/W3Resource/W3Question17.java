package W3Resource;

import java.util.*;
/*
This Class will take two binary numbers and print the sum of them. It mimics addition.
 */
public class W3Question17 {
        public static void main(String[] args) {

            mimicBinaryAddition();


        } //end of main method

    static int[] binary_Num_1 = {1,0,1,0,1,1,1};
    static int[] binary_Num_2 = {0,1,1,1,0,0,1};
    static int[] carry_Over = {0};
    static int[] final_Sum = new int[12];
    static int cycle = binary_Num_1.length-1;
    static int index = final_Sum.length;
    static int i = 0;  // index for carry_Over[].

    static void mimicBinaryAddition(){
        while(cycle >= 0){
            System.out.println("This is sumCycle: " + index);
            System.out.println("This is cycle number: " + cycle);

            if( (binary_Num_1[cycle] != 0) && (binary_Num_2[cycle] != 0) ){
                if (carry_Over[i] == 1){
                    final_Sum[index -1] = 1;
                    carry_Over[i] = 1;
                    cycle -= 1;
                    index -= 1;
                    System.out.println("=================== Condition 1 evaluated");}
                else
                if (carry_Over[i] == 0) {
                    carry_Over[i] = 1;
                    final_Sum[index -1] = 0;
                    cycle -= 1;
                    index -= 1;
                    System.out.println("=================== Condition 2 evaluated");}}

            else if ((binary_Num_1[cycle] == 0) && (binary_Num_2[cycle] == 0)) {
                final_Sum[index -1] = 0;
                cycle -= 1;
                index -= 1;
                System.out.println("=================== Condition 3 evaluated");
                {
                    if (carry_Over[i] == 1) {
                        final_Sum[index -1] = 1;
                        carry_Over[i] = 0;
                        index -= 1;
                        System.out.println("=================== Condition 4 evaluated");}}}


            else if ((binary_Num_1[cycle] != 0) || (binary_Num_2[cycle] != 0)){
                if (carry_Over[i] == 0) {
                    carry_Over[i] = 0;
                    final_Sum[index -1] = 1;
                    cycle -= 1;
                    index -= 1;
                    System.out.println("=================== Condition 5 evaluated");}
                else
                if (carry_Over[i] == 1){
                    final_Sum[index -1] = 0;
                    carry_Over[i] = 1;
                    cycle -= 1;
                    index -= 1;
                    System.out.println("=================== Condition 6 evaluated");}}


            System.out.print("Sum is equal to: " + final_Sum[index]);
            System.out.println("\nAnd this is carryOver: " + carry_Over[i]);

        }// end of while loop

        final_Sum[index -1]= carry_Over[i];
        System.out.println("This is sumCycle: " + index);
        System.out.println(Arrays.toString(final_Sum));

        for(int a = index -1; a <= final_Sum.length-1 ; a++)
            System.out.print(final_Sum[a]);
    }

    }// end of MyClass

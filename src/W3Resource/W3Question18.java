package W3Resource;
import java.util.*;
public class W3Question18 {// This Class will take two binary numbers, multiply them, and print the sum of them.
Scanner in = new Scanner(System.in);


    static int[] multiplicand = {1,0,1,0,1,1,1};
    static int[] multiplier = {0,1,1,1,0,1,1};
    static int[] partP1 = new int[7], partP2 = new int[8], partP3 = new int[9], partP4 = new int[10],
            partP5 = new int[11], partP6 = new int[12], partP7 = new int[13]; //partial products
    static int[] carryOver = {0}; //,carryOver2 = {0},carryOver3 = {0}, carryOver4 = {0}; // carry-overs
    static int[] finalProduct = new int[16];  // final products
    static int cycle = multiplier.length-1;
    static int sumCycle = finalProduct.length-1;
    static int i = 0;
    static int finIndex = finalProduct.length-1;

    static void multiplyBinary(){  //This code will multiply the binary numbers
        for(int b = multiplier.length-1; b >= 0; b--)
            for(int a = multiplicand.length-1; a >= 0; a--)
                if(b == multiplier.length-1)
                    partP1[a] = multiplier[b] * multiplicand[a];
                else if (b == multiplier.length-2)
                    partP2[a] = (multiplier[b] * multiplicand[a]);
                else if (b == multiplier.length-3)
                    partP3[a] = (multiplier[b] * multiplicand[a]);
                else if (b == multiplier.length-4)
                    partP4[a] = (multiplier[b] * multiplicand[a]);
                else if (b == multiplier.length-5)
                    partP5[a] = (multiplier[b] * multiplicand[a]);
                else if (b == multiplier.length-6)
                    partP6[a] = (multiplier[b] * multiplicand[a]);
                else if (b == multiplier.length-7)
                    partP7[a] = (multiplier[b] * multiplicand[a]);

        System.out.println();
        System.out.println();
        String item = String.format("%57s \n%57s \n%57s \n%57s \n%57s \n%57s \n+%56s"
                ,Arrays.toString(partP1)+ "  partP1"
                ,Arrays.toString(partP2)+ "  partP2"
                ,Arrays.toString(partP3)+ "  partP3"
                ,Arrays.toString(partP4)+ "  partP4"
                ,Arrays.toString(partP5)+ "  partP5"
                ,Arrays.toString(partP6)+ "  partP6"
                ,Arrays.toString(partP7)+ "  partP7");
        System.out.print(item);
        addBinary();
    } // end of multiplyBinary

    static void addBinary() {  //This code will add all binary numbers
        for (int addIndex = 1; addIndex <= finalProduct.length; addIndex++) {
            if (addIndex <= 7) {
                finalProduct[finIndex] = (
                        partP1[partP1.length - addIndex]
                                + partP2[partP2.length - addIndex]
                                + partP3[partP3.length - addIndex]
                                + partP4[partP4.length - addIndex]
                                + partP5[partP5.length - addIndex]
                                + partP6[partP6.length - addIndex]
                                + partP7[partP7.length - addIndex]
                );
                finIndex--;
            }
            else if (addIndex  ==8) {
                finalProduct[finIndex] = (
                        partP2[partP2.length - addIndex]
                                + partP3[partP3.length - addIndex]
                                + partP4[partP4.length - addIndex]
                                + partP5[partP5.length - addIndex]
                                + partP6[partP6.length - addIndex]
                                + partP7[partP7.length - addIndex]);
                finIndex--;
            }
            else if (addIndex == 9) {
                finalProduct[finIndex] = (
                        partP3[partP3.length - addIndex]
                                + partP4[partP4.length - addIndex]
                                + partP5[partP5.length - addIndex]
                                + partP6[partP6.length - addIndex]
                                + partP7[partP7.length - addIndex]);
                finIndex--;
            }
            else if (addIndex == 10) {
                finalProduct[finIndex] = (
                        partP4[partP4.length - addIndex]
                                + partP5[partP5.length - addIndex]
                                + partP6[partP6.length - addIndex]
                                + partP7[partP7.length - addIndex]);
                finIndex--;
            }
            else if (addIndex == 11) {
                finalProduct[finIndex] = (
                        partP5[partP5.length - addIndex]
                                + partP6[partP6.length - addIndex]
                                + partP7[partP7.length - addIndex]);
                finIndex--;

            }
            else if (addIndex == 12){
                finalProduct[finIndex] = (
                        partP6[partP6.length - addIndex]
                                + partP7[partP7.length - addIndex]);
                finIndex--;
            }
            else
                break;

        }// end of for-loop
        System.out.print("\n—————————————————————————————————————————————————————————");
        System.out.println("\n"+ String.format("%49s ", Arrays.toString( Arrays.copyOfRange(finalProduct,3,16)))+
                "Total Sum");
    }// end of addBinary

    void multiplyBin() {
        System.out.println();
        System.out.print("Input first int: ");
        String first = in.next();
        System.out.print("Input second int: ");
        String second = in.next();
        System.out.println();
        int bin1 = Integer.parseInt(first, 2);
        int bin2 = Integer.parseInt(second, 2);
        int bin3 = bin1 * bin2;
        System.out.println("Solution: " + Integer.toBinaryString(bin3));
        System.out.println();
        System.out.println("The First Binary number is equal to the Decimal: " + Integer.parseInt(first, 2));
        System.out.println("The Second Binary number is equal to the Decimal: " + Integer.parseInt(second, 2));
        System.out.println("The Binary Solution is equal to the Decimal: " + Integer.parseInt(Integer.toString(bin3,
                10)));
    }


    }// end of MyClass

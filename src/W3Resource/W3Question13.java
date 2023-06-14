package W3Resource;

public class W3Question13 {

    static final float Width = 5.6f;
    static final float Height = 8.5f;

    public static void main(String[] args){

        System.out.printf("\nThe Area is %1.1f * %1.1f = %2.2f \n", Width, Height, (Width*Height) );
        System.out.printf("The Perimeter is 2 * (5.6 + 8.5) = %2.2f \n", 2*(Width+Height) );
//I used the printf method because the 2nd decimal place was not printing.
// Using the printf method lets me control how many decimal places to print.
//
    }
}

//13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor.
//Test Data:
//Width = 5.5 Height = 8.5
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

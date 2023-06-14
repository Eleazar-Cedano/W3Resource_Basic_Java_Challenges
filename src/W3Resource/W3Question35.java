package W3Resource;

import java.util.Scanner;

public class W3Question35 {
public static void main(String[] args) {
W3Question35 obj = new W3Question35();
    obj.polygonArea();


} //end of main method
Scanner in = new Scanner(System.in);
void polygonArea() {
    System.out.print("\nThis program calculates the Area of a Polygon. \n\nInput the number of sides on the polygon: ");
    double n = in.nextDouble();
    System.out.print("Input the length of one of the sides: ");
    double s = in.nextDouble();
    double Area_of_a_Polygon = (n * Math.pow(s, 2)) / (4 * Math.tan((Math.PI / n)));
//     Area of a polygon = (n*s^2)/(4*tan(π/n))
    System.out.println("The area of a polygon is: " + Area_of_a_Polygon);
}
}
//35. Write a Java program to compute the area of a polygon.
//        Area of a polygon = (n*s^2)/(4*tan(π/n))
//        where n is n-sided polygon and s is the length of a side
//        Input Data:
//        Input the number of sides on the polygon: 7
//        Input the length of one of the sides: 6
//        Expected Output
//
//        The area is: 130.82084798405722
//

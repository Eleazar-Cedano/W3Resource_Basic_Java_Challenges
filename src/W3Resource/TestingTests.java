package W3Resource;
import java.util.*;
public class TestingTests{  //THIS CLASS TESTS THE NESTED STATEMENTS
public static void main(String[] args) {
//boolean healthyOrNot= isHealthy("Avodaco");



} //end of main method
Scanner in = new Scanner(System.in);
void poligonArea() {
    System.out.print("\nThis program calculates the Area of a Polygon. \n\nInput the number of sides on the polygon: ");
    double n = in.nextDouble();
    System.out.print("Input the length of one of the sides: ");
    double s = in.nextDouble();
    double Area_of_a_Polygon = (n * Math.pow(s, 2)) / (4 * Math.tan((Math.PI / n)));
//     Area of a polygon = (n*s^2)/(4*tan(π/n))
    System.out.println("The area of a polygon is: " + Area_of_a_Polygon);
}

//static boolean isHealthy(String string);

}// end of MyClass
//35. Write a Java program to compute the area of a polygon.
//        Area of a polygon = (n*s^2)/(4*tan(π/n))
//        where n is n-sided polygon and s is the length of a side
//        Input Data:
//        Input the number of sides on the polygon: 7
//        Input the length of one of the sides: 6
//        Expected Output
//
//        The area is: 130.82084798405722

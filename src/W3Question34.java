import java.util.Scanner;
public class W3Question34 {
public static void main(String[] args){
    W3Question34 obj = new W3Question34();
    obj.areaHex2();
}

Scanner in = new Scanner(System.in);
void areaHex(){
    System.out.print("Enter apothem: ");
    double apothem = in.nextDouble();
    System.out.print("Enter perimeter: ");
    double perimeter = in.nextDouble();
    double A = (apothem/2) * (perimeter*6);
    System.out.println(A);
}
void areaHex2(){
    System.out.print("Enter perimeter: ");
    double s = in.nextDouble();
    double hexagon = 6 * Math.pow(s,2.0)/(4 * Math.tan((Math.PI/6.0)));
    //        Area of a hexagon = (6 * s^2)/(4*tan(π/6))
    System.out.println(hexagon);
}
}

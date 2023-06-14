package W3Resource;

public class W3Question36 {
public static void main(String[] args){
    double distance_between_two_points, radius = 6371.01, x1 = Math.toRadians(35), y1 = Math.toRadians(25),
            x2 = Math.toRadians(25.5), y2 = Math.toRadians(35.5);



}
}


//36. Write a Java program to compute the distance between two points on the earth's surface.
//        Distance between the two points [ (x1,y1) & (x2,y2)]
//        d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//        Radius of the earth r = 6371.01 Kilometers
//        Input Data:
//        Input the latitude of coordinate 1: 25
//        Input the longitude of coordinate 1: 35
//        Input the latitude of coordinate 2: 35.5
//        Input the longitude of coordinate 2: 25.5
//        Expected Output
//
//        The distance between those points is: 1480.0848451069087 km

package Math;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {

        //Distance between the two points [ (x1,y1) & (x2,y2)]
        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        //Radius of the earth r = 6371.01 Kilometers
        double earthRadius = 6371.01;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1: ");
        double x1 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 1: ");
        double y1 = input.nextDouble();
        System.out.println("Input the latitude of coordinate 2: ");
        double x2 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 2: ");
        double y2 = input.nextDouble();

        double distance = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between ["+"("+x1+","+y1+")"+" & "+"("+x2+","+y2+")"+"] is: "+ distance);


    }
}

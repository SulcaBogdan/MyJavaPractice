package Math;

import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon: ");
        int ns = scanner.nextInt();
        System.out.println("Input the length of one of the sides: ");
        double side = scanner.nextDouble();
        //Area of a polygon = (n*s^2)/(4*tan(π/n))
        System.out.println("The area is: " + polygonArea(ns, side)+"\n");
    }
    public static double polygonArea(int ns , double side){
        return (ns *(side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
}

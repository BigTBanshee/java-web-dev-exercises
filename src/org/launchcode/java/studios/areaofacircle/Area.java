package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        Double area = Circle.getArea(radius);
        System.out.println(area);
//        double radius;
//        //double area;
//        double pi = 3.14;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a radius: ");
//        radius = input.nextDouble();
//        input.close();
//
//        //area = pi * radius * radius;
//        Circle.getArea(radius);


        //System.out.println("The area of a circle of a radius " + radius + " is: " + getArea);
    }
}
package com.bridgelabz.linecomparison;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class ComparisonComputation {
    public static void main(String []args){
        System.out.println("Welcome to Line Computation Problems");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of X1: ");
        int x1 = sc.nextInt();

        System.out.println("Enter the value of X2: ");
        int x2 = sc.nextInt();

        System.out.println("Enter the value of Y1: ");
        int y1 = sc.nextInt();

        System.out.println("Enter the value of Y2: ");
        int y2 = sc.nextInt();

        // Calculate distance between two points
        double length_of_line = sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        System.out.println("Length of Line between two points: " + length_of_line);
    }
}

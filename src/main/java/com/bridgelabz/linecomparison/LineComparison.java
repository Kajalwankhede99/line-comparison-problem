package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

    public static int enterValue() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Enter coordinates of the first line: ");
        int x1 = enterValue();
        int x2 = enterValue();
        int y1 = enterValue();
        int y2 = enterValue();

        System.out.println("Enter coordinates of the second line: ");
        int secX1 = enterValue();
        int secX2 = enterValue();
        int secY1 = enterValue();
        int secY2 = enterValue();

        // Correcting the formula
        Integer lengthFirstLine = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Integer lengthSecondLine = (int) (Math.pow(secX2 - secX1, 2) + Math.pow(secY2 - secY1, 2));

        int result = compareLengths(lengthFirstLine, lengthSecondLine);
        if (result == 0) {
            System.out.println("Length of the first line is equal to the length of the second line");
        } else if (result < 0) {
            System.out.println("Length of the first line is less than the length of the second line");
        } else {
            System.out.println("Length of the first line is greater than the length of the second line");
        }
    }

    public static int compareLengths(Integer first, Integer second) {
        return first.compareTo(second);
    }
}

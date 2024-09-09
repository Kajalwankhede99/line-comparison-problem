package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineEqualityCheck {
    public static int enterValue() {
        System.out.println("Enter values in order x1,x2,y1,y2 : ");
        Scanner sc = new Scanner(System.in);
        int valueof = sc.nextInt();
        return valueof;
    }

    public static void main(String[] args) {
        System.out.println("Enter co-ordinates of First line : ");
        int X1 = enterValue();
        int X2 = enterValue();
        int Y1 = enterValue();
        int Y2 = enterValue();
        System.out.println("Enter the co-ordinates of Second line : ");
        int secX1 = enterValue();
        int secX2 = enterValue();
        int secY1 = enterValue();
        int secY2 = enterValue();

        Integer length_First_Line = (int) Math.pow((X2 - X1), 2) + (int) Math.pow((Y2 - Y1), 2);
        Integer length_Second_Line = (int) Math.pow((secX2 - secX1), 2) + (int) Math.pow((secY2 - secY1), 2);

        Boolean result = Equality(length_First_Line, length_Second_Line);

        if (result == true)
            System.out.println("Length of First line = length of Second line");
        else
            System.out.println("Length of both lines are different");
    }

    public static Boolean Equality(Integer first, Integer second) {
        Integer length_firstLine = first;
        Integer length_secondLine = second;
        Boolean result = length_firstLine.equals(length_secondLine);
        return (result);
    }
}
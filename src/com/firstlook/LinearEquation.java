package com.firstlook;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("This is a Linear Equation Resolver");
        System.out.println("Give a equation as 'a*x + b = c', pls enter constant");

        Scanner sc = new Scanner(System.in);
        System.out.println("a :");
        double a = sc.nextDouble();
        System.out.println("b :");
        double b = sc.nextDouble();
        System.out.println("c :");
        int c = sc.nextInt();

        if (a!=0) {
           double ans = (c - b) / a;
           System.out.print("Equation pass with x = " + ans);
        } else {
            if( b == c) {
                System.out.print("Solution is all x ");
            } else {
                System.out.print("No solution");
            }
        }
    }
}

package com.firstlook;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert width!?");
        a = sc.nextFloat();
        System.out.println("Insert height!?");
        b = sc.nextFloat();

        float area = (a + b) * 2;
        float square = a * b;
        System.out.println("Area is : " + area);
        System.out.println("Square is : " + square);
    }
}

package com.firstlook;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("This is a Leap year calculate program ");
        System.out.println(" Enter your year that you want to check");
        int y = sc.nextInt();
        boolean isLeapYear = false;

        if(y%4==0) {
            if(y%100==0) {
                if(y%400==0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(y +" is a leap year!");
        } else {
            System.out.println(y+" is not a leap year!");
        }
    }
}

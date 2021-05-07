package com.firstlook;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Hello, this is a BMI checking program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your weight (kg) : ");
        float weight = sc.nextFloat();
        System.out.println("Insert your height (m) : ");
        float height = sc.nextFloat();
        float BMI = weight/ (height*height);

        System.out.println("Your BMI is "+BMI);

        if (BMI< 18.5) {
            System.out.println("You are Underweight");
        } else if (BMI <25) {
            System.out.println("You are Normal");
        } else if (BMI <30) {
            System.out.println("You are Overweight");
        } else if (BMI >= 30) {
            System.out.println("You are Obese");
        }
    }
}

package task;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name pls: ");
        String str = sc.nextLine();

        System.out.println("Welcome! Mr. " + str + ". Have a good day!");
    }
}

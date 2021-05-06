package task;

import java.util.Scanner;

public class ChangeCurrency {
    public static void main(String[] args) {
        System.out.println("Enter your number of currency");
        Scanner sc = new Scanner(System.in);

        int rate = 23000;
        double USD,VND;
        USD = sc.nextDouble();
        VND = USD * rate;

        System.out.println(USD + " USD = " + VND + " VND");
    }
}

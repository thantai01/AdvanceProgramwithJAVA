package task;

import java.util.Scanner;

public class SpeakingNumber {
    public static void main(String[] args) {
        System.out.println("Hi! This is a Number speaker program");
        System.out.println("Please enter your number that you want to speak :");
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int dg_ones = nums%10;
        double dg_tens = Math.ceil(nums*10/100);

        String one;
        String ten="";
        if(nums == 0) {
            System.out.println("Zero");
        } else if (nums>0 && nums <10) {
            one = onesName(dg_ones);
            System.out.println(one);
        } else if(nums>=10 && nums <20) {
            switch (nums) {
                case 10 : ten = "ten";break;
                case 11 : ten = "eleven";break;
                case 12 : ten = "twelve";break;
                case 13 : ten = "thirteen";break;
                case 14 : ten = "fourteen";break;
                case 15 : ten = "fifteen";break;
                case 16 : ten = "sixteen";break;
                case 17 : ten = "seventeen";break;
                case 18 : ten = "eighteen";break;
                case 19 : ten = "nineteen";break;
            }
            System.out.println(ten);
        } else if( nums >= 20 && nums <100) {
            one = onesName(dg_ones);
            ten = tensName((int) dg_tens);
            System.out.println(ten +" "+one);
        }

    }
    private static String onesName(int num) {
        String ones = " ";
        switch (num) {
            case 1: ones = "one";break;
            case 2: ones = "two";break;
            case 3: ones = "three";break;
            case 4: ones = "four";break;
            case 5: ones = "five";break;
            case 6: ones = "six";break;
            case 7: ones = "seven";break;
            case 8: ones = "eight";break;
            case 9: ones = "nine";break;
        }
        return ones;
    }

    private static String tensName(int num) {
        String tens = " ";
        switch (num) {
            case 2: tens = "twenty";break;
            case 3: tens = "thirty";break;
            case 4: tens = "forty";break;
            case 5: tens = "fifty";break;
            case 6: tens = "sixty";break;
            case 7: tens = "seventy";break;
            case 8: tens = "eighty";break;
            case 9: tens = "ninety";break;
        }
        return tens;
    }
}


//Shem Deiparine
//sdeipar1@umbc.edu

import java.util.*;

//Part 1

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number between 1 and 12");
        int x = input.nextInt();

        System.out.println("*****Part 1*****");

        switch (x) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month");


        }
        System.out.println("*****Part 2*****");
//Part 2

        if (x == 1) {
            System.out.print("January");
        }
        else if (x == 2) {
            System.out.print("February");
        }
        else if (x == 3) {
            System.out.print("March");
        }
        else if (x == 4) {
            System.out.print("April");
        }
        else if (x == 5) {
            System.out.print("May");
        }
        else if (x == 6) {
            System.out.print("June");
        }
        else if (x == 7) {
            System.out.print("July");
        }
        else if (x == 8) {
            System.out.print("August");
        }
        else if (x == 9) {
            System.out.print("September");
        }
        else if (x == 10) {
            System.out.print("October");
        }
        else if (x == 11) {
            System.out.print("November");
        }
        else if (x == 12) {
            System.out.print("December");
        }
        else
            System.out.print("Invalid Month");

    }

}



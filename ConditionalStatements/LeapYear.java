package ConditionalStatements;

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year you want to check for leap year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("Not a leap year");
            } else {
                System.out.println("It is a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

        sc.close();
    }
}
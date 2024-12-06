package Recursion;

import java.util.*;

public class YearToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        convertToString(year);
        sc.close();
    }

    public static void convertToString(int year) {
        if (year == 0)
            return;

        convertToString(year / 10);

        int curr = year % 10;
        switch (curr) {
            case 0:
                System.out.print("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
        }
    }
}

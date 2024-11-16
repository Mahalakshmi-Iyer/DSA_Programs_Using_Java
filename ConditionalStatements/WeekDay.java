package ConditionalStatements;

import java.util.*;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number in the week: ");
        int day = sc.nextInt();

        String weekday;

        switch (day) {
            case 1:
                weekday = "Monday";
                break;

            case 2:
                weekday = "Tuesday";
                break;

            case 3:
                weekday = "Wednesday";
                break;

            case 4:
                weekday = "Thursday";
                break;

            case 5:
                weekday = "Friday";
                break;

            case 6:
                weekday = "Saturday";
                break;

            case 7:
                weekday = "Sunday";
                break;

            default:
                weekday = "You have entered an invalid day number";
        }
        if (day >= 1 && day <= 7) {
            System.out.println("Today is " + weekday);
        } else {
            System.out.println(weekday);
        }

        sc.close();
    }
}

package Functions;

import java.util.*;

public class AvgOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = calculateAvg(a, b, c);
        System.out.println("The average of these numbers is : " + avg);
        sc.close();
    }

    public static float calculateAvg(int a, int b, int c) {
        float avg = (a + b + c) / 3;
        return avg;
    }
}

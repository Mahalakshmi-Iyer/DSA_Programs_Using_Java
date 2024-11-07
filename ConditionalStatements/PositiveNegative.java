package Day7;

import java.util.*;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println(n + " is a positive number");
        } else if (n < 0) {
            System.out.println(n + " is a negative number");
        } else {
            System.out.println("You have entered zero");
        }
    }
}

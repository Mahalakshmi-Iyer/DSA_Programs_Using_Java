package Functions;

import java.util.*;

public class CheckIfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for even/odd : ");
        int n = sc.nextInt();

        boolean ans = isEven(n);

        System.out.println(ans ? "It is even" : "It is odd");
        sc.close();
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }
}

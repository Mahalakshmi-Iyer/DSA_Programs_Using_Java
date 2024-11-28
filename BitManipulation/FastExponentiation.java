package BitManipulation;

import java.util.*;

public class FastExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BINARY EXPONENTIATION");
        System.out.println("Enter the base a : ");
        int a = sc.nextInt();
        System.out.println("Enter the power n : ");
        int n = sc.nextInt();

        int ans = fastExpo(a, n);
        System.out.println("Result : " + ans);
        sc.close();
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n != 0) {
            if ((n & 1) == 1) {
                ans *= a;
            }
            a *= a;
            n >>= 1;
        }
        return ans;
    }
}

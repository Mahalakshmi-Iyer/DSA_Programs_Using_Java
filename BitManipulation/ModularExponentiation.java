package BitManipulation;

import java.util.*;

public class ModularExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MODULAR EXPONENTIATION");
        System.out.println("Enter the base a : ");
        int a = sc.nextInt();
        System.out.println("Enter the power n : ");
        int n = sc.nextInt();
        System.out.println("Enter the mod value : ");
        int mod = sc.nextInt();

        int ans = modularExpo(a, n, mod);
        System.out.println("Result : " + ans);
        sc.close();
    }

    public static int modularExpo(int a, int n, int mod) {
        a = a % mod;
        if (a == 0)
            return 0;

        int ans = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            n = n >> 1;
        }
        return ans;
    }
}

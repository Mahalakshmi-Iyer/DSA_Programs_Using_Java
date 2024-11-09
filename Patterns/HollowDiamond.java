package Patterns;

public class HollowDiamond {
    public static void main(String[] args) {
        int n = 7;
        int t = n / 2;

        for (int i = 1; i <= (t + 1); i++) {
            for (int k = 1; k <= (t - i + 1); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= t; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (n - 2 * i); j++) {
                if (j == 1 || j == (n - 2 * i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
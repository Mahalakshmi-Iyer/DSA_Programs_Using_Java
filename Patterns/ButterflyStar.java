package Patterns;

public class ButterflyStar {
    public static void main(String[] args) {
        int n = 4;
        int stars;
        int spaces = 2 * n - 3;
        for (int i = 1; i <= (2 * n - 1); i++) {
            stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            for (int k = 1; k <= spaces; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= stars; j++) {
                if (i == n && j == stars) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }

        }
    }
}
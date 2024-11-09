package Patterns;

public class XStar {
    public static void main(String[] args) {
        int n = 3;
        int spaces = 2 * n - 3;

        for (int i = 1; i <= (n - 1); i++) {
            for (int k = 1; k <= (i - 1); k++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int k = 1; k <= spaces; k++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            spaces -= 2;
            System.out.println();
        }

        for (int k = 1; k <= (n - 1); k++) {
            System.out.print("  ");
        }
        System.out.println("* ");

        spaces = 1;
        for (int i = 1; i <= (n - 1); i++) {
            for (int k = 1; k <= (n - i - 1); k++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int k = 1; k <= spaces; k++) {
                System.out.print("  ");
            }
            spaces += 2;
            System.out.print("* ");
            System.out.println();
        }
    }
}

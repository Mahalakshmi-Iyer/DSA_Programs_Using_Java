package Backtracking;

public class GridWays {
    public static void main(String[] args) {
        int n = 3, m = 3;

        int totalWays = gridWays(0, 0, n, m);
        System.out.println(
                "Total number of ways to reach from (0,0) to (" + (n - 1) + "," + (m - 1) + ") is : " + totalWays);
    }

    public static int gridWays(int x, int y, int n, int m) {
        // base case
        if (x == n - 1 && y == m - 1) {
            return 1;
        } else if (x == n || y == m) {
            return 0;
        }

        // recursion step
        int w1 = gridWays(x + 1, y, n, m); // right
        int w2 = gridWays(x, y + 1, n, m); // down
        return w1 + w2;
    }
}

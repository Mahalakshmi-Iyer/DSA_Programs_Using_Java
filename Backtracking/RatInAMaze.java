package Backtracking;

// TC : O(4^(n^2))
public class RatInAMaze {
    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        // int maze1[][] = {
        // { 1, 0, 0, 0 },
        // { 1, 1, 0, 1 },
        // { 0, 1, 0, 0 },
        // { 1, 1, 1, 1 }
        // };
        int maze2[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };

        ratMaze(maze2, n, 0, 0, "");
        System.out.println("Total ways : " + count);
    }

    public static void ratMaze(int maze[][], int n, int x, int y, String path) {
        // base case
        if (x >= n || y >= n || x < 0 || y < 0 || maze[x][y] == 0 || maze[x][y] == -1)
            return;
        if (x == n - 1 && y == n - 1) {
            System.out.println(path);
            count++;
            return;
        }

        // recursion step
        maze[x][y] = -1; // visit cell
        ratMaze(maze, n, x - 1, y, path + "U"); // top
        ratMaze(maze, n, x + 1, y, path + "D"); // bottom
        ratMaze(maze, n, x, y + 1, path + "R"); // right
        ratMaze(maze, n, x, y - 1, path + "L"); // left
        maze[x][y] = 1; // unvisit cell

    }
}

package Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        char dir;
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            dir = path.charAt(i);
            switch (dir) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    System.out.println("Invalid direction!");
                    return;
            }
        }
        float shortestPath = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.printf("Shortest path from destination to origin is : %.2f", shortestPath);
    }
}

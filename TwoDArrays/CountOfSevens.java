package TwoDArrays;

public class CountOfSevens {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 5, 7 },
                { 3, 7, 7 },
                { 7, 2, 9 }
        };
        int count = countSevens(matrix);
        System.out.println("Frequency of 7 in this matrix : " + count);
    }

    public static int countSevens(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}

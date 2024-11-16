package Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 1, 10, 20, 7 };
        System.out.println("Pairs in the array are : ");
        printPairs(numbers);
    }

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp); // formula = n(n-1)/2
    }
}

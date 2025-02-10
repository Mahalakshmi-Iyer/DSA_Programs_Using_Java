package GreedyAlgorithms;

public class KthLargestOddNo {
    public static void main(String[] args) {

        int l = -3, r = 3;
        int k = 2;
        int flag = 0;

        if (k <= 0) {
            System.out.println("Invalid input, enter a value greater than 0!");
            return;
        }

        for (int i = r; i >= l; i--) {
            if (k == 1 && Math.abs(i) % 2 == 1) {
                System.out.println("K-largest odd number is : " + i);
                flag = 1;
                break;
            }
            if (Math.abs(i) % 2 == 1) {
                k--;
            }
        }

        if (flag == 0)
            System.out.println("K is larger than the odd numbers in the range!");

    }
}

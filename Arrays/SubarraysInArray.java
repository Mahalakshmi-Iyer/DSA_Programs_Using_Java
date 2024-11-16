package Arrays;

public class SubarraysInArray {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        System.out.println("Subarrays of the array are : ");
        printSubarrays(numbers);
    }

    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) { // print subarray
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + ts); // formula = n(n+1)/2
    }
}

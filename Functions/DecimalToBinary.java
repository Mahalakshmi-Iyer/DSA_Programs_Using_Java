package Functions;

import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert to binary : ");
        int decNum = sc.nextInt();

        int binNum = decToBin(decNum);
        System.out.println("The binary form of " + decNum + " is " + binNum);
    }

    public static int decToBin(int decNum) {
        int rem = 0;
        int power = 0;
        int binNum = 0;

        while (decNum > 0) {
            rem = decNum % 2;
            binNum += rem * (int) Math.pow(10, power);
            power++;
            decNum /= 2;
        }

        return binNum;
    }
}

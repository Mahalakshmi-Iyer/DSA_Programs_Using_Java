package Functions;

import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number to convert to decimal : ");
        int binNum = sc.nextInt();

        int decNum = binToDec(binNum);
        System.out.println("The decimal form of " + binNum + " is " + decNum);
    }

    public static int binToDec(int binNum) {
        int lastDigit = 0;
        int decNum = 0;
        int power = 0;
        while (binNum > 0) {
            lastDigit = binNum % 10;
            decNum += lastDigit * (int) Math.pow(2, power);
            power++;
            binNum /= 10;
        }
        return decNum;
    }
}

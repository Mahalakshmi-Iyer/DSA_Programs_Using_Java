package BitManipulation;

import java.util.*;

public class BitOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU : 1. Check if no. is even  2. Get ith Bit  3. Set ith bit  4. Set ith Bit");
        System.out.println(
                "5. Clear ith Bit    6. Clear last i bits    7. Clear bits in range  8. Check if no. is a power of 2");

        int n, i, j;
        char c = 'Y';
        while (c == 'y' || c == 'Y') {
            System.out.println("Enter your choice : ");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter a number : ");
                    n = sc.nextInt();
                    boolean ans = checkForEven(n);
                    if (ans)
                        System.out.println("Number is even");
                    else
                        System.out.println("Number is odd");
                    break;

                case 2:
                    System.out.println("Enter a number : ");
                    n = sc.nextInt();
                    System.out.println("Enter value of i : ");
                    i = sc.nextInt();
                    int ithbit = getIthBit(n, i);
                    System.out.println("i th bit is : " + ithbit);
                    break;

                case 3:
                    System.out.println("Enter a number : ");
                    n = sc.nextInt();
                    System.out.println("Enter value of i : ");
                    i = sc.nextInt();
                    int newno = setIthBit(n, i);
                    System.out.println("The new number is : " + newno);
                    break;

                case 4:
                    System.out.println("Enter a number : ");
                    n = sc.nextInt();
                    System.out.println("Enter value of i : ");
                    i = sc.nextInt();
                    newno = clearIthBit(n, i);
                    System.out.println("The new number is : " + newno);
                    break;

                case 5:
                    System.out.println("Enter a number : ");
                    n = sc.nextInt();
                    System.out.println("Enter value of i : ");
                    i = sc.nextInt();
                    newno = clearLastIBits(n, i);
                    System.out.println("The new number is : " + newno);
                    break;

                case 6:
                    System.out.println("Enter a number : ");
                    n = sc.nextInt();
                    System.out.println("Enter value of i : ");
                    i = sc.nextInt();
                    System.out.println("Enter value of j : ");
                    j = sc.nextInt();
                    newno = clearBitsInRange(n, i, j);
                    System.out.println("The new number is : " + newno);
                    break;

                case 7:
                    System.out.println("Enter a number : ");
                    n = sc.nextInt();
                    ans = checkIfPowerOfTwo(n);
                    if (ans)
                        System.out.println("Number is a power of 2");
                    else
                        System.out.println("Number is not a power of 2");
                    break;

                default:
                    System.out.println("Invalid choice! Enter a choice between 1-7");
            }
            System.out.println("Enter y if you want to continue and n to exit : ");
            c = sc.next().charAt(0);
        }

        sc.close();

    }

    public static boolean checkForEven(int n) {
        if ((n & 1) == 1) // odd
            return false;
        else // even
            return true;
    }

    public static int getIthBit(int n, int i) {
        int bitmask = (1 << i);
        return ((n & bitmask)) >> i;
    }

    public static int setIthBit(int n, int i) {
        int bitmask = (1 << i);
        return (n | bitmask);
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }

    public static int clearLastIBits(int n, int i) {
        int bitmask = (~0) << i;
        return (n & bitmask);
    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = (~0) << j;
        int b = (1 << i) - 1;
        int bitmask = (a | b);
        return (n & bitmask);
    }

    public static boolean checkIfPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }
}

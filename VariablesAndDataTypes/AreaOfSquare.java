package VariablesAndDataTypes;

import java.util.*;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        float s = sc.nextFloat();

        float area = s * s;

        System.out.println("The area of the square is : " + area);
        sc.close();
    }
}

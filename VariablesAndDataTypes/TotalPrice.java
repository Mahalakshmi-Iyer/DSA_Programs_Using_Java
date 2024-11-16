package VariablesAndDataTypes;

import java.util.*;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil : ");
        float p1 = sc.nextFloat();
        System.out.println("Enter the price of pen : ");
        float p2 = sc.nextFloat();
        System.out.println("Enter the price of eraser : ");
        float p3 = sc.nextFloat();

        float total = p1 + p2 + p3;
        float gst = (18 * total) / 100;

        System.out.println("Total Price : " + total);
        System.out.println("Net amount : " + (total + gst));
        sc.close();
    }
}

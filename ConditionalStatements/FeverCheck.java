package ConditionalStatements;

import java.util.*;

public class FeverCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your body temperature: ");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("You have fever! Take care");
        } else {
            System.out.println("Yippie! You don't have fever");
        }
    }
}

package BasicPrograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:  ");
        int n = sc.nextInt();
        if (n != 0 && n >= 0) {
            if (n % 2 == 0) {
                System.out.println("The entered number is Even");
            } else {
                System.out.println("Entered value is odd");
            }
        } else {
            System.out.println("Enter a valid number");
        }

    }
}
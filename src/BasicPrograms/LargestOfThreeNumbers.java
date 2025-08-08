package BasicPrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && b > c) {
            System.out.println("The largest number is: " + a);
        } else if (b > c && a < c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }

    }
}
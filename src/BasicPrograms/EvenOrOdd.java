package BasicPrograms;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:  ");
        int n = sc.nextInt();

        System.out.println("Even numbers from 0 to " + n + " is");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers from 0 to " + n + " is");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
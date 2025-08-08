package BasicPrograms;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial cannot be calculated for negative numbers");
            return -1L;
        } else {
            return n != 0 && n != 1 ? (long)n * factorial(n - 1) : 1L;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of the number " + n + " is: " + factorial(n));
    }
}

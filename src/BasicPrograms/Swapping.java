package BasicPrograms;

import java.util.Scanner;

public class Swapping {
    public void swap(int a, int b) {
        a += b;
        b = a - b;
        a -= b;
        System.out.println("The variables after Swapping is :");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int b = sc.nextInt();
        Swapping S = new Swapping();
        S.swap(a, b);
    }
}

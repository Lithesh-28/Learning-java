package stringDemo;


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String first = sc.nextLine();
        String second = "";

        for (int i = first.length() - 1; i >= 0; i--) {
            second += first.charAt(i);
        }
        System.out.println("Original String :"+first);

        if(first.equals(second))
            System.out.println("Given String is palindrome");
        else
            System.out.println("Given String is not palindrome");

        System.out.println("Reversed String is: ");
        System.out.println(second);

    }
}

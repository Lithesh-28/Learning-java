package BasicPrograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        int sum = 0;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse: ");
        int n = sc.nextInt();

        while(n!=0){
            temp = n%10;
            sum = sum*10 + temp;
            n/=10;
        }
        System.out.println("After reverse "+sum);
        if(n == sum)
            System.out.println("The entered number is palindrome");
        else
            System.out.println("The entered number is not palindrome");

    }
}

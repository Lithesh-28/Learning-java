package BasicPrograms;

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args){
        int sum = 0;
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number with more than one digit: ");
        int n = sc.nextInt();

        System.out.print("The sum of digits is ");
        while(n != 0){
            temp = n % 10;
            sum+=temp;
            n/=10;
        }
        System.out.print(sum);
    }
}

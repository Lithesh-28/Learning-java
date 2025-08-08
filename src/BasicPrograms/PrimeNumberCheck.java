package BasicPrograms;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static boolean isprime(int n){
        if(n<=0)
            return false;
        else if(n==2)
            return true;
        else if(n%2 == 0)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isprime(n))
            System.out.println("The entered number "+n+" is a prime number");
        else
            System.out.println("The entered number "+n+" is not a prime number");
    }
}


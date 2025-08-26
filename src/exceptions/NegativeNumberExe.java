package exceptions;

import java.util.Scanner;

public class NegativeNumberExe extends Exception{
    String message;

    public NegativeNumberExe(String message) {
        super(message);
    }
}

class Main1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        try{
            if(num<0)
                throw new NegativeNumberExe("The number should always be positive");
            System.out.println("The entered number is: "+num);
        }catch (NegativeNumberExe e){
            System.out.println(e.getMessage());
        }
    }
}

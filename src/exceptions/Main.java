package exceptions;

import java.util.Scanner;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int div = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            if (b == 0)
                throw new CustomException("cannot divide br zero");
            div = a/b;
        }catch (CustomException e){
            div = 0;
            System.out.println(div);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(div);
    }
}

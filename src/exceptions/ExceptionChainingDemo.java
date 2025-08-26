package exceptions;

import java.util.Scanner;

public class ExceptionChainingDemo{

    public static float operation(int n) throws CalculateException{
        try {
            if(n==0)
                throw new ArithmeticException();
            return (float) 100 / n;
        }catch (ArithmeticException e){
            throw new CalculateException("Error: Cannot divide by zero ",e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n = sc.nextInt();

        try {
            float result = operation(n);
            System.out.println(result);
        }catch (CalculateException e){
            System.out.println(e.getMessage());
            System.out.println("original exception is: "+e.getCause());
        }

        sc.close();
    }
}

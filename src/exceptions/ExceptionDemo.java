package exceptions;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        float i;
        float j;
        float res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        i = sc.nextFloat();
        j = sc.nextFloat();
        try {
            if (j == 0)
                throw new ArithmeticException();
            else
                res = i / j;
        } catch (ArithmeticException e){
            float res1 = i / 2;
            System.out.println("Cannot divide by zero "+e);
        }finally {
            System.out.println("division output is: "+res);
        }
    }
}

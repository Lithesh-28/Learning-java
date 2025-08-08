package OopsAndCalculator;

import java.util.Scanner;

public class SimpleCalculator {
    Scanner sc = new Scanner(System.in);
    int conti;

    public void calculate() {
        do {

            System.out.println("Enter the first number: ");
            int a = sc.nextInt();
            System.out.println("Enter the second number: ");
            int b = sc.nextInt();
            System.out.println("Enter the operator: ");
            char op = sc.next().charAt(0);
            int result;

            switch (op) {
                case '+':
                    result = a + b;
                    System.out.println(a + " + " + b + " = " + result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println(a + " - " + b + " = " + result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println(a + " * " + b + " = " + result);
                    break;
                case '/':
                    if (b != 0) {
                        result = a / b;
                        System.out.println(a + " / " + b + " = " + result);
                    } else {
                        System.out.println("Cannot divide a number by ZERO!!!!!!");
                    }
                    break;
                case '%':
                    result = a % b;
                    System.out.println(a + " % " + b + " = " + result);
                    break;
            }

            System.out.println("Do you wish to continue" + "\nEnter Zero to exit : ");
            conti = sc.nextInt();

        } while (conti != 0);
    }
}

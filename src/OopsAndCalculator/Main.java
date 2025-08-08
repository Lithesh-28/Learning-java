package OopsAndCalculator;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student S = new SubClass();
        S.EnterInput();
        S.display();
        System.out.println("Enter true or false to use calculator: ");
        boolean cal = sc.nextBoolean();
        if(cal){
            SimpleCalculator SC = new SimpleCalculator();
            SC.calculate();
        }
        else exit(0);


    }
}

package BasicPrograms;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f1 = 0 ,f2 = 1, f3 = 0 , count=2;
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("The fibonaccci series till "+n+" is\n"+f1+" "+f2+" ");
        while(count < n){
           f3 = f1 + f2;
           System.out.print(f3+" ");
           f1 = f2;
           f2 = f3;
           count++;
        }
    }
}

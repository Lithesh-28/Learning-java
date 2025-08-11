package BasicPrograms;

import java.util.Scanner;

public class WhiteSpaceRemoval {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String noSpace = string.replaceAll("\\s+","");
        System.out.println("After the removal of spaces: ");
        System.out.println(noSpace);

        sc.close();
    }
}

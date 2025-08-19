package stringDemo;

import java.util.Scanner;

public class VowelsAndConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sting: ");
        String words = sc.nextLine();
        int vowels = 0;
        int conso = 0;
        int count = 0;
        boolean inWord = false;

        for(int i = 0; i <= words.length()-1; i++){
            char ch = words.charAt(i);
            if(ch!=' ') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    conso++;
            }
        }
        for(int i = 0; i <= words.length()-1; i++){
            char ch = words.charAt(i);
            if (ch != ' '){
                if(!inWord){
                    count++;
                    inWord = true;
                }
            }else
                inWord = false;
        }

        System.out.println(words);
        System.out.print("The number of vowels in the string are: "+vowels);
        System.out.print("\nThe number of consonents in the string are: "+conso);
        System.out.print("\nThe number of words in the string are: "+ count);
    }
}

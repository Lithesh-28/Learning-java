package BasicPrograms;

public class Patterns {
    public static void main(String[] args){
        int i ,j;
        for (i = 1; i <= 5; i++){
            for (j = i; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 5; i >= 1; i--){
            for (j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 0; i < 5; i++){
            for (j = 0; j < 5; j++){
                if(i == 0||j == 0|| i == 5-1|| j == 5-1){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 2 * (5 - i); j++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

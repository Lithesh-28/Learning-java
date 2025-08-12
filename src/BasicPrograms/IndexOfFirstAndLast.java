package BasicPrograms;

import java.util.Scanner;

public class IndexOfFirstAndLast {
    public static void firstAndLastIndex(int[] arr, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    if (first == -1)
                        first = i + 1;
                    last = i + 1;
                }
            }
        if (first == -1)
            System.out.println("There is no such element in the array");
        else
        {
            System.out.println("The first index of "+target+" is: " + first);
            System.out.println("The last index of "+target+" is: "+ last);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        firstAndLastIndex(arr,target);

    }
}

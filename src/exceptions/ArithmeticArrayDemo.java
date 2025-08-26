package exceptions;

public class ArithmeticArrayDemo {
    public static void main(String[] args) {
        int res =0 ;
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 0;
        arr[4] = 6;

        try{
            for (int i=0 ; i<=arr.length; i++){
                System.out.println(arr[i]);
                if(arr[i+1]==0){
                    throw new ArithmeticException("cannot divide by zero");
                }
                res = arr[i]/arr[i+1];
            }
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("exception Occurred");
        }
        System.out.println(res);
    }
}

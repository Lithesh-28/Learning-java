package exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            File file = new File("hello.txt");
            if(file.createNewFile()) {
                System.out.println("File created Successfully");
            } else {
                System.out.println("File Already exists");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("hello.txt",true)) {
            fw.append("Hello world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

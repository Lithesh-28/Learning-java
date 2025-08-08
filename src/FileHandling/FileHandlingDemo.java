package FileHandling;

import java.io.IOException;
import java.io.InputStreamReader;
public class FileHandlingDemo {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter some letters ");
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

//        try(FileReader fr= new FileReader("hello.txt")){
//            System.out.println("Enter some letters ");
//            int letters= fr.read();
//            while(fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read();
//            }
//            System.out.println();
//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try(FileWriter fw = new FileWriter("hello.txt",true)){
//           fw.write("this should be written");
//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        // Create New file using File Class

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.InputStreamReader;
//
//        public class FileHandling {
//
//
//            public void newFile()
//            {
//                String strPath , strName ;
//
//
//                try {
//                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                    System.out.print("Enter the file name : ");
//                    strName = br.readLine();
//                    System.out.print("Enter the file path : ");
//                    strPath = br.readLine();
//                    File file1 = new File(strPath + "\\" + strName + ".txt");
//                    file1.createNewFile();
//                }
//                catch (Exception ex1) {
//                    System.out.print("Failed to create a file.");
//                }
//            }
//
//            public static void main(String[] args){
//
//                CreateUsingFile gfg = new CreateUsingFile();
//                gfg.newFile();
//            }
//        }

// Write into a File
// using FileWriterClass
//import java.io.BufferedReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class FileHandling
//{
//    public static void main(String[] args)
//    {
//        String text = "Helloo!!!!!!\nHappy Learning!";
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//            System.out.print("Enter the Path : ");
//            String path = br.readLine();
//            FileWriter fWriter = new FileWriter(path);
//            fWriter.write(text);
//            System.out.println(text);
//            fWriter.close();
//        }
//        catch (IOException e) {
//            System.out.print(e.getMessage());
//        }
//    }
//}
// Delete a file using
// java.io.File.delete() Method
//import java.io.*;
//
//public class FileHandling
//{
//    public static void main(String[] args) throws IOException
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.print("Enter the Path : ");
//        String path = br.readLine();
//        File file = new File(path);
//        if (file.delete()) {
//            System.out.println("File deleted successfully");
//        }
//        else {
//            System.out.println("Failed to delete the file");
//        }
//    }
//}
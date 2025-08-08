package OopsAndCalculator;

import java.util.Scanner;

public abstract class Student {
    int regno;
    String name;
    int mark1;
    int mark2;
    int mark3;

    public Student(int regno , String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.regno = regno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public Student(){

    }
    public void EnterInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the regno: ");
        this.regno = sc.nextInt();
        System.out.println("Enter the name: ");
        this.name = sc.next();
        System.out.println("enter the marks of three subject: ");
        this.mark1 = sc.nextInt();
        this.mark2 = sc.nextInt();
        this.mark3 = sc.nextInt();
    }
    public double percentage(){
        return (mark1 + mark2 + mark3)/3.0;
    }

    public abstract String calculateGrade();


    public void display(){
        System.out.println("------------------------------------------");
        System.out.println("Register no: "+regno);
        System.out.println("Name: "+name);
        System.out.println("Mark1: "+mark1);
        System.out.println("Mark2: "+mark2);
        System.out.println("Mark3: "+mark3);
        System.out.println("Percentage: "+percentage());

    }
}
class SubClass extends Student{

    public SubClass(int regno, String name, int mark1, int mark2, int mark3) {
        super(regno, name, mark1, mark2, mark3);
    }
    public SubClass(){

    }

    public String calculateGrade(){
        double percent = percentage();
          if(percent <= 100)
              return "Distinction";
          else if(percent >= 75)
              return "First class";
          else
              return "Fail";

    }
    @Override
    public void display(){
        super.display();
        System.out.println("Grade: "+calculateGrade());
        System.out.println("------------------------------------------");
    }
}

package EmployeePayrollSystem;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayRollSystem prs = new PayRollSystem();

        while (true) {
            System.out.println("\n=== Employee Payroll System ===");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String nameFT = sc.nextLine();
                    System.out.print("Enter ID: ");
                    int idFT = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Department (HR, IT, SALES, MARKETING): ");
                    Department deptFT = Department.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Enter City: ");
                    String cityFT = sc.nextLine();
                    System.out.print("Enter State: ");
                    String stateFT = sc.nextLine();
                    System.out.print("Enter Monthly Salary: ");
                    double salaryFT = sc.nextDouble();

                    prs.addEmp(new FullTimeEmp(nameFT, idFT, deptFT, new Address(cityFT, stateFT), salaryFT));
                    System.out.println("Full-Time Employee Added!");
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    String namePT = sc.nextLine();
                    System.out.print("Enter ID: ");
                    int idPT = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Department (HR, IT, SALES, MARKETING): ");
                    Department deptPT = Department.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Enter City: ");
                    String cityPT = sc.nextLine();
                    System.out.print("Enter State: ");
                    String statePT = sc.nextLine();
                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();
                    System.out.print("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();

                    prs.addEmp(new PartTimeEmp(namePT, idPT, deptPT, new Address(cityPT, statePT), hours, rate));
                    System.out.println("Part-Time Employee Added!");
                    break;

                case 3:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = sc.nextInt();
                    prs.removeEmp(removeId);
                    break;

                case 4:
                    prs.displayEmp();
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

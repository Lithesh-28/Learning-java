package EmployeePayrollSystem;

import java.util.ArrayList;
import java.util.Iterator;

class PayRollSystem {
    private ArrayList<Employee> empList = new ArrayList<>();

    // Method overloading for adding employees
    public void addEmp(Employee emp) {
        empList.add(emp);
    }


    public void removeEmp(int id) {
        Employee empToRemove = null;
        for (Employee emp : empList) {
            if (emp.getId() == id) {
                empToRemove = emp;
                break;
            }
        }
        if (empToRemove != null) {
            empList.remove(empToRemove);
            System.out.println("Employee removed successfully !!!!");
        } else {
            System.out.println("No employee found with ID: " + id);
        }
    }

    public void displayEmp() {
        if (empList.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }

    public int getEmployee(){
        int count = 0;
        Iterator<Employee> it = empList.iterator();
        while(it.hasNext()){
            it.next();
            count++;

        }
        return count;
    }
}

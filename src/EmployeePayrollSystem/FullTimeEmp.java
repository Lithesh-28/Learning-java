package EmployeePayrollSystem;

class FullTimeEmp extends Employee {
    private double monthlySalary;

    public FullTimeEmp(String name, int id, Department department, Address address, double monthlySalary) {
        super(name, id, department, address);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public double calculateBonus() {
        return monthlySalary * 0.10; // 10% bonus
    }
}
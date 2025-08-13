package EmployeePayrollSystem;

class PartTimeEmp extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmp(String name, int id, Department department, Address address, int hoursWorked, double hourlyRate) {
        super(name, id, department, address);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public double calculateBonus() {
        return calculateSalary() * 0.05; // 5% bonus
    }
}

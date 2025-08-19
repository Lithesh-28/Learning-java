package EmployeePayrollSystem;

abstract class Employee implements payable {
    private String name;
    private int id;
    private Department department;
    private Address address;


    public Employee(String name, int id, Department department, Address address) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public Department getDepartment() {
        return department;
    }
    public Address getAddress() {
        return address;
    }

   abstract public double calculateSalary();

    @Override
    public String toString() {
        return "Employee [" +
                "Name='" + name + '\'' +
                ", ID=" + id +
                ", Department=" + department +
                ", Address=" + address +
                ", Salary=" + calculateSalary() +
                ", Bonus=" + calculateBonus() +
                ']';
    }
}
package org.example.inheritance.iheritanceChallange1;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static  int employeeNumber = 1;

    public Employee(String name, String dob, String hireDate) {
        super(name, dob);
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

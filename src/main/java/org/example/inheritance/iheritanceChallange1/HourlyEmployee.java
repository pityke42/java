package org.example.inheritance.iheritanceChallange1;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String dob, String hireDate, double hourlyPayRate) {
        super(name, dob, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
    @Override
    public double collectPay(){
        return 40 * hourlyPayRate;
    }
    public double getDoublePay(){
        return 2 * collectPay();
    }
}

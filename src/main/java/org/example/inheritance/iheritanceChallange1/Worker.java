package org.example.inheritance.iheritanceChallange1;
import java.lang.*;

public class Worker {
    private String name;
    private String dob;
    protected String endDate;
    public int getAge(){
        int currentYear = 2024;
        int birthYear = Integer.parseInt(dob.substring(6));
        return currentYear - birthYear;
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }
    public Worker(){

    }

    public Worker(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

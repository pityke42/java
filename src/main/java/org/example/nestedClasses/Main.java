package org.example.nestedClasses;

import org.example.nestedClasses.domain.Employee;
import org.example.nestedClasses.domain.EmployeeComparator;
import org.example.nestedClasses.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee(1, "ralph", 2015),
                new Employee(23, "Carole", 2021),
                new Employee(3, "Jane", 2013),
                new Employee(4, "Laura", 2020),
                new Employee(6, "Jim", 2018)
        ));

//        var comparator = new EmployeeComparator<>();
//        employeeList.sort(comparator);

        employeeList.sort(new EmployeeComparator<>().reversed());

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("Store Members");

        List<org.example.nestedClasses.domain.StoreEmployee> storeEmployees = new ArrayList<>(
                List.of(
                        new StoreEmployee(1002, "Meg", 2019, "Target"),
                        new StoreEmployee(2353, "joe", 2021, "walmart"),
                        new StoreEmployee(3214, "tom", 2020, "macys"),
                        new StoreEmployee(34533, "Marty", 2018, "Walmart"),
                        new StoreEmployee(1233, "Bud", 2016, "Target")
                )
        );

//        var comparator = new Employee.EmployeeComparator<>();
        var genericEmployee = new StoreEmployee();
        var comparator = genericEmployee.new StoreComparator<>();
        storeEmployees.sort(comparator);
        storeEmployees.forEach(storeEmployee -> System.out.println(storeEmployee));

        System.out.println("With pig latin name");
        addPigLatinName(storeEmployees);


    }
    public static void addPigLatinName(List<? extends StoreEmployee> list){
        String lastname = "Piggy";
        class DecoratedEmployee extends StoreEmployee implements Comparable<DecoratedEmployee>{
            private String pigLantinName;
            private Employee originalInstance;

            public DecoratedEmployee(String pigLantinName, Employee originalInstance) {
                this.pigLantinName = pigLantinName + " " + lastname;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString() + " " + pigLantinName;
            }

            @Override
            public int compareTo(DecoratedEmployee o) {
                return pigLantinName.compareTo(o.pigLantinName);
            }
        }
        List<DecoratedEmployee> newList = new ArrayList<>(list.size());
        for(var employee : list){
            String name = employee.getName();
            String pigLatin = name.substring(1) + name.charAt(0) + "ay";
            newList.add(new DecoratedEmployee(pigLatin, employee));
        }
        newList.sort(null);
        for(var dEmployee : newList){
            System.out.println(dEmployee.originalInstance.getName() + " " + dEmployee.pigLantinName);
        }
    }
}

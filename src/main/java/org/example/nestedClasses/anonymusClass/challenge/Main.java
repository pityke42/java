package org.example.nestedClasses.anonymusClass.challenge;

import org.example.nestedClasses.domain.StoreEmployee;

import java.time.LocalDate;
import java.util.*;
import java.util.spi.LocaleServiceProvider;

 record Employee(String firstName, String lastName, String hireDate) {
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");
        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));
        printOrderedList(list, "name");
        printOrderedList(list,"year");
    }
    public static void printOrderedList(List<Employee> list, String sortField) {
        int curyear = LocalDate.now().getYear();
        class MyEmployee {
            Employee containedEmployee;
            int yearsWorked;
            String fullname;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = curyear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                fullname = String.join(" ", containedEmployee.firstName(), containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has beenn an employee for %d years".formatted(fullname, yearsWorked);
            }
        }

        List<MyEmployee> list2 = new ArrayList<>();
        for (Employee employee : list) {
            list2.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if(sortField.equals("name")){
                    return o1.fullname.compareTo(o2.fullname);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };
        list2.sort(comparator);
        for(MyEmployee myEmployee : list2){
            System.out.println(myEmployee);
        }
    }
}

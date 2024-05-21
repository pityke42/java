package org.example.nestedClasses.anonymusClass;

import org.example.nestedClasses.burger.Store;
import org.example.nestedClasses.domain.Employee;
import org.example.nestedClasses.domain.EmployeeComparator;
import org.example.nestedClasses.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {
    public static void main(String[] args) {
        List<StoreEmployee> storeEmployees = new ArrayList<>(
                List.of(
                        new StoreEmployee(1002, "Meg", 2019, "Target"),
                        new StoreEmployee(2353, "joe", 2021, "walmart"),
                        new StoreEmployee(3214, "tom", 2020, "macys"),
                        new StoreEmployee(34533, "Marty", 2018, "Walmart"),
                        new StoreEmployee(1233, "Bud", 2016, "Target")
                )
        );
        var c0 = new EmployeeComparator<StoreEmployee>();
        var c1 = new Employee.EmployeeComparator<StoreEmployee>();
        var c2 = new StoreEmployee().new StoreComparator<StoreEmployee>();

        //using local class
        class NameSort<T> implements Comparator<StoreEmployee>{
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        var c3 = new NameSort<StoreEmployee>();

        //using anonymous class
        var c4 = new Comparator<StoreEmployee>(){
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        sortIt(storeEmployees, c0);
        sortIt(storeEmployees, c1);
        sortIt(storeEmployees, c2);
        sortIt(storeEmployees, c3);
        sortIt(storeEmployees, c4);
        sortIt(storeEmployees, new Comparator<StoreEmployee>(){
            @Override
            public int compare(StoreEmployee o1, StoreEmployee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator){
        System.out.println("Sorting with comparator: " + comparator.toString());
        list.sort(comparator);
        for(var employee : list){
            System.out.println(employee);
        }
    }
}

package com.cs.trial.algo;

import java.util.*;

public class EqualsHashCode {
    static {
        System.out.println("Static block");
    }
    {
        System.out.println("Initail block");
    }
    public EqualsHashCode(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        EqualsHashCode eq = new EqualsHashCode();
        Employee e1 = new Employee("Chintan", "IT", "1001", 10000);
        Employee e2 = new Employee("Shah", "HR", "1002", 20000);
        Employee e3 = new Employee("Chintan", "IT", "1001", 10000);
        List<Employee> employeeList = new ArrayList<>();
        Set<Employee> employeeSet = new HashSet<>();
        HashSet<Employee> employeeHashSet = new HashSet<>();
        HashMap<Employee, String> employeeHashMap = new HashMap<>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);

        employeeHashSet.add(e1);
        employeeHashSet.add(e2);
        employeeHashSet.add(e3);

        employeeHashMap.put(e1, "1");
        employeeHashMap.put(e2, "2");
        employeeHashMap.put(e3, "3");

        System.out.println(employeeList.size());
        System.out.println(employeeSet.size());
        System.out.println(employeeHashSet.size());
        System.out.println(employeeHashMap.size());
        //employeeList.stream().forEach(System.out::println);

        //employeeSet.stream().forEach(System.out::println);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.hashCode() +" "+ e2.hashCode()+ " " + e3.hashCode());
    }
}

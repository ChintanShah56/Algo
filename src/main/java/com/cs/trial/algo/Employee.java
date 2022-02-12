package com.cs.trial.algo;

import java.util.Objects;

public class Employee {
    private String name;
    private String department;
    private String employeeId;
    private int salary;

    public Employee(String name, String department, String employeeId, int salary) {
        this.name = name;
        this.department = department;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getSalary() == employee.getSalary() && getName().equals(employee.getName()) && getDepartment().equals(employee.getDepartment()) && getEmployeeId().equals(employee.getEmployeeId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment(), getEmployeeId(), getSalary());
    }

    @Override
    public String toString() {
        return "com.cs.trial.algo.Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                '}';
    }
}

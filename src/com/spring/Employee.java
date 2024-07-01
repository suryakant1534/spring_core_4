package com.spring;

public class Employee {
    static {
        System.out.println("Class initialized");
    }

    private int id;
    private String name;
    private double salary;
    public Employee() {
        System.out.println("Employee Constructor");
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

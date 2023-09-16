package com.example.oop;

import java.util.Arrays;

public class Department extends Employee {
    String name;
    Employee[] employees=new Employee[3];


    public Department(int id, String fullName, String jobName, double price, int childrenNumber) {
        super(id, fullName, jobName, price, childrenNumber);
    }
}



//داله لطباعه عدد الموظفين بالقسم

/*public static void printEmployeeCountInDepartment(Employee[] employees, String targetDepartment) {
        long employeeCount = Arrays.stream(employees)
                .filter(employee -> employee.getDepartment().equals(targetDepartment))
                .count();

        System.out.println("عدد الموظفين في القسم " + targetDepartment + ": " + employeeCount);*/



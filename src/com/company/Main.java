package com.company;

public class Main {

    public static void main(String[] args) {
        Department department = new Department("Company", "1");
        Employee employee = new Employee("Storozhko", "1", 30, 24);
        Employee employee2 = new Employee("Bezhatchenko", "1", 30, 24);

        department.addEmployee(employee);
        department.addEmployee(employee2);
        System.out.println(employee.getAnnualCost());
        System.out.println(department.getAnnualCost());
    }
}

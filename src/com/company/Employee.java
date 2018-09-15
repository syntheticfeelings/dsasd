package com.company;

public class Employee extends Company {


    public Employee(String name, String id, int salary, int workingTime) {
        super(name, id);
        this.salary = salary;
        this.workingTime = workingTime;
    }

    private int salary;
    private int workingTime;

    @Override
    public double getAnnualCost() {
        /*
        this method calculated annual cost for employee
         */
        return salary * workingTime;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkingTime(int workingTime) {
        this.workingTime = workingTime;
    }
}

package com.company;

import java.util.ArrayList;

public class Company implements Functions {
    private String name;
    private String id;
    private double annualCost;
    protected ArrayList<Employee> employees = new ArrayList<>();


    public Company(String name, String id, double annualCost) {
        this.name = name;
        this.id = id;
        this.annualCost = annualCost;
    }

    public Company(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getAnnualCost() {
        return annualCost;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

}

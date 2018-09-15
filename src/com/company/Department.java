package com.company;

import java.util.List;

class Department extends Company {

    public Department(String name, String id) {
        super(name, id);
    }

    List<Employee> addEmployee(Employee e) {
        employees.add(e);
        return employees;
    }

    @Override
    public double getAnnualCost() {
        /*
        this method calculated annual cost for Department
         */
        int annualCostsForAllEmployees = 0;
        for (Employee employee : employees) {
            annualCostsForAllEmployees += employee.getAnnualCost();
        }
        return annualCostsForAllEmployees;
    }


}

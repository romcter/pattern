package com.example.iterator;

public class Company implements Iterable {

    private Employee[] employee;

    public Company(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator(employee);
    }
}

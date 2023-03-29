package com.example.iterator;

public class EmployeeIterator implements Iterator {

    private int index;
    private Employee[] employee;

    public EmployeeIterator(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public boolean hasNext() {
        return employee.length > index;
    }

    @Override
    public Object next() {
        return employee[index++];
    }
}

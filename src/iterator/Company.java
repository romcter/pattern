package iterator;

public class Company implements Iterable {

    private Employee[] employee;

    public Company(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }


    public static class Employee {
        String name;
        String lastName;

        public Employee(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }


    private class EmployeeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return employee.length > index;
        }

        @Override
        public Object next() {
            return employee[index++];
        }
    }
}

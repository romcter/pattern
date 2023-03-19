package iterator;

public class IteratorCompanyRunner {
    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
                new Employee("Roman", "Pryimuk"),
                new Employee("Den", "Lion"),
                new Employee("Chin", "Pion"),
                new Employee("Pin", "Cava"),
                new Employee("Din", "Nint"),
                new Employee("Fin", "Pint")
        };

        Company company = new Company(employees);

        Iterator iterator = company.getIterator();

        System.out.println("All employees: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

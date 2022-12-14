package iterator;

public class IteratorCompanyRunner {
    public static void main(String[] args) {

        Company.Employee[] employees = new Company.Employee[]{
                new Company.Employee("Roman", "Pryimuk"),
                new Company.Employee("Den", "Lion"),
                new Company.Employee("Chin", "Pion"),
                new Company.Employee("Pin", "Cava"),
                new Company.Employee("Din", "Nint"),
                new Company.Employee("Fin", "Pint")
        };

        Company company = new Company(employees);

        Iterator iterator = company.getIterator();

        System.out.println("All employees: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

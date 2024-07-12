import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person person = new Person("Priya");
        Employee e = new Employee(person, 800000,2025, "ABC225");

        System.out.println("Testing getters:");
        e.displaydetails();

        System.out.println("-----------------");

        System.out.println("Testing setters:");
        System.out.print("Enter name: ");
        e.setName(sc.next());
        System.out.print("Enter annual salary: ");
        e.setAnnualSalary(sc.nextDouble());
        System.out.print("Enter start year: ");
        e.setStartYear(sc.nextInt());
        System.out.print("Enter national insurance number: ");
        e.setNationalInsuranceNumber(sc.next());
        System.out.println("------------------");
        e.displaydetails();
    }
}
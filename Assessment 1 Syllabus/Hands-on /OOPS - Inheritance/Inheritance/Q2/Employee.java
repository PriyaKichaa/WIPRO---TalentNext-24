public class Employee extends Person {
    private double annual_salary;
    private int start_year;
    private String national_insurance_number;

    Employee(Person person, double annual_salary, int start_year, String national_insurance_number) {
        super(person.getName());
        this.annual_salary = annual_salary;
        this.start_year = start_year;
        this.national_insurance_number = national_insurance_number;
    }

    public double getAnnualSalary() {
        return annual_salary;
    }

    public int getStartYear() {
        return start_year;
    }

    public String getNationalInsuranceNumber() {
        return national_insurance_number;
    }

    public void setAnnualSalary(double annual_salary) {
        this.annual_salary = annual_salary;
    }

    public void setStartYear(int start_year) {
        this.start_year = start_year;
    }

    public void setNationalInsuranceNumber(String national_insurance_number) {
        this.national_insurance_number = national_insurance_number;
    }

    public void displaydetails() {
        System.out.println("Name: " + getName());
        System.out.println("Annual Salary: " + getAnnualSalary());
        System.out.println("Start Year: " + getStartYear());
        System.out.println("National Insurance Number: " + getNationalInsuranceNumber());
    }

}

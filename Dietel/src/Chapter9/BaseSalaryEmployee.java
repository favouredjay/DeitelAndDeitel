package Chapter9;

public class BaseSalaryEmployee {
    String firstName;
    String lastName;
    double salary;

    public BaseSalaryEmployee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary= salary;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

@Override
    public String toString(){
        return  String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "base-salaried commissioned employee", firstName,lastName, "salary is ", salary);
    }
}

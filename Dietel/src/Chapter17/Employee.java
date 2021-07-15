package Chapter17;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String department;
    public Employee(String firstName, String lastName, double salary, String department){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getName(String firstName, String lastName){
        return toString().formatted("%s %2s ,", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %5s %7s %11s", firstName, lastName, salary, department);
    }
}

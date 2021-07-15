package Chapter9;

public class BaseSalaryEmployeeTest {

    public static void main(String[] args) {
        BaseSalaryEmployee employee = new BaseSalaryEmployee("JOY", "UDOM", 50000000);

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());



        employee.setSalary(100000000);

        System.out.printf("%n%s:%n%n%s%n", employee.toString());
    }
}

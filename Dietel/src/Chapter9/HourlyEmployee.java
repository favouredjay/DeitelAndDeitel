package Chapter9;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double wagesPerHours;


    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hoursWorked, double wagesPerHours) {
        super(firstName, lastName, socialSecurityNumber);

        if(hoursWorked <= 0 || hoursWorked > 24)
            throw new IllegalArgumentException("Hours must be between 1 and 24");


    }
}

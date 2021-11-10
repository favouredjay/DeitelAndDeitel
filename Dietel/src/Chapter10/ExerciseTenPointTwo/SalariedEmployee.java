package Chapter10.ExerciseTenPointTwo;

import java.util.Date;

public class SalariedEmployee extends Employee{
    private double WeeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, Date dateOfBirth) {
        super(socialSecurityNumber, firstName, lastName, dateOfBirth);
        WeeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return WeeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary <0.0)
            throw new IllegalArgumentException("Must be > 0.0");
        WeeklySalary = weeklySalary;
    }
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return (super.toString() + "\nWeekly Salary" + getWeeklySalary());
    }
}


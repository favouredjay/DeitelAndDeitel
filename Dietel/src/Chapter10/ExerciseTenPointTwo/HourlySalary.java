package Chapter10.ExerciseTenPointTwo;

import java.util.Date;

public class HourlySalary extends Employee {
private  double wage;
private double hours;

    public HourlySalary(Date dateOfBirth, String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(socialSecurityNumber, firstName, lastName, dateOfBirth);
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");
        this.wage = wage;

        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");
        this.hours = hours;

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException(
                    "Hourly wage must be >= 0.0");
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) // validate hours
            throw new IllegalArgumentException(
                    "Hours worked must be >= 0.0 and <= 168.0");
        this.hours = hours;
    }


    @Override
    public double earnings() {
        if (getHours() <= 40) // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }
    @Override
    public String toString(){
        return (super.toString() + "\nhourly wage: " + getWage() + "\nHours worked: " + getHours() );
    }
}

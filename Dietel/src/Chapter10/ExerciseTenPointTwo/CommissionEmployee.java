package Chapter10.ExerciseTenPointTwo;

import java.util.Date;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(Date dateOfBirth, String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(socialSecurityNumber, firstName, lastName, dateOfBirth);
        if (commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException(
                "Commission rate must be > 0.0 and < 1.0");}

        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");}
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return  getCommissionRate() * getGrossSales();
    }
    @Override
    public  String toString(){
        return (super.toString() + "\nGross Sales: " + getGrossSales() + "\nCommission Rates: " + getCommissionRate());
    }
}

package Chapter10.ExerciseTenPointTwo;

import java.util.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(Date dateOfBirth, String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(dateOfBirth, firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;

    if(baseSalary < 0.0) {
             throw new IllegalArgumentException("Base salary must be >= 0.0");}

         this.baseSalary = baseSalary;
 }

         // set base salary
         public void setBaseSalary(double baseSalary)
         {
         if (baseSalary < 0.0) // validate baseSalary
         throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
         }

         // return base salary
         public double getBaseSalary()
         {
         return baseSalary;
         }
         @Override
            public double earnings(){
        return getBaseSalary() + super.earnings();
         }
         public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
         }
        } // end class BasePlusCommissionEmployee


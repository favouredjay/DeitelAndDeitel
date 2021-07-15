package Chapter9;

public class BasePlusCommissionEmployee extends CommissionEmployee{
        private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0)
            throw new IllegalArgumentException("must be > 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0)
            throw  new IllegalArgumentException("must be > 0.0");

        this.baseSalary = baseSalary;
    }
    @Override
    public String toString() {
        return  "BasePlus" +
                super.toString() + '\n' +
                "Base Salary = " + getBaseSalary();
    }
}

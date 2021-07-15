package Chapter9;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("gross sales must be greater than 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >=1.0)
            throw new IllegalArgumentException("must be between 0.0 and 1.0");
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return  "Commission employee\n" + super.toString() +
                "Gross Sales = " + getGrossSales() + '\n' +
                "Commissions Rate = " + getCommissionRate();
    }
}

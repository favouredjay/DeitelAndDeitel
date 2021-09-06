package Chapter9;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private final double wagesPerHours;
    private double amountPay = 40.00;


    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hoursWorked, double wagesPerHours, double amountPay) {
        super(firstName, lastName, socialSecurityNumber);

        if(hoursWorked <= 0 || hoursWorked > 24)
            throw new IllegalArgumentException("Hours must be between 1 and 24");
        this.hoursWorked = hoursWorked;
        this.wagesPerHours = wagesPerHours;
        this.amountPay = amountPay;

    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getWagesPerHours() {
        return wagesPerHours;
    }

    public double getAmountPay() {
        return amountPay;
    }

    public void setAmountPay(double amountPay) {
        this.amountPay = amountPay;
    }

    public void setWagesPerHours(double wagesPerHours) {
        if(hoursWorked < 0 || hoursWorked >= 24)
            throw new IllegalArgumentException("must be between 1 and 24");
        wagesPerHours = hoursWorked * amountPay;

    }
    @Override
    public String toString(){
        return "Hourly Employee\n" + super.toString() + "Hour Worked : " + getHoursWorked() + '\n' + "Wages Per Hours: " + getWagesPerHours();
    }


}

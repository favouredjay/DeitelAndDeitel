package Chapter8;

public class SavingsAccount {
    static double annualInterest;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void annualInterest(double rate) {
        annualInterest = rate;
    }

    public double calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance*(annualInterest/12) + savingsBalance;
    return monthlyInterest;
    }
    public double  getAnnualInterest(){
        return annualInterest;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public double deposit(double amount){
        if (amount > 0){
            savingsBalance = savingsBalance + amount;
        }
        return savingsBalance;
    }
}

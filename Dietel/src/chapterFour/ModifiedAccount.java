package chapterFour;

public class ModifiedAccount {

    private String firstName;
    private double balance;


    public ModifiedAccount(String firstName, double balance) {
        this.firstName = firstName;
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance += depositAmount;
    }

    public void withdraw(double cash) {
        if (cash > 0.0 && cash < balance)
            balance -= cash;

        else if (cash > balance)
            System.out.println("Insufficient Fund");
    }

}

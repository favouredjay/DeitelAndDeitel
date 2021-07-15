package ourFirstTddClass;

public class MyAccount {
    double deposit;
    int pin;
    double balance = 2500;


    public double getDeposit() {
        return deposit;
    }

    public void deposit(double amount) {
        if (deposit == 2500) {
            balance += deposit;
        }
    }

    public double getBalance(int balance) {
        return balance;
    }

    public void withdraw(double withdraw , int pin) {
        if(withdraw > 0 && withdraw < balance && pin == 1234) {
            balance = balance - withdraw;
        }
        else {
            System.out.println("insufficient funds" + balance);
        }
    }
}
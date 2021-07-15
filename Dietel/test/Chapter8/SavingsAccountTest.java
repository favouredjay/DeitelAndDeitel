package Chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SavingsAccountTest {



    @Test
    void annualInterestCanBeCalculated(){
        SavingsAccount account1 = new SavingsAccount(1000);
        SavingsAccount.annualInterest(100.00);
       assertEquals(100, account1.getAnnualInterest());
    }
    @Test
    void testThatUserCanSave(){
        SavingsAccount account = new SavingsAccount(100);
        assertEquals(100, account.getSavingsBalance());
    }
    @Test
    void userCanDepositMoney(){
        SavingsAccount account = new SavingsAccount(50);
        assertEquals(200, account.deposit(150));
    }
    @Test
    void testThatMonthlyInterestCanBeCalculated(){
        SavingsAccount account = new SavingsAccount(50);
        SavingsAccount.annualInterest(100);
        assertEquals(466.6666666666667, account.calculateMonthlyInterest());
    }
    @Test
    void testThatTheyAreTwoAccounts(){
        SavingsAccount account1 = new SavingsAccount(2000);
        SavingsAccount account2 = new SavingsAccount(3000);
        SavingsAccount.annualInterest(80);
        assertEquals(2000, account1.getSavingsBalance());
        assertEquals(2200,account1.deposit(200));
        assertEquals(16866.666666666668, account1.calculateMonthlyInterest());


        assertEquals(3000, account2.getSavingsBalance());
        assertEquals(3200, account2.deposit(200));
        assertEquals(24533.333333333336, account2.calculateMonthlyInterest());
    }

    @Test
    void testThatTheyCanBeCalculatedWith5Percent(){
        SavingsAccount.annualInterest(100);
    }

}
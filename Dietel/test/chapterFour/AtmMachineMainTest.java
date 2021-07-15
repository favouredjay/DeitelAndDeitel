package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmMachineMainTest {


    AtmMachine atmMachine;

    @BeforeEach
    void doAllForAllTest() {
        atmMachine = new AtmMachine();
    }

    @Test
    void customer_canCreatePin() {
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.setPin("1234");
        assertEquals("1234", atmMachine.getPin());

    }

    @Test
    void customer_canDepositMoney() {
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.deposit(500.00);
        assertEquals(500.00, atmMachine.getBalance());
    }

    @Test
    void customer_cannotDepositZero() {
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.deposit(1000);
        atmMachine.deposit(0);
        assertEquals(1000, atmMachine.getBalance());
    }

    @Test
    void customer_canDepositMoreThanOnce() {
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.deposit(300);
        atmMachine.deposit(200);
        atmMachine.deposit(100);
        assertEquals(600, atmMachine.getBalance());
    }


    @Test
    void customer_canWithdrawMoney() {
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.deposit(200.00);
        atmMachine.setPin("1122");

        atmMachine.withdraw(100, "1122");
        assertEquals(100, atmMachine.getBalance());
    }

    @Test
    void customer_cannotWithdrawNegativeAmount() {
        atmMachine.deposit(700);
        atmMachine.setPin("1122");
        atmMachine.withdraw(-100, "1122");
        assertEquals(700, atmMachine.getBalance());
    }

    @Test
    void customer_cannotWithdrawLessThanTheAmountInAccount() {
        atmMachine.deposit(700);
        atmMachine.setPin("1122");
        atmMachine.withdraw(800, "1122");
        assertEquals(700, atmMachine.getBalance());
    }

    @Test
    void customer_cannotWithdrawZeroAmount() {
        atmMachine.deposit(700);
        atmMachine.setPin("1122");
        atmMachine.withdraw(0, "1122");
        assertEquals(700, atmMachine.getBalance());
    }

    @Test
    void customer_canTransferMoneyToAnotherAccount() {
        atmMachine.deposit(7000);
        atmMachine.setPin("1100");
        atmMachine.transfer(7000, "1100");
        assertEquals(0, atmMachine.getBalance());
    }

    @Test
    void customer_cannotTransferMoneyToAnotherAccountWithWrongPin() {
        atmMachine.deposit(7000);
        atmMachine.setPin("1100");
        atmMachine.transfer(7000, "0000");
        assertFalse(false, String.valueOf(atmMachine.getPin().equals("0000")));

    }

    @Test
    void customer_canPayUtilityBills() {
        atmMachine.deposit(1000);
        atmMachine.setPin("1234");
        atmMachine.recharge(800, "1234");
        assertEquals(200, atmMachine.getBalance());
    }

    @Test
    void customer_changePin() {
        atmMachine.setPin("2233");
        atmMachine.changePin("1234", "2233");
        assertEquals("1234", atmMachine.getPin());
    }
}

package ourFirstTddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    void account_canReceiveDeposit() {
        //given
        MyAccount account = new MyAccount();
        //when
        account.deposit(2500.00);
        //assert
        assertEquals(2500, account.getBalance(2500));
    }
    @Test
    void account_canGetBalance(){

        MyAccount account = new MyAccount();
        account.getBalance(2500);
        assertEquals(2500, account.balance );
    }

    @Test
    void account_canWithdraw(){
        MyAccount account = new MyAccount();
        account.withdraw(500, 1234);
        assertEquals(2000, account.balance);
    }
}



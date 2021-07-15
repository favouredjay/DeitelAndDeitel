package chapterFour;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;
//
//public class BankTest {
//    @Test
//    @DisplayName("Bank can be created")
//    void bankMustNotBeCreated() {
//        Bank bank = new Bank("Maven_Afric");
//        assertNotNull(bank);
//    }
//
//    @Test
//    void accountMustBeCreatedByTheBank() {
//        Bank bank = new Bank("Maven-Afric");
//        bank.createAccount("Akenz", " Able", 284447);
//        AccountClass savedAccount = bank.findAccountByAccountNumber(284447);
//        assertEquals("Akenz", savedAccount.getFirstName());
//        assertEquals(284447, savedAccount.getAccountNumber());
//    }
//    @Test
//    void multipleAccountMustBeCreated(){
//        AccountClass account1 = new AccountClass("Davies", "HillTon", 100085);
//        Bank bank = new Bank("Maven-Afric");
//        bank.newAccount(account1);
//        assertNotNull(account1);
//    }
//    @Test
//    void bankShouldGetNumberOfAccountCreated(){
//        Bank bank = new Bank("Maven-Afric");
//        AccountClass account2 = new AccountClass("Davies", "HillTon", 100085);
//        bank.newAccount(account2);
//        assertEquals(1, bank.getAccountList());
//    }
//    @Test
//    void bankCanGetCustomerInformation(){
//        Bank bank = new Bank("Maven-Afric");
////        bank.customerAccountInformation(2111742955, );
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    @Test
////    void createAccountNameForCustomer() {
////        Bank account = new Bank("Maven_Afric");
////        account.createAccountName("Lasisi Lazarus");
////        assertEquals("Lasisi Lazarus", account.getAccountName());
////    }
////
////    @Test
////    void bank_canCreateMoreThanOneAccount() {
////        Bank account = new Bank("Maven_Afric");
////        account.createAccountName("Davies Chijioke");
////        assertEquals("Davies Chijioke", account.getAccountName());
////        account.createAccountName("Bessy Lee");
////        assertEquals("Bessy Lee", account.getAccountName());
////    }
////    @Test
////    void bank_canGenerateID(){
////        Bank account = new Bank("Maven_Afric");
////        account.generateICustomerD(001);
////        assertEquals();
////    }
//
//
//

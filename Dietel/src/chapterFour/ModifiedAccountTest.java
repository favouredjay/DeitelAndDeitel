package chapterFour;

import java.util.Scanner;
public class ModifiedAccountTest {

    public static void main(String[] args) {
        ModifiedAccount modifiedAccount = new ModifiedAccount("Joy", 0.0);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n depositing %.2f to Joy's balance%n%n", depositAmount);
        modifiedAccount.deposit(depositAmount);


        System.out.print("Enter amount you want to withdraw: ");
        double withdrawAmount = input.nextDouble();
        System.out.printf("%n withdrawing %.2f from Joy's balance%n%n", withdrawAmount);
        modifiedAccount.withdraw(withdrawAmount);

        System.out.println("Account Balance is: " + modifiedAccount.getBalance());


        }


}

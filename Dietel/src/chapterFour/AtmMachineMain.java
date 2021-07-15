//package chapterFour;
//
//import java.util.Scanner;
//
//public class AtmMachineMain {
//    public static void main(String[] args) {
//
//        AtmMachine atmMachine = new AtmMachine();
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("""
//                Welcome to Maven Afric Bank
//                Please insert your card
//                Please create pin""");
//        int system = userInput.nextInt();
//        atmMachine.setPin(system);
//        System.out.println("Your Pin is " + atmMachine.getPin()+ "\n-----------------");
//        for (int checkerRound = 1; checkerRound <= 30; checkerRound++) {
//
//            String chijioke = """
//                    --> Enter 1 to Deposit
//                    --> Enter 2 to Withdraw
//                    --> Enter 3 to Transfer
//                    --> Enter 4 to Recharge
//                    --> Enter 5 to Change pin
//                    --> Enter 6 to Check Balance
//                    --> Enter 7 to End Transaction
//                    """;
//            System.out.println(chijioke);
//            int money = userInput.nextInt();
//
//            switch (money) {
//                case 1 -> {
//                    System.out.println("Enter amount to deposit: ");
//                    double john = userInput.nextDouble();
//                    atmMachine.deposit(john);
//                    System.out.println("Your account has been credited with: " + atmMachine.getBalance() +
//                            "\n---------------------");
//                }
//                case 2 -> {
//                    System.out.println("Enter pin");
//                    int joy = userInput.nextInt();
//                    System.out.println("Enter amount to withdraw");
//                    double withdrawal = userInput.nextInt();
//                    atmMachine.withdraw(withdrawal, joy);
//                    System.out.println("Balance is: " + atmMachine.getBalance() + "\n--------------------");
//                }
//                case 3 -> {
//                    System.out.println("Enter pin to continue");
//                    int wire = userInput.nextInt();
//                    System.out.println("Enter Account number to transfer to");
//                    long sc = userInput.nextLong();
//                    System.out.println("""
//                            Select Bank to transfer to
//                            1. GtBank
//                            2. EcoBank
//                            3. First Bank
//                            4. Union Bank
//                            5. FCMB
//                            6. Stanbic IBTC
//                            7. Wema Bank
//                            8. UBA""");
//                    String bank = userInput.next();
//                    System.out.println("Enter amount to transfer");
//                    double transfer = userInput.nextDouble();
//                    atmMachine.transfer(transfer, wire);
//                    System.out.println("Balance is:" + atmMachine.getBalance() + "\n------------------");
//                }
//                case 4 -> {
//                    System.out.println("Enter pin to continue");
//                    int bills = userInput.nextInt();
//                    System.out.println("""
//                            1: Press  to pay for your NEPA bill
//                            2: Press 2 to buy airtime
//                            """);
//                    int refuel = userInput.nextInt();
//                    switch (refuel) {
//                        case 1 -> {
//                            System.out.println("Enter your Electronic number to recharge");
//                            long electric = userInput.nextLong();
//                            System.out.println("Enter amount to recharge");
//                            double amount = userInput.nextDouble();
//                            atmMachine.recharge(amount, bills);
//                            System.out.println("Balance is:" + atmMachine.getBalance() + "\n---------------------");
//                        }
//                        case 2 -> {
//                            System.out.println("Enter number to recharge");
//                            long number = userInput.nextLong();
//                            System.out.println("Select Network:\n1. 9mobile\n2. MTN\n3. Glo\n4. Airtel");
//                            int line = userInput.nextInt();
//                            System.out.println("Enter amount to recharge");
//                            double rechargeAmount = userInput.nextDouble();
//                            atmMachine.recharge(rechargeAmount, bills);
//                            System.out.println("Balance is:" + atmMachine.getBalance() + "\n-------------------");
//                        }
//                        default -> System.out.println("Please Select the right Option");
//                    }
//                }
//                case 5 -> {
//                    System.out.println("Enter Current Pin");
//                    int oldPin = userInput.nextInt();
//                    System.out.println("Enter New Pin:");
//                    int newPin = userInput.nextInt();
//                    atmMachine.changePin(newPin, oldPin);
//                }
//                case 6 -> System.out.println("Your Available Balance is " + atmMachine.getBalance() + "\n------------------");
//                case 7 -> {
//                    checkerRound += 50;
//                    System.out.println("Thank you for choosing Maven Afric Bank");
//                }
//                default -> System.out.println("Wasiu Behave Normal Na");
//            }
//        }
//    }   }
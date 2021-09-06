package chapter5;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n= input.nextInt();
        int product = 1;
        for(int i = 1; i<= n; i++){
            if(n%i == 0){
                System.out.println(i);
              product = product * i;
            }

        }
        System.out.println(product);
    }
}

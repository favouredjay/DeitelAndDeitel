package Chapter18;

import java.util.Scanner;

public class ComputeFactorialTailRecursion {


    public static long factorial(int n) {
        return factorial(n, 1);
    }

    private static long factorial(int n, int result) {
        if (n == 0)
            return result;
        else
            return factorial(n - 1, n * result);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();

        System.out.println(factorial(number, 1));
    }
}
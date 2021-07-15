package Chapter7;
import java.util.Scanner;
public class CommandLineArgument {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initializer = 0;
        int arrayLength = 0;
        int sum = 0;
        System.out.println("Enter length of array");
        arrayLength = input.nextInt();
        initializer = input.nextInt();
        int incrementer = input.nextInt();

        int[] myArray = new int[arrayLength];
        myArray[0] = initializer;
        for (int i = 0; i < arrayLength; i++) {
            myArray[i] =initializer + incrementer * i;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(i +"   "+  myArray[i]);

        }
        for(int elements : myArray)
             sum +=elements;
            System.out.println("Sum is " + sum);


    }
}



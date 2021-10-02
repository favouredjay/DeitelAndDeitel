package Extras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingWithLambdas {
    List<String> employee = new ArrayList<>();

    public void addEmployee(String name) {
        employee.add(name);
        System.out.println(name + " Successfully added");
    }

    public void sortEmployees() {
        if (employee.size() != 0) {
            System.out.println("The sorted names are " + employee.stream().sorted().collect(Collectors.toList()));


        }

    }


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
       SortingWithLambdas lambdas = new SortingWithLambdas();
        boolean quit = false;
       while (!quit) {
           System.out.println("Enter 1 to add employees and 2 to quit");
           int add = userInput.nextInt();
           switch (add){
               case 1:
                   for (int i = 0; i < 5; i++) {


                       System.out.println("Enter employees");
                       String name = userInput.next();
                       lambdas.addEmployee(name);
                   }
               case 2:

                   lambdas.sortEmployees();
               case 3:
                   quit = true;
           }

       }
    }
}

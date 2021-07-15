package chapterFour;

public class AssignmentOne {
    public static void main(String[] args) {
        int counter = 1;
        counter = ++counter + ++counter;
        System.out.println("counter equals: " + counter);

        counter = counter++ + ++counter;
        System.out.println("counter equals: " + counter);

        counter = counter++ + counter++;
        System.out.println("counter equals: " + counter);

        counter = ++counter + counter++;
        System.out.println("counter equals: " + counter);


    }
}


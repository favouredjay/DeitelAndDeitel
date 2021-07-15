package Extras;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class File {

    private static Formatter output;
    public static void openFile(){
        try {
            output = new Formatter("students.txt");
        }
        catch (SecurityException securityException){
            System.out.println("Permission denied");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("File not found");
        }

        }
        public static  void addRecords() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Student's Firstname, Lastname, level and Year of birth");


            try {
                output.format("%s %s %s %s %s%n", "First name", "Last name", "Level", "Year of birth", "Age");
            } catch (FormatterClosedException formatterClosedException) {
                System.out.println("Error writing to file");

            } catch (NoSuchElementException noSuchElementException) {
                System.out.println("Invalid input, try again");
                input.nextLine();

                while (input.hasNext()) {
                    String firstname = input.next();
                    String lastName = input.next();
                    int level = input.nextInt();
                    int yearOfBirth = input.nextInt();

                    output.format("%s %s %d %d", firstname, lastName, level, LocalDate.now().getYear() - yearOfBirth);

                }
                System.out.println("?");
            }
        }
    public static  void closeFile(){
        if(output!=null)
            output.close();
    }

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }
}

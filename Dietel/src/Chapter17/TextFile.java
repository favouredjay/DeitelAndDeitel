package Chapter17;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextFile {private static Formatter output;
    public static void openFile(){
        try {
            output = new Formatter("concordance.txt");
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
        System.out.println("Enter Text");


        try {
            output.format("%s", "Text");
        } catch (FormatterClosedException formatterClosedException) {
            System.out.println("Error writing to file");

        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Invalid input, try again");
            input.nextLine();

            while (input.hasNext()) {
                String text = input.nextLine();
                output.format("%s", text);

            }
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

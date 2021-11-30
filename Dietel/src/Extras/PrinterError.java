package Extras;

public class PrinterError {

    public static String printErrors(String s){
        return s.replaceAll("[a-m]", "").length()+"/"+s.length();

    }

    public static void main(String[] args) {
        String word = "abschtuyz";
        System.out.println(printErrors(word));
    }
}

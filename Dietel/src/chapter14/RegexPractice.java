package chapter14;

public class RegexPractice {

    public static boolean validateNme(String address){
        return address.matches("[a-z0-9_.-]+[@][a-zA-Z]+[.-][a-z]+");
    }
    public static boolean address(String address){
        return address.matches("\\d+\\s([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z])+");
    }

    public static void main(String[] args) {
        System.out.println(validateNme("judom_2011@gmail.org"));
    }
}

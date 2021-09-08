package Chapter18;

public class RecursiveWithSubstring {
//    public static boolean isPalindrome(String s) {
//    if(s.length() <= 1){
//        return true;
//    }
//
//    else if ((s.charAt(0) != s.charAt(s.length()-1)) && s.charAt(1) != s.length()-2){
//        return false;
//    }
//    else return isPalindrome(s.substring(1, s.length()-1));
//    }
//
//    public static void main(String[] args) {
//        System.out.println("is lmoml a Palindrome? " + isPalindrome("lmoml"));
//        System.out.println("is look a Palindrome? " + isPalindrome("look"));
//        System.out.println("is mom a Palindrome? " + isPalindrome("mom"));
//    }

    public static boolean isPalindrome(String s){
        return isPalindrome(s, 0, s.length()-1);
    }

    private static boolean isPalindrome(String s, int low, int high) {
       if(high <= low){
            return true;
        }
        else if (s.charAt(low) != s.charAt(high) ){
            return false;
        }
        else return isPalindrome(s,low+1, high -1);
    }

    public static void main(String[] args) {
        System.out.println("is lmoml a Palindrome? " + isPalindrome("lmoml"));
       System.out.println("is look a Palindrome? " + isPalindrome("look"));
        System.out.println("is mom a Palindrome? " + isPalindrome("mom"));
    }
}
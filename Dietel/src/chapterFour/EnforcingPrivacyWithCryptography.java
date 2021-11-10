package chapterFour;

public class EnforcingPrivacyWithCryptography {
    private int firstNumber=0;
    private int secondNumber=0;
    private int thirdNumber=0;
    private int fourthNumber=0;
    private  int digits=0;
    private int result;

    public void encryption(int number){

        while (digits != 4){
            if (number >= 1000 && number <=9999) {
                digits = 4;
            }else {
                System.out.println("Digit must be up to 4");}
//                    if (firstNumber >= 1000){
//                    firstNumber = (number+7)%10;}
//                    else if (number >= 100){
//                    secondNumber = (number + 7)%10;}
//                    else if(thirdNumber>=10){
//                    thirdNumber = (number + 7) %10;}
//                    else{
//                    fourthNumber = (number + 7)%10;}
            firstNumber = ((number/1000) + 7)%10;
            secondNumber = ((number%1000/100) + 7)%10;
            thirdNumber = ((number % 1000 /10) + 7)%10;
            fourthNumber = ((number %10)+7)%10;

            System.out.println(thirdNumber + "" + fourthNumber + "" + firstNumber + "" +secondNumber);
            }
        }

    public int getEncryption(){
        return result;
    }

    public static void main(String[] args) {
        EnforcingPrivacyWithCryptography cryptography = new EnforcingPrivacyWithCryptography();
        cryptography.encryption(3456);
//        System.out.println(cryptography.getEncryption());
    }

}

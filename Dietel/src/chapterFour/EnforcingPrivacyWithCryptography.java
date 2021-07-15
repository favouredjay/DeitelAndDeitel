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
                    if (firstNumber >= 1000){
                    firstNumber = (number+7)%10;}
                    else if (number >= 100){
                    secondNumber = (number + 7)%10;}
                    else if(thirdNumber>=10){
                    thirdNumber = (number + 7) %10;}
                    else{
                    fourthNumber = (number + 7)%10;}

                     result = (thirdNumber*1000)  + (fourthNumber * 100)  + (firstNumber*10) +  (secondNumber*1);
            }
        }

    public int getEncryption(){
        return result;
    }

    public static void main(String[] args) {
        EnforcingPrivacyWithCryptography cryptography = new EnforcingPrivacyWithCryptography();
        cryptography.encryption(3456);
        System.out.println(cryptography.getEncryption());
    }

}

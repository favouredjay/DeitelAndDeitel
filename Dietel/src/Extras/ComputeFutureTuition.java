package Extras;

public class ComputeFutureTuition {
    public static void main(String[] args) {
        double universityTuition = 10000;
        double increaseRate = 0.05;
        double increaseFees = 1;
        int i = 2;
        double amountIncrease = 1;
        System.out.println("The tuition for the university is $10,000 this year and increases 5% every year"+"\nTuition fee for 14 years");
//        for (i = 1; i <= 14; i++ ){
        System.out.println("Year   " + " Amount Increase");
        while (i > 1 && i <= 14) {
            increaseFees = universityTuition+ ((i-1)*increaseRate * universityTuition);
            System.out.println(i + "       " + increaseFees);
        i++;
        }




    }
}

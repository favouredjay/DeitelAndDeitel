
package chapterFour;
public class ModifiedCompoundInterest {
    public static void main(String[] args) {


        double compoundInterest;
        double principal = 1000.00;
        int year;
        double interestRates;
        for(interestRates = 5; interestRates<=10; interestRates++){
            System.out.printf("%s%26s%n", "Year", "Compound Interest("+interestRates+"%)");
        for(year = 1; year <=10; year++){
            compoundInterest = principal * ((1.0 + interestRates/100) * year) * ((1.0 + interestRates/100) * year);
            System.out.printf("%2d%,18.2f%n", year, compoundInterest);
        }
            System.out.println();


        }
    }
}
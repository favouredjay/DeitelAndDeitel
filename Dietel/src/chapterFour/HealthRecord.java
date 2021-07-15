//(Computerization of Health Records) A health-care issue that has been in the news lately is
//        the computerization of health records. This possibility is being approached cautiously because of
//        sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
//        Computerizing health records could make it easier for patients to share their health profiles and histories
//        among their various health-care professionals. This could improve the quality of health care,
//        help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
//        save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes
//should include the person’s first name, last name, gender, date of birth (consisting of separate
//attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
//should have a constructor that receives this data. For each attribute, provide set and get methods.
//        The class also should include methods that calculate and return the user’s age in years, maximum
//        heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
//        Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
//class HealthProfile for that person and prints the information from that object—including the person’s
//        first name, last name, gender, date of birth, height and weight—then calculates and prints the
//        person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
//        the BMI values chart from Exercise 2.33.

package chapterFour;

public class HealthRecord {


    private String name;
    private String gender;
    private double height;
    private double weight;
    private int month;
    private int day;
    private int year;
    private int age;
    private int maximumHeartRate;

    public HealthRecord(String name, String gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;

    }


    public void setName(String firstName, String lastName) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMonth() {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay() {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear() {
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public void setDateOfBirth(int month, int day, int year) {
        if (month >= 1 && month <= 12 && day >= 1 && day <= 31 && year >= 1900 && year <= 2021) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

    }

    public String getdateOfBirth() {
        String dateOfBirth = day + "/" + month + "/" + year;
        return dateOfBirth;
    }

    public int getAge(int year) {
        age = 2021 - year;
        return age;
    }

    public double getHeight() {
        if (height > 0.0) ;
        this.height = height;
        return height;
    }

    public void setWeight() {
        if (weight > 0.0) ;
        this.weight = weight;

    }

    public double getWeight() {
        return weight;
    }

    public double getBMI(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight");
            if (bmi >= 18.5 && bmi <= 24.9) ;
            System.out.println("Normal");
            if (bmi >= 25 && bmi <= 29.9) ;
            System.out.println("overweight");
            if (bmi > 30) ;
        }
        return bmi;
    }

    public int calculateMaximumHeartRate(int year) {
        maximumHeartRate = 220 - this.age;
        return maximumHeartRate;

    }

}


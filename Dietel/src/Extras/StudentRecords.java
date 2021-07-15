package Extras;

public class StudentRecords {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private int level;

    public StudentRecords(String firstName, String lastName, int DateOfBirth, int level){
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
    }

    public int setYearOfBirth(int yearOfBirth){
        if (yearOfBirth > 0);
        int age = 2021 - yearOfBirth;
        return  age;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getLevel(){
        return level;
    }
}

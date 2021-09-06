package Chapter10.ExerciseTenPointTwo;

import java.time.LocalDate;

public abstract class Employee {
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee( String firstName, String lastName, String socialSecurityNumber, LocalDate dateOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;
    }



    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

@Override
    public  String toString(){
        return ("First Name" + firstName + "\nLast Name" + lastName + "\nSocial Security Number " + socialSecurityNumber + "\nBirth Date" + dateOfBirth);

}

public abstract double earnings();





}

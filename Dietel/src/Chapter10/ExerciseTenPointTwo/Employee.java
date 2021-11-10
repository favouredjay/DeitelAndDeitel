package Chapter10.ExerciseTenPointTwo;

import java.util.Date;

public abstract class Employee {
    private final Date dateOfBirth;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee( String firstName, String lastName, String socialSecurityNumber, Date dateOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;
    }



    public Date getDateOfBirth() {
        return dateOfBirth;
    }

//    public void setDateOfBirth(Date dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

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
        return ("First Name" + getFirstName() + "\nLast Name" + getLastName() + "\nSocial Security Number " + getSocialSecurityNumber() + "\nBirth Date" + getDateOfBirth());

}

public abstract double earnings();





}

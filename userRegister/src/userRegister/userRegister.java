package userRegister;

import java.util.Scanner;

public class userRegister {

    Scanner userInput = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String password;
    private String confirmPassword;
    private String emailId;
    private int phoneNumber;



    public String getFirstName() {
        return lastName;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void createUser(){
        System.out.println("Please enter you first Name.");
        setFirstName(userInput.next());
        System.out.println("Please enter your Last Name.");
        setLastName(userInput.next());
        System.out.println("Please enter your Password.");
        setPassword(userInput.next());
        System.out.println("Please confirm your password.");
        setConfirmPassword(userInput.next());
        System.out.println("Please enter your e-mail id.");
        setEmailId(userInput.next());
        System.out.println("Please enter your phone number.");
        setPhoneNumber(userInput.nextInt());
        System.out.println("Please enter your Date of Birth.");
        setDateOfBirth(userInput.next());
    }

    public void displayUser(){
        System.out.println("User First name is "+getFirstName());
        System.out.println("User name is "+ getLastName()+".");
        System.out.println("Email id of "+getFirstName()+" is "+getEmailId());
        System.out.println(getFirstName()+"'s phone number is "+getPhoneNumber());
        System.out.println(getFirstName()+"'s Date of Birth is "+getDateOfBirth());
    }

}

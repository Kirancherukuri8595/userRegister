package userRegister;

import java.util.Scanner;

public class userRegister {

    Scanner userInput = new Scanner(System.in);

    private String name;
    private String dateOfBirth;
    private String userName;
    private String password;
    private String confirmPassword;
    private String emailId;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public void createUser(){
        System.out.println("Please enter you first Name.");
        setName(userInput.next());
        System.out.println("Please enter your User Name.");
        setUserName(userInput.next());
        System.out.println("Please enter your Password.");
        setPassword(userInput.next());
        System.out.println("Please confirm your password.");
        setConfirmPassword(userInput.next());
        System.out.println("Please enter your e-mail id.");
        setEmailId(userInput.next());
        System.out.println("Please enter your Date of Birth.");
        setDateOfBirth(userInput.next());
    }

    public void displayUser(){
        System.out.println("User First name is "+getName());
        System.out.println("User name is "+ getUserName()+".");
        System.out.println("Email id of "+getUserName()+" is "+getEmailId());
        System.out.println(getName()+"'s Date of Birth is "+getDateOfBirth());
    }

}

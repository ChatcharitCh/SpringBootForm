package com.project.SpringBootForm.entity;

import java.util.Date;

/**
 *
 * @author Chatcharit
 */
public class User {

    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String email;
    private String gender;
    private String address;
    private String course;

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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "User{" + "firstName = " + firstName + ", lastName = " + lastName + 
                ", telephoneNumber = " + telephoneNumber + ", email = " + email + 
                ", gender = " + gender + ", address = " + address + ", course = " + course + '}';
    }
    
    

   
 





}

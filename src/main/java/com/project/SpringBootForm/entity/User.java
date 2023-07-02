/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.SpringBootForm.entity;

/**
 *
 * @author Chatcharit
 */
public class User {
    
    private String firstName;
    private String lastName;
    private String gender;
    private String telephoneNumber;
    private String email;
    private String address;
    private String seminar;
    
    // --------------------------- override toString() -----------------------------

    @Override
    public String toString() {
        return "User{" + "firstName= " + firstName + ", lastName = " + lastName + 
                ", gender = " + gender + ", telephoneNumber = " + telephoneNumber + 
                ", email = " + email + ", address = " + address + ", seminar = " + seminar + '}';
    }
    
    
    // --------------------------- getters and setters -----------------------------

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSeminar() {
        return seminar;
    }

    public void setSeminar(String seminar) {
        this.seminar = seminar;
    }
    
    
}

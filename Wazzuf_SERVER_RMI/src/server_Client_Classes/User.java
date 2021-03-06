/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.sql.Blob;


/**
 *
 * @author Lenovo
 */
public abstract class User {
    private Account useracc;
    protected static int userID;
    private String name;
    private int phoneNumber;
    private String address;
    private int WarningCounter;
    private Blob picture;
    private String Bio;

    public User(Account useracc, String name, int phoneNumber, String address, int WarningCounter, Blob picture, String Bio) {
        this.useracc = useracc;
        User.userID = userID++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.WarningCounter = WarningCounter;
        this.picture = picture;
        this.Bio = Bio;
    }

    public Account getUseracc() {
        return this.useracc;
    }

    public void setUseracc(Account useracc) {
        this.useracc = useracc;
    }

   public static int getID() {
        return userID;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWarningCounter() {
        return WarningCounter;
    }

    public void setWarningCounter(int WarningCounter) {
        this.WarningCounter = WarningCounter;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String Bio) {
        this.Bio = Bio;
    }
    
    
}

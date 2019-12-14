/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author Lenovo
 */
enum ValidationStatus{APPROVED, REJECTED, PENDING};
public class Company extends User implements Observer,CompanyROI {
    
    private int compID;
    private int establishYear;
    private ArrayList<String> categories;
    private String description;
    private String website;
    private int employees; 
    
    private ValidationStatus companyValidationStatus;

    public Company(Account useracc, String name, int phoneNumber, String address, int WarningCounter, Blob picture, String Bio) {
                super(useracc, name, phoneNumber, address, WarningCounter, picture, Bio);
                this.compID = userID;
    }

    public Company(int establishYear, ArrayList<String> categories, String description, String website, int employees, ValidationStatus companyValidationStatus, Account useracc, int ID, String name, int phoneNumber, String address, int WarningCounter, Blob picture, String Bio) {
        super(useracc, name, phoneNumber, address, WarningCounter, picture, Bio);
        this.compID = userID;
        this.establishYear = establishYear;
        this.categories = categories;
        this.description = description;
        this.website = website;
        this.employees = employees;
        this.companyValidationStatus = companyValidationStatus;
    }

    public Company() {
         super(null,null,0,null,0,null,null);
    }



    
    public int getEstablishYear() {
        return establishYear;
    }

    public void setEstablishYear(int establishYear) {
        this.establishYear = establishYear;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public ValidationStatus getCompanyValidationStatus() {
        return companyValidationStatus;
    }

    public void setCompanyValidationStatus(ValidationStatus companyValidationStatus) {
        this.companyValidationStatus = companyValidationStatus;
    }

    public int getCompID() {
        return compID;
    }

    public void setCompID(int compID) {
        this.compID = compID;
    }
    
    
    public void editProfile(){};
    public void deleteAccount(){};
    public void submitReport(){};
    public void registerCompany(){};
       public String getCompanyUsername() {
        return this.getUseracc().getUsername();
    }
    
    @Override
    public void update(Observable o, Object o1) {
        System.out.println("company : new job was posted");
    }

    @Override
    public void createJob() {}//code

    @Override
    public void editJob() {}//code

    @Override
    public void removeJob() {}//code
    
    
    
    
    
    
}

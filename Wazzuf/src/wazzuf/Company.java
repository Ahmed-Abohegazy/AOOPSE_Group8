/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wazzuf;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
enum ValidationStatus{APPROVED, REJECTED, PENDING};
public class Company {
    
    
    private int establishYear;
    private ArrayList<String> categories;
    private String description;
    private String website;
    private int employees; 
    
    private ValidationStatus companyValidationStatus;

    public Company() {
    }

    public Company(int establishYear, ArrayList<String> categories, String description, String website, int employees, ValidationStatus companyValidationStatus) {
        this.establishYear = establishYear;
        this.categories = categories;
        this.description = description;
        this.website = website;
        this.employees = employees;
        this.companyValidationStatus = companyValidationStatus;
    }
    
    
    
    public void editProfile(){};
    public void deleteAccount(){};
    public void submitReport(){};
    public void update(){};
    public void registerCompany(){};

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
    
}

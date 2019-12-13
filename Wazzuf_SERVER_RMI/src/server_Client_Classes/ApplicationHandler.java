/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ApplicationHandler {
    
    private ArrayList<Application> CompanyApplications;
    private Company companyOBJ;

    public ApplicationHandler(ArrayList<Application> CompanyApplications, Company companyOBJ) {
        this.CompanyApplications = CompanyApplications;
        this.companyOBJ = companyOBJ;
    }

   public Application setApplicationStatus(int ID, AppStatus Status){
   
   
   return null;
   }
    
    public ArrayList<Application> viewAllApplications() {
        return CompanyApplications;
    }

    public void setCompanyApplications(ArrayList<Application> CompanyApplications) {
        this.CompanyApplications = CompanyApplications;
    }

    public Company getCompanyOBJ() {
        return companyOBJ;
    }

    public void setCompanyOBJ(Company companyOBJ) {
        this.companyOBJ = companyOBJ;
    }
   
    
    
}

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
public class Admin {
    Admin_loginROI adminUser;
    private String supportMail;
    private ArrayList<Company> companyList;
    private ArrayList<JobSeeker> jobSeekerList;
    private ArrayList<Report> reportList;
    private static Admin singleAdmin;
    
    private void Admin(){};
    public void validateCompany(){};
    public void reviewReport(Report r){};
    public void giveWarning(int userID){};
    
    public static Admin getSingleAdmin() {
         if(singleAdmin == null){

         singleAdmin = new Admin();

         }


          return singleAdmin;
      }
    
    public String getSupportMail() {
        return supportMail;
    }

    public void setSupportMail(String supportMail) {
        this.supportMail = supportMail;
    }

    public ArrayList<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(ArrayList<Company> companyList) {
        this.companyList = companyList;
    }

    public ArrayList<JobSeeker> getJobSeekerList() {
        return jobSeekerList;
    }

    public void setJobSeekerList(ArrayList<JobSeeker> jobSeekerList) {
        this.jobSeekerList = jobSeekerList;
    }

    public ArrayList<Report> getReportList() {
        return reportList;
    }

    public void setReportList(ArrayList<Report> reportList) {
        this.reportList = reportList;
    }

  
    
    
}

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
enum AppStatus{ACCEPTED,REJECTED,SHORTLISTED};

public class Application {
    public ArrayList<Job> jobs;
    private int ID;
    private ArrayList<String> questionList;
    private JobSeeker applicant;
    private Company company;
    private AppStatus ApplicationStatus;

    public Application(ArrayList<Job> jobs, int ID, ArrayList<String> questionList, JobSeeker applicant, Company company, AppStatus ApplicationStatus) {
        this.jobs = jobs;
        this.ID = ID;
        this.questionList = questionList;
        this.applicant = applicant;
        this.company = company;
        this.ApplicationStatus = ApplicationStatus;
        
    }

    public Application cloneApplication(){
    return null;
    }
    
    
    
    
    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<String> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<String> questionList) {
        this.questionList = questionList;
    }

    public JobSeeker getApplicant() {
        return applicant;
    }

    public void setApplicant(JobSeeker applicant) {
        this.applicant = applicant;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public AppStatus getApplicationStatus() {
        return ApplicationStatus;
    }

    public void setApplicationStatus(AppStatus ApplicationStatus) {
        this.ApplicationStatus = ApplicationStatus;
    }
    


    
    
}

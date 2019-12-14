/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import server_Client_Classes.User;

import java.util.Observer;
import java.util.Observable;
/**
 *
 * @author Lenovo
 */

enum gender{MALE,FEMALE};

public class JobSeeker extends User implements Observer,JobSeekerROI {
    private int JSid;
    private boolean isPremium;
    private int appLimit;
    private gender Gender;
    private String cv;
    private String achievement;
    private String Skills;
    private int ssn;
    private Date birthDate;
    private ArrayList<Job> jobInterests;
    private ArrayList<Job> jobs;
    private ArrayList<Application> seekerApplications;
    public JobSeeker(){
        super(null,null,0,null,0,null,null);
    }
  public JobSeeker(Account useracc, String name, int phoneNumber, String address, int WarningCounter, Blob picture, String Bio) {
        super(useracc ,name, phoneNumber, address, WarningCounter, picture, Bio);
        this.JSid = userID;
        }
    public JobSeeker(boolean isPremium, int appLimit, gender Gender, String cv, String achievement, String Skills, int ssn, Date birthDate, ArrayList<Job> jobInterests, ArrayList<Job> jobs, ArrayList<Application> seekerApplications, Account useracc, int ID, String name, int phoneNumber, String address, int WarningCounter, Blob picture, String Bio) {
        super(useracc, name, phoneNumber, address, WarningCounter, picture, Bio);
        this.JSid = userID;
        this.isPremium = isPremium;
        this.appLimit = appLimit;
        this.Gender = Gender;
        this.cv = cv;
        this.achievement = achievement;
        this.Skills = Skills;
        this.ssn = ssn;
        this.birthDate = birthDate;
        this.jobInterests = jobInterests;
        this.jobs = jobs;
        this.seekerApplications = seekerApplications;
    }

 
    public void viewProfile(){};
    public void editProfile(){};
    public void deleteAccount(){};
    public void viewAllJobs(ArrayList<Job> jobs){
            for (int i=0;i<jobs.size();i++)
        {
               // return jobs.get(i);
        }
    };
    public void searchOnJob(String name){};
    public void viewApplication(){};
    public void editApplication(){};
    public void removeApplication(){};
    public void trackApplication(int ID){};
    public void editSkills(){};
    public void editCV(){};
    public void addJobInterests(){};
    public void removeJobInterests(){};
    public void submitReport(Report r){};
    public void upgradeToPremium(PaymentMethod r){};
    public void registerJobSeeker(){};

    public boolean isIsPremium() {
        return isPremium;
    }

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public int getAppLimit() {
        return appLimit;
    }

    public void setAppLimit(int appLimit) {
        this.appLimit = appLimit;
    }

    public gender getGender() {
        return Gender;
    }

    public void setGender(gender Gender) {
        this.Gender = Gender;
    }
    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String Skills) {
        this.Skills = Skills;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<Job> getJobInterests() {
        return jobInterests;
    }

    public void setJobInterests(ArrayList<Job> jobInterests) {
        this.jobInterests = jobInterests;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public ArrayList<Application> getSeekerApplications() {
        return seekerApplications;
    }

    public void setSeekerApplications(ArrayList<Application> seekerApplications) {
        this.seekerApplications = seekerApplications;
    }

    public int getJSid() {
        return JSid;
    }

    @Override
    public void update(Observable o, Object o1) {
        System.out.println("job seeker: there is new job for u ");
    }

    @Override
    public void applyForJob() {}//code
    
    
}

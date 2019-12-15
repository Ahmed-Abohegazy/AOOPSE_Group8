/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author Lenovo
 */
enum Type{INTERN,FULLTIME,PARTTIME};

public class Job  {
    
    private int ID;
    private String name;
    private Boolean Status;
    private String level;
    private float experience;
    private String Category;
    private Type jobType;
    private String description;
    private float Salary;
    private String duration; //Three years, four years..etc
    private String language;
    private int numOfPositions;
    private Date deadline;
    private ArrayList<Application> app;
    private JobManager jobmng;//composition new (discuss about it)

    public Job() {
        this.jobmng = new JobManager();
    }

    public Job(int ID, String name, Boolean Status, String level, float experience, String Category, Type jobType, String description, float Salary, String duration, String language, int numOfPositions, Date deadline, ArrayList<Application> app) {
        this.ID = ID;
        this.name = name;
        this.Status = Status;
        this.level = level;
        this.experience = experience;
        this.Category = Category;
        this.jobType = jobType;
        this.description = description;
        this.Salary = Salary;
        this.duration = duration;
        this.language = language;
        this.numOfPositions = numOfPositions;
        this.deadline = deadline;
        this.app = app;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Type getJobType() {
        return jobType;
    }

    public void setJobType(Type jobType) {
        this.jobType = jobType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumOfPositions() {
        return numOfPositions;
    }

    public void setNumOfPositions(int numOfPositions) {
        this.numOfPositions = numOfPositions;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public ArrayList<Application> getApp() {
        return app;
    }

    public void setApp(ArrayList<Application> app) {
        this.app = app;
    }
    
    
    public void createJob(){};
    public void editJob(){};
    public void removeJob(){};
    
    public void applyForJob(){
        
    
    };
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wazzuf_server_rmi;
import java.rmi.Remote;
import java.rmi.RemoteException;
import server_Client_Classes.Application;
import server_Client_Classes.Company;
import server_Client_Classes.Job;
import server_Client_Classes.JobSeeker;

/**
 *
 * @author Ahmed_Abohgeazy
 */
public interface Wazzuf_DB_Interface extends Remote{
    //INSERT JOB SEEEKER
    public void insertJobseeker(JobSeeker s);
    // GET JOB SEEKER BY USER NAME AND PASSWORD
    public JobSeeker getJobSeeker(String Username, String Password);
    //GET COMPANY BY  USER NAME AND PASSWORD
    public Company getCompany(String Username, String Password);
    
    public void insertCompany(Company s);
    public void insertJob(Job j);
    public void insertApplication(Application A);
    public void deleteJobSeeker(int JSid );
    public void deleteCompany(int compID );
    public void deleteJob(int JID );
    public void deleteApplication(int AID );
    public JobSeeker getJobSeekerByID(int id );
    public Company getCompanyByID(int id );
     public Job getJobByID(int id );
     public Application getApplicationByID(int id );
        
}

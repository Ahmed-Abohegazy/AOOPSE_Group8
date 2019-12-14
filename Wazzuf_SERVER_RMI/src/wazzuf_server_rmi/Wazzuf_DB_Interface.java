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
    public void insertJobseeker(JobSeeker s) throws RemoteException;;
    // GET JOB SEEKER BY USER NAME AND PASSWORD
    public JobSeeker getJobSeeker(String Username, String Password)throws RemoteException;;
    //GET COMPANY BY  USER NAME AND PASSWORD
    public Company getCompany(String Username, String Password)throws RemoteException;;
    
    public void insertCompany(Company s)throws RemoteException;;
    public void insertJob(Job j)throws RemoteException;;
    public void insertApplication(Application A)throws RemoteException;;
    public void deleteJobSeeker(int JSid )throws RemoteException;;
    public void deleteCompany(int compID )throws RemoteException;;
    public void deleteJob(int JID )throws RemoteException;;
    public void deleteApplication(int AID )throws RemoteException;;
    public JobSeeker getJobSeekerByID(int id )throws RemoteException;;
    public Company getCompanyByID(int id )throws RemoteException;;
     public Job getJobByID(int id )throws RemoteException;;
     public Application getApplicationByID(int id )throws RemoteException;;
        
}

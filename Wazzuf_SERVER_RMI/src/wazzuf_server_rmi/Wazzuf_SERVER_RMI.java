/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wazzuf_server_rmi;

import Database.WazzufDB;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import server_Client_Classes.*;
import server_Client_Classes.Account;


/**
 *
 * @author Ahmed_Abohgeazy
 */
public class Wazzuf_SERVER_RMI  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException , AlreadyBoundException {
        // TODO code application logic here
        WazzufDB db;
        db = new WazzufDB();
        
        AccountInterface AccountIC = new Account();
        Registry r = LocateRegistry.createRegistry(1099);
        r.bind("UserLogin", AccountIC);
        //r.bind("Report", ReportFacade);
        
        //Initiating DB.
       
        
        Account ad = new Account("Ahmed2", "Mohamed3", "J");
        
        JobSeeker ahmed3 = new JobSeeker(ad, "name of jobseeker", 123, "Bio", 123, null, "Bio");
        db.insertJobseeker(ahmed3);
        
        // System.out.print(("server is up and runnig "));
         JobSeeker kk = db.getJobSeeker("Ahmed2", "Mohamed");
         System.out.println("Test: " + kk.getUseracc().getUsername());
         
    }
    
}

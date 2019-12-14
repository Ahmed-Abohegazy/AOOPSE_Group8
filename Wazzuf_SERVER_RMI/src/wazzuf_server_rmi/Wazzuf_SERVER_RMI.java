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
public class Wazzuf_SERVER_RMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException , AlreadyBoundException {
        // TODO code application logic here

         Registry r = LocateRegistry.createRegistry(1099);
                     WazzufDB db;
        db = new WazzufDB();
        
        Account ad = new Account("Ahmed username", "Mohamed password", Account.AccountType.JOBSEEKER);
        
        JobSeeker ahmed = new JobSeeker(ad, "name of jobseeker", 123, "Bio", 123, null, "Bio");
        db.insertJobseeker(ahmed);
        
         System.out.print(("server is up and runnig "));
         
    }
    
}

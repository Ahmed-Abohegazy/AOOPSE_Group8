/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import Database.WazzufDB;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import wazzuf_server_rmi.Wazzuf_DB_Interface;

/**
 *
 * @author Lenovo
 */



public class Account extends UnicastRemoteObject implements AccountInterface,Admin_loginROI, Serializable{
    
    private String username;
    private String password;
    private String userType;


    @Override
    public boolean login(String username, String password, String acctype) throws RemoteException{
        WazzufDB db;
        db = new WazzufDB();
        if(acctype.equals("A")){
           Account ad = new Account();
           Admin x = db.getAdmin(username, password);
           x.adminUser = ad;
           x.adminUser.login(username, password, acctype);
        
            }
        else if(acctype.equals("C")){  
        Company c = db.getCompany(username, password);
        if(c.getUseracc().getUsername().equals(username) && c.getUseracc().getPassword().equals(password)){
        return true;
            
        }
        }
        else if(acctype.equals("J")){        
        JobSeeker a = db.getJobSeeker(username, password);
        if(a.getUseracc().getUsername().equals(username) && a.getUseracc().getPassword().equals(password)){
        return true;
        }
        }
//calling database function retrieving arraylist
        return false;
    
    };
    
    public void changePassword(String newPass){
    
    };
    public void registerAccount(String username, String password,String acctype) throws RemoteException{
        WazzufDB db;
        db = new WazzufDB();
            if(acctype.equals("A")){
                JobSeeker s = new JobSeeker(new Account(username,password,acctype));
                db.insertJobseeker(s);
            }
            else if(acctype.equals("J")){        
        
        }
    };

    public Account() throws RemoteException{
    
    }
    
    public Account(String username, String password, String acctype) throws RemoteException {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


}

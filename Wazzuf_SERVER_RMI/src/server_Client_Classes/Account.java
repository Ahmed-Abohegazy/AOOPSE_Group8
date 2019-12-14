/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

/**
 *
 * @author Lenovo
 */



public class Account implements AccountInterface,Admin_loginROI{
    
    private String username;
    private String password;
    private String userType;


    public void login(String username, String password, String acctype){
        if(acctype.equals("A")){
        
            }
        else if(acctype.equals("C")){  
        
        }
        else if(acctype.equals("J")){        
        
        }
//calling database function retrieving arraylist
    
    };
    public void changePassword(String newPass){
    
    };
    public void registerAccount(String username, String password,String acctype){
            if(acctype.equals("A")){
        
            }
            else if(acctype.equals("J")){        
        
        }
    };

    public Account(){
    
    }
    
    public Account(String username, String password, String acctype) {
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

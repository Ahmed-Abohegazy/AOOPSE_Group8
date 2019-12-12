/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wazzuf;

/**
 *
 * @author Lenovo
 */

enum AccountType{ADMIN,JOBSEEKER,COMPANY};

public class Account {
    private String username;
    private String password;
    private AccountType userType;

public void login(String username, String password, AccountType a){};
public void changePassword(String newPass){};

    public Account(String username, String password, AccountType userType) {
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

    public AccountType getUserType() {
        return userType;
    }

    public void setUserType(AccountType userType) {
        this.userType = userType;
    }


}

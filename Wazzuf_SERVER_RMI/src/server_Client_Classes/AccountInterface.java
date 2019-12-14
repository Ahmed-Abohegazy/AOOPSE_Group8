/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Lenovo
 */
public interface AccountInterface extends Remote{
    public void login(String username, String password, String acctype)  throws RemoteException;;
    public void changePassword(String newPass)  throws RemoteException;
    public void registerAccount(String username, String password,String acctype) throws RemoteException;
}

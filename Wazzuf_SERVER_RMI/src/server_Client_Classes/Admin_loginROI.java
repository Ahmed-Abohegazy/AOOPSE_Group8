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
public interface Admin_loginROI {
    public void login(String username, String password, String acctype);
    public void changePassword(String password);
}

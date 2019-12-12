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
public interface AdminROI {
    public Admin login(String username, String password);
    public void changePassword(String password);
}

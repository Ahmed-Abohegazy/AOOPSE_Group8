/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmi_Connection;

import GUI.*;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Lenovo
 */
public class Wazzuf {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.AlreadyBoundException
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException{
        LoginGUI loginGUIobj = new LoginGUI();
        loginGUIobj.setLocationRelativeTo(null); // This makes the window appears centered
        loginGUIobj.setVisible(true); // This shows the gui        
// We connect to the RMI Registry
        Registry r = LocateRegistry.getRegistry(1099);
     System.out.print(("client is up and runnig "));
    
    }
    
}

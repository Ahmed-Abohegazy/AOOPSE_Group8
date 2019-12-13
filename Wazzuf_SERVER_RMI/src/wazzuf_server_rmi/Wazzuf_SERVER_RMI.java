/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wazzuf_server_rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
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
         System.out.print(("server is up and runnig "));
    }
    
}

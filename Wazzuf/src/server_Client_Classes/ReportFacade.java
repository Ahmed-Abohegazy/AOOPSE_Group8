/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.rmi.RemoteException;

/**
 *
 * @author Lenovo
 */
public interface ReportFacade extends java.rmi.Remote{
       public void getReportData() throws RemoteException;
    public void setReportData(int ID, String title, String reason, int reportedUserID, boolean handled) throws RemoteException; 
}

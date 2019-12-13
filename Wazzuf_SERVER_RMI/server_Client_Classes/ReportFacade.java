/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;
import java.rmi.Remote;

/**
 *
 * @author Lenovo
 */
public interface ReportFacade extends java.rmi.Remote {
    public void getReportData();
    public void setReportData();
}

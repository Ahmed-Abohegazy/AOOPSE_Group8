/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class ReportTransferObject implements Serializable{
    private int id;
    private String reason;
    private ReportStatus Status;
    private int reportedUserID;
    private boolean handled;
    
    public void getAllReportData(){}
    public void setAllReportData(){}
}

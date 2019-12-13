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
enum ReportStatus{ACCEPTED,DENIED};

public class Report {
    private int ID;
    private String reason;
    private ReportStatus status;
    private int reportedUserID;
    private boolean handled;

    public Report() {
    }

    public Report(int ID, String reason, int reportedUserID, boolean handled) {
        this.ID = ID;
        this.reason = reason;
        this.reportedUserID = reportedUserID;
        this.handled = handled;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getReportedUserID() {
        return reportedUserID;
    }

    public void setReportedUserID(int reportedUserID) {
        this.reportedUserID = reportedUserID;
    }

    public boolean isHandled() {
        return handled;
    }

    public void setHandled(boolean handled) {
        this.handled = handled;
    }
    
    
}

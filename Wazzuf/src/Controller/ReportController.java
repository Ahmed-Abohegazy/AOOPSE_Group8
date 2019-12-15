/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.LoginGUI;
import GUI.SubmitReportGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.AncestorListener;
import server_Client_Classes.AccountInterface;
/**
 *
 * @author Lenovo
 */
public class ReportController {
        SubmitReportGUI gui;
        Registry r;
           public ReportController(SubmitReportGUI gui, Registry r)
    {
        this.gui = gui;
        this.r = r;
          gui.getjLabel4().addAncestorListener((AncestorListener) new getSubmitButtonAction());
          
}
  class getSubmitButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
             try {
            AccountInterface g = (AccountInterface) r.lookup("Report");
            //parse int
            String id = gui.getjTextField1().getText();
            String Title = gui.getjTextField2().getText();
            String Reason = gui.getjTextArea1().getText();
            
            
                } catch (RemoteException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  }
}


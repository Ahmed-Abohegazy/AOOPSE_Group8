/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.ViewJobsGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import javax.swing.RowFilter;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import server_Client_Classes.AccountInterface;
/**
 *
 * @author Lenovo
 */
public class ViewJobsController {
    ViewJobsGUI gui;
    Registry r;
        public ViewJobsController(ViewJobsGUI gui, Registry r)
    {
        this.gui = gui;
        this.r = r;
        // This registers the button with our action listener below (the inner class)
        gui.getjButton1().addAncestorListener((AncestorListener) new jButton1ActionPerformed());
    }
    class jButton1ActionPerformed implements ActionListener {                                         
         @Override
        public void actionPerformed(ActionEvent ae) {
//        try{
            
        DefaultTableModel model =(DefaultTableModel) gui.getjTable1().getModel();
             String findDoctors = "SELECT * FROM USERS WHERE ACCOUNTTYPE = 'Doctor' ";
             String getSpecialization = "SELECT SPZ FROM DOCTORS, USERS WHERE USERS.ID = USR_ID";}}}
             
        //ResultSet rs=null;
        //ResultSet rs2 = null;
//        int row = 0;
//        int col = 0;
       // rs=st.executeQuery(findDoctors);
        //rs2 = st2.executeQuery(getSpecialization);
        
        
        
//
//   // while(cursor.hasNext()) {
//       / DBObject obj = cursor.next();
//        String first = (String)obj.get("first");
//        String last = (String)obj.get("last");
//       // ObjectId id = (ObjectId)obj.get("_id");
//        model.addRow(new Object[] { id, first, last });
//    }
//  //  table.setModel(model);
//        }
//    // catch (SQLException ex) {
//          //  Logger.getLogger(rEditMember.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }                                        

//    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                     
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); //WE COULD HAVE USED LAST KEY WORD ENTERED, BUT THERE IS NO TIME :(
//        String search = jTextField1.getText();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
//        jTable1.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(search));
//    }                           
//}

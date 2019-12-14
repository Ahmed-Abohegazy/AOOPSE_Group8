/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import GUI.LoginGUI;
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
public class LoginController {
    LoginGUI gui;
    Registry r;
    
    // The constructor takes the gui and the rmi registry as paramaters
    public LoginController(LoginGUI gui, Registry r)
    {
        this.gui = gui;
        this.r = r;
        // This registers the button with our action listener below (the inner class)
        gui.getLoginSubmitButton().addAncestorListener((AncestorListener) new getLoginButtonAction());
    }
    class getLoginButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
             try {
            AccountInterface g = (AccountInterface) r.lookup("UserLogin");

            String username = gui.getjTextField1().getText();
            
            char[] c = gui.getjPasswordField1().getPassword();
            String password = String.copyValueOf(c); 
            String type = gui.getjComboBox1();
                    
            g.login(username,password, type);

                // Once we got the result from our remote object, we can set it to
                // appear inside the gui using the jLabel
                gui.setVisible(false);
                
                } catch (RemoteException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    
    
    }
    
}

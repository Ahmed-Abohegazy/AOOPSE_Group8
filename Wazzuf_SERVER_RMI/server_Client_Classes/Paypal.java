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
public class Paypal implements PaymentMethod{
    private String PPemail;
    private String PPpassword;

    public Paypal(String email, String password) {
        this.PPemail = email;
        this.PPpassword = password;
    }
    @Override
	public void pay(int amount) {
		System.out.println(amount +" paid using paypal, your account has been promoted to premium account.");
	}
    
}

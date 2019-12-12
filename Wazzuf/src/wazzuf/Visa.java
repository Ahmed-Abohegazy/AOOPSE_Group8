/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wazzuf;

/**
 *
 * @author Lenovo
 */
public class Visa implements PaymentMethod {
	private String name;
	private String cardNumber;
	private String cvv;
	private String expDate;
	
	public Visa(String nm, String ccNum, String cvv, String ed){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.expDate=ed;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid using Visa, your account has been promoted to premium account.");
	}

}

/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

import java.util.ArrayList;

/**
 * @Classe: Company.java
 * 
 * @Descripció: El constructor de la classe contempla el fet de que 
 * l'associació amb la classe location sigui de composició (ja comentat en
 * la classe BaseFloor).
 * 
 */

public class Company {

	//Attributes
	
	private String name;
	private String phone;
	private String email;

	//Relacions
		
	private ArrayList<Location> locations; 
	private Rate rates;
			
	//Constructor
	
	public Company(String pName, String pPhone, String pEmail) {
		this.name = pName;
		this.phone = pPhone;
		this.email = pEmail;
		this.rates = null;
		this.locations = new ArrayList<Location>(); 
	}

	//Getters 
	
	public String getName() {
		return this.name;
	}

	public String getPhone() {
		return this.phone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Rate getRates() {
		return rates;
	}
	
	//Setters
	
	public void setName(String pName) {
		this.name = pName;
	}
	
	public void setPhone(String pPhone) {
		this.phone = pPhone;
	}
	
	public void setEmail(String pEmail) {
		this.email = pEmail;
	}
	
	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}
	
	public void setRates(Rate rates) {
		this.rates = rates;
	}	

	//Mètodes
	
	public String listOrders() {
		return null;
	}
}

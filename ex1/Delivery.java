/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

import java.util.*; //Buscar quina llibreria s'ha de importar per al tipus de dada "DATE" en comptes de fer servir *

/**
 * @Classe: Delivery.java
 * 
 */

public class Delivery {
	
	//Attributes
	
	private Date departureDate;
	private Date deliveryDate;
	private String email;
	
	//Relationship (Unidirectional / Bidirectional / Composite...)
	
	private Order order;
		
	//Methods
		
	//Constructor

	public Delivery(Date pDepartureDate, Date pDeliveryDate, String pEmail) {
		this.departureDate = pDepartureDate;
		this.deliveryDate = pDeliveryDate;
		this.email = pEmail;
		this.order = null;
	}

	//Getters
	
	public Date getDepartureDate() {
		return this.departureDate;
	}
	
	public Date getDeliveryDate() {
		return this.deliveryDate;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Order getOrder() {
		return order;
	}
	
	//Setters
	
	public void setDepartureDate(Date pDepartureDate) {
		this.departureDate = pDepartureDate;
	}
	
	public void setDeliveryDate(Date pDeliveryDate) {
		this.deliveryDate = pDeliveryDate;
	}
	
	public void setEmail(String pEmail) {
		this.email = pEmail;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

/**
 * @Classe: Rate.java
 * 
 * @Descripció: Classe associativa. (Correspon a la transformació nº 2 del fitxer transformacion.txt)
 * 
 */

public class Rate {

	//Attributes
	
	private Integer ratting;
	private String text;
	
	//Relacions
	
	private Company company;
	private Order order;
		

	//Constructor

	public Rate(int ratting, String text) {
		this.ratting = ratting;
		this.text = text;
		this.company = null;
		this.order = null;
	}

	//Getters & Setters
	
	public int getRatting() {
		return this.ratting;
	}
	
	public String getText() {
		return this.text;
	}

	public Company getCompany() {
		return company;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setRatting(Integer ratting) {
		this.ratting = ratting;
	}
	
	public void setText(Integer text) {
		this.ratting = text;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
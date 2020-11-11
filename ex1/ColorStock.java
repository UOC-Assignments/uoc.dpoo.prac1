/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

//Imports

/**
 * @Classe: ColorStock.java
 * 
 * @Descripció: Permet instanciar objectes de la classe Stock, que són del tipus Llista (TAD) 
 *
 */


public class ColorStock {
	
	//Atributs
	
	private Integer amount;
		
	//Relacions
		
	private Stock stock; 
	
	private Color color;
	
	//Constructor
	
	public ColorStock(int amount) {
		this.amount = amount;
		this.color = null;
		this.stock = null;
	}

	//Getters & Setters
	
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void setAmount(int pAmount) {
		this.amount = pAmount;
	}

	//methods
	
	public void increase(int amount) {
		//some code here
	}
	
	public void decrease(int amount) {
		//some code here
	}
}
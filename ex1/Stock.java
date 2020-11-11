/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

import java.util.ArrayList;

/**
 * @Classe: Stock.java
 * 
 * @Descripció: Permet instanciar objectes de la classe Stock, que són del tipus Llista (TAD) 
 *
 */

public class Stock {
	
	//Atributs
	
	private String address;
	
	//Relacions
	
	private ArrayList<ColorStock> colors; 
		
	//Constructor

	/**
	 * Mètode: public Stock(String address, ArrayList<ColorStock> colors)
	 * Funcionalitat: 
	 * Mètode constructor. permet instanciar els objectes de la classe 
	 * "Stock". 
	 * 
	 * Paràmetres d'entrada: 
	 * @String Address -> 
	 * @ArrayList<ColorStock> colors -> he decidit passar com a paràmetre 
	 * la llista colors
	 * 
	 * Paràmetres sortida: no retorna cap valor
	 * 
	 */
	
	public Stock(String address) {
		this.address = address;
		this.colors = new ArrayList<ColorStock>();
	}
	
		//Getters & Setters
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setColors(ArrayList<ColorStock> colors) {
		this.colors = colors;
	}	

	//methods
	
	public void addStock(Color color, int amount) {
		//Some Code here
	}
	
	public boolean checkStock(Color color) {
		return false;
	}

	public boolean reduceStock(Color color, int amount) {
		return false;
	}
}
/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

/**
 * @Classe: Color.java
 * 
 * @Descripció: Defineix els atributs i mètodes necessaris per a modelar un color de moqueta
 *
 */
public class Color {
	
	//Attributs
	
	private String name;
	private String rgb;
	private Boolean isCustomizable; //TRANSFORMACIÓ nº 1: La classe "CustomizableColor" passa a ser un atribut de la Classe color (veure transformacions.txt)
	private Double price;
	
	//Constructor
	
	/**Mètode: public Color(String name, double price, String rgb, boolean isCustomizable)
	 * Funcionalitat: Mètode constructor. permet instanciar els objectes d'aquesta classe
	 * També inicialitza els atributs.
	 * 
	 * Paràmetres d'entrada:
	 * @param name -> nom del color
	 * @param price -> preu base del color
	 * @param rgb -> codi hexadecimal associat al color 
	 * @param isCustomizable -> no s'utilitza
	 * 
	 * Paràmetres sortida: no retorna cap valor
	 * 
	 */
	
	public Color(String name, Double price, String rgb, Boolean isCustomizable) {
		this.name = name;
		this.price = price;
		this.rgb = rgb;
		this.isCustomizable = isCustomizable;
	}
	
	//Getters 

	public String getName() {
		return name;
	}

	public String getRgb() {
		return rgb;
	}

	public Boolean getIsCustomizable() { 
		return isCustomizable;
	}

	public Double getPrice() {
		return price;
	}
	
	//Setters

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setIsCustomizable(Boolean isCustomizable) {
		this.isCustomizable = isCustomizable;
	}
	
	public void setRgb(String rgb) {
		this.rgb = rgb;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

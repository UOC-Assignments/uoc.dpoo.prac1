/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

/**
 * @Classe: Location.java
 * 
 */

public class Location {
	
	//Attributes
	
	private String name;
	private int lenght;
	private int width;
	private String address;
		
	//Relacions
		
	private Design design; 
	private Company company;
			
	//Constructor

	public Location(String pName, int pLenght, int pWidth, String pAddress) {
		this.name = pName;
		this.lenght = pLenght;
		this.width = pWidth;
		this.address = pAddress;
		this.design = null;
		this.company = null;
	}

	//Getters & Setters
	
	public String getName() {
		return this.name;
	}
	
	public int getLenght() {
		return this.lenght;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public String getAddress() {
		return this.address;
	}	

	public Company getCompany() {
		return company;
	}
	
	public void setName(String pName) {
		this.name = pName;
	}
	
	public void setLenght(int pLenght) {
		this.lenght= pLenght;
	}
	
	public void setWidth(int pWidth) {
		this.width= pWidth;
	}
	
	public void setAddress(String pAddress) {
		this.address = pAddress;
	}

	public void setDesign(Design design) {
		this.design = design;
	}

	public void setCompany(Company company) {
		this.company = company;
	}	
}
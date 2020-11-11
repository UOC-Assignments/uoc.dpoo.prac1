/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

import java.util.ArrayList;

/**
 * @Classe: BaseFloor.java
 * 
 * @Descripció: Permet instanciar objectes de la classe BaseFloor i per tant generar
 * la estructura completa del programa 
 *
 */

public class BaseFloor {
	
	//Relacions
	
	private ArrayList<Company> companies; 
	private ArrayList<Stock> stocks;
	
	//Constructor
	
	/**
	 * Mètode: public BaseFloor()
	 * Funcionalitat: 
	 * Mètode constructor. permet instanciar els objectes de la classe 
	 * "BaseFloor". En aquest cas també permet crear instàncies de les 
	 * classes associades unidireccionalment (Stock i Company). A més, 
	 * com que el diagrama UML indica que aquestes són associacions per 
	 * composició, hem de tenir cura de que quan deixi de referenciar-se 
	 * un objecte de la classe BaseFloor, aquest i els objectes associats 
	 * de les classes Stock i Company també siguin eliminats. Per aconseguir 
	 * això, en comptes de passar com a paràmetres les instàncies de Company 
	 * i Stock, les creem al constructor BaseFloor().
	 * 
	 * Paràmetres d'entrada: no en reb cap
	 * 
	 * Paràmetres sortida: no retorna cap valor
	 * 
	 */
	
	public BaseFloor(){
		this.companies = new ArrayList<Company>();
		this.stocks = new ArrayList<Stock>();			
	}
	
	
	/**
	 * 
	 * Així sería la codificació del disseny UML per al constructor d'aquesta 
	 * classe si les relacions no fossin de composició.
	 * 
	public BaseFloor(ArrayList<Company> companies, ArrayList<Stock> stocks) {
		this.companies = companies;
		this.stocks = stocks;
	}
	 *
	 */
	
	//Getters	

	/**
	 * El següents getters es codifiquen nomès per a senyalar que per a un atribut de 
	 * tipus arrayList no s'ha de retornar amb un getter per tal de que no es 
	 * modifiquin fora del seu àmbit.
	 * 
	 * public ArrayList<Company> getCompanies() {
	 *	 return companies;
	 * }
	 * 
     * public ArrayList<Stock> getStocks() {
	 *   return stocks;
	 * }
	 * 
	 **/
	
	//Setters
	
	public void setCompanies(ArrayList<Company> companies) {
		this.companies = companies;
	}

	public void setStocks(ArrayList<Stock> stocks) {
		this.stocks = stocks;
	}
}

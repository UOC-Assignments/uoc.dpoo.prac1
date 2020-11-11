/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

import java.util.ArrayList;

/**
 * @Classe: Design.java
 * 
 * @Descripció: Defineix els atributs i mètodes necessaris per a modelar un disseny de moqueta
 *
 */
public class Design 
{
	//Attributs
	
	private Integer columns; //Num. de columnes que ha de tenir el disseny
	private Integer rows; //Num. de files que ha de tenir el disseny
	
	
	//Relacions
	
	private Order order; //Relació bidireccinal 1..1 amb Order
	private Order location; //Relació bidireccinal 1..1 amb Location
	private ArrayList<Piece> pieces; //Bidireccional 1..* -> Això vol dir que per a cada instància de tipus Design pot haber'hi multiples instàncies del tipus "Piece" associades.
			
	//Constructor
	
	/**
	 * Mètode: public Design(Color color, int columns, int rows)
	 * Funcionalitat: 
	 * Mètode constructor. permet instanciar els objectes de la classe 
	 * "Design", és a dir, permet crear un nou disseny donats un color i unes dimensions
	 * 
	 * Paràmetres d'entrada:
	 * @param color -> Color inicial del disseny (uniforme per a totes les peces)
	 * @param columns -> Num. de columnes que tindrà el disseny
	 * @param rows -> Num. de files que tindrà el disseny
	 * 
	 * Paràmetres sortida: no retorna cap valor
	 * 
	 */
	
	public Design(Color color, Integer columns, Integer rows) {
		this.columns = columns;
		this.rows = rows;
		Piece p = null;
		this.pieces = new ArrayList<Piece>();		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				p = new SyntheticPiece();
				p.setX(column);
				p.setY(row);
				p.setColor(color);
				p.setDesign(this);
				p.setPrice(color.getPrice()); //Aqui assignem el valor de la peça en funció del seu color al atribut "price" de la classe "Piece". Desprès calcularem el preu base de la moqueta a partir d'aquest valor.
				this.pieces.add(p);
			}
		}
	}

	//Getters
	
	public Integer getColumns() {
		return this.columns;
	}
	
	public Integer getRows() {
		return this.rows;
	}
	
	/**
	 * El següent getter es codifica nomès per a senyalar que per a un atribut de 
	 * tipus arrayList no s'ha de retornar amb un getter per tal de que no es 
	 * modifiquin fora del seu àmbit. 
	 * 
	 * public ArrayList<Piece> getPieces() { 
		return this.pieces;
	}**/
						
	//Setters
	
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	public void setRows(Integer rows) {
		this.rows = rows;
	}	
	
	public Order getOrders() {
		return order;
	}

	public void setOrders(Order orders) {
		this.order = orders;
	}

	public Order getLocation() {
		return location;
	}

	public void setLocation(Order location) {
		this.location = location;
	}

	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}
				
	//Mètodes
	
	public void addPiece(Piece p){
		//some code here	
	}
						
	public Piece getPiece(Integer x, Integer y){ //Aqui s'ha de recorrer tot l'ArrayList per tal de trobar la peça[x][y]
		return null;
	}
		
	public void removePiece(Integer x, Integer y){
		//some code here
	}
	
	public Double calculatePrice(){	
		return null;			
	}
	
	public void createOrder() {
		//some code here
	}
}

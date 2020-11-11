/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

import java.util.ArrayList;

/**
 * @Classe: Order.java
 * 
 * @Descripció: Aquesta classe, a més de tenir 4 associacions, conté l'atribut id:Integers, que és inmutable. 
 * A més s'observa que una de les seves associacions és realitza cap a una classe associativa (veure transformacions.txt). * 
 *
 */

public class Order implements OrderStatus { // Implements -> implementa la interfície (Enumeracio) "orderStatus"

	//Attributs
	
	private static Integer id; //class attribute
	private Integer date;
	private OrderStatus status;
	private Double price;
	private Boolean dirty;
	
	//Relacions
	
	private Delivery delivery; //Cardinalitat 1-1 bidireccional
	private Design design; //Cardinalitat 1-1 bidireccional
	private ArrayList<Rate> rates; //Cardinalitat 1-0..* bidireccional
	private ArrayList<Piece> pieces; //Cardinalitat 1-1..* bidireccional -> S'HA DE REVISAR!! <-

	//Constructor

	public Order(Integer id, Integer date, OrderStatus status, Double price, Boolean dirty, ArrayList<Piece> pieces, Design design) {
		//Order.id = id; no s'ha de rebre com a paràmetre, ni s'ha de inicialitzar.  
		this.date = date;
		this.status = status;
		this.price = price;
		this.dirty = dirty;
		this.pieces = pieces;
		this.design = design;
	}		
	
	//Getters
	
	public Integer getId() {
		return Order.id; //per a retornar un valor estàtic fem la crida directament sobre el nom de la Classe.atribut
	}
	public Integer getDate() {
		return this.date;
	}
	public OrderStatus getStatus() {
		return this.status;
	}
	public Double getPrice() {
		return this.price;
	}
	public Boolean getDirty() {
		return this.dirty;
	}
	
	public Design getDesign() {
		return design;
	}
	
	public Delivery getDelivery() {
		return delivery;
	}
	
	 //Setters
	 
	/**
	 * No s'implementa ja que l'atribut Id ha de ser inmutable
	 * 
	public void setId(int pId) {
		Order.id = pId;
	}
	**/
	
	public void setDate(Integer date) {
		this.date = date;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setDirty(Boolean dirty) {
		this.dirty = dirty;
	}
	
	public void setRates(ArrayList<Rate> rates) {
		this.rates = rates;
	}
	

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public void setDesign(Design design) {
		this.design = design;
	}

	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}

	//methods
	
	public String exportToERP() {
		return null;
	}
	public Boolean isDirty() {
		return false;
	}
}
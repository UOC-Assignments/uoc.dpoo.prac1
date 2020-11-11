/**
 * Pràctica 1 DPOO Exercici 1
 * **/

package edu.uoc.prac;

/**
 * @interficie: OrderStatus.java
 * 
 * @Descripció: Interficie enumerativa. Proporciona un tipus de dada 
 * de 3 valors definis (MANUFACTURING, DELIVERING, INSTALLED)
 *
 */

interface OrderStatus {
	  // methods here
	}

	enum StatusDataType implements OrderStatus {
	  MANUFACTURING, DELIVERING, INSTALLED;

	  // implement methods
}
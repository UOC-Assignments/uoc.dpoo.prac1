/**
 * Pràctica 1 DPOO
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

/**
 * @Classe: SyntheticPiece.java
 * 
 * @Descripció: Hereta atributs i mètodes de la classe "Piece". 
 * Defineix els atributs i mètodes necessaris per a modelar una peça de moqueta genèrica
 *
 * (no pot ser abstracta pq si ho fos, seria imposible d'instanciar)
 **/

public class SyntheticPiece extends Piece{
	
	//Constructor

	/**Mètode: public SyntheticPiece() 
	 * Funcionalitat: Mètode constructor. permet instanciar els objectes d'aquesta classe
	 * També inicialitza els atributs. 
	 * 
	 * Paràmetres d'entrada: no reb cap valor.
	 * 
	 * Paràmetres sortida: no retorna cap valor.
	 * 
	 */
	
	public SyntheticPiece() {
		super(0, 0, false, 0.0);
		
	} 
}
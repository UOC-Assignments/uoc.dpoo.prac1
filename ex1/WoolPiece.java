/** 
* Pràctica 1 DPOO Exercici 1
* @alumne: Jordi Bericat Ruz 
**/

package edu.uoc.prac;

/**
 * @Classe: WoolPiece.java
 * 
 * @Descripció: Hereta atributs i mètodes de la classe "Piece". 
 * Defineix els atributs i mètodes necessaris per a modelar una peça de moqueta específica (amb text)
 *
 */

public class WoolPiece extends Piece {
	
	//Atributs
	
	private Integer woolLenght;
	
	//Constructor
	
	/**Mètode: public WoolPiece(int woolLenght)
	 * 
	 * Funcionalitat: Mètode constructor. permet instanciar els objectes d'aquesta classe
	 * També inicialitza els atributs. 
	 * 
	 * Paràmetres d'entrada: Longitud / mida del material que composa la peca de moqueta (llana).
	 * 
	 * Paràmetres de sortida: no retorna cap valor.
	 * 
	 */

	public WoolPiece(Integer woolLenght) {
		super(0, 0, false, 0.0);
		this.woolLenght = woolLenght;
		if (this.woolLenght < 1 | this.woolLenght > 2) {
			System.out.println("ERROR. WoolLenght must be 1 or 2");
		}
	}

	public Integer getWoolLenght() {
		return woolLenght;
	}

	public void setWoolLenght(int woolLenght) {
		this.woolLenght = woolLenght;
	}
	
	//Mètodes
	
	@Override
    public String toString() {
		String size;
		if (this.getWoolLenght() == 1) { 
				size = "w ";
				}
		else size = "ww";		
        return " " + size + " " + this.getColor().getRgb()+"    "; //Imprimeix amb format el codi del color i la grandaria de material per pantall 
    }
}
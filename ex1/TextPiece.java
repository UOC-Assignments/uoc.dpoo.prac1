/** 
* Pràctica 1 DPOO Exercici 1
* @alumne: Jordi Bericat Ruz 
**/

package edu.uoc.prac;

/**
 * @Classe: TextPiece.java
 * 
 * @Descripció: Hereta atributs i mètodes de la classe "Piece". 
 * Defineix els atributs i mètodes necessaris per a modelar una peça de moqueta específica (amb text)
 *
 */

public class TextPiece extends SyntheticPiece {
	
	//Atributs
	
	private String text;
	private Integer textSize;
	
	/**Mètode: public TextPiece(String text, int textSize) {
	 * 
	 * Funcionalitat: Mètode constructor. permet instanciar els objectes d'aquesta classe
	 * També inicialitza els atributs. 
	 * 
	 * Paràmetres d'entrada: no reb cap valor.
	 * 
	 * Paràmetres de sortida: no retorna cap valor.
	 * 
	 */

	public TextPiece(String text, Integer textSize) {
		super();	
		this.text = text;
		this.textSize = textSize;
		if (this.textSize < 1 | this.textSize > 3) {
			System.out.println("ERROR. Text size values must be 1, 2 or 3");
		}
		if ((this.text == null)|(this.text != null && this.text.replaceAll("\\s+","").length() == 0)) { //He utilitzat una "Regular Expression" per a retallar els espais en blanc i desprès poder avaluar el resultat contra this.text.lenght(). La regex no la he desenvolupat jo, la he extret de http://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java 
			System.out.println("ERROR. Empty Text");
		}		
	}

	//Getters
	
	public String getText() {
		return text;
	}

	public Integer getTextSize() {
		return this.textSize;
	}

	//Setters
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setTextSize(Integer textSize) {
		this.textSize = textSize;
	}
	
	//Mètodes
	
	@Override
    public String toString() { //Imprimeix per pantalla el text de la peca. Penso que es pot implementar millor, però no he tingut temps
		String s;
		s = this.getText();
		if (s.length() > 8) //Si la longitud del text es més gran que 9, llavors s'ha de retallar l'string i deixar un espai per a imprimir la mida
		{
			return s.substring(0, 9) + " " + this.getTextSize(); 
		}
		else 
			if (s.length() < 5)
			{
				return s + "      " + this.getTextSize(); 
			}
			else
			{
				 return s + "    " + this.getTextSize();
			}        	
    }
}

/**
 * Pràctica 1 DPOO Exercici 1
 * @alumne: Jordi Bericat Ruz 
 */

package edu.uoc.prac;

/**
 * @Classe: Piece.java
 * 
 * @Descripció: Classe abastracta. Serveix com a contenidor de les subclasses 
 * SyhteticPiece(), TextPiece() i WoolPiece(), les quals hereten els seus mètodes 
 * i atributs. Això permet que un objecte d'alguna de les subclasses sigui 
 * instanciat a l'hora com un objecte de tipus "Piece" dins d'un TAD llista, facilitant 
 * que aquest contingui objectes "heterogenis" pero que a l'hora comparteixin alguns elements 
 * en comú.
 *
 */

public abstract class Piece {
		
	//Atributs
	
	private Integer x;
	private Integer y;
	private Boolean manufactured;
	private Double price;
	
	//Relacions 
	
	private Design design; //Bidireccional *..1 -> Per a cada instància de la classe Piece hi haurà un (i nomès un) disseny associat.
	private Color color; //Unidireccional 1..1 -> Per a cada instància de Piece hi haurà una instància de color associada, pero no a l'inrevès.
				
	//Constructor
	
	/**
	 * Mètode: public Piece(int x, int y, boolean manufactured, double price)
	 * Funcionalitat: Mètode constructor. permet instanciar els objectes de classes 
	 * que heredin d'aquesta classe (si no fos abstracta permetria instanciar objectes 
	 * d'aquesta classe en concret)
	 * 
	 * Paràmetres d'entrada:
	 * @param x -> coordenada x (columna) que ocupara la peça dins el disseny
	 * @param y -> coordenada y (fila) que ocupara la peça dins el disseny
	 * @param manufactured -> Desconegut (no es fa servir?)
	 * @param price -> preu individual de la peça
	 * 
	 * Paràmetres sortida: no retorna cap valor
	 * 
	 */
				
	public Piece(Integer x, Integer y, Boolean manufactured, Double price) { 
		this.x = x;
		this.y = y;
		this.manufactured = manufactured; //No es fa servir
		this.price = price;
		this.design = null;
		this.color = null;
	}
   
	//Getters 

	public Integer getX() {
		return this.x; 
	}
	
	public Integer getY() {
		return this.y; 
	}
	
	public Boolean getManufactured() { //No s'utilitza?
		return this.manufactured;
	}
	
	public Double getPrice(){  //Reutilitzem aquest mètode per a implementar el que també es demana a la classe Piece. Com que els paràmetres són iguals i fan el mateix no cal fer overload
		return this.price;
	}
	
	public Design getDesign() {
		return design;
	}
	
	public Color getColor() {
		return color;
	}
	
	//Setters
	
	/**Implementació part 5: Tot i que gairebé aconsegueixo que la meva sortida coincideixi 
	 * amb el joc de proves, hi ha alguna cosa que no he fet bé, ja que falta la darrera 
	 * linia de "Max rows are 4" (no he tingut temps per a localitzar el problema, 
	 * potser està en el mateix algorisme que he implementat).
	 * 
	 * Dit això; he decidit implementar el control d'errors dins dels mètodes setX(int x) 
	 * i setY(int i), ja que m'ha semblat que així "s'encapsula" millor la informació 
	 * (d'aquesta manera, és més fàcil controlar la propagació d'errors). 
	 * A més, així es pot estar segur de que el valors que passen els getters i setters 
	 * són fiables, cosa que incrementa la robustesa de l'aplicació i la facilitat de 
	 * manteniment i ampliació (si obtens errors durant la fase de codificació no cal 
	 * perdre temps esbrinant si els valors que passen els setters i getters són o no 
	 * correctes). Una altra forma d'implementació seria incloure el mateix algorisme 
	 * al mètode addPiece() (Opció descartada).
	 * 
	 * L'estratègia que he seguit per a tractar tots els errors possibles 
	 * correspon al següent algorisme (a la fase de codificació ho he separat entre en setX() i el setY())
	 * 
	 * si columna = nombre negatiu llavors mostrar error a1
	 * 	sino si fila = nombre negatiu llavors mostrar error a2
	 *		sino si columna > 5 llavors mostrar error b1
	 *			sino si fila > 4 llavors mostrar error b2
	 *				sino per i := 1;i < longitud llista fer llista->afegir("peça" a la posició "i") //NOTA: Si la peça és incorrecta no fem cap canvi
	 *
	 */	
	
	public void setX(Integer x) {
		if (x < 0)
		{
			System.out.println("ERROR. X must be a positive number");
		}
		else
		{
			if (x > 5)
			{
				System.out.println("ERROR. Max columns are 5");
			}
		}						
		this.x = x;
	}
	
	public void setY(Integer y) {	
		if (y < 0)
		{
			System.out.println("ERROR. Y must be a positive number");
		}
		else
		{
			if (y > 4)
			{
				System.out.println("ERROR. Max rows are 4");
			}
		}						
		this.y = y;
	}
	
	public void setManufactured(Boolean manufactured) { //No s'utilitza?
		this.manufactured = manufactured;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	public void setDesign(Design design) { //Associa la peça amb un disseny (Associació *..1)
		this.design = design; 
	}

	public void setColor(Color color) {
		this.color = color;
		setPrice(color.getPrice()); //S'ha d'actualitzar el preu de la peca cada cop que se li canvia el color.
	}
}

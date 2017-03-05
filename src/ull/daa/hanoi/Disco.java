/**
 * En este fichero encontramos la clase para los discos del problema de las torres de Hanoi
 * Pablo Pastor Martín
 * alu0100890839@ull.edu.es
 * 03/03/2017
 * Diseño y Análisis de Algoritmos
 */
package ull.daa.hanoi;

/**
 * Clase para los discos del problema de las torres de Hanoi
 * @author Pablo Pastor Martín
 * @version 1.0.0
 */
public class Disco  implements Comparable<Disco>{
	
	private int radio; 			// Radio del cisco
	
	/**
	 * Constructor por defecto, pone el radio a 1.
	 */
	public Disco() {
		radio = 1;
	}
	
	/**
	 * Constructor a partir de un radio dado
	 * @param radio El radio que tendrá el disco.
	 */
	public Disco(int radio) {
		this.radio = radio;
	}

	/**
	 * Getter de el radio
	 * @return Radio del disco
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * Setter del radio
	 * @param Nuevo radio del disco
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	/**
	 * Comparador con otro disco
	 */
	@Override
	public int compareTo(Disco otro) {
		return new Integer(radio).compareTo(otro.getRadio());
	}
	
	/**
	 * Método para imprimir el disco en una cadena
	 * @return Cadena que representa al disco
	 */
	public String toString() {
		return "| r: " + radio;
	}
}

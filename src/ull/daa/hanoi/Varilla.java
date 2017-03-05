/**
 * Clase para las varillas del problema de las torres de Hanoi
 * Diseño y Análisis de Algoritmos
 * Pablo Pastor Martín
 * alu0100890839@ull.edu.es
 * 03/03/2017
 */
package ull.daa.hanoi;

import java.util.ArrayList;

/**
 * Clase para las varillas del problema de las torres de Hanoi
 * @version 1.0.0
 * @author Pablo Pastor Martín
 */
public class Varilla {
	
	private ArrayList<Disco> discos;			// ArrayList de los discos de la varilla
	
	/**
	 * Constructor por defecto
	 */
	public Varilla() {
		discos = new ArrayList<Disco>();
	}
	
	/**
	 * Constructor a partir del número de discos que tiene que tener la varilla
	 * @param discos Número de discos
	 */
	public Varilla(int nDiscos) {
		this.discos = new ArrayList<Disco>();
		
		for(int i = 0; i < nDiscos; i++) {
			discos.add(new Disco(1 + i));
		}
	}
	
	/**
	 * Resetea la varilla
	 */
	public void reset() {
		discos.clear();
	}
	
	/**
	 * Reinicializa la varilla con el número de discos dados
	 */
	public void initialize(int nDiscos) {
		discos.clear();
		
		for(int i = 0; i < nDiscos; i++) {
			discos.add(new Disco(nDiscos - i));
		}
	}
	
	/**
	 * Añade un disco a la varilla
	 * @param disco Disco a añadir
	 */
	public void addDisk(Disco disco) {
		discos.add(0, disco);
	}
	
	/**
	 * Quita el disco superior y lo devuelve
	 * @return Disco superior
	 */
	public Disco takeDisk() {
		return discos.remove(0);
	}
	
	/**
	 * Método para obtener el número de discos
	 * @return Número de discos de la varilla
	 */
	public int getNumeroDiscos() {
		return discos.size();
	}
	
	/**
	 * Método para crear una cadena que represente a la varilla
	 * @return Cadena que representa a la varilla
	 */
	public String toString() {
		String toReturn = "";
		for(Disco d: discos) {
			toReturn += "  " + d.toString() + "\n";
		}
		toReturn += "_____\n";
		return toReturn;
	}
}

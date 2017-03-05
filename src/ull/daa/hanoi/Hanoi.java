/**
 * Clase que implementa el problema de las Torres de Hanoi tradicional de forma recursiva. 
 * Pablo Pastor Martín
 * alu0100890839@ull.edu.es
 * Diseño y Análisis de Algoritmos
 * 03/03/2017
 */
package ull.daa.hanoi;

/**
 * Clase que implementa el problema de las Torres de Hanoi traidicional de forma recursiva.
 * @author Pablo Pastor Martín
 * @version 1.0.0
 */
public class Hanoi {
	private Varilla varilla1;		// varillas del problema
	private Varilla varilla2;
	private Varilla varilla3;
	
	private int pasos;
	private boolean debug;
	/**
	 * Constructor a partir del número de discos que tiene la primera varilla
	 */
	public Hanoi(int nDiscos) {
		varilla1 = new Varilla(nDiscos);
		varilla2 = new Varilla();
		varilla3 = new Varilla();
		
		pasos = 0;
		debug = false;
	}
	
	/**
	 * Método que envuelve la ejecución del juego
	 */
	public void run(boolean debug) {
		this.debug = debug;
		this.hanoi(varilla1.getNumeroDiscos(), varilla1, varilla3, varilla2);
		System.out.println("Numero de movimientos realizados en total: " + pasos); 
	}
	
	/**
	 * Método recursivo que resuelve el problema
	 * @param origen Varilla de origen
	 * @param destino Varilla de destino
	 * @param auxiliar Varilla auxiliar
	 */
	public void hanoi(int size, Varilla origen, Varilla destino, Varilla auxiliar) {
		if(size == 1) {
			this.move(origen, destino);
		}
		else {
			hanoi(size - 1, origen, auxiliar, destino);
			this.move(origen, destino);
			hanoi(size - 1, auxiliar, destino, origen);
		}
	}
	
	/**
	 * Mueve un disco desde una varilla a otra
	 * @param origen varilla de origen
	 * @param destino varilla de destino
	 */
	public void move(Varilla origen, Varilla destino) {
		destino.addDisk(origen.takeDisk());
		pasos++;
		if(debug) {
			System.out.println("\nMovimiento nº: " + pasos);
			System.out.println("Varilla 1:\n" + varilla1);
			System.out.println("Varilla 2:\n" + varilla2);
			System.out.println("Varilla 3:\n" + varilla3);
			System.out.println("============\n");
		}
	}
	
	/**
	 * Getter de los pasos
	 * @return número de movimientos realizados
	 */
	public int getPasos() {
		return pasos;
	}
}

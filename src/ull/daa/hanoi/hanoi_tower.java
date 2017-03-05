/**
 * Clase para el main de la versión tradicional
 * Pablo Pastor Martín
 * alu0100890839@ull.edu.es
 * Diseño y Análisis de Algoritmos
 * 03/03/2017
 */
package ull.daa.hanoi;

/**
 * Main para la versión traidicional
 * @author Pablo Pastor Martín
 */
public class hanoi_tower {
	public static void main(String args[]) {
		if(args.length > 0) {
			long startTime = System.nanoTime();
			Hanoi hanoi = new Hanoi(Integer.parseInt(args[0]));
			if(args.length > 1 && args[1].equals("1")) {
				hanoi.run(true);
			}
			else {
				hanoi.run(false);
			}
			long endTime = System.nanoTime();

			long duration = (endTime - startTime);
			System.out.println("TIEMPO EMPLEADO: " + duration/1000000);
		}
	}
}

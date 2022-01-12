package packageJava.Ejercicio10;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 10: control de flujo
 * **/
public class Ejercicio10_NumeroVentasApp {

	public static void main(String[] args) {
		/*10)
Realiza una aplicación que nos pida un número de ventas a introducir, después nos
pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		String count = JOptionPane.showInputDialog("Ingrese el número de ventas que desea introducir");
		double suma = 0;
		
		int ventas = Integer.parseInt(count);
		
		for(int i = 0; i < ventas; i++) {
			String aux = JOptionPane.showInputDialog("Ingrese el total de la venta : ");
			double venta = Double.parseDouble(aux);
			suma += venta;
		}

		JOptionPane.showMessageDialog(null, "La suma total de las ventas es igual a : " + suma);
	}

}

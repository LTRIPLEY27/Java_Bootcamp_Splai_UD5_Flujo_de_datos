package packageJava.Ejercicio10;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 10: control de flujo
 * **/
public class Ejercicio10_NumeroVentasApp {

	public static void main(String[] args) {
		/*10)
Realiza una aplicaci�n que nos pida un n�mero de ventas a introducir, despu�s nos
pedir� tantas ventas por teclado como n�mero de ventas se hayan indicado. Al final
mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		String count = JOptionPane.showInputDialog("Ingrese el n�mero de ventas que desea introducir");
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

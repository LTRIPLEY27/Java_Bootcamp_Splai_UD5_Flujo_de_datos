package packageJava.Ejercicio4;

import javax.swing.*;

/**@author isabel Calzadilla
 * Ejercicio 4: control de flujo
 * **/
public class Ejercicio4_CalculaAreaApp {

	public static void main(String[] args) {
		/*4)
Haz una aplicación que calcule el área de un circulo (pi*R 2 ). El radio se pedirá por teclado
(recuerda pasar de String a double con Double.parseDouble ). Usa la constante PI y el
método pow de Math*/
		
		final double PI = 3.14;
		double radio;
		
		String radius = JOptionPane.showInputDialog("Indique el radio : ");
		
		radio = Double.parseDouble(radius);
		//JOptionPane.showMessageDialog(null, "El área del circulo con radio " + radio + " es igual a : " + (PI * (radio * radio)));
		JOptionPane.showMessageDialog(null, "El área del circulo con radio " + radio + " es igual a : " + (PI * Math.pow(radio, 2)));
	}

}

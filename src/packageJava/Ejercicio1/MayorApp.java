package packageJava.Ejercicio1;

import javax.swing.*;

/**@author isabel Calzadilla
 * Ejercicio 1: control de flujo
 * **/

public class MayorApp {

	public static void main(String[] args) {
		/*1)
Declara 2 variables num�ricas (con el valor que desees), he indica cual es mayor de los
dos. Si son iguales indicarlo tambi�n. Ves cambiando los valores para comprobar que
funciona.*/
		
		int a, b;

		String num1 = JOptionPane.showInputDialog("Indique el valor para n�mero 1");
		String num2 = JOptionPane.showInputDialog("Indique el valor para n�mero 2");
		
		a = Integer.parseInt(num1);
		b = Integer.parseInt(num2);
		
		if(a > b) {
			JOptionPane.showMessageDialog(null, "El n�mero 1: " + a + " es mayor a n�mero 2 : " + b);
		} else {
			JOptionPane.showMessageDialog(null, "El n�mero 2 : " + b + " es mayor a n�mero 1: " + a);
		}
	}

}

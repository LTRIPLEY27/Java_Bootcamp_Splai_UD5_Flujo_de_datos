package packageJava.MajorThen;

import javax.swing.*;

/**@author isabel Calzadilla
 * Ejercicio 1: control de flujo
 * **/

public class MayorApp {

	public static void main(String[] args) {
		/*1)
Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los
dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que
funciona.*/
		
		int a, b;

		String num1 = JOptionPane.showInputDialog("Indique el valor para número 1");
		String num2 = JOptionPane.showInputDialog("Indique el valor para número 2");
		
		a = Integer.parseInt(num1);
		b = Integer.parseInt(num2);
		
		if(a > b) {
			JOptionPane.showMessageDialog(null, "El número 1: " + a + " es mayor a número 2 : " + b);
		} else {
			JOptionPane.showMessageDialog(null, "El número 2 : " + b + " es mayor a número 1: " + a);
		}
	}

}

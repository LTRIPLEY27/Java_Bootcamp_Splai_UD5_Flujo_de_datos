package packageJava.Ejercicio7;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 7: control de flujo
 * **/
public class Ejercicio7_Cuenta_con_WhileApp {

	public static void main(String[] args) {
		// 7)Muestra los n�meros del 1 al 100 (ambos incluidos). Usa un bucle while
		
		int num = 1;
		
		while(num <= 100) {
			//JOptionPane.showMessageDialog(null, "El valor de n�mero es : " + num);
			System.out.println("El valor de n�mero en �sta vuelta  es : " + num);
			num++;
		}
	}

}

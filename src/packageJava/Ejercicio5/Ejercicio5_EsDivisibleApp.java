package packageJava.Ejercicio5;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 5: control de flujo
 * **/
public class Ejercicio5_EsDivisibleApp {

	public static void main(String[] args) {
		/*5)
Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, tambi�n
debemos indicarlo.*/
		
		String aux = JOptionPane.showInputDialog("Indique el numero a verificar: ");
		int num = Integer.parseInt(aux);
		
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El n�mero : " + num + " es divisible entre 2 ");
		} else {
			JOptionPane.showMessageDialog(null, "El n�mero : " + num + " no es divisible entre 2 ");
		}

	}

}

package packageJava.Ejercicio12;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 12: control de flujo
 * **/
public class Ejercicio12_Verifica_ContrasenyaApp {

	public static void main(String[] args) {
		/*12)
Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s
se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas
la contrase�a y mostrara un mensaje diciendo � Enhorabuena�. Piensa bien en la condici�n
de salida (3 intentos y si acierta sale, aunque le queden intentos).*/

		String pass = JOptionPane.showInputDialog("Ingrese la contrase�a a almacenar : ");
		int count = 0;
		String password = "";
		
		do {
			password = JOptionPane.showInputDialog("Ingrese password, dispones de s�lo 3 intentos : ");
			if(password.equals(pass)) {
				JOptionPane.showMessageDialog(null, " Enhorabuena");
				break;
			}
			count++;
		}while(count < 3);
	}

}

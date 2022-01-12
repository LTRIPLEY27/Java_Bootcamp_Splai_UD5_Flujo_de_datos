package packageJava.Ejercicio12;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 12: control de flujo
 * **/
public class Ejercicio12_Verifica_ContrasenyaApp {

	public static void main(String[] args) {
		/*12)
Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
la contraseña y mostrara un mensaje diciendo “ Enhorabuena”. Piensa bien en la condición
de salida (3 intentos y si acierta sale, aunque le queden intentos).*/

		String pass = JOptionPane.showInputDialog("Ingrese la contraseña a almacenar : ");
		int count = 0;
		String password = "";
		
		do {
			password = JOptionPane.showInputDialog("Ingrese password : ");
			if(password.equals(pass)) {
				JOptionPane.showMessageDialog(null, " Enhorabuena");
				break;
			}
			count++;
		}while(count < 3);
	}

}

package packageJava.Ejercicio3;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 3: control de flujo
 * **/

public class Ejercicio3App {

	public static void main(String[] args) {
		/*3)
Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
(recuerda usar JOptionPane*/

String name;
		
		name = JOptionPane.showInputDialog("Indica tu nombre, por favor : ");
		JOptionPane.showMessageDialog(null, "Bienvenido  " + name);
	}

}

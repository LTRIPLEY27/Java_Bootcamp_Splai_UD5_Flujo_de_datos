package packageJava.StringName;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 2: control de flujo
 * **/
public class ReturnNameApp {

	public static void main(String[] args) {
		/*2)
Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
por consola. Por ejemplo: si introduzco “ Fernando”, me aparezca “Bienvenido*/
		
		String name;
		
		name = JOptionPane.showInputDialog("Indica tu nombre, por favor : ");
		JOptionPane.showMessageDialog(null, "Bienvenido  " + name);
	}

}

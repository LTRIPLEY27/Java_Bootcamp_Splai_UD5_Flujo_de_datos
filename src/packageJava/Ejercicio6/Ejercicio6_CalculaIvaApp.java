package packageJava.Ejercicio6;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 6: control de flujo
 * **/
public class Ejercicio6_CalculaIvaApp {

	public static void main(String[] args) {
		/*6)
Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
calcule el precio final con IVA. El IVA sera una constante que sera del 21%*/
		
		final double IVA = 0.21;
		
		String product = JOptionPane.showInputDialog("Indique el precio del producto : ");
		
		double producto = Double.parseDouble(product);
		
		JOptionPane.showMessageDialog(null, "El precio del producto : " + producto + " con IVA incluido es : " + (producto + (producto * IVA)));

	}

}

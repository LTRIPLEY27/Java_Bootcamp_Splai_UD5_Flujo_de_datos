package packageJava.Ejercicio11;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 11: control de flujo
 * **/
public class Ejercicio11_DiaLaboral_con_SwitchApp {

	public static void main(String[] args) {
		/*11)Crea una aplicaci�n que nos pida un d�a de la semana y que nos diga si es un d�a laboral
		o no. Usa un switch para ello.*/
		
		String day = JOptionPane.showInputDialog("Indique el d�a de la semana a evaluar si es o no laboral");
	
		switch(day.toLowerCase()){
			case "lunes":
				JOptionPane.showMessageDialog(null, "El d�a " + day + " es laborable");
				break;
			case "martes":
				JOptionPane.showMessageDialog(null, "El d�a " + day + " es laborable");
				break;
			case "miercoles":
				JOptionPane.showMessageDialog(null, "El d�a " + day + " es laborable");
				break;
			case "jueves":
				JOptionPane.showMessageDialog(null, "El d�a " + day + " es laborable");
				break;
			case "viernes":
				JOptionPane.showMessageDialog(null, "El d�a " + day + " es laborable");
				break;
			case "sabado":
				JOptionPane.showMessageDialog(null, "El d�a " + day + " no es laborable");
				break;
			case "domingo":
				JOptionPane.showMessageDialog(null, "El d�a " + day + " no es laborable");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Indique una opci�n v�lida");
				break;

		}
	}

}

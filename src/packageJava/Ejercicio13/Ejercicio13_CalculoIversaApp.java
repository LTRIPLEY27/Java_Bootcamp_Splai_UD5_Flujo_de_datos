package packageJava.Ejercicio13;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 13: control de flujo
 * **/
public class Ejercicio13_CalculoIversaApp {

	public static void main(String[] args) {
		/*13)
Crea una aplicación llamada CalculadoraInversa , nos pedirá 2 operandos int ) y un signo
aritmético ( String ), según este último se realizara la operación correspondiente. Al final
mostrara el resultado en un cuadro de dialogo.
Los signos aritméticos disponibles son:
+: suma los dos
operandos
-
-: resta los operandos
*: multiplica los
operandos
/: divide los
operandos , este debe dar un resultado con decimales double
^:
1º operando como base y 2º como exponente.
%:
módulo, resto de la división entre operando1 y operando2.*/ 
		
		double n1, n2;
		String num1 = JOptionPane.showInputDialog("Ingrese valor 1: ");
		String num2 = JOptionPane.showInputDialog("Ingrese valor 2: ");
		String operando = JOptionPane.showInputDialog("Ingrese operacion aritmética a realizar con los siguientes signos para : suma (+), resta(-), multiplicación (*), división (/), exponente (^) y módulo (%)");
		
		//JOptionPane.showMessageDialog(null, operando);
		
		n1 = Double.parseDouble(num1);
		n2 = Double.parseDouble(num2);
	
		switch(operando) {
			case "+":
				JOptionPane.showMessageDialog(null, "La suma de valor1 : " + n1 + " valor2  " + n2 + " es igual a: " + (n1 + n2) );
				break;
			case "-":
				JOptionPane.showMessageDialog(null, "La resta de valor1 : " + n1 + " valor2  " + n2 + " es igual a: " + (n1 - n2) );
				break;
			case "*":
				JOptionPane.showMessageDialog(null, "La multiplicación de valor1 : " + n1 + " valor2 " + n2 + " es igual a: " + (n1 * n2) );
				break;
			case "/":
				JOptionPane.showMessageDialog(null, "La división de valor1 : " + n1 + " valor2  " + n2 + " es igual a: " + (n1 / n2) );
				break;
			case "^":
				JOptionPane.showMessageDialog(null, "La potencia de valor1 : " + n1 + " valor2  " + n2 + " es igual a: " + Math.pow(n1, n2) );
				break;
			case "%":
				JOptionPane.showMessageDialog(null, "El módulo de valor1 : " + n1 + " valor2  " + n2 + " es igual a: " + (n1 % n2) );
				break;
			default:
				JOptionPane.showMessageDialog(null, "Ingrese opción válida");
				break;
				
		}

	}

}

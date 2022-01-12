package packageJava.Ejercicio13;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * Ejercicio 13: control de flujo
 * **/
public class Ejercicio13_CalculoIversaApp {

	public static void main(String[] args) {
		/*13)
Crea una aplicaci�n llamada CalculadoraInversa , nos pedir� 2 operandos int ) y un signo
aritm�tico ( String ), seg�n este �ltimo se realizara la operaci�n correspondiente. Al final
mostrara el resultado en un cuadro de dialogo.
Los signos aritm�ticos disponibles son:
+: suma los dos
operandos
-
-: resta los operandos
*: multiplica los
operandos
/: divide los
operandos , este debe dar un resultado con decimales double
^:
1� operando como base y 2� como exponente.
%:
m�dulo, resto de la divisi�n entre operando1 y operando2.*/ 
		
		double n1, n2;
		String num1 = JOptionPane.showInputDialog("Ingrese valor 1: ");
		String num2 = JOptionPane.showInputDialog("Ingrese valor 2: ");
		String operando = JOptionPane.showInputDialog("Ingrese operacion aritm�tica a realizar con los siguientes signos para : suma (+), resta(-), multiplicaci�n (*), divisi�n (/), exponente (^) y m�dulo (%)");
		
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
				JOptionPane.showMessageDialog(null, "La multiplicaci�n de valor1 : " + n1 + " valor2 " + n2 + " es igual a: " + (n1 * n2) );
				break;
			case "/":
				JOptionPane.showMessageDialog(null, "La divisi�n de valor1 : " + n1 + " valor2  " + n2 + " es igual a: " + (n1 / n2) );
				break;
			case "^":
				JOptionPane.showMessageDialog(null, "La potencia de valor1 : " + n1 + " valor2  " + n2 + " es igual a: " + Math.pow(n1, n2) );
				break;
			case "%":
				JOptionPane.showMessageDialog(null, "El m�dulo de valor1 : " + n1 + " valor2  " + n2 + " es igual a: " + (n1 % n2) );
				break;
			default:
				JOptionPane.showMessageDialog(null, "Ingrese opci�n v�lida");
				break;
				
		}

	}

}

package packageJava.Ejercicio9;
/**@author isabel Calzadilla
 * Ejercicio 9: control de flujo
 * **/
public class Ejercicio9_NumDivisible_entre_tres_y_dos_con_ForApp {

	public static void main(String[] args) {
		/*9)Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle
		que desees.*/
		
		for(int i = 1; i <=100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.println("El número " + i + " es múltiplo de 2 y 3 ");
			}
		}
		
		System.out.println("\n \nAhora con while: ");
		
		
		int aux = 1;
		while(aux <= 100) {
			if(aux % 2 == 0 && aux % 3 == 0) {
				System.out.println("El número " + aux + " es múltiplo de 2 y 3 ");
			}
			
			aux++;
		}

	}

}

/* Nombre: areacono
 * Analisis
 * 	El programa calcula el area lateral, el area total y el volumen del cono
 * 	Entradas: El radio de la base y la altura del cono
 * 		
 * 	Salida: El area lateral, la total y el volumen
 *
 * 	Restricciones: Los números introducidos deben ser positivos
 * 	Variables: radio, altura, generatriz, Alateral, Atotal, Volumen
 * 	Constantes: PI	
 * 	Comentarios:
 * 		-Se calcula la generatriz dentro del programa pero no se muestra 
 * 		-Formulas:
 * 			-Alateral=PI*radio*generatriz
 * 			-Atotal=PI*radio*generatriz+PI*radio*radio
 * 			-Volumen=(1.0/3)*PI*radio*radio*altura
 * 
 * Pseudocodigo generalizado:
 * Inicio
 * 		Leer datos
 * 		Calcular area lateral, area total y volumen
 * 		Mostrar resultado
 * Fin
 * 
 */

import java.util.*;
import java.lang.*;

public class areacono {
	
	public static void main (String[] args) { 
		Scanner teclado = new Scanner(System.in);
		//Leer datos
		double Alateral;
		double Atotal;
		double Volumen;
		double generatriz;
		double radio;
		double altura;
		final double PI=3.14;
		System.out.print("Introduce el radio: ");
		radio=teclado.nextInt();
		System.out.print("Introduce la altura: ");
		altura=teclado.nextInt();
		//Fin Leer datos
		//Calcular area lateral, area total y volumen
		generatriz=Math.sqrt(altura*altura+radio*radio);

		Alateral=PI*radio*generatriz;
		
		Atotal=PI*radio*generatriz+PI*radio*radio;

		Volumen=PI*radio*radio*altura*(1.0/3);
		//Fin Calcular area lateral, area total y volumen
		//Mostrar resultado
		System.out.println("El area lateral es: "+Alateral);
		System.out.println("El area total es: "+Atotal);
		System.out.println("El volumen es: "+Volumen);
		//Fin mostrar resultado
		
	}
}


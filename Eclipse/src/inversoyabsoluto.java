/*Nombre:inversoyabsoluto
 * Análisis
 * El programa calcula el inverso y el abosutlo de un número cualquiera excepto el 0
 * 	Entrada: Un número entero (n)
 * 	Salida: Dos números enteros (Abs e Inv)
 * 	Restricciones: No se puede introducir el 0
 * Comentarios:
 * 		-Inverso de un número: 5^-1=1/5
 * 		-Valor absoluto de un número: |5|=5 y |-5|=5
 * 
 *	Pseudocódigo generalizado:
 * 	Inicio
 * 		Leerdatos
 * 		Calcular inverso, valor absoluto y mostrar resultado
 * 	Fin
 */ 



import java.util.*;
import java.lang.*;


public class inversoyabsoluto {
	
	public static void main (String[] args) {
		Scanner tecla=new Scanner(System.in);
		//Leer datos
		int abs;
		double inv;
		int n=0;
		System.out.print("Introduce un numero: ");
		n=tecla.nextInt();
		//Fin Leer datos
		//Calcular inverso, valor absoluto y valorar el caso de 0
		
		if (n!=0){
			inv=1.0/n;
			abs=Math.abs(n);
			//Mostrar resultado
			System.out.println("El inverso es: "+inv);
			System.out.println("El valor absoluto es: " + abs);
			}
			
		else {
		System.out.println("ERROR");
		}
		//Fin mostrar resultado
		//Fin calcular inverso, valor absoluto y valorar el caso de 0		
	}
}


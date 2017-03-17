/*
 * Nombre: numerosnaturales
 * 
 * Análisis
 * 
 * Este programa calcula la potencia, el producto y las raíces cuadradas de los N primeros números naturales que introduzcas entre 1 y 20.
 * Entrada: Un número
 * Salida: La potencia enésima de cada uno de esos números, el producto de todos ellos y las raíces cuadradas de cada uno.
 * Restricciones: 
 * 	-El número introducido debe estar entre 1 y 20, ambos incluidos.
 * 	-La potencia debe ser entre 2 y 5, ambos incluidos.
 * 
 * Pseudocódigo generalizado:
 * 
 * Inicio
 * 		Leer y validar entrada
 * 		Mientras quiera iniciar programa
 * 			Leer y validar los números
 * 			Hacer operaciones
 * 			Mostrar resultado
 * 			Leer y validar reiniciar
 * 		Fin_Mientras
 * Fin
 * 
 * 
 * 
 * numero
 */

import java.io.*;
import java.util.*;
import java.lang.Math;

public class numerosnaturales {
	
	public static void main (String[] args) {
			
			int numero=0;
			double potencia=0.0;
			char ejecutar=' ';
			double raizCuadrada=0.0;
			double producto=1.0;
			double resultadoPotencia=0.0;
			Scanner teclado= new Scanner (System.in);
			
			//Leer y validar entrada
			do
			{ System.out.println("Desea iniciar el programa? Si/No");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			}while (ejecutar!='s' && ejecutar!='n');
			//Fin leer y validar entrada
			
			//Mientras quiera iniciar programa

			while (ejecutar=='s'){	
				//Leer y validar números
				do 
				{
					System.out.println("Introduzca un numero del 1 al 20: ");
					numero=teclado.nextInt();
				}while (numero<1 || numero>20);
				
				
				
				do 
				{
					System.out.println("Introduzca una potencia entre 2 y 5: ");
					potencia=teclado.nextDouble();
				}while (potencia<2 || potencia >5);
				//Leer y validar números
				
				//Hacer operaciones
				int contador; 
				for ( contador=1; contador <= numero; contador++) //El contador se inicializa en 0, mientras el contador sea menor que el numero el contador se incrementará.
				{
					raizCuadrada=Math.sqrt(contador);
					
					resultadoPotencia=Math.pow(contador,potencia);
					
					producto=contador*producto;
					
					System.out.println("La raiz cuadrada de " +contador+ " es: "+raizCuadrada);
					System.out.println("El resultado de la potencia " +contador+ " es: "+resultadoPotencia);
				}
				System.out.println("El producto de todos los numeros es: " + producto);
				//Fin hacer operaciones
				//Leer y validar reiniciar
				do
					{
						System.out.println("Quiere reiniciar el programa? Si/No");
						ejecutar=Character.toLowerCase(teclado.next().charAt(0));
					}while (ejecutar != 's'&& ejecutar!='n');
			}
			//Fin_mientras
	}
}


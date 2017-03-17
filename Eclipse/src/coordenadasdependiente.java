/* Nombre: coordenadasdependiente
 * 
 * Analisis
 * 
 * Este programa te indica en qué cuadrante se encuentra el punto de las coordenadas introducidas
 * 
 * Entrada: Coordenadas cartesianas (x,y)
 * Salida: Cuadrante correspondiente
 * Restricciones: Ninguno de los dos números puede valer 0, ya que si no el punto se encontraría en un eje y no en un cuadrante.
 * Comentarios:
 * -Si (x,y): 1º cuadrante
 * -Si (-x,y): 2º cuadrante
 * -Si (-x,-y): 3º cuadrante
 * -Si (x,-y): 4º cuadrante
 * 
 * 
 * Pseudocódigo generalizado:
 * 
 * Inicio
 * 		Preguntar si quiere iniciar el programa
 * 		Mientras quiera iniciar programa
 * 			Leer y verificar coordenadas
 * 			Chequear y mostrar resultado
 * 			Preguntar si quiere reiniciar el programa
 * 		Fin_Mientras
 * Fin
 * 
 * 
 */

import java.util.*;
import java.io.*;

public class coordenadasdependiente {
	
	public static void main (String[] args) {
		Scanner teclado=new Scanner(System.in);
		int x=0;
		int y=0;
		char ejecutar=' ';
		
		//preguntar si quiere iniciar programa
		//Leer y verificar datos
		//Bucle controlado por centinela
		System.out.println ("Quieres iniciar el programa?");
		ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		while (ejecutar!='s'&& ejecutar!='n')
		{ //Condición de salida: Si escribimos 's' o 'n' salimos del bucle, en el caso de escribir 'n' salimos del bucle y del programa y en el caso de escribir 's' volvemos al bucle anterior
			System.out.println ("Quieres iniciar el programa?");
			ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		}
		//Fin del bucle
		//fin preguntar si quiere iniciar programa
		//Mientras quiera seguir
		//Bucle controlado por centinela
		while (ejecutar=='s') {//Condición de salida: Si escribimos 'n' sale del bucle y del programa.
			System.out.print("Introduce la primera coordenada: ");
			x=teclado.nextInt();
			System.out.print("Introduce la segunda coordenada: ");
			y=teclado.nextInt();
		
			//Fin leer y verificar datos
			//Chequear y mostrar resultado
			
			if ((x==0||y==0)||(x==0&&y==0)){
				System.out.println("El punto se situa en un eje de coordenadas");
			}
			
			if (y>0) {
				
				if (x>0){
					System.out.println("El punto se encuentra en el primer cuadrante");
				}
				
				if (x<0){
					System.out.println("El punto se encuentra en el segundo cuadrante");
				}
			}
			
			if (y<0) {
				
				if (x>0){
				System.out.println("El punto se encuentra en el cuarto cuadrante");
				}
				
				if (x<0) {
				System.out.println ("El punto se encuentra en el tercer cuadrante");
				}
			} 
			//Fin chequear y mostrar resultado
				 //Preguntar si quiere reiniciar programa
			
			System.out.println ("Quieres reiniciar el programa?");
			ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			//Bucle controlado por centinela
			while (ejecutar!='s'&& ejecutar!='n'){//Condición de salida: Si escribimos 's' o 'n' salimos del bucle, en el caso de escribir 'n' salimos del bucle y del programa
				System.out.println ("Quieres reiniciar el programa?");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			
			}
			//Fin del bucle
			//fin preguntar si quiere reiniciar programa
		}
		//Fin bucle
		//Fin mientras quiera iniciar programa
	}
}

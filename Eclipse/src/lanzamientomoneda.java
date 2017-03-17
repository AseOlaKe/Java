/*
 * Nombre: lanzamientomoneda
 * 
 * Analisis
 * 
 * Este programa simula el lanzamiento de una moneda al aire y te indica si ha salido cara o cruz
 * 
 * Entrada: Si o no.
 * Salida: Cara o cruz.
 * 
 * Pseudocódigo generalizado:
 * 
 * Inicio
 * 		Leer y validar iniciar
 * 		Mientras quiera iniciar
 * 			Chequear y Mostrar resultado
 * 			Leer y validar reiniciar
 * 		Fin_Mientras
 * Fin
 */

import java.io.*;
import java.util.*;

public class lanzamientomoneda {
	
	public static void main (String[] args) {
		
		char ejecutar=' ';
		int numero=0;
		
		
		Scanner teclado= new Scanner(System.in);
		Random aleatorio= new Random();
		//Leer y validar iniciar
		do
		{
			System.out.println("Quiere iniciar el programa? Si/No");
			ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		}while(ejecutar!='s'&&ejecutar!='n');
		//Mientras quiera iniciar
		while (ejecutar=='s')
		{
			 numero=aleatorio.nextInt(2)+1;
			
			
			//Chequear y mostrar resultado
			if (numero==1)
			{
				System.out.println("HA SALIDO CRUZ");
			}
			
			else
			{
				System.out.println("HA SALIDO CARA");
			}
			//Leer y validar reiniciar
			do 
			{
				System.out.println("Quiere iniciar el programa? Si/No");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			}while(ejecutar!='s'&&ejecutar!='n');
		}
	}
}


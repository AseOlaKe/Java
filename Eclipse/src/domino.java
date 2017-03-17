/*
 * Nombre: domino
 * 
 * Analisis
 * 
 * Este programa saca fichas de domino al azar hasta que lo indiques, suma sus cantidades y cuenta cuantas veces ha salido cada una.
 * 
 * Entrada: Un número entero.
 * Salida: La suma de los valores de las fichas(un número entero) y 
 * Restricciones: - El número introducido debe estar entre 1 y 28
 * 
 * Pseudocódigo generalizado
 * 
 * Inicio
 * 		Leer y validar iniciar
 * 		Mientras quiera iniciar
 * 			Leer y validar sacar ficha
 * 			Mientras quiera sacar fichas
 * 				Leer y validar sacar otra ficha y mostrar puntuaciones de las fichas
 * 				Leer y validar reiniciar
 * 			Fin_Mientras quiera sacar fichas	
 * 		Fin_Mientras
 * Fin
 * 
 * 
 */

import java.io.*;
import java.util.*;

public class domino {
	
	public static void main (String[] args) {
		
		int ficha=0;
		char sacaFicha=' ';
		int contador;
		char ejecutar=' ';
		int numeroFichas=0;
		char otraFicha=' ';
		
		Scanner teclado=new Scanner(System.in);
		Random aleatorio=new Random();
		//Leer y validar iniciar
		do
		{
			System.out.println("Quieres iniciar el programa? Si/No");
			ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		}while(ejecutar!='s'&&ejecutar!='n');
		//Fin Leer y validar iniciar
		//Mientras quiera iniciar
		while(ejecutar=='s')
		{
			//Leer y validar sacar ficha
			do
			{
				System.out.println("Quieres sacar una ficha? Ten en cuenta que en el domino hay 28 fichas Si/No:");
				sacaFicha=Character.toLowerCase(teclado.next().charAt(0));
			} while(sacaFicha!='s'&&sacaFicha!='n');
			//Fin Leer y validar número
			//Mientras quiera sacar ficha
			while (sacaFicha=='s')
			{ 
					
				for(contador=1;contador<=28;contador++)
				{
				  ficha=aleatorio.nextInt(13)+0;
				 //Leer y validar sacar otra ficha y mostrar puntuaciones de las fichas
				  System.out.println("Ficha: "+ficha);
				  
					do
					{
					System.out.println("Quieres sacar otra ficha mas? Ten en cuenta que en el domino hay 28 fichas (Otra/No): ");
					sacaFicha=Character.toLowerCase(teclado.next().charAt(0));
					} while(sacaFicha!='s'&&sacaFicha!='n');		
				}
				//Leer y validar reiniciar
				do
					{
						System.out.println("Quieres reiniciar el programa? Si/No");
						ejecutar=Character.toLowerCase(teclado.next().charAt(0));
					}while(ejecutar!='s'&&ejecutar!='n');
				//Fin leer y validar reiniciar
			} //Fin_Mientras quiera sacar ficha		
		}//Fin_mientras quiera iniciar
	}
}


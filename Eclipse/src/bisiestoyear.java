/*Nombre: bisiestoyear
 * 
 * Análisis
 * Es un programa que comprueba si el año introducido es bisiesto o no.
 * Entrada: Un número (year)
 * Salida: Es bisiesto o no es bisiesto.
 * Restricciones: El número introducido debe ser positivo
 * Comentario: Un año es bisiesto si es divisible por 400, o bien es divisible por 4 pero no por 100.
 * 
 * Pseudocódigo generalizado
 * 
 * Inicio
 * 		Preguntar si quiere iniciar programa
 * 		Mientras quiera iniciar programa
 * 				Leer y validar número
 * 				Chequear y mostrar resultado
 * 			
 * 		Preguntar si quiere reiniciar programa
 * 		Fin Mientras
 * Fin
 * 			
 *
 * 
 * 
 */
import java.io.*;
import java.util.*;

public class bisiestoyear {
	
	public static void main (String[] args) {
		
		boolean bisiesto;
		int year=0;
		char ejecutar=' ';
		
		Scanner tecla= new Scanner (System.in);
		
		System.out.println("Do you want to start the program? Y/N");
		ejecutar=Character.toLowerCase(tecla.next().charAt(0));
		
		while(ejecutar!='y'&&ejecutar!='n')
		{	
			 System.out.println("Do you want to start the program? Y/N");
				ejecutar=Character.toLowerCase(tecla.next().charAt(0));
		}
		
		while(ejecutar=='y')
		{ 
			System.out.println("Enter a year: ");
			year=tecla.nextInt();
			if (year<0)
			{ 
				System.out.println("ERROR");
			}
			
			else if ((year%400==0)||(year%4==0&&year%100!=0))
			{
				bisiesto=true;
				System.out.println("It's a leap-year");
			}
			else if ((year%400!=0)||(year%4!=0||year%100==0))
			{
				bisiesto=false;
				System.out.println("It isn't a leap-year");
			}
			System.out.println("Do you want to restart the program?");
			ejecutar=Character.toLowerCase(tecla.next().charAt(0));
			
			while(ejecutar!='y'&&ejecutar!='n')
			{	
				 System.out.println("Do you want to restart the program?");
					ejecutar=Character.toLowerCase(tecla.next().charAt(0));
			}
		}
		
		
		
	}
}


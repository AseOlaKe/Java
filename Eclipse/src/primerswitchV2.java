/*
 * Nombre: primerswitch
 * 
 * Analisis
 * 	Este programa puede realizar distintas operaciones según la opción que escoja el usuario: Si escoge la 1 calcula el factorial de un número, si escoge la 2 calcula la cantidad de dígitos que tiene un número y si escoge la 3 cuenta y suma los números que son múltiplos de 5 de un número escogido entre 1 y 100.
 * 	Entrada: 
 * 		-Si elige la opción de calcular el factorial de un número entero, la entrada será un número entero.
 * 		-Si elige la opción de calcular la cantidad de dígitos que tiene un número, la entrada será un número entero.
 * 		-Si elige la tercera opción, la entrada será un número entero.
 * 	Salida:
 * 		-Primera opción: Un número entero.
 * 		-Segunda opción: Un número entero.
 * 		-Tercera opción: Dos números enteros.
 * 	Restricciones:
 * 		-Primera opción: El número no puede ser negativo.
 * 		-Tercera opción: El número debe estar entre 1 y 100.
 * 
 * 	Pseudocódigo generalizado:
 * 		Inicio
 * 			Leer y validar iniciar
 * 			Mientras quiera iniciar programa
 * 				Presentar menú y elegir y validar opción
 * 				Según (opción)
 * 					Para opcion==1
 * 						Leer y validar numero
 * 						Calcular el factorial
 * 						Mostrar resultado
 * 					Para opcion==2
 * 						Leer número
 * 						Calcular el número de dígitos
 * 						Mostrar resultado
 * 					Para opcion==3
 * 						Leer y validar número
 * 						Contar y sumar todos los números que sean múltiplos de 5
 * 						Mostrar resultado
 * 				Fin_Según
 * 				Leer y validar reiniciar
 * 			Fin_Mientras
 * 		Fin
 * 
 */
import java.io.*;
import java.util.*;
import java.lang.*;

public class primerswitchV2 {
	
	public static void main (String[] args) {
			
			Scanner teclado=new Scanner (System.in);
			int opcion=0;
			int numero=0;
			char ejecutar=' ';
			int factorial=1;
			int i=0;
			
			//Leer y validar entrada
			do
			{ 
				System.out.println("Quieres iniciar el programa? Si/No");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			} while (ejecutar!='s'&&ejecutar!='n');
			
			while (ejecutar=='s') //Mientras quiera iniciar programa
			{
				//Elegir y validar opcion
				do
				{
					factorial=1;
					
					i=0;
					System.out.println("Introduce la opcion elegida (1 para calcular el factorial de un numero, 2 para calcular los dígitos que tiene un numero y 3 para contar y sumar los numeros que sean multiplos de 5 de un numero): ");
					opcion=teclado.nextInt();
				}while(opcion!=1&&opcion!=2&&opcion!=3);
				
				switch(opcion)
				{
					case 1:
					
						
					
						System.out.println("Ha elegido la opcion de calcular el factorial de un numero");
						do
						{
							System.out.println("Introduce un numero mayor que 0");
							numero=teclado.nextInt();
						}while(numero<0);
						
						
							
						for(i=1;i<=numero;i++)
						{
							factorial=factorial*i;
								
						}
						
						System.out.println("El factorial de " + numero + " es: "+factorial);
						
								
					break;
					case 2:
						
						System.out.println("Ha elegido la opcion de calcular los digitos de un numero");
						System.out.println("Introduce un numero: ");
						numero=teclado.nextInt();
						while (numero!=0)
						{
							numero=numero/10;
							i++;
						}
						System.out.println("El numero tiene "+i+" cifras");
						
					break;
					case 3:
						System.out.println("Ha elegido la opcion de contar y sumar todos los numeros que sean multiplos de 5");
						do
						{
							System.out.println("Introduce un numero del 1 al 100, ambos incluidos: ");
							numero=teclado.nextInt();
						}while(numero<1||numero>100);
						
							System.out.println("EN CONSTRUCCION");
						
						break;
						
				}
				do
					{ 
					System.out.println("Quieres reiniciar el programa? Si/No");
					ejecutar=Character.toLowerCase(teclado.next().charAt(0));
					} while (ejecutar!='s'&&ejecutar!='n');
			}
	}
}


/*
 * Nombre: primerswitchV3
 * 
 * Analisis
 * 	Este programa puede realizar distintas operaciones según la opción que escoja el usuario: Si escoge la 1 calcula el factorial de un número, si escoge la 2 calcula la cantidad de dígitos que tiene un número y si escoge la 3 cuenta y suma los números que son múltiplos de 5 de un número escogido entre 1 y 100.
 * 	Entrada: 
 * 		-La opción elegida.
 * 		-Si elige la opción de calcular el factorial de un número entero, la entrada será un número entero.
 * 		-Si elige la opción de calcular la cantidad de dígitos que tiene un número, la entrada será un número entero.
 * 		-Si elige la tercera opción, la entrada será un número.
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
 * ESTUDIO DE BUCLES:
 * 	
 * -Bucle de los módulos "Leer y Validar iniciar" y "Leer y validar reiniciar"
 * 		- Es un bucle controlado por suceso y, por tanto, tiene una VCB de tipo centinela.
 * 		- Condición de salida: Introducir 's' o 'n'.
 * 		- Se inicializa por lectura anticipada antes de la primera iteración
 * 		- Se actualiza al final del bucle por lectura final.
 *
 *  -Bucle del módulo "Presentar menú y elegir y valdiar opción"
 * 		- Es un bucle controlado por sucesos
 * 		- VCB de tipo centinela
 * 		- Condición de salida: Introducir un número mayor que uno y menor que tres.
 * 		- Se inicializa por lectura anicipada antes de la primera iteración
 * 		- Se actualiza al final del bucle por lectura final.
 * 	
 * -Bucle del módulo "Leer y validar número" (De la opcion==1)
 * 		- Es un bucle controlado por sucesos
 * 		- VCB de tipo centinela
 * 		- Condición de salida: Introducir un número mayor que 0.
 * 		- Se inicializa por lectura anicipada antes de la primera iteración
 * 		- Se actualiza al final del bucle por lectura final.
 * 
 * 	-Bucle del módulo "Mientras quiera iniciar programa"
 * 		- Es un bucle controlado por sucesos
 * 		- VCB de tipo centinela
 * 		- Condicion de salida: Introducir 'n'
 * 		- Se inicializa
 * 
 * 
 * 
 */
import java.io.*;
import java.util.*;

public class primerswitchV3 {
	
	public static void main (String[] args) {
			
			Scanner teclado=new Scanner (System.in);
			char opcion=' ';
			int numeroOp1=0;
			int numeroOp2=0;
			double numeroOp3=0;
			int factorial=1;
			int sumaMultiplos=0;
			char ejecutar=' ';
			int contador = 0;//Variable del contador.
			int contadorMultiplos = 0; //Variable para contar los números que sean múltiplos de 5.
			//Leer y validar iniciar
			do
			{ 
				System.out.println("Quieres iniciar el programa? Si/No");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			} while (ejecutar!='s'&&ejecutar!='n');
			
			while (ejecutar=='s') //Mientras quiera iniciar programa
			{
				
				//Presentar menú y elegir y validar opcion
				do
				{
					System.out.println("Selecciona una opcion: ");
					System.out.println("-----------------------------------------------------------------------------------------------");
					System.out.println("1: Calcula el factorial de un numero");
					System.out.println("-----------------------------------------------------------------------------------------------");
					System.out.println("2: Cuenta los digitos que tiene un numero ");
					System.out.println("-----------------------------------------------------------------------------------------------");
					System.out.println("3: Cuenta y suma los numeros que sean multiplos de 5 de un numero");
					System.out.println("-----------------------------------------------------------------------------------------------");
					System.out.println("4: SALIR");
					System.out.println("-----------------------------------------------------------------------------------------------");
				
					opcion=Character.toLowerCase(teclado.next().charAt(0));
					
				
				}while(opcion<'1'||opcion>'4'); 
				
				//Según (opción)
				switch(opcion)
				{
					//Para opción==1
					case '1':
						
						System.out.println("Ha elegido la opcion de calcular el factorial de un numero");
						//Leer y validar número
						do
						{
							System.out.println("Introduce un numero mayor que 0");
							numeroOp1=teclado.nextInt();
						}while(numeroOp1<=0);
						
						//Calcular factorial
							
						for( contador=1,factorial=1;contador<=numeroOp1;contador++) //i se inicializa en 1 y mientras que sea menor que el número introducido se incrementa.
						{
							factorial=factorial*contador; //Inicializamos factorial en 1 para que el resultado no nos dé 0.
								
						}
						//Mostrar resultado
						System.out.println("El factorial de " + numeroOp1 + " es: "+factorial);
						
								
					break;
					//Para opción==2
					case '2':
						System.out.println("Ha elegido la opcion de calcular los digitos de un numero");
						//Leer numero
						System.out.println("Introduce un numero: ");
						numeroOp2=teclado.nextInt();
						//Contar dígitos
						contador=0;
						while (numeroOp2!=0) //Mientras el número sea distinto de 0
						{
							numeroOp2=numeroOp2/10; //Al introducir un numero entero (int) y dividirlo entre 10 nos quedamos con una cifra menos, por lo que mientras el numero no se quede sin cifras, i sigue contando.
							contador++;
						}
						//Mostrar resultado
						System.out.println("El numero tiene "+contador+" cifras");
					break;
					//Para opción==3
					case '3':
						sumaMultiplos=0;
						System.out.println("Ha elegido la opcion de contar y sumar todos los numeros que sean multiplos de 5");
						//Leer y validar número
						do
						{
							System.out.println("Introduce un numero del 1 al 100, ambos incluidos: ");
							numeroOp3=teclado.nextDouble();
						}while(numeroOp3<1||numeroOp3>100);
						
						//Contar y sumar todos los números que sean múltiplos de 5
						for(contador=1,contadorMultiplos=0;contador<=numeroOp3;contador++) //i se inicializa en 1 y mientras que sea menor que el número introducido se incrementa.
						{
							if (contador%5==0)
							{
								sumaMultiplos=contador+sumaMultiplos; //Los numeros que sean divisibles entre 5 se van sumando
								contadorMultiplos++; //Pongo j como contador porque si pongo i, puedo variar el bucle. Todos los números que sean múltiplos de 5 se van contando en j
							}
							
						}
						
						//Mostrar resultado
							System.out.println("La suma de todos los numeros divisibles entre 5 es: "+sumaMultiplos);
							System.out.println("Hay "+contadorMultiplos+" numeros multiplos de 5");
						
						
						break;
					case '4':
					break;
						
					}
				//Fin_Según
				//Leer y validar reiniciar
				do
					{ 
					System.out.println("Quieres reiniciar el programa? Si/No");
					ejecutar=Character.toLowerCase(teclado.next().charAt(0));
					} while (ejecutar!='s'&&ejecutar!='n');
			}
			//Fin_Mientras
	}
}


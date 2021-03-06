package ligaFutbol;
/*
 * An�lisis
 * 
 * Este programa es una aplicacion de gestion de un grupo de la Champions League
 * Entradas:
 *		- Nombre del equipo local, nombre del equipo visitante
 * 		- Resultado del partido, dos enteros
 * Salidas:
 * 		- Se imprimir� por pantalla la tabla clasificatoria con sus datos correspondientes
 * Restricciones:
 * 		- El resultado de los partidos es mayor o igual a 0.
 * 
 * PSEUDOC�DIGO GENERALIZADO
 * 
 * Inicio
 * 		Cargar Array Liga
 * 		Presentar men� y leer y valdiar opcion
 * 		Mientras opcion!=0
	 * 			Segun(opcion)
	 * 				Caso 1:
	 * 					Simular jornada
	 * 				Caso 2:
	 * 					Imprimir tabla de clasificaci�n
	 * 			Fin_Segun
	 * 			Presentar menu y leer y validar opcion
	 * 		Fin_Mientras
 * Fin
 * 	
 * ---M�dulo Simular jornada---
 * Inicio
 * 		Generar Jornada
 * 		Imprimir Jornada
 *		Generar resultados 
 *		Imprimir resultados
 *		Aplicar resultados de los partidos a los equipos
 * Fin
 * 	
 */

import java.io.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MAIN 
{
	/*
	 * Interfaz
	 * 
	 * Este m�todo imprime el men� de la liga
	 * Prototipo: public void presentarMenu()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void presentarMenu()
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 * 
	 * 
	 */
	public static void presentarMenu()
	{
		
			System.out.println("Indique lo que desea hacer: ");
			System.out.println("1: Simular jornada");
			System.out.println("2: Clasificacion");
			System.out.println("0: Salir");

	}
	public static void main (String[]args) throws IOException, InterruptedException
	{
		int opcion=0;
		Equipo sevilla=null;
		Equipo juventus=null;
		Equipo zagreb=null;
		Equipo lyon=null;
		Partido partido1=null;
		Partido partido2=null;
		GestoraLiga gestora=new GestoraLiga();
		try
		{
			sevilla=new Equipo("Sevilla FC",0,0,0,0,0);
			juventus=new Equipo("Juventus FC",0,0,0,0,0);
			zagreb=new Equipo("Dinamo de Zagreb",0,0,0,0,0);
			lyon=new Equipo("Olympique de Lyon",0,0,0,0,0);
			partido1=new Partido();
			partido2=new Partido();
		}catch(ligaException mensaje)
		{
			System.out.println(mensaje);
		}
		InputStreamReader corriente=new InputStreamReader(System.in);
		BufferedReader tecladoString=new BufferedReader(corriente);
		Scanner teclado=new Scanner (System.in);
			System.out.println("Bienvenidos al Grupo H de la UEFA Champions League!");
			//Cargar array liga
			gestora.cargarArray(sevilla, juventus, zagreb, lyon);
			//Fin cargar array liga
			//Presentar menu y leer y validar opcion
			do
			{
				presentarMenu();
				try
				{
					opcion=teclado.nextInt();
				}catch(InputMismatchException error)
				{
					System.out.println("Introduce un numero por favor, no intente petar el programa");
					opcion=-1;
					teclado=new Scanner(System.in);
				}
			}while(opcion<0||opcion>2);
			//Fin presentar menu y leer y validar opcion
			while(opcion!=0)
			{	//Seg�n la opcion elegida
				switch(opcion)
				{
					case 1:
						//Generar Jornada
						gestora.generarEnfrentamientos(partido1, partido2, sevilla, juventus, zagreb, lyon);
						//Fin generar jornada
						//Imprimir jornada
						gestora.imprimirEnfrentamientos(partido1, partido2);
						//Fin imprimir jornada
						Thread.sleep(1500);
						System.out.println("Generando resultados...");
						Thread.sleep(1500);
						//Generar resultados
						gestora.generarResultados(partido1);
						gestora.generarResultados(partido2);
						//fin generar resultados
						//Imprimir resultados
						gestora.imprimirResultados(partido1, partido2);
						//Fin imprimir resultados
						//Aplicar resultados de los partidos a los equipos
						gestora.gestionarPartidos(partido1);
						gestora.gestionarPartidos(partido2);
						//Fin aplicar
					break;
					case 2:
						//Imprimir clasificacion
						gestora.imprimirClasificacion();
						//Fin imprimir clasificacion
					break;
				}
				//Presentar menu y leer y validar opcion
				do
				{
					presentarMenu();
					try
					{
						opcion=teclado.nextInt();
					}catch(InputMismatchException error)
					{
						System.out.println("Introduce un numero por favor, no intente petar el programa");
						opcion=-1;
						teclado=new Scanner(System.in);
					}
				}while(opcion<0||opcion>2);
				//Fin presentar menu y leer y validar opcion
			}
		}
	}



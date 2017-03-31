package ligaFutbol;
/*
 * Análisis
 * 
 * Este programa es una aplicacion de gestion de un grupo de la Champions League
 * Entradas:
 *		- Nombre del equipo local, nombre del equipo visitante
 * 		- Resultado del partido, dos enteros
 * Salidas:
 * 		- Se imprimirá por pantalla la tabla clasificatoria con sus datos correspondientes
 * Restricciones:
 * 		- El resultado de los partidos es mayor o igual a 0.
 * 
 * PSEUDOCÓDIGO GENERALIZADO
 * 
 * Inicio
 * 		Leer y validar iniciar liga
 * 		Mientras quiera iniciar liga
 * 			Presentar menú y leer y valdiar opcion
 * 			Mientras opcion!=0
	 * 			Segun(opcion)
	 * 				Caso 1:
	 * 					Simular jornada
	 * 					Llamar al tito Floren
	 * 				Caso 2:
	 * 					Imprimir tabla de clasificación
	 * 			Fin_Segun
	 * 		Fin_Mientras
 * 			Leer y validar reiniciar
 * 		Fin_Mientras
 * Fin
 * 	
 * ---Módulo Simular jornada---
 * Inicio
 * 		Generar e imprimir Jornada
 *		Generar resultados e imprimir resultados
 * Fin
 * 
 * ---Módulo Llamar al tito Floren---
 * Inicio
 * 		Imprimir resultados
 * 		Leer y validar elegir partido
 * 		Leer y validar nuevo resultado
 * 		Imprimir resultados
 * Fin			
 */

import java.io.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MAIN 
{
	/*
	 * Interfaz
	 * 
	 * Este método imprime el menú de la liga
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
		String seguir=" ";
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
			gestora.cargarArray(sevilla, juventus, zagreb, lyon);
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
			while(opcion!=0)
			{
				switch(opcion)
				{
					case 1:
						gestora.generarEnfrentamientos(partido1, partido2, sevilla, juventus, zagreb, lyon);
						gestora.imprimirEnfrentamientos(partido1, partido2);
						Thread.sleep(1500);
						System.out.println("Generando resultados...");
						Thread.sleep(1500);
						gestora.generarResultados(partido1, partido2);
						gestora.imprimirResultados(partido1, partido2);
					break;
					case 2:
						gestora.imprimirClasificacion();
					break;
				}
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
			}
		}
	}



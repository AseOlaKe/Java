/*
*  Boletín Navidad
* 
* Análisis
* 
* Entradas:
* 	-Opciones del menú (1 al 13 ambos inclusive)
* 	-Primera opción: Dos caracteres
* 	-Segunda opción: Un carácter
* 	-Tercera opción: Un carácter
* 	-Cuarta opción: Un carácter
* 	-Quinta opción:  Un número entero
* 	-Sexta opción: Un número entero
* 	-Séptima opción: Un número entero
* 	-Octava opción: Un carácter 
* 	-Novena opción: Un número entero
* 	-Décima opción: Seis números
* 	-Undécima opción: Un número entero
* 	-Duodécima opción: Seis números
* 	-Decimotercera opción: Un número y un carácter
* Salidas:
* 	-Primera opción: Si el primero es anterior, posterior o igual
* 	-Segunda opción: Si es mayus o minus
* 	-Tercera opción: Valor booleano
* 	-Cuarta opción: Valor booleano
* 	-Quinta opción:  Si es compuesto o no
* 	-Sexta opción: Si es perfecto o semiperfecto
* 	-Séptima opción: Si es friki o no
* 	-Octava opción: Un mensaje gracioso
* 	-Novena opción: Valor booleano
* 	-Décima opción: Si la primera fecha es igual, anterior o posteriora
* 	-Undécima opción: Un número
* 	-Duodécima opción: Un número
* 	-Decimotercera opción: Un reloj de arena en pantalla
* Restricciones:
* 	-La opción del menú no puede ser mayor que 12 ni menor que 1
* 	-Primera opción: Deben ser caracteres del alfabeto español
* 	-Segunda opción: Debe ser un carácter del alfabeto español
* 	-Tercera opción: No hay
* 	-Cuarta opción: No hay
* 	-Quinta opción:  No hay
* 	-Sexta opción: No hay
* 	-Séptima opción: No hay
* 	-Octava opción: El carácter debe estar comprendido entre 0 y 9
* 	-Novena opción: No hay
* 	-Décima opción: Los dias deben estar comprendidos entre 28, 29, 30 o 31 dependiendo del mes y los meses deben estar comprendidos entre 1 y 12
* 	-Undécima opción: El número introducido debe estar comprendido entre 0 y 23
* 	-Duodécima opción: Idém que décima opción
* 	-Decimotercera opción: La base debe ser un número impar entre 1 y 5
* 
* Pseudocódigo generalizado
* 
* Inicio
* 	Mientras quiera seguir
* 	Presentar menú y elegir y validar opcion
* 		Según (opcion)
* 			Caso 1:
* 				ComparacionCaracteres
* 			Caso 2:
* 				MayusMinus
* 			Caso 3:
* 				Entre0y9
* 			Caso 4:
* 				SimboloPuntuacion
* 			Caso 5:
* 				NumeroCompuesto
* 			Caso 6:
* 				PerfectoSemiperfecto
* 			Caso 7:
* 				NumeroFriki
* 			Caso 8:
* 				MensajilloGracioso
* 			Caso 9:
* 				NumeroPrimoProbable
* 			Caso 10:
* 				ComparacionFechas
* 			Caso 11:
* 				ConversorPmAm
* 			Caso 12:
* 				DiasTranscurridos
* 			Caso 13:
* 				RelojArena
* 		Fin_Segun
* 	Leer y validar reiniciar
* 	Fin_Mientras
* Fin
* 
*  
 * 
 */

import java.util.*;
import java.io.*;

public class BoletinNavidad {
	
	public static void main (String[] args) {
		
		int opcion=0;
		char seguir='s';
		char caracter1=' ';
		char caracter2=' ';
		char caracter=' ';
		boolean caracterEsValido=false;
		boolean OpcionEsValida=false;
		boolean numeroEsValido=false;
		boolean numeroEsCompuesto=false;
		boolean numeroEsPerfecto=false;
		boolean numeroEsSemiperfecto=false;
		boolean esValido=false; //Una variable general para validar las fechas
		boolean esFriki=false;
		boolean esBisiesto=false;
		boolean esBisiesto2=false;
		int caracteresComparados=0;
		char caracterMinusMayus=' ';
		int caracterEsMinusOMayus=0;
		int numero=0;
		int dia1=0;
		int mes1=0;
		int agno1=0;
		int dia2=0;
		int mes2=0;
		int agno2=0;
		int compararFechas=0;
		int hora=0;
		int horaAmPm=0;
		
		
		
		Scanner teclado=new Scanner(System.in);
		
		while(seguir=='s')
		{	
			do
			{
				SubprogramasNavidad.PresentarMenu();
				opcion=teclado.nextInt();
				OpcionEsValida=SubprogramasNavidad.OpcionValida(opcion);
			}while(OpcionEsValida==false);
		
		
			switch(opcion)
			{
				case 1:
					do
					{
						System.out.println("Introduzca un caracter del alfabeto espa\u00f1ol");
						caracter1=Character.toLowerCase(teclado.next().charAt(0));
						caracterEsValido=SubprogramasNavidad.CaracterValido1(caracter1);
					}while(caracterEsValido==false);
					do
					{
						System.out.println("Introduzca el segundo caracter del alfabeto espa\u00f1ol");
						caracter2=Character.toLowerCase(teclado.next().charAt(0));
						caracterEsValido=SubprogramasNavidad.CaracterValido2(caracter2);
					}while(caracterEsValido==false);
					caracteresComparados=SubprogramasNavidad.CompararCaracteres(caracter1, caracter2);
					if(caracteresComparados==1)
					{
						System.out.println("El primer caracter es posterior");
					}
					else if(caracteresComparados==0)
					{
						System.out.println("Los dos caracteres son iguales");
					}
					else
					{
						System.out.println("El primer caracter es anterior");
					}
				break;
				
				case 2:
					do
					{
						System.out.println("Introduzca un caracter del alfabeto espa\u00f1ol: ");
						caracterMinusMayus=teclado.next().charAt(0);
						caracterEsValido=SubprogramasNavidad.CaracterValido(caracterMinusMayus);
					}while(caracterEsValido==false);
					caracterEsMinusOMayus=SubprogramasNavidad.MinusOMayus(caracterMinusMayus);
					if(caracterEsMinusOMayus==1)
					{
						System.out.println("Es minuscula");
					}
					else
					{
						System.out.println("Es mayuscula");
					}
				break;
				case 3:
						System.out.println("Introduzca un caracter: ");
						caracter=teclado.next().charAt(0);
						caracterEsValido=SubprogramasNavidad.ceroNueve(caracter);
						if(caracterEsValido==true)
						{
							System.out.println("El caracter se encuentra entre 0 y 9");
						}
						else
						{
							System.out.println("El caracter no se encuentra entre 0 y 9");
						}
				break;
				case 4:
						System.out.println("Introduzca un caracter");
						caracter=teclado.next().charAt(0);
						caracterEsValido=SubprogramasNavidad.signoPuntuacion(caracter);
						if(caracterEsValido==true)
						{
							System.out.println("Es un signo de puntuacion");
						}
						else
						{
							System.out.println("No es un signo de puntuacion");
						}
				break;
				case 5:
						do
						{
							System.out.println("Introduce un numero mayor que 0: ");
							numero=teclado.nextInt();
							numeroEsValido=SubprogramasNavidad.numeroValido(numero);
						}while(numeroEsValido==false);
						numeroEsCompuesto=SubprogramasNavidad.numeroCompuesto(numero);
						if(numeroEsCompuesto==true)
						{
							System.out.println("Es un numero compuesto");
						}
						else
						{
							System.out.println("No es compuesto");
						}
				break;
				case 6:
						do
						{
							System.out.println("Introduce un numero mayor que 0: ");
							numero=teclado.nextInt();
							numeroEsValido=SubprogramasNavidad.numeroValido(numero);
						}while(numeroEsValido==false);
						numeroEsPerfecto=SubprogramasNavidad.numeroPerfecto(numero);
						if(numeroEsPerfecto==true)
						{
							System.out.println("El "+numero+" es perfecto");
						}
						else
						{
							System.out.println("El "+numero+" no es perfecto");
						}
				break;
				case 7:
						do
						{
							System.out.println("Introduce un numero mayor que 0: ");
							numero=teclado.nextInt();
							numeroEsValido=SubprogramasNavidad.numeroValido(numero);
						}while(numeroEsValido==false);
						esFriki=SubprogramasNavidad.numeroFriki(numero);
						if(esFriki==true)
						{
							System.out.println("Es un numero friki");
						}
						else
						{
							System.out.println("No es un numero friki");
						}
				break;
				case 8:
						do
						{
							System.out.println("Introduce un numero entre 0 y 9: ");
							caracter=Character.toLowerCase(teclado.next().charAt(0));
							numeroEsValido=SubprogramasNavidad.ceroNueve(caracter);
						}while(numeroEsValido==false);
						SubprogramasNavidad.mensajeGracioso(caracter);			
				break;
				case 9:
						do
						{
							System.out.println("Introduce un numero mayor que 0: ");
							numero=teclado.nextInt();
							numeroEsValido=SubprogramasNavidad.numeroValido(numero);
						}while(numeroEsValido==false);
						System.out.println(SubprogramasNavidad.numeroPrimoProbable(numero));
				break;
				case 10:
						do
						{
							System.out.println("Introduce el anyo de la primera fecha, debe ser mayor o igual que 1582:");
							agno1=teclado.nextInt();
							esValido=SubprogramasNavidad.agnoValido(agno1);
						}while(esValido==false);
						do
						{
							System.out.println("Introduce el mes de la primera fecha");
							mes1=teclado.nextInt();
							esValido=SubprogramasNavidad.mesValido(mes1);
						}while(esValido==false);
						do
						{
							System.out.println("Introduce el dia de la primera fecha");
							dia1=teclado.nextInt();
							esBisiesto=SubprogramasNavidad.agnoBisiesto(agno1);
							esValido=SubprogramasNavidad.diaValido(dia1,mes1,esBisiesto);
						}while(esValido==false);
						do
						{
							System.out.println("Introduce el anyo de la segunda fecha, debe ser mayor o igual que 1582:");
							agno2=teclado.nextInt();
							esValido=SubprogramasNavidad.agnoValido2(agno2);
						}while(esValido==false);
						
						do
						{
							System.out.println("Introduce el mes de la segunda fecha");
							mes2=teclado.nextInt();
							esValido=SubprogramasNavidad.mesValido2(mes2);
						}while(esValido==false);
						do
						{
							System.out.println("Introduce el dia de la segunda fecha");
							dia2=teclado.nextInt();
							esBisiesto2=SubprogramasNavidad.agnoBisiesto2(agno2);
							esValido=SubprogramasNavidad.diaValido(dia2,mes2,esBisiesto2);
						}while(esValido==false);
						compararFechas=SubprogramasNavidad.comparaFechas(dia1,mes1,agno1,dia2,mes2,agno2);
						if(compararFechas==-1)
						{
							System.out.println("La primera fecha es posterior");
						}
						else if(compararFechas==0)
						{
							System.out.println("Ambas fechas son iguales");
						}
						else
						{
							System.out.println("La primera fecha es anterior");
						}
				break;
				case 11:
						do
						{
							System.out.println("Introduce una hora entre 0 y 23, ambos inclusive: ");
							hora=teclado.nextInt();
							esValido=SubprogramasNavidad.horaValida(hora);
						}while(esValido==false);
						horaAmPm=SubprogramasNavidad.conversor24hAMPM(hora);
						if (hora>=1&&hora<=12)
						{
							System.out.println(horaAmPm+" AM");
						}
						else if(hora>=13&&hora<=23||hora==0)
						{
							System.out.println(horaAmPm+" PM");
						}
						
				break;
				case 12:
					System.out.println("EN CONSTRUCCION");
				break;
				case 13:
					System.out.println("EN CONSTRUCCION");
				break;
				
				case 14:
					System.out.println("Eres un iluminati, te has saltado la validación");
					System.out.println("10 puntos para Griffindor");
					System.out.println("Te hamo Jarry Potter");
				break;
					
						
					
			}
			do
			{
				System.out.println("Desea reiniciar el programa? Si/No");
				seguir=Character.toLowerCase(teclado.next().charAt(0));
			}while(seguir!='s'&&seguir!='n');
		}
		
	}
}


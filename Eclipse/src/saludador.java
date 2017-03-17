/*
 *Nombre: Saludador
 * Analisis
 * Este programa imprime un saludo dependiendo la hora del día
 * Entrada: Hora(hora) y minuto(min)
 * Salida: Saludo correspondiente
 * Restricciones: Las horas introducidas deberán estar entre 00 y 23, ambos inclusive. Los minutos introducidos deberán estar entre 00 y 59, ambos inclusive.
 * 
 * Pseudocódigo generalizado:
 * 
*	Inicio
* 		Preguntar si quiere iniciar el programa
* 		Mientras quiera iniciar el programa
 * 			Leer datos
 * 			Chequear y mostrar resultado
 * 		Preguntar si quiere reiniciar el programa
 * 		Fin mientras
 * 	Fin
 * 
 */

import java.util.*;
import java.io.*;
public class saludador {
	
	public static void main (String[] args) {
		Scanner tecla=new Scanner(System.in);
		int hora=0;
		int minuto=0;
		char ejecutar=' ';
		//Preguntar si quiere iniciar el programa
		while (ejecutar!='s'&&ejecutar!='n') {
			System.out.println("Quiere iniciar el programa?");
			ejecutar=Character.toLowerCase(tecla.next().charAt(0));
			}
		//Fin preguntar
		//Mientras quiera iniciar programa
		while (ejecutar=='s'){
			//Leer datos
			System.out.print("Introduce la hora: ");
			hora=tecla.nextInt();
			System.out.print ("Introduce los minutos: ");
			minuto=tecla.nextInt();
			//Fin Leer datos
			//Chequear y mostrar resultado
			if ((hora>23||hora<0)||(minuto>59||minuto<0)) {
				System.out.println("ERROR");
				}
			else if (((hora==7)&&(minuto>=30))||((hora>=8)&&(hora<14))||((hora==14)&&(minuto<=0))){
				System.out.println("WENO DIA COLEGA, JELOU MOMDEI");
			}
			else if (((hora==14)&&(minuto>=1))||((hora>=15)&&(hora<20))||((hora==20)&&(minuto<=30))){
				System.out.println("WENA TARDE Y WENA SIESTA TE VA A ESHA");
				}
			else{
				System.out.println("AMONO Q NOS AMO PA LA ALAMEDA Y WENA NOCHE");
			}
			
			System.out.println("Quiere reiniciar el programa?");
			ejecutar=Character.toLowerCase(tecla.next().charAt(0));
			
			while (ejecutar!='s'&&ejecutar!='n'){
				System.out.println("Quiere reiniciar el programa?");
				ejecutar=Character.toLowerCase(tecla.next().charAt(0));
			}
		}
			//Fin Chequear y mostrar resultado
	}
}


/*
 * Nombre:numeromes
 * Análisis
 * 	Este programa te indica el correspondiente mes según el número que tu introduzcas del 1 al 12.
 * Entrada: Un número entero (n)
 * Salida: El mes correspondiente
 * Restricciones: El número introducido debe estar entre el 1 y el 12, ambos inclusive.
 * 
 * Pseudocódigo generalizado:
 * Inicio
 * 		Leerdatos
 * 		Chequear y mostrar resultado
 * Fin
 */
import java.util.*;

public class numeromes {
	
	public static void main (String[] args) {
		Scanner tecla=new Scanner(System.in);
		int mes;
		//Leer datos
		System.out.print("Introduce un numero del 1 al 12: ");
		mes=tecla.nextInt();
		//Fin Leer datos
		//Chequear y mostrar resultado
		if (mes<1 || mes>12){
			System.out.println("ERROR");
			}
		else if (mes==1){
			System.out.println("ENERO");
			}
		else if (mes==2){
			System.out.println("FEBRERO");
			}
		else if (mes==3) {
			System.out.println("MARZO");
			}
		else if (mes==4) {
			System.out.println("ABRIL");
			}
		else if (mes==5) {
			System.out.println ("MAYO");
			}
		else if (mes==6) {
			System.out.println ("JUNIO");
			}
		else if (mes==7) {
			System.out.println ("JULIO");
			}
		else if (mes==8) {
			System.out.println("AGOSTO");
			}
		else if (mes==9) {
			System.out.println("SEPTIEMBRE");
			}
		else if (mes==10) {
			System.out.println("OCTUBRE");
			}
		else if (mes==11) {
			System.out.println ("NOVIEMBRE");
			}
		else {
			System.out.println ("DICIEMBRE");
		}
		//Fin Chequear y mostrar resultado	
	
	}
}


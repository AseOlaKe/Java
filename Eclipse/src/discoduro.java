/*
 * Nombre: Disco duro
 * Análisis
 * 	Este programa calcula la capacidad de un disco duro
 * 	Entrada:cuatro números enteros (pistas,cilindros,sectores y bytesporsectores)
 * 	Salida: un número entero (Capacidad)
 *  Restricciones: Los números deben ser positivos
 * 	Comentarios
 * 		-Fórmula para calcular la capacidad: Capacidad=pistas*cilindros*sectores*bytesporsectoresas
 *  Pseudocódigo generalizado:
 *  
 * 	Inicio
 * 		Leerdatos
 * 		Calcular capacidad
 * 		Valorar si la capacidad sale negativa
 * 		Mostrar resultado
 * 	Fin 		
 * 
 * 
 */

import java.util.*;
public class discoduro {
	
	public static void main (String[] args) {
		
		Scanner tecla=new Scanner (System.in);
		
		//Leer datos
		double capacidad;
		double pistas=0;
		double cilindros=0;
		double sectores=0;
		double bytesporsectores=0;
		System.out.print("Introduce el numero de pistas: ");
		pistas=tecla.nextInt();
		System.out.print("Introduce el numero de cilindros: ");
		cilindros=tecla.nextInt();
		System.out.print("Introduce el numero de sectores: ");
		sectores=tecla.nextInt();
		System.out.print("Introduce el numero de bytes por sectores: ");
		bytesporsectores=tecla.nextInt();
		//Fin Leer datos
		//Calcular capacidad
		capacidad=pistas*cilindros*sectores*bytesporsectores;
		//Fin calcular capacidad
			//Mostrar resultado
		if (capacidad>0) {
			
			System.out.println("La capacidad del disco duro en bytes es: "+capacidad);
			System.out.println("La capacidad del disco duro en Kbytes es: "+(capacidad/1000));
			System.out.println("La capacidad del disco duro en Megabytes es: "+(capacidad/1000000));
			System.out.println("La capacidad del disco duro en Gigabytes es: "+(capacidad/100000000));
			}
		else{
			System.out.println("La capacidad de un disco duro no puede ser negativa");
		}
			
			//Fin Mostrar resultado
	}
}


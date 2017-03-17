/* Nombre: coordenadas
 * 
 * Analisis
 * 
 * Este programa te indica en qué cuadrante se encuentra el punto de las coordenadas introducidas
 * 
 * Entrada: Coordenadas cartesianas (n1,n2)
 * Salida: Cuadrante correspondiente
 * Restricciones: Ninguno de los dos números puede valer 0, ya que si no el punto se encontraría en un eje y no en un cuadrante.
 * Comentarios:
 * -Si (n1,n2): 1º cuadrante
 * -Si (-n1,n2): 2º cuadrante
 * -Si (-n1,-n2): 3º cuadrante
 * -Si (n1,-n2): 4º cuadrante
 * 
 * 
 * Pseudocódigo generalizado:
 * 
 * Inicio
 * 		Leer datos
 * 		Chequear y mostrar resultado
 * Fin
 * 
 * 
 */

import java.util.*;
import java.io.*;
public class coordenadas {
	
	public static void main (String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n1=0;
		int n2=0;
		//Leer datos
		System.out.print("Introduce la primera coordenada: ");
		n1=teclado.nextInt();
		System.out.print("Introduce la segunda coordenada: ");
		n2=teclado.nextInt();
		//Fin leer datos
		//Chequear y mostrar resultado
		 if ((n1==0||n2==0)||(n1==0&&n2==0)){
			System.out.println("El punto se situa en un eje de coordenadas");
			}
		
		 if (n1>0&&n2>0){
			System.out.println("El punto se encuentra en el primer cuadrante");
			}
		 if (n1<0&&n2>0){
			System.out.println("El punto se encuentra en el segundo cuadrante");
			}
		 if (n1<0&&n2<0){
			System.out.println("El punto se encuentra en el tercer cuadrante");
			}
		 if (n1>0&&n2<0){
			System.out.println ("El punto se en el cuarto cuadrante");
			}
		//Fin chequear y mostrar resultado
	}
}


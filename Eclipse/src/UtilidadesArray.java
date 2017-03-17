import java.util.*;
public class UtilidadesArray {

	
/*
 * Interfaz
 * 
 * Comentario: 	Esta funcionalidad cuenta los elementos pares de un array
 * Prototipo: public static int contadorPar(int[]array)
 * Precondiciones: No hay
 * Entradas: Un array de numeros enteros
 * Salidas: Un número entero
 * Postcondiciones: El número es igual o mayor a 0
 * E/S: No hay
 * 
 * RESGUARDO
 * 
public int contadorPar(int[]array)
 {
 		return 1;
 }
*/
	public static int contadorPar(int[]array)
	{
		int contador=0;
		int i;
		for(i=0; i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				contador++;
			}
		}	
	
		return contador;
	}
/*
 * Interfaz
 * 
 * Comentario: 	Esta funcionalidad carga un array aleatoriamente
 * Prototipo: public static int[] cargarArray (int[]array)
 * Precondiciones: El array está vacío
 * Entradas: Un array de tipo entero
 * Salidas: Un array de tipo entero
 * Postcondiciones: Los números que contiene el array van de 1 a 100
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static int[] cargarArray(int[]array)
 * {
 * 		return array;
 * }
 * 
 */
	public static int[] cargarArray(int tamaño)
	{
		int i;
		Random aleatorio=new Random();
		int[]array=new int[tamaño];
		for(i=0; i<array.length;i++)
		{	
			array[i]=aleatorio.nextInt(201)+100;
		}
		return array;
	}
	
	/*
	 * Interfaz
	 * 
	 * Comentario: 	Dado un array cargado aleatoriamente, generar a partir de él otro array que contenga los elementos pares que se encuentran en el primero.
	 * Prototipo: public static int[] cargarArrayPar(int[]array, int contador)
	 * Precondiciones: El array esta cargado con números entre 1 y 100, el contador es igual o mayor a 0.
	 * Entradas: Un array de tipo entero y un número entero
	 * Salidas: Un array de tipo entero
	 * Postcondiciones: Los números que contiene el array son pares
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static int[] cargarArrayPar(int[]array, int contador)
	 * {
	 * 		return array;
	 * }
	 * 
	 */
	public static int[] cargarArrayPar(int[]array, int contador)
	{
		int i;
		int j=0;
		int[]arrayPar=new int[contador];
		
			for(i=0;i<array.length;i++)
			{
				if(array[i]%2==0)
				{		
					arrayPar[j]=array[i];
					j++;
				}
			}
		return arrayPar;
	}
	
	/*
	 * Interfaz
	 *
	 * Comentario: Carga un array aleatorio con elementos repetidos
	 * Prototipo: public int[] arrayNoRepetido(
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: Un array de enteros
	 * Postcondiciones: No se repite ningún número. Están situados entre 100 y 300
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public int[] arrayNoRepetido()
	 * { 
	 * 		int[]array=null;
	 * 		return array;
	 * }
	 */ 
	public static int[] arrayNoRepetido()
	{
		int i;
		int numeroRepetido=0;
		boolean esRepetido=false;
		Random aleatorio=new Random();
		int[]arrayNoRepetido=new int[20];
		for(i=0;i<arrayNoRepetido.length;i++)
		{	
			if(i==0)
			{
				arrayNoRepetido[i]=aleatorio.nextInt(201)+100;
			}
			else
			{
				numeroRepetido=aleatorio.nextInt(201)+100;
				esRepetido=numeroRepetido(arrayNoRepetido, numeroRepetido);
				if(esRepetido==false)
				{
					arrayNoRepetido[i]=numeroRepetido;
				}
				else if(esRepetido)
				{
					i--;
				}
			}
			
		}
		return arrayNoRepetido;
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método comprueba si un número está repetido en un array
	 * Prototipo: public static boolean numeroRepetido(int[]arrayNoRepetido, int numeroRepetido)
	 * Precondiciones: Los números están entre 100 y 300 ambos inclusive
	 * Entradas: Un array de enteros y un número entero
	 * Salidas: Un valor booleano
	 * Postcondiciones: True si hay un número repetido y false si no lo hay
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static boolean numeroRepetido(int[]arrayNoRepetido, int numeroRepetido)
	 * {
	 * 		return false;
	 * }
	 * 
	 */
	public static boolean numeroRepetido(int[]arrayNoRepetido, int numeroRepetido)
	{
		boolean repetido=false;
		int i;
		for(i=0;i<arrayNoRepetido.length;i++)
		{
				if(numeroRepetido==arrayNoRepetido[i])
				{
					repetido=true;
				}
		}	
		
		return repetido;
	}
	
	/* Interfaz
	 * 
	 * Comentario: Este subprograma devuelve un array al revés
	 * Prototipo: public static int [] arrayAlReves(int[]array)
	 * Precondiciones: Los números del array están comprendidos entre 100 y 300, ambos inclusive
	 * Entradas: Un array de enteros
	 * Salidas: Un array de enteros
	 * Postcondiciones: El array es el mismo de entrada pero al revés
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static int[] arrayAlReves(int[]array)
	 * {
	 * 		int[]arrayAlReves=null;
	 * 		return arrayAlReves;
	 * }
	 */ 
	public static int[]arrayAlReves(int[]array)
	{
		int[]arrayAlReves=new int[array.length];
		int i;
		for(i=0;i<array.length;i++)
		{
			arrayAlReves[array.length-1-i]=array[i];
		}
		return arrayAlReves;
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma imprime el array paralelo
	 * Prototipo: public static void PintarArray(String[]NombresArray, int[]NotasArray)
	 * Precondiciones: El array entero contiene numeros del 1 al 10
	 * Entrada: Un array tipo entero y otro tipo String
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * E/S: No hay
	 */ 
	 
	public static void PintarArray(int[]NotasArray)
	{
		int i;
		for(i=0;i<NotasArray.length;i++)
		{
			System.out.println(NotasArray[i]);
		}
	}
}

import java.io.*;
import java.util.*;
public class UtilNotasArray {
	
	/*
	 * Interfaz
	 * 
	 * Este subprograma carga el Array de notas
	 * Prototipo: public static int[] CargarArrayNotas(int numero)
	 * Precondiciones: El entero es positivo
	 * Entradas: Un entero
	 * Salidas: Un array de tipo entero
	 * Postcondiciones: Los números del array están entre 1 y 10, ambos incluidos
	 * E/S: No hay
	 * 
	 */
	public static int[] CargarArrayNotas(int numero)
	{
		int[]NotasArray= new int[numero];
		int i;
		Random aleatorio=new Random();
		for(i=0; i<NotasArray.length;i++ )
		{
			NotasArray[i]=aleatorio.nextInt(10)+1;
			
		}
		return NotasArray;
	}
	
	/*
	 * Interfaz
	 * 
	 * Este subprograma carga el Array de nombres
	 * Prototipo: public static String[] CargarArrayNombres(int numero)
	 * Precondiciones: El entero es positivo
	 * Entradas: Un entero
	 * Salidas: Un array de tipo String
	 * Postcondiciones: Se leen por teclado las cadenas
	   E/S: No hay
	 */
	public static String[] CargaArrayNombres(int numero) throws IOException
	{
		String [] NombresArray=new String[numero];
		int i;
		InputStreamReader corriente= new InputStreamReader(System.in);
		BufferedReader tecladoString=new BufferedReader (corriente);
		for(i=0;i<NombresArray.length;i++)
		{
			NombresArray[i]=tecladoString.readLine();
		}
		return NombresArray;
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
	 
	public static void PintarArray(String[]NombresArray, int[]NotasArray)
	{
		int i;
		for(i=0;i<NotasArray.length;i++)
		{
			System.out.println(NombresArray[i]+": "+NotasArray[i]);
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma calcula la nota media del array de notas
	 * Prototipo: public static double notaMedia(int[]NotasArray)
	 * Precondiciones: Las notas del array están entre 1 y 10
	 * Entrada: Un array de tipo entero
	 * Salidas: Un número real
	 * Postcondiciones: El número real es la nota media, por lo que es positivo
	 * E/S: No hay
	 */
	public static double notaMedia(int[]NotasArray)
	{
		int i;
		double notaMedia=0.0;
		int acumulador=0;
		
		for(i=0;i<NotasArray.length;i++)
		{
			acumulador=acumulador+NotasArray[i];
		}
		notaMedia=acumulador/(double)NotasArray.length;
		
		return notaMedia;
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma calcula la nota más alta del array de notas
	 * Prototipo: public static int notaAlta(int[]NotasArray)
	 * Precondiciones: Las notas del array están entre 1 y 10
	 * Entrada: Un array de tipo entero
	 * Salidas: Un número entero
	 * Postcondiciones: El número está entre 1 y 10
	 * E/S: No hay
	 */
	 public static int notaAlta(int[]NotasArray)
	 {
		 int i;
		 int notaAlta=0;
		 for(i=0;i<NotasArray.length;i++)
			{
				if(NotasArray[i]>notaAlta)
				{
					notaAlta=NotasArray[i];
				}
			}
		 return notaAlta;
	 }
	 /*
		 * Interfaz
		 * 
		 * Este subprograma calcula la nota más baja del array de notas
		 * Prototipo: public static int notaBaja(int[]NotasArray)
		 * Precondiciones: Las notas del array están entre 1 y 10
		 * Entrada: Un array de tipo entero
		 * Salidas: Un número entero
		 * Postcondiciones: El número está entre 1 y 10
		 * E/S: No hay
		 */
	 public static int notaBaja(int[]NotasArray)
	 {
		 int i;
		 int notaBaja=10;
			for(i=0;i<NotasArray.length;i++)
			{
				if(notaBaja>NotasArray[i])
				{
					notaBaja=NotasArray[i];
				}
			}
		return notaBaja;
	 }
	 /*
		 * Interfaz
		 * 
		 * Este subprograma calcula las notas por encima de la nota media
		 * Prototipo: public static int notaPorEncima(int[]NotasArray, double notaMedia)
		 * Precondiciones: Las notas del array están entre 1 y 10 y la nota media es positiva
		 * Entrada: Un array de tipo entero y un número real
		 * Salidas: Un número entero
		 * Postcondiciones: El número es mayor o igual que 0
		 * E/S: No hay
		 */
	 public static int notaPorEncima(int[]NotasArray, double notaMedia)
	 {
		 int i;
		 int contador=0;
		 for(i=0;i<NotasArray.length;i++)
			{
				if(NotasArray[i]>notaMedia)
				{
					contador++;
				}
			}
		 return contador;
	 }
	 /*
		 * Interfaz
		 * 
		 * Este subprograma calcula las notas por debajo de la nota media
		 * Prototipo: public static int notaPorDebajo(int[]NotasArray, double notaMedia)
		 * Precondiciones: Las notas del array están entre 1 y 10 y la nota media es positiva
		 * Entrada: Un array de tipo entero y un número real
		 * Salidas: Un número entero
		 * Postcondiciones: El número mayor o igual que 0
		 * E/S: No hay
		 */
	 public static int notaPorDebajo(int[]NotasArray, double notaMedia)
	 {
		 int contador=0;
		 int i;
		 for(i=0;i<NotasArray.length;i++)
			{
				if(NotasArray[i]<notaMedia)
				{
					contador++;
				}
			}
		 return contador;
	 }
}

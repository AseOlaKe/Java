package NotasArray;
/**

 * NotasArray
 * 
 * Análisis
 * 
 * Es un programa que genera 20 notas aleatorias y presenta un menú en el cual puedes elegir calcular la nota media, ver la nota más alta, la más baja, cuántas personas están por encima de la nota media y cuántas personas están por debajo
 * 
 * Entradas: 
 * 	-Un carácter(por si quiere volver a ejecutar el programa con 20 notas diferentes)
 * 	-Un entero(opción del menú)
 * 4
 * Salidas:
 *  -Si se elige la opción 1: Un número real
 *  -Opcion 2, 3, 4 y 5: Un entero
 * 
 *  Restricciones:
 *  
 *  El carácter debe ser 's' o 'n'
 *  La opción elegida debe estar entre 0 y 5, ambos inclusive
 *  
 *  Pseudocódigo generalizado:
 *  
 *  Inicio
 *  	<declaraciones>
 *  	Leer y validar ver notas de los alumnos
 *  	Mientras quiera ver las notas de los alumnos
 *  		Leer y validar tamaño del Array
 *  		Cargar y pintar Array
 *  		Presentar menu y elegir y validar opcion
 *  			Mientras la opcion elegida sea distinta de 0
*  					Segun(opcion)
 *  						Para opcion==1
 *  							Calcular y mostrar nota media
 *  						Para opcion==2
 *  							Calcular y mostrar nota más alta
 *  						Para opcion==3
 *  							Calcular y mostrar nota más baja
 *  						Para opcion==4
 *  							Calcular y mostrar cantidad de notas que están por encima de la media
 *  						Para opcion==5
 *  							Calcular y mostrar cantidad de notas que están por encima de la media
 *  				Fin_Segun
 *  				Presentar menu y elegir y validar opcion
 *  			Fin_Mientras
 *  		Leer y validar ver nuevas notas de alumnos
 *  	Fin_Mientras
 *  Fin
 *  
 *  -----MODULO: Calcular y mostrar nota media-----
 *  
 *  Inicio
 *  	Calcular nota media
 *  	Imprimir nota media
 *  Fin
 *  
 *  -----MODULO: Calcular y mostrar nota más alta-----
 *  Inicio
 *  	Comparar notas
 *  	Imprimir nota más alta
 *  Fin
 *  
 *  -----MODULO: Calcular y mostrar nota más baja-----
 *  Inicio
 *  	Comparar notas
 *  	Imprimir nota más baja
 *  Fin
 *  -----MODULO: Calcular y mostrar cantidad de notas que están por encima de la media-----
 *  Inicio
 *  	Calcular nota media
 *  	Contar notas mayores a la nota media
 *  	Imprimir cuantas notas hay mayores a la media
 *  Fin 		
 *  -----MODULO: Calcular y mostrar cantidad de notas que están por debajo de la media-----
 *  Inicio
 *  	Calcular nota media
 *  	Contar notas menores a la nota media
 *  	Imprimir cuantas notas hay menores a la media
 *  Fin		
 *  		
 */

/**
 * @author PabloJarana
 *
 */

import java.io.IOException;
import java.util.*;
public class NotasArray  {
	
	/*
	 * Interfaz
	 * 
	 * Este subprograma presenta un menú
	 * Prototipo: public static void presentarMenu()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static void presentarMenu()
	 * {	
	 *		System.out.println("En construccion");
	 * }
	 */
	public static void presentarMenu()
	{
		System.out.println("Que desea hacer?");
		System.out.println("1:Calcular y mostrar la nota media");
		System.out.println("2:Calcular y mostrar la nota mas alta");
		System.out.println("3:Calcular y mostrar la nota mas baja");
		System.out.println("4:Calcular y mostrar cuantas personas tienen una nota superior a la media");
		System.out.println("5:Calcular y mostrar cuantas personas tienen una nota inferior a la media");
		System.out.println("0:Salir");
	}

	public static void main(String[] args)throws InterruptedException, IOException {
		
		//Inicio
		int numero=0;
		char seguir=' ';
		int opcion=0;
		double notaMedia;
		int notaAlta;
		int notaBaja;
		int contador=0;
		
		Scanner teclado=new Scanner(System.in);
		
		//Leer y validar ver notas de los alumnos
		do
		{
			System.out.println("Desea ver las notas de los alumnos? Si/No");
			seguir=Character.toLowerCase(teclado.next().charAt(0));
		}while(seguir!='s'&& seguir!='n');
		//Fin leer y validar ver notas de los alumnos
		//Mientras quiera ver notas de los alumnos
		while(seguir=='s')
		{	
			//Leer y validar longitud del array
			do
			{
				System.out.println("Cuantas notas quieres ver?");
				numero=teclado.nextInt();
			}while(numero<=0);
			//Fin leer y validar longitud del array
			//Cargar y pintar
			int [] NotasArray= UtilNotasArray.CargarArrayNotas(numero);
			System.out.println("Introduce los nombres de los alumnos");
			String [] NombresArray= UtilNotasArray.CargaArrayNombres(numero);
			System.out.println("Notas de los alumnos: ");
			UtilNotasArray.PintarArray(NombresArray, NotasArray);
			//Fin cargar y pintar Array
			//Presentar menu y elegir y validar opcion
			do
			{
				presentarMenu();
				opcion=teclado.nextInt();
			}while(opcion<0||opcion>5);
			//Fin presentar menu y elegir y validar opcion
			//Mientras la opcion sea distinta de 0
			while(opcion!=0)
			{	//Segun(opcion)
				switch(opcion)
				{	
					//Para opcion==1
					case 1: //Preguntar Asun subprogramas
						//Calcular nota media
						notaMedia=UtilNotasArray.notaMedia(NotasArray);
						//Mostrar nota media
						System.out.println("La nota media es: "+notaMedia);
					break;
					case 2:
						//Comparar notas
						notaAlta=UtilNotasArray.notaAlta(NotasArray);
						//Fin comparar notas
						//Imprimir nota mas alta
						System.out.println("La nota mas alta es un: "+notaAlta);
					break;
					//Para opcion==3
					case 3:
						//Comparar notas
						notaBaja=UtilNotasArray.notaBaja(NotasArray);
						//Fin comparar notas
						//Imprimir nota mas baja
						System.out.println("La nota mas baja es un: "+notaBaja);
						
					break;
					//Para opcion==4
					case 4:
						//Calcular nota media
						notaMedia=UtilNotasArray.notaMedia(NotasArray);
						//Fin calcular nota media
						//Contar las notas por encima de la nota media
						contador=UtilNotasArray.notaPorEncima(NotasArray, notaMedia);
						//Fin del recuento
						//Imprimir cantidad de notas por encima de la nota media
						System.out.println("Hay "+contador+" notas por encima de la nota media");
					break;
					case 5:
						//Calcular nota media
						notaMedia=UtilNotasArray.notaMedia(NotasArray);
						//Fin Calcular nota media
						//Contar las notas por debajo de la nota media
						contador=UtilNotasArray.notaPorDebajo(NotasArray, notaMedia);
						//Fin del recuento
						//Imprimir cantidad de notas por debajo de la nota media
						System.out.println("Hay "+contador+" notas por debajo de la nota media");
					break;
				  }
				//Fin_Segun
				//Presentar menu y elegir y validar opcion
				do
				{
					presentarMenu();
					opcion=teclado.nextInt();
				}while(opcion<0||opcion>5);
				//Fin presentar menu y elegir y validar opcion
			 }
			//Fin_Mientras
			//Leer y validar ver nuevas notas de alumnos
			do
			{
				System.out.println("Desea ver las notas de otros alumnos? Si/No");
				seguir=Character.toLowerCase(teclado.next().charAt(0));
			}while(seguir!='s'&& seguir!='n');
			//Fin Leer y validar ver nuevas notas de alumnos
		 }
	//Fin_Mientras
	}
	//Fin
}

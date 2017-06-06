package arboles;

import java.util.*;
/*
 * Un pequeño main para probar cositas con arboles
 * Entrada: opciones y numeros
 * Salidas: Impresiones por pantalla
 * 
 * Pseudocódigo generalizado
 * 
 * Inicio
 * 
 * 		PresentarMenuYLeerYValidarOpcion
 * 		Mientras opcion!=0
 * 			Segun(opcion)
 * 				Caso 1:
 * 					Leer numero 
 * 					Introducir numero en el arbol*
 * 				Caso 2:
 * 					Leer numero
 * 					Buscar numero en arbol*
 *			Fin_Segun
 *			PresentarMenuYLeerYValidarOpcion
 *		Fin_Mientras
 * Fin
 */
public class TestArboles 
{
	/*
	 * Interfaz
	 * 
	 * Este método imprime un menú
	 * Prototipo:void imprimirMenu()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * Postcondiciones: No hay
	 */
	public static void imprimirMenu()
	{
		System.out.println("Bienvenido, elige que quieres hacer con el árbol: ");
		System.out.println("1.- Agregar un nuevo nodo");
		System.out.println("2.- Buscar nodo");
		System.out.println("0.- Salir");
	}
	public static void main(String[]args)
	{
		int numero,opcion;
		Scanner teclado=new Scanner(System.in);
		ArbolBinario ojulaquevamoalia=new ArbolBinario();
		
		//PresentarMenuYLeerYValidarOpcion
		imprimirMenu();
		do
		{
			try
			{
				opcion=teclado.nextInt();
			}catch(InputMismatchException error)
			{
				System.out.println("Negativo charlie, introduce un numero");
				opcion=-1;
				teclado=new Scanner(System.in);
			}
			if(opcion<0)
			{
				System.out.println("Negativo charlie, introduce una opcion correcta");
			}
		}while(opcion<0);
		//Fin_PresentarMEnuYLeerYValidarOpcion
		//Mientras opcion!=0
		while(opcion!=0)
		{	//Segun la opcion
			switch(opcion)
			{
				case 1:
					System.out.println("Introduce el numero"); //Leemos numero y lo introducimos
					numero=teclado.nextInt();
					ojulaquevamoalia.agregarNodo(numero);
				break;
				case 2:
					System.out.println("Introduce el numero a buscar"); //Leemos numero y buscamos en el arbol
					numero=teclado.nextInt();
					System.out.println(ojulaquevamoalia.buscarNodo(numero));
				break;
			}
			//Fin_Segun
			//PresentarMenuYLeerYValidarOpcion
			imprimirMenu();
			do
			{
				try
				{
					opcion=teclado.nextInt();
				}catch(InputMismatchException error)
				{
					System.out.println("Negativo charlie, introduce un numero");
					opcion=-1;
					teclado=new Scanner(System.in);
				}
				if(opcion<0)
				{
					System.out.println("Negativo charlie, introduce una opcion correcta");
				}
			}while(opcion<0);
			//Fin_PresentarMenuYLeerYValidarOpcion
		}//Fin_Mientras
		
	}//Fin
}

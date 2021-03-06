package arboles;

import java.util.*;
/*
 * Un peque�o main para probar cositas con arboles
 * Entrada: opciones y numeros
 * Salidas: Impresiones por pantalla
 * 
 * Pseudoc�digo generalizado
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
				Caso 3:
					Mostrar arbol InOrden*
				Caso 4:
					Mostrar arbol PreOrden*
				Caso 5:
					Mostrar arbol PostOrden*
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
	 * Este m�todo imprime un men�
	 * Prototipo:void imprimirMenu()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: No hay
	 * Postcondiciones: No hay
	 */
	public static void imprimirMenu()
	{
		System.out.println("Bienvenido, elige que quieres hacer con el �rbol: ");
		System.out.println("1.- Agregar un nuevo nodo");
		System.out.println("2.- Buscar nodo");
		System.out.println("3.- Mostrar nodos InOrden");
		System.out.println("4.- Mostrar nodos PreOrden");
		System.out.println("5.- Mostrar nodos PostOrden");
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
		}while(opcion<0||opcion>5);
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
					//System.out.println("EN CONSTRUCCION");
					System.out.println("Introduce un numero");//Leemos numero y buscamos en el arbol
					numero=teclado.nextInt();
					System.out.println(ojulaquevamoalia.buscarNodo(numero));
				break;
				case 3:
					if(!ojulaquevamoalia.estaVacio())
					{
						ojulaquevamoalia.recorrerInOrden(ojulaquevamoalia.getNodoRaiz());
					}
					else
					{
						System.out.println("El �rbol est� vac�o");
					}
				break;
				case 4:
					if(!ojulaquevamoalia.estaVacio())
					{
						ojulaquevamoalia.recorrerPreOrden(ojulaquevamoalia.getNodoRaiz());
					}
					else
					{
						System.out.println("El �rbol est� vac�o");
					}
				break;
				case 5:
					if(!ojulaquevamoalia.estaVacio())
					{
						ojulaquevamoalia.recorrerPostOrden(ojulaquevamoalia.getNodoRaiz());
					}
					else
					{
						System.out.println("El �rbol est� vac�o");
					}
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

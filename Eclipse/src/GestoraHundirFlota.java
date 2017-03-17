//package hundirFlota;
package hundirLaFlota;
import java.util.*;
public class GestoraHundirFlota {

	/*
	 * Interfaz
	 * 
	 * Este subprograma lee la opcion del menu inicial
	 * Precondiciones: No hay
	 * Entradas:Nohay
	 * Salidas: Un entero
	 * Postcondiciones: No hay
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public int leerOpcion()
	 * {
	 * 		return 1;
	 * }
	 *
	 */
	public static int leerOpcion()
	{
		int opcion=0;
		Scanner teclado=new Scanner(System.in);
		opcion=teclado.nextInt();
		return opcion;
	}
	
	/*
	 * Interfaz
	 * 
	 * Este subprograma imprime el tablero
	 * prototipo: public static void imprimirTablero(int[][]tablero)
	 * Precondiciones: El tamaño del array es de 10x10
	 * Entradas: Un array bidimensional de enteros
	 * Salidas: Nada
	 * Postcondiciones: Nada
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static void imprimirTablero(int[][]tablero)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public static void imprimirTablero(int[][]tablero)
	{
		int i;
		int j;
		int contador=1;
		System.out.println("   A    B    C    D    E    F    G    H    I    J");
		for(i=0;i<tablero.length;i++)
		{
			for(j=0;j<tablero.length;j++)
			{
				System.out.print(" ----");
			}
			System.out.println();
			for(j=0;j<tablero.length;j++)
			{
				
				if(tablero[i][j]==1||tablero[i][j]==2||tablero[i][j]==3||tablero[i][j]==4)
				{
					System.out.print("| @  ");
				}
				else
				{
					System.out.print("|    ");
				}
			}
			System.out.println("| "+contador);
			contador++;
		}
		for(j=0;j<tablero.length;j++)
		{
			System.out.print(" ----");
		}
		System.out.println();
	}
	/*
	 * Interfaz
	 * 
	 * Este método convierte un char en un int
	 * Precondiciones: El char está entre A y J, ambos incluidos
	 * Entradas: Un char
	 * Salidas: Un entero
	 * Postcondiciones: Está entre 0 y 9
	 * E/S:No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static int ConversorCharInt(char posicionColumna)
	 * {
	 * 		return 1;
	 * }
	 */
	public static int ConversorCharInt(char posicionColumna)
	{
		int entero=0;
		
		switch(posicionColumna)
		{
			case 'A':
				entero=0;
			break;
			case 'B':
				entero=1;
			break;
			case 'C':
				entero=2;
			break;
			case 'D':
				entero=3;
			break;
			case 'E':
				entero=4;
			break;
			case 'F':
				entero=5;
			break;
			case 'G':
				entero=6;
			break;
			case 'H':
				entero=7;
			break;
			case 'I':
				entero=8;
			break;
			case 'J':
				entero=9;
			break;
		}
		return entero;
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma convierte un entero a la posición correspondiente del array
	 * Prototipo: int conversorIntPosicion(int posicionFila)
	 * Precondiciones: El entero estará entre 1 y diez ambos incluidos
	 * Entradas: Un entero
	 * Salidas: Un entero
	 * Postcondiciones: El entero estará entre 0 y 9 ambos incluidos
	 * 
	 * RESGUARDO
	 * 
	 * public static int conversorIntPosicion(int posicionFila)
	 * {
	 * 		return 1;
	 * }
	 */
	public static int conversorIntPosicion(int posicionFila)
	{
		return posicionFila-1;
	}
	
	/*
	 * Interfaz 
	 * 
	 * Este subprograma carga el array de tablero
	 * Prototipo: void cargarArray(boolean[][]tablero, Barco barco, int i, int j)
	 * Precondiciones: Los dos enteros están entre 0 y 9 ambos inclusive y el string es o "Vertical" o "Horizontal"
	 * Entradas: Un objeto barco, dos enteros y un string
	 * Salidas: No
	 * Postcondiciones: Se cargará el tablero con el tamaño del barco
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static void cargarArray(boolean[][]tablero, Barco barco)
	 * {
	 * 		boolean[][]tablero=null;
	 * 		return tablero;
	 * }
	 */
	public static void cargarArray(int[][]tablero, Barco barco, int fila, int columna)
	{
		int i;
		int j;
		int k;
		
		if(barco.getPosicion().equals("Vertical"))
		{
			if(barco.getDireccion().equals("Abajo"))
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
							for(k=0;k<barco.getTamanyo().length;k++)
							{
	
										tablero[i][j]=barco.getTamanyo()[k];
										i++;
							}
						}
					}
				}
			}
			else
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
							for(k=0;k<barco.getTamanyo().length;k++)
							{
	
										tablero[i][j]=barco.getTamanyo()[k];
										i--;
							}
						}
					}
				}
			}
		}
		else
		{
			if(barco.getDireccion().equals("Derecha"))
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
								for(k=0;k<barco.getTamanyo().length;k++)
								{
									tablero[i][j]=barco.getTamanyo()[k];
									j++;
								}
						}
					}
				}
			}
			else
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
								for(k=0;k<barco.getTamanyo().length;k++)
								{
									tablero[i][j]=barco.getTamanyo()[k];
									j--;
								}
						}
					}
				}
			}
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma comprueba si una posicion del array está ocupada o no
	 * Prototipo: boolean comprobarArray(boolean[][]tablero, int fila, int columna)
	 * Precondiciones: El array es 10x10 y los enteros van entre 0 y 9 ambos inclusive
	 * Entradas: Un array bidimensional booleano y dos enteros
	 * Salidas: Un valor booleano
	 * Postcondiciones: True si esa posicion del array es true y false si esa posicion del array es false
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static boolean comprobarArray(boolean[][]tablero, int fila, int columna)
	 * {
	 * 		return false;
	 * }
	 */
	public static boolean comprobarArray(int[][]tablero, int fila, int columna)
	{
		boolean ocupada=false;
		
		if(tablero[fila][columna]==1||tablero[fila][columna]==2||tablero[fila][columna]==3||tablero[fila][columna]==4||tablero[fila][columna]==5)
		{
					ocupada=true;
		}
			
		
		return ocupada;
	}
	public static boolean comprobarArrayBarcoEntero(int[][]tablero, Barco barco, int fila, int columna)
	{
		int i;
		int j;
		
		boolean ocupada=false;
		boolean ocupadaDefinitiva=false;
		
		if(barco.getPosicion().equals("Vertical"))
		{
			if(barco.getDireccion().equals("Abajo"))
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
							for(i=fila;i<barco.getTamanyo().length;i++)
							{	
									ocupada=GestoraHundirFlota.comprobarArray(tablero, i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}										
							}
						}
					}
				}
			}
			else
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
							for(i=fila;i<barco.getTamanyo().length;i++)
							{
									ocupada=GestoraHundirFlota.comprobarArray(tablero, i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}	
							}
						}
					}
				}
			}
		}
		else
		{
			if(barco.getPosicion().equals("Derecha"))
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
								for(j=fila;j<barco.getTamanyo().length;j++)
								{
									ocupada=GestoraHundirFlota.comprobarArray(tablero, i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}
								}
						}
					}
				}
			}
			else
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
								for(j=fila;j<barco.getTamanyo().length;j++)
								{
									ocupada=GestoraHundirFlota.comprobarArray(tablero, i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}
								}
						}
					}
				}
			}
		}
		return ocupada;
	}
	public static boolean comprobarArrayBarcoEnteroPrueba(int[][]tablero, Barco barco, int fila, int columna)
	{
		int i;
		int j;
		
		boolean ocupada=false;
		boolean ocupadaDefinitiva=false;
		
		if(barco.getPosicion().equals("Vertical"))
		{
			if(barco.getDireccion().equals("Abajo"))
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
							for(i=fila;i<barco.getTamanyo().length;i++)
							{	
									ocupada=GestoraHundirFlota.comprobarArray(tablero, i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}										
							}
						}
					}
				}
			}
			else
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
							for(i=fila;i<barco.getTamanyo().length;i++)
							{
									ocupada=GestoraHundirFlota.comprobarArray(tablero, i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}	
							}
						}
					}
				}
			}
		}
		else
		{
			if(barco.getPosicion().equals("Derecha"))
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
								for(j=fila;j<barco.getTamanyo().length;j++)
								{
									ocupada=GestoraHundirFlota.comprobarArray(tablero, i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}
								}
						}
					}
				}
			}
			else
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
								for(j=fila;j<barco.getTamanyo().length;j++)
								{
									ocupada=GestoraHundirFlota.comprobarArray(tablero, i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}
								}
						}
					}
				}
			}
		}
		return ocupada;
	}
}

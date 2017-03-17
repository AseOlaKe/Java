//package hundirFlota;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//package hundirLaFlota;
import java.util.*;
public class GestoraHundirFlota {
	
	/*
	 * Interfaz
	 * 
	 * Este método lee la casilla donde crees que está el barco
	 * Prototipo: public static String leerCasilla()
	 * Precondiciones: No hay
	 * Entradas: No hay 
	 * Salidas: Un string
	 * Postcondiciones: El string contendrá la posición elegida por el jugador
	 * 
	 * RESGUARDO
	 * public static String leerCasilla()
	 * {
	 * 		String s="En construccion";
	 * 		return s;
	 * }
	 */
	public static String leerCasilla()
	{
		String posicion=" ";
		char posicionColumna=' ';
		int posicionFila=0;
		Scanner teclado=new Scanner(System.in);
		do
		{
			posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
			if(posicionColumna<'A'||posicionColumna>'J')
			{
				System.out.println("Elige una columna correcta");
			}
		}while(posicionColumna<'A'||posicionColumna>'J');
		do
		{
			try
			{
				posicionFila=teclado.nextInt();
			}catch(InputMismatchException mensaje)
			{
				System.out.println("No te la juegues e introduce un numero anda.");
				posicionFila=0;
				teclado=new Scanner(System.in);
			}
		}while(posicionFila<1||posicionFila>10);
		posicion=posicionColumna+","+posicionFila;
		return posicion;
	}
	
	/*
	 * Interfaz
	 * 
	 * Este método imprime en pantalla el ganador de la partida
	 * Precondiciones: Los enteros estan entre 0 y 5
	 * Entrada: Dos enteros y dos objetos Jugador
	 * Salida: Nada
	 * Postcondiciones: Nada
	 * 
	 * RESGUARDO
	 * 
	 * public static void comprobarGanador(int contadorBarcosJugador1, int contadorBarcosJugador2)
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 * 
	 */
	
	public static void comprobarGanador(int contadorBarcosDestruidosJugador1, int contadorBarcosDestruidosJugador2, Jugador jugador, Jugador jugador2)
	{
		if(contadorBarcosDestruidosJugador1==5&&contadorBarcosDestruidosJugador2==5)
		{
			System.out.println("Empate! Ambos habeis destruido vuestros barcos");
		}
		else if(contadorBarcosDestruidosJugador2==5)
		{
			System.out.println("Ha ganado "+jugador2.getNombre()+"!!");
		}
		else if(contadorBarcosDestruidosJugador1==5)
		{
			System.out.println("Ha ganado "+jugador.getNombre()+"!!");
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este método configura la posicion y la direccion de cualquier barco en el tablero
	 * Prototipo:void configBarcos (Barco barco)
	 * Precondiciones: No hay
	 * Entradas: Un objeto barco
	 * Salidas: No hay
	 * Postcondiciones: Nada
	 * 
	 * RESGUARDO
	 * public static String configBarco(Barco barco)
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 * 
	 */
	public static void configBarcos (Barco barco) throws IOException 
	{
		InputStreamReader corriente=new InputStreamReader(System.in);
		BufferedReader tecladoString=new BufferedReader(corriente);
		do
		{
			System.out.println("En que posicion quieres colocar el barco? Vertical/Horizontal");
			try
			{
				barco.setPosicion(tecladoString.readLine().toLowerCase());
			}catch(FlotaExcepcion mensaje)
			{
				System.out.println(mensaje);
			}
			
		}while((!barco.getPosicion().equals("horizontal")&&!barco.getPosicion().equals("vertical"))||barco.getPosicion().equals(" "));
		if(barco.getPosicion().equals("horizontal"))
		{
			do
			{
				System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
				try
				{
					barco.setDireccion(tecladoString.readLine().toLowerCase());
				}catch(FlotaExcepcion mensaje)
				{
					System.out.println(mensaje);
				}
				barco.getDireccion().toLowerCase();
			}while((!barco.getDireccion().equals("derecha")&&!barco.getDireccion().equals("izquierda"))||barco.getPosicion().equals(" "));
		}
			else
			{
				do
				{
					System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
					try
					{
						barco.setDireccion(tecladoString.readLine().toLowerCase());
					}catch(FlotaExcepcion mensaje)
					{
						System.out.println(mensaje);
					}
				}while((!barco.getDireccion().equals("arriba")&&!barco.getDireccion().equals("abajo"))||barco.getPosicion().equals(" "));
			}	
	}
	/*
	 * Interfaz
	 * 
	 * Este método lee la casilla donde quieres meter el barco
	 * Prototipo: public static void elegirCasilla(Barco barco, Tablero tablero, String nombreBarco)
	 * Precondiciones: No hay
	 * Entradas: No hay 
	 * Salidas: nada
	 * Postcondiciones: nada
	 * 
	 * RESGUARDO
	 * public static void elegirCasilla()
	 * {
	 * 		system.out.println("En construccion");
	 * }
	 */
	
	public static void elegirCasilla(Barco barco, Tablero tablero, String nombreBarco)
	{
		String posicion=" ";
		String[]partes=null;
		char posicionColumna=' ';
		int posicionFila=0;
		Scanner teclado= new Scanner(System.in);
		boolean seSale=false;
		int fila,columna;
		boolean posicionOcupada=false;
		
		do
		{
			System.out.println("En que casilla quieres colocar el barco? Columna de la A a la J y Fila del 1 al 10");
			do
			{
				posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
				if(posicionColumna<'A'||posicionColumna>'J')
				{
					System.out.println("Elige una columna correcta(A-J)");
				}
			}while(posicionColumna<'A'||posicionColumna>'J');
			do
			{
				try
				{
					posicionFila=teclado.nextInt();
				}catch(InputMismatchException mensaje)
				{
					System.out.println("No te la juegues e introduce un numero anda.");
					posicionFila=0;
					teclado=new Scanner(System.in);
				}
				if(posicionFila<1||posicionFila>10)
				{
					System.out.println("Introduce una columna correcta(1-10)");
				}
			}while(posicionFila<1||posicionFila>10);
			posicion=posicionColumna+","+posicionFila;
			partes=posicion.split(",");
			posicionColumna=partes[0].charAt(0);
			posicionFila=Integer.valueOf(partes[1]);
			columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
			fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
			seSale=tablero.comprobarSiSeSale(barco, fila, columna, nombreBarco);
			if(seSale==false)
			{
				posicionOcupada=tablero.comprobarArrayBarcoEntero(barco, fila, columna, nombreBarco);
				if(posicionOcupada==true)
				{
					System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
				}
			}
			else
			{
				System.out.println("El barco se sale del tablero, elija otra casilla por favor");
			}
		}while(posicionOcupada==true||seSale==true);
		
		
		barco.cargarArrayBarco(barco,nombreBarco);
		tablero.cargarArray(barco, fila, columna);
	}
	/*
	 * Interfaz
	 * 
	 * Este método convierte un char en un int
	 * Prototipo:int ConversorCharInt(Character posicionColumna)
	 * Precondiciones: El char está entre A y J, ambos incluidos
	 * Entradas: Un char
	 * Salidas: Un entero
	 * Postcondiciones: Está entre 0 y 9
	 * E/S:No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static int ConversorCharInt(Character posicionColumna)
	 * {
	 * 		return 1;
	 * }
	 */
	public static int ConversorCharInt(Character posicionColumna)
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
	public static int conversorIntPosicion(Integer posicionFila)
	{
		return posicionFila-1;
	}
	
	
}

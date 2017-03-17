//package hundirFlota;
package hundirLaFlota;
/*
 * Análisis
 * 
 *  Este programa es un simulador del tradicional juego de mesa Hundir la flota.
 *  
 *  Entradas: 
 *  	- El nombre, un string
 *  	- Posicion donde quiere colocar los barcos, posición donde el jugador crea que están los barcos(un carácter y un entero)
 *  	- Un carácter, para seguir jugando
 *  Salidas:
 *  	- Ganador final en pantalla
 *  
 *  Restricciones:
 *  	-Para elegir posición, un carácter entre 'A' y 'J'(ambos inclusive) y un entero entre 1 y 10(ambos inclusive)
 *  	-El carácter para seguir debe ser una 's' o una 'n'
 */
import java.util.*;
import java.io.*;
public class MAINhundirLaFlota {
	
	/*
	 * Interfaz
	 * 
	 * Este subprograma presenta el menú inicial
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void presentarMenuInicial()
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public static void presentarMenuInicial()
	{
		System.out.println("Bienvenido a hundir la flota!");
		System.out.println("Elija una opcion: ");
		System.out.println("1: Empezar juego");
		System.out.println("0: Salir");
	}

	public static void main (String[]args) throws IOException
	{
		char posicionColumna=' ';
		int posicionFila;
		int fila=0;
		int columna=0;
		int opcion=0;
		int contadorPortaaviones=1;
		int contadorDestructor=1;
		int contadorSubmarino=1;
		int contadorLancha=2;
		int contadorBarcosPuestos=0;
		int contadorBarcosDestruidosJugador1=0;
		int contadorBarcosDestruidosJugador2=0;
		boolean posicionOcupada=false;
		String posicion=" ";
		String nombreJugador1=" ";
		String nombreJugador2=" ";
		String nombreBarco=" ";
		int [][]tablero=new int [10][10];
		int[][]tablero2=new int[10][10];
		int[][]backup=new int[10][10];
		int[][]backup2=new int[10][10];
		Barco lancha=null;
		Barco lancha2=null;
		Barco portaaviones=null;
		Barco destructor=null;
		Barco submarino=null;
		Barco lanchaJugador2=null;
		Barco lancha2Jugador2=null;
		Barco portaavionesJugador2=null;
		Barco destructorJugador2=null;
		Barco submarinoJugador2=null;
		try
		{
			lancha=new Barco(new int[1],"Vertical","Abajo");
			lancha2=new Barco(new int[1],"Vertical","Abajo");
			portaaviones=new Barco(new int[4],"Vertical","Abajo");
			destructor=new Barco(new int[3],"Vertical","Abajo");
			submarino=new Barco(new int[2],"Vertical","Abajo");
			lanchaJugador2=new Barco(new int[1],"Vertical","Abajo");
			lancha2Jugador2=new Barco(new int[1],"Vertical","Abajo");
			portaavionesJugador2=new Barco(new int[4],"Vertical","Abajo");
			destructorJugador2=new Barco(new int[3],"Vertical","Abajo");
			submarinoJugador2=new Barco(new int[2],"Vertical","Abajo");
		}catch(FlotaExcepcion mensaje)
		{
			System.out.println(mensaje);
		}
		Jugador jugador1=new Jugador("Default");
		Jugador jugador2=new Jugador("Default");
		Scanner teclado=new Scanner(System.in);
		InputStreamReader corriente=new InputStreamReader(System.in);
		BufferedReader tecladoString=new BufferedReader(corriente);
		
		do
		{
			presentarMenuInicial();
			opcion=GestoraHundirFlota.leerOpcion();
		}while(opcion>1||opcion<0);
		if(opcion!=0)
		{
			System.out.println("Introduzcan sus nombres: ");
			jugador1.setNombre(tecladoString.readLine());
			jugador2.setNombre(tecladoString.readLine());
			System.out.println("Bienvenidos "+jugador1.getNombre()+" y "+jugador2.getNombre()+", antes de nada elige que barcos quieres colocar "+jugador1.getNombre());
			while(contadorBarcosPuestos<5)
			{
				do
				{	
					
					System.out.println("Dispones de: ");
					System.out.println(contadorPortaaviones+" Portaaviones, 4 casillas");
					System.out.println(contadorDestructor+" Destructor, 3 casillas");
					System.out.println(contadorSubmarino+" Submarino, 2 casillas");
					System.out.println(contadorLancha+" Lanchas, 1 casilla");
					nombreBarco=tecladoString.readLine();
					if(!nombreBarco.equals("Portaaviones")&&!nombreBarco.equals("Destructor")&&!nombreBarco.equals("Submarino")&&!nombreBarco.equals("Lancha"))
					{
						System.out.println("No dispones de "+nombreBarco+", escribe un nombre correcto");
					}
					if((nombreBarco.equals("Portaaviones")&&contadorPortaaviones==0)||(nombreBarco.equals("Destructor")&&contadorDestructor==0)||(nombreBarco.equals("Submarino")&&contadorSubmarino==0)||(nombreBarco.equals("Lancha")&&contadorLancha==0))
					{
						System.out.println("No te queda/n "+nombreBarco+", elige alguno disponible");
					}
				}while(!nombreBarco.equals("Portaaviones")&&!nombreBarco.equals("Destructor")&&!nombreBarco.equals("Submarino")&&!nombreBarco.equals("Lancha")||((nombreBarco.equals("Portaaviones")&&contadorPortaaviones==0)||(nombreBarco.equals("Destructor")&&contadorDestructor==0)||(nombreBarco.equals("Submarino")&&contadorSubmarino==0)||(nombreBarco.equals("Lancha")&&contadorLancha==0)));	
				switch (nombreBarco)
				{
					case "Portaaviones":
						System.out.println("Elige donde quieres colocar el portaaviones");
						GestoraHundirFlota.imprimirTablero(tablero);
						do
						{
							System.out.println("En que posicion quieres colocar el portaaviones? Vertical/Horizontal");
							try
							{
								portaaviones.setPosicion(tecladoString.readLine());
							}catch(FlotaExcepcion mensaje)
							{
								System.out.println(mensaje);
							}
						}while((!portaaviones.getPosicion().equals("Horizontal")&&!portaaviones.getPosicion().equals("Vertical"))||portaaviones.getPosicion()==null);
						do
						{
							System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
							posicionFila=teclado.nextInt();
							posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
							columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
							fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
							posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,portaaviones, fila, columna);
							if(posicionOcupada==true)
							{
								System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
							}
						}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
						do
						{
							if(portaaviones.getPosicion().equals("Horizontal"))
							{
								System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
								try
								{
									portaaviones.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
							else
							{
								System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
								try
								{
									portaaviones.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
						}while(((portaaviones.getPosicion().equals("Arriba")||portaaviones.getDireccion().equals("Abajo"))&&portaaviones.getPosicion().equals("Horizontal"))||((portaaviones.getPosicion().equals("Izquierda")||portaaviones.getDireccion().equals("Derecha"))&&portaaviones.getPosicion().equals("Vertical")));
						
						destructor.cargarArrayBarco(portaaviones,nombreBarco);
						GestoraHundirFlota.cargarArray(tablero, portaaviones, fila, columna);
						GestoraHundirFlota.imprimirTablero(tablero);
						contadorPortaaviones--;
						contadorBarcosPuestos++;
					break;
					case "Destructor":
						System.out.println("Elige donde quieres colocar el destructor");
						GestoraHundirFlota.imprimirTablero(tablero);
						do
						{
							System.out.println("En que posicion quieres colocar el destructor? Vertical/Horizontal");
							try
							{
								destructor.setPosicion(tecladoString.readLine());
							}catch(FlotaExcepcion mensaje)
							{
								System.out.println(mensaje);
							}
						}while((!destructor.getPosicion().equals("Horizontal")&&!destructor.getPosicion().equals("Vertical"))||destructor.getPosicion()==null);
						do
						{
							System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
							posicionFila=teclado.nextInt();
							posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
							columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
							fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
							posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,destructor, fila, columna);
							if(posicionOcupada==true)
							{
								System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
							}
						}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
						do
						{
							if(destructor.getPosicion().equals("Horizontal"))
							{
								System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
								try
								{
									destructor.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
							else
							{
								System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
								try
								{
									destructor.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
						}while(((destructor.getPosicion().equals("Arriba")||destructor.getDireccion().equals("Abajo"))&&destructor.getPosicion().equals("Horizontal"))||((destructor.getPosicion().equals("Izquierda")||destructor.getDireccion().equals("Derecha"))&&destructor.getPosicion().equals("Vertical")));
						
						destructor.cargarArrayBarco(destructor,nombreBarco);
						GestoraHundirFlota.cargarArray(tablero, destructor, fila, columna);
						GestoraHundirFlota.imprimirTablero(tablero);
						contadorDestructor--;
						contadorBarcosPuestos++;
					break;
					case "Submarino":
						System.out.println("Elige donde quieres colocar el submarino");
						GestoraHundirFlota.imprimirTablero(tablero);
						
						do
						{
							System.out.println("En que posicion quieres colocar el submarino? Vertical/Horizontal");
							try
							{
								submarino.setPosicion(tecladoString.readLine());
							}catch(FlotaExcepcion mensaje)
							{
								System.out.println(mensaje);
							}
						}while((!submarino.getPosicion().equals("Horizontal")&&!submarino.getPosicion().equals("Vertical"))||submarino.getPosicion()==null);
						do
						{
							System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
							posicionFila=teclado.nextInt();
							posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
							columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
							fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
							posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,submarino, fila, columna);
							
							if(posicionOcupada==true)
							{
								System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
							}
						}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
						do
						{
							if(submarino.getPosicion().equals("Horizontal"))
							{
								System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
								try
								{
									submarino.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
							else
							{
								System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
								try
								{
									submarino.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
						}while(((submarino.getPosicion().equals("Arriba")||submarino.getDireccion().equals("Abajo"))&&submarino.getPosicion().equals("Horizontal"))||((submarino.getPosicion().equals("Izquierda")||submarino.getDireccion().equals("Derecha"))&&submarino.getPosicion().equals("Vertical")));
						
						submarino.cargarArrayBarco(submarino,nombreBarco);
						GestoraHundirFlota.cargarArray(tablero, submarino, fila, columna);
						GestoraHundirFlota.imprimirTablero(tablero);
						contadorSubmarino--;
						contadorBarcosPuestos++;
					break;
					case "Lancha":
						System.out.println("Elige donde quieres colocar la lancha");
						GestoraHundirFlota.imprimirTablero(tablero);
						if(contadorLancha==2)
						{	
							do
							{
								System.out.println("En que posicion quieres colocar el lancha? Vertical/Horizontal");
								try
								{
									lancha.setPosicion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}while((!lancha.getPosicion().equals("Horizontal")&&!lancha.getPosicion().equals("Vertical"))||lancha.getPosicion()==null);
							do
							{
								System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
								posicionFila=teclado.nextInt();
								posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
								columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
								fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
								posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,lancha, fila, columna);
								
								if(posicionOcupada==true)
								{
									System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
								}
							}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
							do
							{
								if(lancha.getPosicion().equals("Horizontal"))
								{
									System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
									try
									{
										lancha.setDireccion(tecladoString.readLine());
									}catch(FlotaExcepcion mensaje)
									{
										System.out.println(mensaje);
									}
								}
								else
								{
									System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
									try
									{
										lancha.setDireccion(tecladoString.readLine());
									}catch(FlotaExcepcion mensaje)
									{
										System.out.println(mensaje);
									}
								}
							}while(((lancha.getPosicion().equals("Arriba")||lancha.getDireccion().equals("Abajo"))&&lancha.getPosicion().equals("Horizontal"))||((lancha.getPosicion().equals("Izquierda")||lancha.getDireccion().equals("Derecha"))&&lancha.getPosicion().equals("Vertical")));
							
								lancha.cargarArrayBarco(lancha,nombreBarco);
								GestoraHundirFlota.cargarArray(tablero, lancha, fila, columna);
								GestoraHundirFlota.imprimirTablero(tablero);
								contadorLancha--;
								contadorBarcosPuestos++;
						}
						else
						{
							do
							{
								System.out.println("En que posicion quieres colocar el lancha? Vertical/Horizontal");
								try
								{
									lancha2.setPosicion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}while((!lancha2.getPosicion().equals("Horizontal")&&!lancha2.getPosicion().equals("Vertical"))||lancha2.getPosicion()==null);
							do
							{
								System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
								posicionFila=teclado.nextInt();
								posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
								columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
								fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
								posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,lancha2, fila, columna);
								
								if(posicionOcupada==true)
								{
									System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
								}
							}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
							do
							{
								if(lancha2.getPosicion().equals("Horizontal"))
								{
									System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
									try
									{
										lancha2.setDireccion(tecladoString.readLine());
									}catch(FlotaExcepcion mensaje)
									{
										System.out.println(mensaje);
									}
								}
								else
								{
									System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
									try
									{
										lancha2.setDireccion(tecladoString.readLine());
									}catch(FlotaExcepcion mensaje)
									{
										System.out.println(mensaje);
									}
								}
							}while(((lancha2.getPosicion().equals("Arriba")||lancha2.getDireccion().equals("Abajo"))&&lancha2.getPosicion().equals("Horizontal"))||((lancha2.getPosicion().equals("Izquierda")||lancha2.getDireccion().equals("Derecha"))&&lancha2.getPosicion().equals("Vertical")));
						
							
								lancha2.cargarArrayBarco(lancha2,nombreBarco);
								GestoraHundirFlota.cargarArray(tablero, lancha2, fila, columna);
								GestoraHundirFlota.imprimirTablero(tablero);
								contadorLancha--;
								contadorBarcosPuestos++;
						}
						
						
					break;
				}
			}
			System.out.println("Turno para "+nombreJugador2+", elige que barco quieres colocar");
			contadorBarcosPuestos=0;
			contadorPortaaviones=1;
			contadorDestructor=1;
			contadorSubmarino=1;
			contadorLancha=2;
			while(contadorBarcosPuestos<5)
			{
				do
				{	
					
					System.out.println("Dispones de: ");
					System.out.println(contadorPortaaviones+" Portaaviones, 4 casillas");
					System.out.println(contadorDestructor+" Destructor, 3 casillas");
					System.out.println(contadorSubmarino+" Submarino, 2 casillas");
					System.out.println(contadorLancha+" Lanchas, 1 casilla");
					nombreBarco=tecladoString.readLine();
					if(!nombreBarco.equals("Portaaviones")&&!nombreBarco.equals("Destructor")&&!nombreBarco.equals("Submarino")&&!nombreBarco.equals("Lancha"))
					{
						System.out.println("No dispones de "+nombreBarco+", escribe un nombre correcto");
					}
					if((nombreBarco.equals("Portaaviones")&&contadorPortaaviones==0)||(nombreBarco.equals("Destructor")&&contadorDestructor==0)||(nombreBarco.equals("Submarino")&&contadorSubmarino==0)||(nombreBarco.equals("Lancha")&&contadorLancha==0))
					{
						System.out.println("No te queda/n "+nombreBarco+", elige alguno disponible");
					}
				}while(!nombreBarco.equals("Portaaviones")&&!nombreBarco.equals("Destructor")&&!nombreBarco.equals("Submarino")&&!nombreBarco.equals("Lancha")||((nombreBarco.equals("Portaaviones")&&contadorPortaaviones==0)||(nombreBarco.equals("Destructor")&&contadorDestructor==0)||(nombreBarco.equals("Submarino")&&contadorSubmarino==0)||(nombreBarco.equals("Lancha")&&contadorLancha==0)));	
				switch (nombreBarco)
				{
					case "Portaaviones":
						System.out.println("Elige donde quieres colocar el portaaviones");
						GestoraHundirFlota.imprimirTablero(tablero2);
						do
						{
							System.out.println("En que posicion quieres colocar el portaaviones? Vertical/Horizontal");
							try
							{
								portaavionesJugador2.setPosicion(tecladoString.readLine());
							}catch(FlotaExcepcion mensaje)
							{
								System.out.println(mensaje);
							}
						}while((!portaavionesJugador2.getPosicion().equals("Horizontal")&&!portaavionesJugador2.getPosicion().equals("Vertical"))||portaavionesJugador2.getPosicion()==null);
						do
						{
							System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
							posicionFila=teclado.nextInt();
							posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
							columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
							fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
							posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,portaavionesJugador2, fila, columna);
							if(posicionOcupada==true)
							{
								System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
							}
						}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
						do
						{
							if(portaavionesJugador2.getPosicion().equals("Horizontal"))
							{
								System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
								try
								{
									portaavionesJugador2.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
							else
							{
								System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
								try
								{
									portaavionesJugador2.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
						}while(((portaavionesJugador2.getPosicion().equals("Arriba")||portaavionesJugador2.getDireccion().equals("Abajo"))&&portaavionesJugador2.getPosicion().equals("Horizontal"))||((portaavionesJugador2.getPosicion().equals("Izquierda")||portaavionesJugador2.getDireccion().equals("Derecha"))&&portaavionesJugador2.getPosicion().equals("Vertical")));
						
						portaavionesJugador2.cargarArrayBarco(portaavionesJugador2,nombreBarco);
						GestoraHundirFlota.cargarArray(tablero2, portaavionesJugador2, fila, columna);
						GestoraHundirFlota.imprimirTablero(tablero2);
						contadorPortaaviones--;
						contadorBarcosPuestos++;
					break;
					case "Destructor":
						System.out.println("Elige donde quieres colocar el destructor");
						GestoraHundirFlota.imprimirTablero(tablero2);
						do
						{
							System.out.println("En que posicion quieres colocar el destructor? Vertical/Horizontal");
							try
							{
								destructorJugador2.setPosicion(tecladoString.readLine());
							}catch(FlotaExcepcion mensaje)
							{
								System.out.println(mensaje);
							}
						}while((!destructorJugador2.getPosicion().equals("Horizontal")&&!destructorJugador2.getPosicion().equals("Vertical"))||destructorJugador2.getPosicion()==null);
						do
						{
							System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
							posicionFila=teclado.nextInt();
							posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
							columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
							fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
							posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,destructorJugador2, fila, columna);
						
							if(posicionOcupada==true)
							{
								System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
							}
						}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
						do
						{
							if(destructorJugador2.getPosicion().equals("Horizontal"))
							{
								System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
								try
								{
									destructorJugador2.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
							else
							{
								System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
								try
								{
									destructorJugador2.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
						}while(((destructorJugador2.getPosicion().equals("Arriba")||destructorJugador2.getDireccion().equals("Abajo"))&&destructorJugador2.getPosicion().equals("Horizontal"))||((destructorJugador2.getPosicion().equals("Izquierda")||destructorJugador2.getDireccion().equals("Derecha"))&&destructorJugador2.getPosicion().equals("Vertical")));
						
						destructorJugador2.cargarArrayBarco(destructorJugador2,nombreBarco);
						GestoraHundirFlota.cargarArray(tablero2,destructorJugador2, fila, columna);
						GestoraHundirFlota.imprimirTablero(tablero2);
						contadorDestructor--;
						contadorBarcosPuestos++;
					break;
					case "Submarino":
						do
						{
							System.out.println("En que posicion quieres colocar el submarino? Vertical/Horizontal");
							try
							{
								submarinoJugador2.setPosicion(tecladoString.readLine());
							}catch(FlotaExcepcion mensaje)
							{
								System.out.println(mensaje);
							}
						}while((!submarinoJugador2.getPosicion().equals("Horizontal")&&!submarinoJugador2.getPosicion().equals("Vertical"))||submarinoJugador2.getPosicion()==null);
						do
						{
							System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
							posicionFila=teclado.nextInt();
							posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
							columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
							fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
							posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,submarinoJugador2, fila, columna);
							
							if(posicionOcupada==true)
							{
								System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
							}
						}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
						do
						{
							if(submarinoJugador2.getPosicion().equals("Horizontal"))
							{
								System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
								try
								{
									submarinoJugador2.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
							else
							{
								System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
								try
								{
									submarinoJugador2.setDireccion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}
						}while(((submarinoJugador2.getPosicion().equals("Arriba")||submarinoJugador2.getDireccion().equals("Abajo"))&&submarinoJugador2.getPosicion().equals("Horizontal"))||((submarinoJugador2.getPosicion().equals("Izquierda")||submarinoJugador2.getDireccion().equals("Derecha"))&&submarinoJugador2.getPosicion().equals("Vertical")));
						columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
						fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
						
						submarinoJugador2.cargarArrayBarco(submarinoJugador2,nombreBarco);
						GestoraHundirFlota.cargarArray(tablero2,submarinoJugador2, fila, columna);
						GestoraHundirFlota.imprimirTablero(tablero2);
						contadorSubmarino--;
						contadorBarcosPuestos++;
					break;
					case "Lancha":
						System.out.println("Elige donde quieres colocar la lancha");
						GestoraHundirFlota.imprimirTablero(tablero2);
						if(contadorLancha==2)
						{	
							do
							{
								System.out.println("En que posicion quieres colocar el lancha? Vertical/Horizontal");
								try
								{
									lanchaJugador2.setPosicion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}while((!lanchaJugador2.getPosicion().equals("Horizontal")&&!lanchaJugador2.getPosicion().equals("Vertical"))||lanchaJugador2.getPosicion()==null);
							do
							{
								System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
								posicionFila=teclado.nextInt();
								posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
								columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
								fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
								posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,lanchaJugador2, fila, columna);
								
								if(posicionOcupada==true)
								{
									System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
								}
							}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
							do
							{
								if(lanchaJugador2.getPosicion().equals("Horizontal"))
								{
									System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
									try
									{
										lanchaJugador2.setDireccion(tecladoString.readLine());
									}catch(FlotaExcepcion mensaje)
									{
										System.out.println(mensaje);
									}
								}
								else
								{
									System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
									try
									{
										lanchaJugador2.setDireccion(tecladoString.readLine());
									}catch(FlotaExcepcion mensaje)
									{
										System.out.println(mensaje);
									}
								}
							}while(((lanchaJugador2.getPosicion().equals("Arriba")||lanchaJugador2.getDireccion().equals("Abajo"))&&lanchaJugador2.getPosicion().equals("Horizontal"))||((lanchaJugador2.getPosicion().equals("Izquierda")||lanchaJugador2.getDireccion().equals("Derecha"))&&lanchaJugador2.getPosicion().equals("Vertical")));
							
							
								lanchaJugador2.cargarArrayBarco(lanchaJugador2,nombreBarco);
								GestoraHundirFlota.cargarArray(tablero, lanchaJugador2, fila, columna);
								GestoraHundirFlota.imprimirTablero(tablero);
								contadorLancha--;
								contadorBarcosPuestos++;
						}
						else
						{
							do
							{
								System.out.println("En que posicion quieres colocar el lancha? Vertical/Horizontal");
								try
								{
									lancha2Jugador2.setPosicion(tecladoString.readLine());
								}catch(FlotaExcepcion mensaje)
								{
									System.out.println(mensaje);
								}
							}while((!lancha2Jugador2.getPosicion().equals("Horizontal")&&!lancha2Jugador2.getPosicion().equals("Vertical"))||lancha2Jugador2.getPosicion()==null);
							do
							{
								System.out.println("En que casilla quieres colocar el barco? Fila del 1 al 10 y columna de la A a la J");
								posicionFila=teclado.nextInt();
								posicionColumna=Character.toUpperCase(teclado.next().charAt(0));
								columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
								fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
								posicionOcupada=GestoraHundirFlota.comprobarArrayBarcoEntero(tablero,lancha2Jugador2, fila, columna);
								
								if(posicionOcupada==true)
								{
									System.out.println("Esa posicion ya esta ocupada por otro barco, elige otra");
								}
							}while(((posicionFila<1||posicionFila>10)||(posicionColumna<'A'||posicionColumna>'J'))||posicionOcupada==true);
							do
							{
								if(lancha2Jugador2.getPosicion().equals("Horizontal"))
								{
									System.out.println("En que direccion quieres situarlo? Derecha/Izquierda");
									try
									{
										lancha2Jugador2.setDireccion(tecladoString.readLine());
									}catch(FlotaExcepcion mensaje)
									{
										System.out.println(mensaje);
									}
								}
								else
								{
									System.out.println("En que direccion quieres situarlo? Arriba/Abajo");
									try
									{
										lancha2Jugador2.setDireccion(tecladoString.readLine());
									}catch(FlotaExcepcion mensaje)
									{
										System.out.println(mensaje);
									}
								}
							}while(((lancha2Jugador2.getPosicion().equals("Arriba")||lancha2Jugador2.getDireccion().equals("Abajo"))&&lancha2Jugador2.getPosicion().equals("Horizontal"))||((lancha2Jugador2.getPosicion().equals("Izquierda")||lancha2Jugador2.getDireccion().equals("Derecha"))&&lancha2Jugador2.getPosicion().equals("Vertical")));
							
							
								lancha2Jugador2.cargarArrayBarco(lancha2Jugador2,nombreBarco);
								GestoraHundirFlota.cargarArray(tablero, lancha2Jugador2, fila, columna);
								GestoraHundirFlota.imprimirTablero(tablero);
								contadorLancha--;
								contadorBarcosPuestos++;
						}
					break;
				}
			}
			while(contadorBarcosDestruidosJugador1<5||contadorBarcosDestruidosJugador2<5)
			{
				
			}
			if(contadorBarcosDestruidosJugador1==5)
			{
				System.out.println("Ha ganado "+nombreJugador1+"!!");
			}
			if(contadorBarcosDestruidosJugador2==5)
			{
				System.out.println("Ha ganado "+nombreJugador2+"!!");
			}
			
		}
	}
}

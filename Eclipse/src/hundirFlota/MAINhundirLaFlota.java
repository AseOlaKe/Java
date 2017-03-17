//package hundirFlota;
//package hundirLaFlota;
/*
 * Análisis
 * 
 *  Este programa es un simulador del tradicional juego de mesa Hundir la flota.
 *  
 *  Entradas: 
 *  	- El nombre de los jugadores, dos string
 *  	- Nombre del barco que se quiere colocar
 *  	- La opcion, un entero
 *  	- Posicion , direccion y casilla donde quiere colocar los barcos 
 *  	- Casilla donde el jugador crea que están los barcos(un carácter y un entero)
 *  	
 *  Salidas:
 *  	- Ganador final en pantalla, tablero, mensajes en pantalla
 *  
 *  Restricciones:
 *  	-Para elegir posición, un carácter entre 'A' y 'J'(ambos inclusive) y un entero entre 1 y 10(ambos inclusive)
 *  	-El carácter para seguir debe ser una 's' o una 'n'
 *  	- El nomrbe del barco debe ser "Portaaviones", "Destructor", "Submarino", "Lancha"
 *  	- La posicion del barco debe ser "Horizontal" o "Vertical"
 *  	-Si la posicion es horizontal, la direccion solo puede ser "Derecha" o "Izquierda". Si es vertical, "Arriba" o "Abajo"
 *  
 *  Pseudocódigo generalizado
 *  
 *  Inicio
 *  	Presentar menú y leer y validar opcion
 *  	Mientras opcion!=0
 *  		Leer nombre jugador 1
 *  		Leer nombre jugador 2
 *  		Mientras el jugador 1 tenga menos de 5 barcos puestos
 *  			Leer y validar nombre del barco
*  					Según(Nombre del barco)
*  						Caso "Portaaviones":
*  							Imprimir tablero
 *  						Configurar posicion y direccion
 *                          Elegir casilla del barco
 *                          Imprimir tablero
 *  					Caso "Destructor":
 *  						Imprimir tablero
*  							Configurar posicion y direccion
 *                          Elegir casilla del barco
 *                          Imprimir tablero
 *  					Caso "Submarino":
 *  						Imprimir tablero
 *  						Configurar posicion y direccion
 *                          Elegir casilla del barco
 *                          Imprimir tablero
*  						Caso "Lancha":
*  							Imprimir tablero
 *  						SI tiene dos lanchas 							 
 *                         		 Elegir casilla del barco
 *                         		 Imprimir tablero
 *  						Fin_SI
 *  						SINO
 *                         	 	Elegir casilla del barco(Segunda lancha)
 *  							Imprimir tablero
 *  						Fin_SINO
 *  				Fin_Segun
*  			Fin_Mientras
*  			Imprimir ventana de espera
*  			Mientras el jugador 2 tenga menos de 5 barcos puestos
*  				Leer y validar nombre del barco
*  					Según(Nombre del barco)
*  						Caso "Portaaviones":
*  							Imprimir tablero
 *  						Configurar posicion y direccion
 *                          Elegir casilla del barco
 *                          Imprimir tablero
 *  					Caso "Destructor":
 *  						Imprimir tablero
*  							Configurar posicion y direccion
 *                          Elegir casilla del barco
 *                          Imprimir tablero
 *  					Caso "Submarino":
 *  						Imprimir tablero
 *  						Configurar posicion y direccion
 *                          Elegir casilla del barco
 *                          Imprimir tablero
*  						Caso "Lancha":
*  							Imprimir tablero
 *  						SI tiene dos lanchas
 *                         	 Elegir casilla del barco
 *                         	 Imprimir tablero
 *  						Fin_SI
 *  						SINO
 *                         	 Elegir casilla del barco(Segunda lancha)
 *                         	 Imprimir tablero
 *  						Fin_SINO
 *  				Fin_Segun
 *  		Fin_Mientras
 *  		Imprimir ventana de espera
 *  		Mientras el jugador1 no haya destruido 5 barcos o el jugador2 no haya destruido 5 barcos
 *  			Imprimir backup jugador1
 *  			Imprimir tablero jugador1
 *  			Leer y validar casilla
 *  			Verificar si ha tocado algun barco
 *  			Imprimir backup jugador2
 *  			Imprimir tablero jugador2
 *  			Leer y validar casilla
 *  			Verificar si ha tocado algun barco
 *  		Fin_Mientras
 *  		Comprobar e imprimir ganador
 *  		Presentar menu y leer y validar reiniciar
 *  	Fin_Mientras
 *  Fin
 *  
 *  
 *  ---Módulo: Configurar posicion y direccion---
 *  
 *  Inicio
 *  	Leer y validar posicion del barco
 *  	SI la posicion es vertical
 *  		Leer y validar direccion del barco
 *  	Fin_SI
 *  	SINO
 *  		Leer y validar direccion del barco
 *  	Fin_SINO
 *  Fin
 *  ---------------------------------------------
 *  ---Módulo: Elegir casilla del barco---
 *  Inicio
 *  	Repetir
 *  		Leer y validar columna
 *  		Leer y validar fila
 *  		Comprobar si se sale
 *  		SI no se sale
 *  			Comprobar si ocupa la posicion de otro barco
 *  			SI la ocupa
 *  				Imprimir que no puede colocar el barco ahi
 *  			Fin_SI
 *  		Fin_SI
 *  		SINO
 *  			Imprimir que se sale
 *  		Fin_SINO
 *  	Mientras el barco se salga del tablero o vaya a ocupar el espacio de otro barco
 *  	Cargar el array de barco
 *  	Cargar el tablero
 *  Fin
 *  	
 *  ------------------------------------------------
 *  ---Módulo: Verificar si ha tocado algun barco
 *  
 *  SI el jugador ha tocado algun barco
 *  				SI ha tocado una lancha
 *  					Imprimir tocado y hundido
 *  				Fin_SI
 *  				SI ha tocado un submarino
 *  					SI ha tocado solo una vez al submarino
 *  						Imprimir tocado
 *  					Fin_SI
 *  					SINO
 *  						Imprimir tocado y hundido
 *  					Fin_SINO
 *  				Fin_SI
 *  				SI ha tocado un destructor
 *  					SI lo ha tocado menos de 3 veces
 *  						Imprimir tocado
 *  					Fin_SI
 *  					SINO
 *  						Imprimir tocado y hundido
 *  					Fin_SI
 *  				Fin_SI
 *  				SI ha tocado un portaaviones
 *  					SI lo ha tocado menos de 4 veces
 *  						Imprimir tocado
 *  					Fin_SI
 *  					SINO
 *  						Imprimir tocado y hundido
 *  					Fin_SI
 *  				Fin_SI
 *  			Fin_SI
 *  			SI NO
 *  				Imprimir agua
 *  			Fin_SINO	
 *  ------------------------------------------------------					
 *  				
 *  		
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
	/*
	 * Interfaz
	 * 
	 * Este subprograma presenta una pequeña ventana de espera.
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void ventanaEspera()
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 * 
	 */
	public static void ventanaEspera()
	{
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("********************En espera***********************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		System.out.println("****************************************************");
	}

	public static void main (String[]args) throws IOException, InterruptedException
	{
		int opcion=0;
		Character posicionColumna=' ';
		Integer posicionFila;
		int fila=0;
		int columna=0;
		int contadorPortaaviones;
		int contadorDestructor;
		int contadorSubmarino;
		int contadorLancha;
		int contadorBarcosPuestos;
		int contadorBarcosDestruidosJugador1;
		int contadorBarcosDestruidosJugador2;
		int contadorSubmarinoTocado;
		int contadorDestructorTocado;
		int contadorPortaavionesTocado;
		int contadorSubmarinoTocadoJ2;
		int contadorDestructorTocadoJ2;
		int contadorPortaavionesTocadoJ2;
		String posicion=" ";
		String nombreBarco=" ";
		Tablero tableroJugador1=new Tablero(new int[10][10]);
		Tablero tableroJugador2=new Tablero(new int[10][10]);
		Tablero backupJugador1=new Tablero(new int[10][10]);
		Tablero backupJugador2=new Tablero(new int[10][10]);
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
			lancha=new Barco(new int[1]," "," ");
			lancha2=new Barco(new int[1]," "," ");
			portaaviones=new Barco(new int[4]," "," ");
			destructor=new Barco(new int[3]," "," ");
			submarino=new Barco(new int[2]," "," ");
			lanchaJugador2=new Barco(new int[1]," "," ");
			lancha2Jugador2=new Barco(new int[1]," "," ");
			portaavionesJugador2=new Barco(new int[4]," "," ");
			destructorJugador2=new Barco(new int[3]," "," ");
			submarinoJugador2=new Barco(new int[2]," "," ");
		}catch(FlotaExcepcion mensaje)
		{
			System.out.println(mensaje);
		}
		Jugador jugador1=new Jugador("Default");
		Jugador jugador2=new Jugador("Default");
		Scanner teclado=new Scanner(System.in);
		InputStreamReader corriente=new InputStreamReader(System.in);
		BufferedReader tecladoString=new BufferedReader(corriente);
		//Presentar menú y leer y validar opcion
		do
		{
			presentarMenuInicial();
			try
			{
				opcion=teclado.nextInt();
			}catch(InputMismatchException mensaje)
			{
				System.out.println("No te la juegues e introduce un numero anda.");
				opcion=-1;//Le damos a opción un valor inválido para que podamos introducir un nuevo número
				teclado=new Scanner(System.in); //Instancio nuevamente la clase, ya que si no lo hacemos seguirá intentando obtener el valor de el elemento capturado, lo que puede ocasionar una nueva InputMismatchException no manejada.
			}
		}while(opcion>1||opcion<0);
		//Fin presentar menu y leer y validar opcion
		//Mientras la opcion!=0**
		while(opcion!=0)
		{	//Leer nombre jugador1
			System.out.println("Introduzca el nombre del Jugador 1: ");
			jugador1.setNombre(tecladoString.readLine());
			//Fin leer nombre jugador1
			//Leer nombre jugador2
			System.out.println("Introduzca el nombre del Jugador 2: ");
			jugador2.setNombre(tecladoString.readLine());
			//Fin leer nombre jugador2
			System.out.println("Bienvenidos "+jugador1.getNombre()+" y "+jugador2.getNombre()+", antes de nada elige que barcos quieres colocar "+jugador1.getNombre());
			contadorPortaaviones=1;//Actualizamos los contador
			contadorDestructor=1;
			contadorSubmarino=1;
			contadorLancha=2;
			contadorBarcosPuestos=0;
			contadorBarcosDestruidosJugador1=0;
			contadorBarcosDestruidosJugador2=0;
			contadorSubmarinoTocado=0;
			contadorDestructorTocado=0;
			contadorPortaavionesTocado=0;
			contadorSubmarinoTocadoJ2=0;
			contadorDestructorTocadoJ2=0;
			contadorPortaavionesTocadoJ2=0; //ponerlos como atributo a jugador*
			//Mientras el jugador 1 tenga menos de 5 barcos puestos
			while(contadorBarcosPuestos<5)
			{
				//Leer y validar nombre del barco **cambiar por menu
				do
				{	
					
					System.out.println("Dispones de: ");
					System.out.println(contadorPortaaviones+" Portaaviones, 4 casillas");
					System.out.println(contadorDestructor+" Destructor, 3 casillas");
					System.out.println(contadorSubmarino+" Submarino, 2 casillas");
					System.out.println(contadorLancha+" Lanchas, 1 casilla");
					nombreBarco=tecladoString.readLine().toLowerCase();
					
					if(!nombreBarco.equals("portaaviones")&&!nombreBarco.equals("destructor")&&!nombreBarco.equals("submarino")&&!nombreBarco.equals("lancha"))
					{
						System.out.println("No dispones de "+nombreBarco+", escribe un nombre correcto");
					}
					if((nombreBarco.equals("portaaviones")&&contadorPortaaviones==0)||(nombreBarco.equals("destructor")&&contadorDestructor==0)||(nombreBarco.equals("submarino")&&contadorSubmarino==0)||(nombreBarco.equals("lancha")&&contadorLancha==0))
					{
						System.out.println("No te queda/n "+nombreBarco+", elige alguno disponible");
					}
				}while(!nombreBarco.equals("portaaviones")&&!nombreBarco.equals("destructor")&&!nombreBarco.equals("submarino")&&!nombreBarco.equals("lancha")||((nombreBarco.equals("portaaviones")&&contadorPortaaviones==0)||(nombreBarco.equals("destructor")&&contadorDestructor==0)||(nombreBarco.equals("submarino")&&contadorSubmarino==0)||(nombreBarco.equals("lancha")&&contadorLancha==0)));	
				//Fin_Leer y validar nombre del barco
				//Según nombre del barco
				switch (nombreBarco)
				{	//Caso: Portaaviones
					case "portaaviones":
					
						System.out.println("Elige donde quieres colocar el portaaviones");
						//Imprimir tablero
						tableroJugador1.imprimirTablero();
						//Fin imprimir tablero
						//Configurar posicion y direccion
						GestoraHundirFlota.configBarcos(portaaviones);
						//Fin_Configurar posicion y direccion
						//Elegir casilla del barco
						GestoraHundirFlota.elegirCasilla(portaaviones, tableroJugador1, nombreBarco);
						//Fin elegir casilla del barco
						//Imprimir tablero
						tableroJugador1.imprimirTablero();
						//Fin imprimir tablero
						contadorPortaaviones--;
						contadorBarcosPuestos++;
					break;
					//Caso: destructor
					case "destructor":
						System.out.println("Elige donde quieres colocar el destructor");
						//Imprimir tablero
						tableroJugador1.imprimirTablero();
						//Fin Imprimir tablero
						//Configurar posicion y direccion
						GestoraHundirFlota.configBarcos(destructor);
						//Fin Configurar posicion y direccion
						//Elegir casilla del barco
						GestoraHundirFlota.elegirCasilla(destructor, tableroJugador1, nombreBarco);
						//Fin elegir casilla del barco
						//Imprimir tablero
						tableroJugador1.imprimirTablero();
						//Fin Imprimir tablero
						contadorDestructor--;
						contadorBarcosPuestos++;
					break;
					//Caso: submarino
					case "submarino":
						System.out.println("Elige donde quieres colocar el submarino");
						//Imprimir tablero
						tableroJugador1.imprimirTablero();
						//Fin Imprimir tablero
						//Configurar posicion y direccion
						GestoraHundirFlota.configBarcos(submarino);
						//Fin_Configurar posicion y direccion
						//Elegir casilla del barco
						GestoraHundirFlota.elegirCasilla(submarino, tableroJugador1, nombreBarco);
						//Fin elegir casilla del barco
						//Imprimir tablero
						tableroJugador1.imprimirTablero();
						//Fin imprimir tablero
						contadorSubmarino--;
						contadorBarcosPuestos++;
					break;
					//Caso: lancha
					case "lancha":
						System.out.println("Elige donde quieres colocar la lancha");
						//Imprimir tablero
						tableroJugador1.imprimirTablero();
						//Imprimir tablero
						//SI tiene dos lanchas
						if(contadorLancha==2)
						{	
								//Elegir casilla del barco
								GestoraHundirFlota.elegirCasilla(lancha, tableroJugador1, nombreBarco);
								//Fin elegir casilla del barco
								//Imprimir tablero
								tableroJugador1.imprimirTablero();
								//Fin imprimir tablero
								contadorLancha--;
								contadorBarcosPuestos++;
						}
						//Fin_SI
						//SINO
						else
						{	
								//Elegir casilla del barco
								GestoraHundirFlota.elegirCasilla(lancha2, tableroJugador1, nombreBarco);
								//Fin_elegir casilla del barco
								//Imprimir tablero
								tableroJugador1.imprimirTablero();
								//Imprimir tablero
								contadorLancha--;
								contadorBarcosPuestos++;
						}
						//Fin_SINO
					break;
				} //Fin_Según
			}
			//Fin_Mientras
			Thread.sleep(750);
			//Imprimir ventana de espera
			ventanaEspera();
			//Fin_Imprimir ventana de espera
			System.out.println("Turno para "+jugador2.getNombre()+", elige que barco quieres colocar");
			contadorBarcosPuestos=0; //Actualizamos los contadores de los barcos
			contadorPortaaviones=1;
			contadorDestructor=1;
			contadorSubmarino=1;
			contadorLancha=2;
			//Mientras el jugador2 haya puesto menos de 5 barcos
			while(contadorBarcosPuestos<5)
			{	//Leer y validar nombre del barco
				do
				{	
					
					System.out.println("Dispones de: ");
					System.out.println(contadorPortaaviones+" Portaaviones, 4 casillas");
					System.out.println(contadorDestructor+" Destructor, 3 casillas");
					System.out.println(contadorSubmarino+" Submarino, 2 casillas");
					System.out.println(contadorLancha+" Lanchas, 1 casilla");
					nombreBarco=tecladoString.readLine().toLowerCase();
					
					if(!nombreBarco.equals("portaaviones")&&!nombreBarco.equals("destructor")&&!nombreBarco.equals("submarino")&&!nombreBarco.equals("lancha"))
					{
						System.out.println("No dispones de "+nombreBarco+", escribe un nombre correcto");
					}
					if((nombreBarco.equals("portaaviones")&&contadorPortaaviones==0)||(nombreBarco.equals("destructor")&&contadorDestructor==0)||(nombreBarco.equals("submarino")&&contadorSubmarino==0)||(nombreBarco.equals("lancha")&&contadorLancha==0))
					{
						System.out.println("No te queda/n "+nombreBarco+", elige alguno disponible");
					}
				}while(!nombreBarco.equals("portaaviones")&&!nombreBarco.equals("destructor")&&!nombreBarco.equals("submarino")&&!nombreBarco.equals("lancha")||((nombreBarco.equals("portaaviones")&&contadorPortaaviones==0)||(nombreBarco.equals("destructor")&&contadorDestructor==0)||(nombreBarco.equals("submarino")&&contadorSubmarino==0)||(nombreBarco.equals("lancha")&&contadorLancha==0)));	
				//Fin leer y validar nombre del barco
				//Según(nombre del barco)
				switch (nombreBarco)
				{	//Caso:Portaaviones
					case "portaaviones":
						System.out.println("Elige donde quieres colocar el portaaviones");
						//Imprimir tablero
						tableroJugador2.imprimirTablero();
						//Fin_Imprimir tablero
						//Configurar posicion y direccion
						GestoraHundirFlota.configBarcos(portaavionesJugador2);
						//Fin_Configurar posicion y direccion
						//Elegir casilla del barco
						GestoraHundirFlota.elegirCasilla(portaavionesJugador2, tableroJugador2, nombreBarco);
						//Fin_Elegir casilla del barco
						//Imprimir tablero
						tableroJugador2.imprimirTablero();
						//Fin_Imprimir tablero
						contadorPortaaviones--;
						contadorBarcosPuestos++;
					break;
					//CAso: destructor
					case "destructor":
						System.out.println("Elige donde quieres colocar el destructor");
						//Imprimir tablero
						tableroJugador2.imprimirTablero();
						//Fin_Imprimir tablero
						//Configurar posicion y direccion
						GestoraHundirFlota.configBarcos(destructorJugador2);
						//Fin_Configurar posicion y direccion
						//Elegir casilla del barco
						GestoraHundirFlota.elegirCasilla(destructorJugador2, tableroJugador2, nombreBarco);
						//Fin_Elegir casilla del barco
						//Imprimir tablero
						tableroJugador2.imprimirTablero();
						//Fin_Imprimir tablero
						contadorDestructor--;
						contadorBarcosPuestos++;
					break;
					//CAso:Submarino
					case "submarino":
						System.out.println("Elige donde quieres colocar el portaaviones");
						//Imprimir tablero
						tableroJugador2.imprimirTablero();
						//Fin_imprimir tablero
						//Configurar posicion y direccion
						GestoraHundirFlota.configBarcos(submarinoJugador2);
						//Fin configurar posicion y direccion
						//Elegir casilla del barco
						GestoraHundirFlota.elegirCasilla(submarinoJugador2, tableroJugador2, nombreBarco);
						//Fin_Elegir casilla del barco
						tableroJugador2.imprimirTablero();
						contadorSubmarino--;
						contadorBarcosPuestos++;
					break;
					case "lancha":
						System.out.println("Elige donde quieres colocar la lancha");
						//Imprimir tablero
						tableroJugador2.imprimirTablero();
						//Fin imprimir tablero
						//SI tiene 2 lanchas
						if(contadorLancha==2)
						{	
								//elegir casilla del barco
								GestoraHundirFlota.elegirCasilla(lanchaJugador2, tableroJugador2, nombreBarco);
								//Fin elegir casilla del barco
								//Imprimir tablero
								tableroJugador2.imprimirTablero();
								//Fin imprimir tablero
								contadorLancha--;
								contadorBarcosPuestos++;
						}
						//Fin_SI
						//SINO
						else
						{
								//Elegir casilla del barco
								GestoraHundirFlota.elegirCasilla(lancha2Jugador2, tableroJugador2, nombreBarco);
								//Fin elegir casilla del barco
								//Imprimir tablero
								tableroJugador2.imprimirTablero();
								//Fin imprimir tablero
								contadorLancha--;
								contadorBarcosPuestos++;
						}
						//Fin_SINO
					break;
				}//Fin_Segun
			}//Fin_Mientras
			Thread.sleep(750);
			//Imprimir ventana de espera
			ventanaEspera();	
			//Imprimir ventana de espera
			//Mientras el jugador1 no haya destruido 5 barcos y el jugador2 no haya destruido 5 barcos
			while(contadorBarcosDestruidosJugador1<5&&contadorBarcosDestruidosJugador2<5)
			{
				Thread.sleep(1000);
				//Imprimir backup
				backupJugador1.imprimirBackup();
				//Fin_Imprimir backup
				//Imprimir tablero
				tableroJugador1.imprimirTablero();
				//Fin_Imprimir tablero
				
				System.out.println("Turno para "+jugador1.getNombre());
				System.out.println("Elige la casilla donde creas que hay un barco. A a la J para columnas y 1 al 10 para filas");
				//Leer y validar casilla
				posicion=GestoraHundirFlota.leerCasilla();
				//Fin leer y validar casilla
				String[]partes2=posicion.split(",");
				posicionColumna=partes2[0].charAt(0);
				posicionFila=Integer.valueOf(partes2[1]);
				columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
				fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
				//Verificar si ha tocado algun barco
				if(tableroJugador2.getTablero()[fila][columna]==1||tableroJugador2.getTablero()[fila][columna]==2||tableroJugador2.getTablero()[fila][columna]==3||tableroJugador2.getTablero()[fila][columna]==4)
				{
					if(tableroJugador2.getTablero()[fila][columna]==1)
					{
						System.out.println("Tocado y hundido! Has hundido una lancha");
						tableroJugador2.getTablero()[fila][columna]=0;
						backupJugador1.getTablero()[fila][columna]=5;
						contadorBarcosDestruidosJugador1++;
					}
					if(tableroJugador2.getTablero()[fila][columna]==2)
					{
						if(contadorSubmarinoTocado<1)
						{
							System.out.println("Tocado!");
							tableroJugador2.getTablero()[fila][columna]=0;
							backupJugador1.getTablero()[fila][columna]=5;
							contadorSubmarinoTocado++;
						}
						else
						{
							System.out.println("Tocado y hundido! Has hundido un submarino");
							tableroJugador2.getTablero()[fila][columna]=0;
							backupJugador1.getTablero()[fila][columna]=5;
							contadorBarcosDestruidosJugador1++;
						}
					}
					if(tableroJugador2.getTablero()[fila][columna]==3)
					{
						if(contadorDestructorTocado<2)
						{
							System.out.println("Tocado!");
							tableroJugador2.getTablero()[fila][columna]=0;
							backupJugador1.getTablero()[fila][columna]=5;
							contadorDestructorTocado++;
						}
						else
						{
							System.out.println("Tocado y hundido! Has hundido un destructor");
							tableroJugador2.getTablero()[fila][columna]=0;
							backupJugador1.getTablero()[fila][columna]=5;
							contadorBarcosDestruidosJugador1++;
						}
					}
					if(tableroJugador2.getTablero()[fila][columna]==4)
					{
						if(contadorPortaavionesTocado<3)
						{
							System.out.println("Tocado!");
							tableroJugador2.getTablero()[fila][columna]=0;
							backupJugador1.getTablero()[fila][columna]=5;
							contadorPortaavionesTocado++;
						}
						else
						{
							System.out.println("Tocado y hundido! Has hundido un portaaviones");
							tableroJugador2.getTablero()[fila][columna]=0;
							backupJugador1.getTablero()[fila][columna]=5;
							contadorBarcosDestruidosJugador1++;
						}
					}
					
				}
				else
				{
					System.out.println("Agua! Una pena...");
					backupJugador1.getTablero()[fila][columna]=6;
				}
				//Fin verificar si ha tocado algun barco
				
					
				Thread.sleep(1000);
				//Imprimir backup jugador2
				backupJugador2.imprimirBackup();
				//Fin imprimir backup jugador2
				//Imprimir tablero
				tableroJugador2.imprimirTablero();
				//Fin imprimir tablero
				System.out.println("Turno para "+jugador2.getNombre());
				System.out.println("Elige la casilla donde creas que hay un barco. A a la J para columnas y 1 al 10 para filas");
				//Leer y validar casilla
				posicion=GestoraHundirFlota.leerCasilla();
				//Fin leer y validar casilla
				String[]partes=posicion.split(",");
				posicionColumna=partes[0].charAt(0);
				posicionFila=Integer.valueOf(partes[1]);
				columna=GestoraHundirFlota.ConversorCharInt(posicionColumna);
				fila=GestoraHundirFlota.conversorIntPosicion(posicionFila);
				//Verificar si ha tocado algun barco	
				if(tableroJugador1.getTablero()[fila][columna]==1||tableroJugador1.getTablero()[fila][columna]==2||tableroJugador1.getTablero()[fila][columna]==3||tableroJugador1.getTablero()[fila][columna]==4)
				{
					if(tableroJugador1.getTablero()[fila][columna]==1)
					{
						System.out.println("Tocado y hundido! Has hundido una lancha");
						tableroJugador1.getTablero()[fila][columna]=0;
						backupJugador2.getTablero()[fila][columna]=5;
						contadorBarcosDestruidosJugador2++;
					}
					if(tableroJugador1.getTablero()[fila][columna]==2)
					{
						if(contadorSubmarinoTocadoJ2<1)
						{
							System.out.println("Tocado!");
							tableroJugador1.getTablero()[fila][columna]=0;
							backupJugador2.getTablero()[fila][columna]=5;
							contadorSubmarinoTocadoJ2++;
						}
						else
						{
							System.out.println("Tocado y hundido! Has hundido un submarino");
							tableroJugador1.getTablero()[fila][columna]=0;
							backupJugador2.getTablero()[fila][columna]=5;
							contadorBarcosDestruidosJugador2++;
						}
					}
					if(tableroJugador1.getTablero()[fila][columna]==3)
					{
						if(contadorDestructorTocadoJ2<2)
						{
							System.out.println("Tocado!");
							tableroJugador1.getTablero()[fila][columna]=0;
							backupJugador2.getTablero()[fila][columna]=5;
							contadorDestructorTocadoJ2++;
						}
						else
						{
							System.out.println("Tocado y hundido! Has hundido un destructor");
							tableroJugador1.getTablero()[fila][columna]=0;
							backupJugador2.getTablero()[fila][columna]=5;
							contadorBarcosDestruidosJugador2++;
						}
					}
					if(tableroJugador1.getTablero()[fila][columna]==4)
					{
						if(contadorPortaavionesTocadoJ2<3)
						{
							System.out.println("Tocado!");
							tableroJugador1.getTablero()[fila][columna]=0;
							backupJugador2.getTablero()[fila][columna]=5;
							contadorPortaavionesTocadoJ2++;
						}
						else
						{
							System.out.println("Tocado y hundido! Has hundido un portaaviones");
							tableroJugador1.getTablero()[fila][columna]=0;
							backupJugador2.getTablero()[fila][columna]=5;
							contadorBarcosDestruidosJugador2++;
						}
					}
				}
				else
				{
					System.out.println("Agua! Una pena...");
					backupJugador2.getTablero()[fila][columna]=6;
				}
				//Fin verificar si ha tocado algun barco
				Thread.sleep(750);
			}//Fin_Mientras
			//Comprobar e imprimir ganador
			GestoraHundirFlota.comprobarGanador(contadorBarcosDestruidosJugador1, contadorBarcosDestruidosJugador2, jugador1, jugador2);
			//Fin Comprobar e imprimir ganador
			//Presentar menu y elegir y validar reiniciar
			do
			{
				presentarMenuInicial();
				try
				{
					opcion=teclado.nextInt();
				}catch(InputMismatchException mensaje)
				{
					System.out.println("No te la juegues e introduce un numero anda.");
					opcion=-1;//Le damos a opción un valor inválido para que podamos introducir un nuevo número
					teclado=new Scanner(System.in); //Instancio nuevamente la clase, ya que si no lo hacemos seguirá intentando obtener el valor de el elemento capturado, lo que puede ocasionar una nueva InputMismatchException no manejada.
				}
			}while(opcion>1||opcion<0);
			//Fin presentar menu y elegir y validar reiniciar
			
		}//Fin_Mientras
	}//FIN
}

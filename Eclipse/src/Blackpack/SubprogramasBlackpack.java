/*
 * SUBPROGRAMAS BLACKPACK
 * AUTORES: LUIS GUTIÉRREZ Y PABLO JARANA
 */


public class SubprogramasBlackpack {
	
/*
 * Estudio del método
 * 
 * Necesidades: Un número
 * Devoluciones: Un valor booleano
 * N/D: No hay
 * Restricciones: No hay
 * 
 * Interfaz
 * 
 * Este subprograma valida la apuesta realizada
 * Prototipo: public static boolean validarApuesta(int apuesta)
 * Precondiciones: No hay
 * Entrada: Un número
 * Salida: Un valor booleano
 * Postcondiciones: True si la apuesta es valida y false si no lo es, asociado al nombre
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean validarApuesta(int apuesta)
 * {
 *		return false;
 * }
 */
	public static boolean validarApuesta(int apuesta, Jugador x1)
	{
		boolean esValida=false;
		
		if(apuesta>0&&apuesta<=200&&apuesta%5==0 && apuesta<=x1.getDinero())
		{
			esValida=true;
		}
		return esValida;
	}	
/*
 * Estudio
 * 
 * Necesidades: Nada
 * Devoluciones: Nada
 * Restricciones No hay
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa presenta el menú principal
 * Prototipo: void presentarMenu();
 * Precondiciones: No hay
 * Entradas: No hay
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void presentarMenu()
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */
 public static void presentarMenu()
 {

			System.out.println("Elija una opci\u00f3n: \n");
			System.out.println("1: Empezar juego");
			System.out.println("0: Salir");
	}
	

/*
 * Estudio
 * 
 * Necesidades: Un número
 * Devoluciones: Un valor booleano
 * N/D: No hay
 * Restricciones: No hay
 * 
 * Interfaz
 * 
 * Este subprograma valida la opción del menú
 * Prototipo: public static boolean opcionValida(int opcion)
 * Precondiciones: No hay
 * Entradas: Un número
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valida y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean opcionValida(int opcion)
 * {
 * 		return false;
 * }
 */
 public static boolean opcionValida(int opcion)
 {
	boolean esValida=false;
	
	if(opcion>=0&&opcion<=1)
	{
		esValida=true;
	}
	return esValida;
}
/*
 * Estudio
 * 
 * Necesidades: Nada
 * Devoluciones: Nada
 * Restricciones No hay
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa presenta el menú de cada turno
 * Prototipo: void presentarMenuTurno();
 * Precondiciones: No hay
 * Entradas: No hay
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void presentarMenuTurno()
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */
 public static void presentarMenuTurno()
 {
					System.out.println("1: Pedir otra carta");
					System.out.println("2: Dividir la mano");
					System.out.println("3: Doblar apuesta");
					System.out.println("4: Plantarse");
					System.out.println("5: Consultar dinero restante");
					System.out.println("6: Consultar mano actual");
					System.out.println("7: Consultar mano del crupier");

}
/*
 * Estudio
 * 
 * Necesidades: Un número
 * Devoluciones: Un valor booleano
 * N/D: No hay
 * Restricciones: No hay
 * 
 * Interfaz
 * 
 * Este subprograma valida la opción del menú de Turno
 * Prototipo: public static boolean opcionValidaTurno(int opcionTurno)
 * Precondiciones: No hay
 * Entradas: Un número
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valida y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean opcionValida(int opcionTurno)
 * {
 * 		return false;
 * }
 */
	 public static boolean opcionValidaTurno(int opcionTurno)
	 {
		boolean esValida=false;
		
		if(opcionTurno>=1&&opcionTurno<=7)
		{
			esValida=true;
		}
		return esValida;
	}
/*
 * Estudio
 * 
 * Necesidades: Nada
 * Devoluciones: Nada
 * Restricciones No hay
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa presenta el menú tras pedir una carta
 * Prototipo: void presentarMenuCarta();
 * Precondiciones: No hay
 * Entradas: No hay
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void presentarMenuCarta()
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */
	public static void presentarMenuCarta()
	{
		System.out.println("Pedir otra carta?");
		System.out.println("1: Pedir carta");
		System.out.println("4: Plantarse");

	}
/*
 * Estudio
 * 
 * Necesidades: Un número
 * Devoluciones: Un valor booleano
 * N/D: No hay
 * Restricciones: No hay
 * 
 * Interfaz
 * 
 * Este subprograma valida la opción del menú de pedir Carta
 * Prototipo: public static boolean opcionValidaCarta(int opcion)
 * Precondiciones: No hay
 * Entradas: Un número
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valida y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean opcionValidaCarta(int opcion)
 * {
 * 		return false;
 * }
 */
	public static boolean opcionValidaCarta(int opcion)
	 {
		boolean esValida=false;
		
		if(opcion==1||(opcion==4))
		{
			esValida=true;
		}
		return esValida;
	}
/*
 * Estudio
 * 
 * Necesidades: Nada
 * Devoluciones: Nada
 * Restricciones No hay
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa presenta el menú tras dividir la mano
 * Prototipo: void presentarMenuDividirMano();
 * Precondiciones: No hay
 * Entradas: No hay
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void presentarMenuDividirMano()
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */
	public static void presentarMenuDividirMano()
	{
		System.out.println("1: Pedir carta");
		System.out.println("3: Doblar");
		System.out.println("4: Plantarse");
		System.out.println("5: Consultar dinero restante");
		System.out.println("6: Consultar mano actual");
		System.out.println("7: Consultar mano del crupier");
	}
/*
 * Estudio
 * 
 * Necesidades: Un número
 * Devoluciones: Un valor booleano
 * N/D: No hay
 * Restricciones: No hay
 * 
 * Interfaz
 * 
 * Este subprograma valida la opción del menú de Dividir Mano
 * Prototipo: public static boolean opcionValidaDividirMano(int opcion)
 * Precondiciones: No hay
 * Entradas: Un número
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valida y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean opcionValidaDividirMano(int opcion)
 * {
 * 		return false;
 * }
 */
	public static boolean opcionValidaDividirMano(int opcion)
	 {
		boolean esValida=false;
		
		if(opcion==1||(opcion>=3&&opcion<=7))
		{
			esValida=true;
		}
		return esValida;
	}
/*
 * Estudio
 * 
 * Necesidades: Nada
 * Devoluciones: Nada
 * Restricciones No hay
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa presenta el menú tras dividir la mano
 * Prototipo: void imprimirGameOver();
 * Precondiciones: No hay
 * Entradas: No hay
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void imprimirGameOver()
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */
	public static void imprimirGameOver()
	{
		System.out.println("Te has quedado sin dinero!");
		System.out.println("..######......###....##.....##.########......#######..##.....##.########.########.");
		System.out.println(".##....##....##.##...###...###.##...........##.....##.##.....##.##.......##.....##");
		System.out.println(".##.........##...##..####.####.##...........##.....##.##.....##.##.......##.....##");
		System.out.println(".##...####.##.....##.##.###.##.######.......##.....##.##.....##.######...########.");
		System.out.println(".##....##..#########.##.....##.##...........##.....##..##...##..##.......##...##..");
		System.out.println(".##....##..##.....##.##.....##.##...........##.....##...##.##...##.......##....##.");
		System.out.println("..######...##.....##.##.....##.########......#######.....###....########.##.....##");
	}
/*
 * Estudio
 * 
 * Necesidades: Jugador jugador, entero apuestas realizadas
 * Devoluciones: Nada
 * Restricciones No hay
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa imprime el dinero disponible
 * Prototipo: void consultarDinero(Jugador x1, int apuesta1, int apuesta2);
 * Precondiciones: No hay
 * Entradas: Jugador x1, int apuesta1, int apuesta2
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void consultarDinero(Jugador x1, int apuesta1, int apuesta2)
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */

	public static void consultarDinero(Jugador x1, int apuesta1, int apuesta2)
	{
		System.out.println("Actualmente dispones de "+(x1.getDinero()-apuesta1-apuesta2)+" euros, y tienes en curso una apuesta de "+(apuesta1+apuesta2)+" euros");
	}
/*
 * Estudio
 * 
 * Necesidades: Todos los valores de las cartas
 * Devoluciones: Nada
 * Restricciones Que haya cartas en la mano
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa imprime el valor de la mano actual
 * Prototipo: void verManoActual();
 * Precondiciones: Que hayan cartas en la mano
 * Entradas: Todos los valores de las cartas
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void verManoActual(Carta carta1Jugador, Carta carta2Jugador, Carta carta3Jugador,Carta carta4Jugador,Carta carta5Jugador,Carta carta6Jugador)
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */
	public static void verManoActual(
		Carta carta1Jugador, 
		Carta carta2Jugador, 
		Carta carta3Jugador,
		Carta carta4Jugador,
		Carta carta5Jugador,
		Carta carta6Jugador)
	{
		int valorTotal=0;
		valorTotal=SubprogramasBlackpackLuis.validarAS(carta1Jugador,carta2Jugador,carta3Jugador,carta4Jugador,carta5Jugador,carta6Jugador);
		carta1Jugador.imprimirCarta();
		carta2Jugador.imprimirCarta();
		carta3Jugador.imprimirCarta();
		carta4Jugador.imprimirCarta();
		carta5Jugador.imprimirCarta();
		carta6Jugador.imprimirCarta();
		
		System.out.println("El valor de tu mano es "+valorTotal);
	}
/*
 * Estudio
 * 
 * Necesidades: Todos los valores de las cartas
 * Devoluciones: Nada
 * Restricciones Que haya cartas en la mano
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa imprime el valor de las dos manos
 * Prototipo: void verManoDividida();
 * Precondiciones: Que hayan cartas en la mano
 * Entradas: Todos los valores de las cartas
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void verManoDividida(Carta carta1Jugador1,Carta carta2Jugador1,Carta carta3Jugador1,Carta carta4Jugador1,Carta carta5Jugador1,Carta carta6Jugador1,Carta carta1Jugador2, Carta carta2Jugador2, Carta carta3Jugador2,Carta carta4Jugador2,Carta carta5Jugador2,Carta carta6Jugador2)
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */
	public static void verManoDividida(
		Carta carta1Jugador1,
		Carta carta2Jugador1,
		Carta carta3Jugador1,
		Carta carta4Jugador1,
		Carta carta5Jugador1,
		Carta carta6Jugador1,
		Carta carta1Jugador2, 
		Carta carta2Jugador2, 
		Carta carta3Jugador2,
		Carta carta4Jugador2,
		Carta carta5Jugador2,
		Carta carta6Jugador2)
	{
		int valorTotalMano1=0;
		int valorTotalMano2=0;
		valorTotalMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador1,carta2Jugador1,carta3Jugador1,carta4Jugador1,carta5Jugador1,carta6Jugador1);
		valorTotalMano2=SubprogramasBlackpackLuis.validarAS(carta1Jugador2,carta2Jugador2,carta3Jugador2,carta4Jugador2,carta5Jugador2,carta6Jugador2);
		carta1Jugador1.imprimirCarta();
		carta2Jugador1.imprimirCarta();
		carta3Jugador1.imprimirCarta();
		carta4Jugador1.imprimirCarta();
		carta5Jugador1.imprimirCarta();
		carta6Jugador1.imprimirCarta();
		System.out.println("El valor de tu mano 1 es "+valorTotalMano1);
		carta1Jugador2.imprimirCarta();
		carta2Jugador2.imprimirCarta();
		carta3Jugador2.imprimirCarta();
		carta4Jugador2.imprimirCarta();
		carta5Jugador2.imprimirCarta();
		carta6Jugador2.imprimirCarta();
		System.out.println("El valor de tu mano 2 es "+valorTotalMano2);
		
	}
/*
 * Estudio
 * 
 * Necesidades: Todos los valores de las cartas del crupier
 * Devoluciones: Nada
 * Restricciones Que haya cartas en la mano
 * N/D: No hay
 * 
 * Interfaz
 * 
 * Este programa imprime el valor de la mano actual
 * Prototipo: void verManoActualCrupier();
 * Precondiciones: Que hayan cartas en la mano
 * Entradas: Todos los valores de las cartas
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void verManoActualCrupier(Carta carta1Crupier,Carta carta2Crupier,Carta carta3Crupier,Carta carta4Crupier,Carta carta5Crupier,Carta carta6Crupier)
 * {
 *		System.out.println("Esto es una prueba");
 * }
 */
	public static void verManoActualCrupier(
		Carta carta1Crupier,
		Carta carta2Crupier,
		Carta carta3Crupier,
		Carta carta4Crupier,
		Carta carta5Crupier,
		Carta carta6Crupier)
	{
		int valorTotal=0;
		valorTotal=carta1Crupier.getValor();
		carta1Crupier.imprimirCarta();
		carta2Crupier.imprimirCartaOculta();
		System.out.println("El valor de la mano del crupier es "+valorTotal);
	}
}



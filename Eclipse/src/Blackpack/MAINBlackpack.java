/*
 * Nombre del programa: Blackpack
 * Autores: Pablo Jarana y Luis Gutiérrez
 * 
 * ANALISIS 

	Descripcion:
	Este programa simula un juego de cartas (que es 100% original y no ha sido copiado de ninguno que ya existe), en el que juegas contra la banca.
	Tu principal objetivo del juego es, robando cartas que tienen un valor asignado, acercarte lo maximo posible a 21 sin pasarte de este, ya que si te pasas pierdes automaticamente.
	La banca debe hacer lo mismo, pero ella esta obligada a robar hasta que el valor de su mano es mayor o igual que 17. Una vez termina de robar, compara el valor de su mano con
	la de los jugadores. Aquellos cuya mano tenga un valor menor que la del crupier o se hayan pasado de 21 pierden, mientras que los que tengan una mano con mayor valor
	que la del crupier (sin pasarse de 21) ganan. Si el valor de ambas manos coincide, hay empate.
	El valor de las cartas es el que indica su numero, ademas del AS que puede valer 1 u 11 segun nos convenga, y las figuras que valen todas 10.
	Antes de jugar cada mano se realiza una apuesta y una vez puesta en la mesa empieza la ronda.
	El crupier (la banca) se coloca una carta bocarriba (a la vista de todos los jugadores), y otra bocabajo que no puede ver nadie, y seguidamente reparte dos cartas 
	bocarriba para cada jugador. Entonces los jugadores tienen varias opciones:
		- Pedir carta: Si la suma de los valores de la cartas que tienes en tu mano no te convencen, puedes pedir cartas de forma indefinida hasta que estes conforme o te pases
		de 21. Tras realizar esta accion no puedes hacer ninguna de las demas
		- Doblar apuesta: Si crees que tienes posibilidades altas de ganar, puedes doblar la apuesta. Tras realizar esta accion duplicaras el dinero apostado, la banca 
		te dara una carta mas y tu turno se habra acabado. No podras hacer ninguna otra accion durante esta ronda.
		- Dividir mano: Si las dos cartas iniciales son iguales, puedes dividir la mano, de forma que ambas cartas se separan para formar 2 manos y se repartira una carta 
		para cada una de esas manos. Estas se trataran por separado, como manos normales, pudiendo realizar tanto la accion de pedir carta tantas veces como se desee como 
		doblando la apuesta (no podra volver a dividir una mano ya dividida aunque tenga ambas cartas iguales). Debe tener en cuenta que al dividir la mano, 
		se asignara la cantidad apostada incialmente a cada una de las manos.
		- Plantarse: Si estas conforme con las 2 cartas iniciales, puedes plantarte y no realizar ninguna accion.
		*Si las dos cartas iniciales de un jugador son un AS (11) y una figura (10), habra hecho un blackjack, y, si la banca consigue un 21, se recompensara al jugador
		con un 50% mas de la apuesta realizada.
	Una vez terminado el turno de todos los jugadores, el crupier dara la vuelta a la carta que permanecia bocabajo y si la suma de las 2 es menor que 17, comenzara a robar
	cartas hasta que sea mayor.

	Entradas:
	Nombre del jugador - String
	apuesta 1 del jugador - entero
	opcion de menu - entero
	opcion de turno - entero
	opcion de menu de carta - entero
	confirmar seguir - caracter

	Salidas:
	Imprimir por pantalla informacion sobre el juego
	Imprimir por pantalla mensajes de error
	Imprimir por pantalla el valor de las manos de los jugadores y del crupier

	Restricciones:
	La cantidad apostada debe ser un numero multiplo de 5 y su valor maximo es 200 euros.
	La opcion de menu debe estar entre 0 y 1
	La opcion de menu de turno debe estar entre 1 y 7
	La opcion de menu de carta debe ser 1 o 4

 * Pseudocódigo generalizado
 * Inicio
 * 		Mientras quiera iniciar
 * 			Presentar menu , leer y validar opcion
 * 			Segun(opcion)
 * 				Para opcion==1
 * 					BlackPack
 * 			Fin_Segun
 * 			Leer y validar reiniciar
 * 		Fin_Mientras
 * 	Fin
 * 
 * 	MÓDULO BLACKPACK
 * 
 * 	Inicio
 * 		Leer nombre
 * 		Repetir mientras quiera seguir jugando y su dinero no sea igual o menor que 0
 * 			Leer y validar apuesta
 * 			Generar e imprimir primera carta del Crupier y otra oculta
 * 			Calcular valor de la mano del Crupier e imprimirlo
 * 			Generar e imprimir cartas Jugador
 * 			Calcular valor de la mano del Jugador e imprimirlo
 * 			SI haces Blackpack
 * 				Imprimir Blackpack
 * 			SINO 
 * 				Mientras el valor de las manos sea menor o igual que 21 y no se quiera plantar
 * 					Presentar MenuTurno y elegir y validar opción
 * 					Según opción
 * 							Para opcion==1
 * 									Pedir otra carta
 * 							Para opcion==2
 * 									Dividir mano
 * 							Para opcion==3
 * 									Doblar apuesta
 * 							Para opcion==4
 * 									Plantarse
 * 							Para opcion==5
 * 									Imprimir dinero restante
 * 							Para opcion==6
 * 									Imprimir cartas y valor de la mano del jugador
 * 							Para opcion==7
 * 									Imprimir cartas y valor de la mano del Crupier
 * 					Fin_Segun
 * 			Fin_SI
 * 
 * 			Imprimir segunda carta del Crupier
 * 			Calcular valor total de la mano del Crupier
 * 			Mientras el valor de la mano del Crupier sea menor que 17
 * 				Generar e imprimir cartas y calcular el valor de la mano del Crupier
 * 			Fin_Mientras
 * 			Imprimir el valor total de la mano del Crupier
 * 			Calcular mano ganadora
 * 			Imprimir ganador final
 * 			Calcular dinero resultante
 * 			Imprimir dinero total
 * 			SI Dinero es igual o menor que 0
 * 				Imprimir GAMEOVER
 * 			SINO
 * 				Leer y validar seguir jugando
 * 			Fin_SI
 * 		Mientras quiera seguir jugando y su dinero no sea igual o menor que 0
 * 	
 * 
 * MÓDULO PEDIR OTRA CARTA
 * 
 * 	Inicio
 * 		Mientras el valor de la mano sea menor o igual a 21 y no se quiera plantar
 * 			Generar e imprimir carta y calcular el valor de la mano del jugador
 * 			Imprimir valor de la mano del jugador
 * 			SI el valor de la mano del jugador es menor o igual a 21
 * 				Presentar Menú de pedir otra carta más, elegir y validar opción
 * 					Según(opcion)
 * 						Para opcion==1
 * 								Pedir otra carta
 * 					Fin_Segun
 * 			Fin_SI
 * 			SI opcion==4 o el valor de la mano del jugador es mayor que 21
 * 				Se planta automáticamente
 * 			Fin_SI
 * 		Fin_Mientras
 * 
 * MÓDULO DIVIDIR MANO
 * 				
 * 		
 * 							
 * 						
 * 				
 * 				
 * 				
 * 			
 * 			
 * 
 */
package Blackpack;
import java.util.*;
import java.io.*;
import java.lang.*;
public class MAINBlackpack {
	public static void main (String[] args) throws IOException{
		
		InputStreamReader corriente=new InputStreamReader(System.in);
		BufferedReader tecladoString=new BufferedReader(corriente);
		int apuesta1=0;
		int apuesta2=0; //en caso de dividir la mano, se hace otra apuesta, ya que tenemos 2 manos
		int opcion=0;
		int opcionTurno=0;
		char seguir='s';
		boolean apuestaValida=false;
		boolean opcionEsValida=false;
		boolean opcionTurnoEsValida=false;
		//Carta cartaRobada;
		int cartasMano1;
		int cartasMano2;
		int cartasManoCrupier;
		int valorMano1=0;
		int valorMano2=0;
		int valorManoCrupier=0;
		boolean plantarse=false;
		boolean crupierPierde=false;
		boolean blackpackMano1;
		boolean blackpackMano2;
		boolean manoDividida=false;
		int resultadoMano1=0;
		int resultadoMano2=0;
		Carta carta1Jugador; //carta inicial 1 del jugador
		Carta carta2Jugador; //carta inicial 2 del jugador
		Carta carta3Jugador;
		Carta carta4Jugador;
		Carta carta5Jugador;
		Carta carta6Jugador;
		Carta carta1Jugador1; //variables usadas en caso que se divida la mano del jugador
		Carta carta2Jugador1; //variables usadas en caso que se divida la mano del jugador
		Carta carta3Jugador1;
		Carta carta4Jugador1;
		Carta carta5Jugador1;
		Carta carta6Jugador1;
		Carta carta1Jugador2; //variables usadas en caso que se divida la mano del jugador
		Carta carta2Jugador2; //variables usadas en caso que se divida la mano del jugador
		Carta carta3Jugador2;
		Carta carta4Jugador2;
		Carta carta5Jugador2;
		Carta carta6Jugador2;
		Carta carta1Crupier; //carta inicial 1 del crupier
		Carta carta2Crupier; //carta inicial 2 del crupier
		Carta carta3Crupier;
		Carta carta4Crupier;
		Carta carta5Crupier;
		Carta carta6Crupier;
		
		Scanner teclado=new Scanner(System.in);
		do{
			System.out.println("Bienvenido a BlackPack!\n");
			
			do
			{
				SubprogramasBlackpack.presentarMenu();
				opcion=teclado.nextInt();
				opcionEsValida=SubprogramasBlackpack.opcionValida(opcion);
			}while(opcionEsValida==false);
			
			if(opcion!=0){
				switch(opcion)
				{
					
					case 1:
					
						System.out.println("Introduzca su nombre o un nombre de usuario por favor"); //nombre de usuario válido (?)

						Jugador x1=new Jugador();
						x1.setNombre(tecladoString.readLine());

						//System.out.println(x1.getNombre());
						do{
							//volvemos a inicializar las variables para cada jugada
							valorMano1=0;
							valorMano2=0;
							apuesta1=0;
							apuesta2=0;
							valorManoCrupier=0;
							plantarse=false;
							blackpackMano1=false;
							blackpackMano2=false;
							carta1Jugador = new Carta(); 
							carta2Jugador = new Carta(); 
							carta3Jugador = new Carta();
							carta4Jugador = new Carta();
							carta5Jugador = new Carta();
							carta6Jugador = new Carta();
							carta1Jugador1 = new Carta(); 
							carta2Jugador1 = new Carta(); 
							carta3Jugador1 = new Carta();
							carta4Jugador1 = new Carta();
							carta5Jugador1 = new Carta();
							carta6Jugador1 = new Carta(); 
							carta1Jugador2 = new Carta(); 
							carta2Jugador2 = new Carta(); 
							carta3Jugador2 = new Carta();
							carta4Jugador2 = new Carta();
							carta5Jugador2 = new Carta();
							carta6Jugador2 = new Carta();
							carta1Crupier = new Carta(); 
							carta2Crupier = new Carta(); 
							carta3Crupier = new Carta();
							carta4Crupier = new Carta();
							carta5Crupier = new Carta();
							carta6Crupier = new Carta();
							
							do
							{
								System.out.println("Introduzca el dinero que desee apostar, tenga en cuenta que dispone de "+x1.getDinero()+" euros y cantidad apostada debe ser m\u00faltiplo de 5: ");
								System.out.println("La apuesta maxima es de 200 euros");
								apuesta1=teclado.nextInt();
								apuestaValida=SubprogramasBlackpack.validarApuesta(apuesta1, x1);
							}while (apuestaValida==false);
							
							//dineroTotal=dineroInicial-apuesta1;
							//System.out.println("Tienes "+dineroTotal+" $");
							
							carta1Crupier=SubprogramasBlackpackLuis.sacarCarta();
							carta1Crupier.imprimirCarta();
							System.out.println();
							carta2Crupier=SubprogramasBlackpackLuis.sacarCarta();
							carta2Crupier.imprimirCartaOculta();
							if(carta1Crupier.getValor()==11 && carta2Crupier.getValor()==11){
								carta2Crupier.setAs1();
							}
							valorManoCrupier=carta1Crupier.getValor()+carta2Crupier.getValor();
							cartasManoCrupier=2;
							System.out.println("El valor actual de la mano del crupier es "+carta1Crupier.getValor());
							
							carta1Jugador=SubprogramasBlackpackLuis.sacarCarta();
							carta1Jugador.imprimirCarta();
							carta1Jugador.setValor(11);
							carta1Jugador.setValorImpreso(1);
							System.out.println();
							carta2Jugador=SubprogramasBlackpackLuis.sacarCarta();
							carta2Jugador.imprimirCarta();
							carta2Jugador.setValor(11);
							carta2Jugador.setValorImpreso(1);
							//if(carta1Jugador.getValor()==11 && carta2Jugador.getValor()==11){
							//	carta2Jugador.setAs1();
							//}
							//valorMano1=carta1Jugador.getValor()+carta2Jugador.getValor();
							valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador, carta2Jugador, carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
							cartasMano1=2;
							System.out.println("El valor actual de su mano es "+valorMano1);
							
							blackpackMano1=SubprogramasBlackpackLuis.comprobarBlackpack(carta1Jugador.getValorImpreso(), carta2Jugador.getValorImpreso());
							if(blackpackMano1==true){
								System.out.println("Blackpack!");
							}else{
								
								System.out.println("Indique lo que desea hacer");
								do{
									
									do
									{
										SubprogramasBlackpack.presentarMenuTurno();
										opcionTurno=teclado.nextInt();
										opcionTurnoEsValida=SubprogramasBlackpack.opcionValidaTurno(opcionTurno);
										
									}while(opcionTurnoEsValida==false);
									switch(opcionTurno)
									{
										case 1:
											do{
												//cartaRobada=SubprogramasBlackpackLuis.sacarCarta();
												if(cartasMano1==2){
													carta3Jugador=SubprogramasBlackpackLuis.sacarCarta();
													cartasMano1++;
													//System.out.println("tu carta numero "+cartasMano1+" es");
													carta3Jugador.imprimirCarta();
													valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador, carta2Jugador, carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
												}else if(cartasMano1==3){
													carta4Jugador=SubprogramasBlackpackLuis.sacarCarta();
													cartasMano1++;
													//System.out.println("tu carta numero "+cartasMano1+" es");
													carta4Jugador.imprimirCarta();
													valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador, carta2Jugador, carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
												}else if(cartasMano1==4){
													carta5Jugador=SubprogramasBlackpackLuis.sacarCarta();
													cartasMano1++;
													//System.out.println("tu carta numero "+cartasMano1+" es");
													carta5Jugador.imprimirCarta();
													valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador, carta2Jugador, carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
												}else if(cartasMano1==5){
													carta6Jugador=SubprogramasBlackpackLuis.sacarCarta();
													cartasMano1++;
													//System.out.println("tu carta numero "+cartasMano1+" es");
													carta6Jugador.imprimirCarta();
													valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador, carta2Jugador, carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
												}
												//valorMano1=valorMano1+cartaRobada.getValor();
												//VALIDADOR DE AS
												/*if(cartaRobada.getValor()==11 && valorMano1>21){
													cartaRobada.setAs1();
													valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
												}
												if(carta1Jugador.getValor()==11 && valorMano1>21){
													carta1Jugador.setAs1();
													valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
												}
												if(carta2Jugador.getValor()==11 && valorMano1>21){
													carta2Jugador.setAs1();
													valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
												}*/
												
												System.out.println("El valor actual de su mano es "+valorMano1);
												if(valorMano1<=21){
													do{
														SubprogramasBlackpack.presentarMenuCarta();
														opcion=teclado.nextInt();
					/**/									opcionEsValida=SubprogramasBlackpack.opcionValidaCarta(opcion);
													}while(opcionEsValida==false);
												}
												if(opcion==4 || valorMano1>21){
													plantarse = true;
												}
												/*switch(opcion){
													case 5:
														SubprogramasBlackpack.consultarDinero(x1, apuesta1, apuesta2);
													break;
													case 6:
														SubprogramasBlackpack.verManoActual(carta1Jugador, carta2Jugador,  carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
													break;
													case 7:
														SubprogramasBlackpack.verManoActualCrupier( carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Crupier);
													break;
												}*/
												
											}while(valorMano1<=21 && plantarse == false);
										break;
										case 2:
										if(carta1Jugador.getValorImpreso()==carta2Jugador.getValorImpreso() && (x1.getDinero()-apuesta1>=apuesta1)){
											manoDividida=true;
											System.out.println("Su primera mano es");
											carta1Jugador1=carta1Jugador;
											if(carta1Jugador.getValor()==1){
												carta1Jugador1.setValor(11);
											}
											carta1Jugador1.imprimirCarta();
											carta2Jugador1=SubprogramasBlackpackLuis.sacarCarta();
											carta2Jugador1.imprimirCarta();
											valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador1, carta2Jugador1, carta3Jugador1, carta4Jugador1, carta5Jugador1, carta6Jugador1);
											cartasMano1=2;
											System.out.println("Su primera mano vale "+valorMano1);
											
											System.out.println("Su segunda mano es");
											carta1Jugador2=carta2Jugador;
											if(carta2Jugador.getValor()==1){
												carta1Jugador2.setValor(11);
											}
											carta1Jugador2.imprimirCarta();
											carta2Jugador2=SubprogramasBlackpackLuis.sacarCarta();
											carta2Jugador2.imprimirCarta();
											valorMano2=SubprogramasBlackpackLuis.validarAS(carta1Jugador2, carta2Jugador2, carta3Jugador2, carta4Jugador2, carta5Jugador2, carta6Jugador2);
											cartasMano2=2;
											System.out.println("Su segunda mano vale "+valorMano2);
											
											apuesta2=apuesta1;
											blackpackMano1=SubprogramasBlackpackLuis.comprobarBlackpack(carta1Jugador1.getValorImpreso(), carta2Jugador1.getValorImpreso());
											
											if(blackpackMano1==true){
												System.out.println("Blackpack en la mano 1!");
											}else{
												System.out.println("Que desea hacer con la mano 1?");
												do{
													do{
														SubprogramasBlackpack.presentarMenuDividirMano();
														opcion=teclado.nextInt();
														opcionEsValida=SubprogramasBlackpack.opcionValidaDividirMano(opcion);
													}while(opcionEsValida==false);
													switch(opcion){
														case 1:
															do{
																//cartaRobada=SubprogramasBlackpackLuis.sacarCarta();
																if(cartasMano1==2){
																	carta3Jugador1=SubprogramasBlackpackLuis.sacarCarta();
																	cartasMano1++;
																	carta3Jugador1.imprimirCarta();
																	valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador1, carta2Jugador1, carta3Jugador1, carta4Jugador1, carta5Jugador1, carta6Jugador1);
																}else if(cartasMano1==3){
																	carta4Jugador1=SubprogramasBlackpackLuis.sacarCarta();
																	cartasMano1++;
																	carta4Jugador1.imprimirCarta();
																	valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador1, carta2Jugador1, carta3Jugador1, carta4Jugador1, carta5Jugador1, carta6Jugador1);
																}else if(cartasMano1==4){
																	carta5Jugador1=SubprogramasBlackpackLuis.sacarCarta();
																	cartasMano1++;
																	carta5Jugador1.imprimirCarta();
																	valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador1, carta2Jugador1, carta3Jugador1, carta4Jugador1, carta5Jugador1, carta6Jugador1);
																}else if(cartasMano1==5){
																	carta6Jugador1=SubprogramasBlackpackLuis.sacarCarta();
																	cartasMano1++;
																	carta6Jugador1.imprimirCarta();
																	valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador1, carta2Jugador1, carta3Jugador1, carta4Jugador1, carta5Jugador1, carta6Jugador1);
																}
																
																//valorMano1=valorMano1+cartaRobada.getValor();
																//VALIDADOR DE AS
																/*if(cartaRobada.getValor()==11 && valorMano1>21){
																	cartaRobada.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}
																if(carta1Jugador.getValor()==11 && valorMano1>21){
																	carta1Jugador.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}
																if(carta2Jugador.getValor()==11 && valorMano1>21){
																	carta2Jugador.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}*/
																
																System.out.println("El valor actual de su mano es "+valorMano1);
																if(valorMano1<=21){
																	do{
																		SubprogramasBlackpack.presentarMenuCarta();
																		opcion=teclado.nextInt();
						/**/												opcionEsValida=SubprogramasBlackpack.opcionValidaCarta(opcion);
																	}while(opcionEsValida==false);
																	
																}
																if(opcion==4 || valorMano1>21){
																	plantarse = true;
																}
																	
															}while(valorMano1<=21 && plantarse == false);
														break;
														
														case 3:
															if(x1.getDinero()-apuesta1*2>=apuesta1){
																
																carta3Jugador1=SubprogramasBlackpackLuis.sacarCarta();
																cartasMano1++;
																carta3Jugador1.imprimirCarta();
																valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador1, carta2Jugador1, carta3Jugador1, carta4Jugador1, carta5Jugador1, carta6Jugador1);
																//valorMano1=valorMano1+cartaRobada.getValor();
																//VALIDADOR DE AS
																/*if(cartaRobada.getValor()==11 && valorMano1>21){
																	cartaRobada.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}
																if(carta1Jugador.getValor()==11 && valorMano1>21){
																	carta1Jugador.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}
																if(carta2Jugador.getValor()==11 && valorMano1>21){
																	carta2Jugador.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}*/
																	
																System.out.println("El valor actual de su mano es "+valorMano1);
																apuesta1 = apuesta1*2;
																plantarse=true;
															}else{
																System.out.println("No tienes suficientes fondos para doblar la apuesta");
															}
														case 4:
															plantarse=true;
														break;
														case 5:
															SubprogramasBlackpack.consultarDinero(x1, apuesta1, apuesta2);
														break;
														case 6:
															SubprogramasBlackpack.verManoDividida(carta1Jugador1, carta2Jugador1,  carta3Jugador1, carta4Jugador1, carta5Jugador1, carta6Jugador1, carta1Jugador2,  carta2Jugador2,  carta3Jugador2, carta4Jugador2, carta5Jugador2, carta6Jugador2);
														break;
														case 7:
															SubprogramasBlackpack.verManoActualCrupier( carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Crupier);
														break;
													}
												}while(valorMano1<=21 && plantarse ==false);
											}
											blackpackMano2=SubprogramasBlackpackLuis.comprobarBlackpack(carta1Jugador2.getValorImpreso(), carta2Jugador2.getValorImpreso());
											if(blackpackMano2==true){
												System.out.println("Blackpack en la mano 2!");
												plantarse=true;
											}else{
												System.out.println("Que desea hacer con la mano 2?");
												plantarse=false;
												do{
													do{
														SubprogramasBlackpack.presentarMenuDividirMano();
														opcion=teclado.nextInt();
														opcionEsValida=SubprogramasBlackpack.opcionValidaDividirMano(opcion);
													}while(opcionEsValida==false);
													switch(opcion){
														case 1:
															do{
																if(cartasMano2==2){
																	carta3Jugador2=SubprogramasBlackpackLuis.sacarCarta();
																	cartasMano2++;
																	carta3Jugador2.imprimirCarta();
																	valorMano2=SubprogramasBlackpackLuis.validarAS(carta1Jugador2, carta2Jugador2, carta3Jugador2, carta4Jugador2, carta5Jugador2, carta6Jugador2);
																}else if(cartasMano2==3){
																	carta4Jugador2=SubprogramasBlackpackLuis.sacarCarta();
																	cartasMano2++;
																	carta4Jugador2.imprimirCarta();
																	valorMano2=SubprogramasBlackpackLuis.validarAS(carta1Jugador2, carta2Jugador2, carta3Jugador2, carta4Jugador2, carta5Jugador2, carta6Jugador2);
																}else if(cartasMano2==4){
																	carta5Jugador2=SubprogramasBlackpackLuis.sacarCarta();
																	cartasMano2++;
																	carta5Jugador2.imprimirCarta();
																	valorMano2=SubprogramasBlackpackLuis.validarAS(carta1Jugador2, carta2Jugador2, carta3Jugador2, carta4Jugador2, carta5Jugador2, carta6Jugador2);
																}else if(cartasMano2==5){
																	carta6Jugador2=SubprogramasBlackpackLuis.sacarCarta();
																	cartasMano2++;
																	carta6Jugador2.imprimirCarta();
																	valorMano2=SubprogramasBlackpackLuis.validarAS(carta1Jugador2, carta2Jugador2, carta3Jugador2, carta4Jugador2, carta5Jugador2, carta6Jugador2);
																}
																
																//valorMano1=valorMano1+cartaRobada.getValor();
																//VALIDADOR DE AS
																/*if(cartaRobada.getValor()==11 && valorMano1>21){
																	cartaRobada.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}
																if(carta1Jugador.getValor()==11 && valorMano1>21){
																	carta1Jugador.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}
																if(carta2Jugador.getValor()==11 && valorMano1>21){
																	carta2Jugador.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}*/
																
																System.out.println("El valor actual de su mano es "+valorMano2);
																if(valorMano2<=21){
																	do{
							/**/											SubprogramasBlackpack.presentarMenuCarta();
																		opcion=teclado.nextInt();
																	}while(opcion!=1 && opcion!=4);
																}
																if(opcion==4 || valorMano2>21){
																	plantarse = true;
																}
																	
															}while(valorMano2<=21 && plantarse == false);
														break;
														
														case 3:
															if(x1.getDinero()-apuesta1*2>=apuesta1){
																carta3Jugador2=SubprogramasBlackpackLuis.sacarCarta();
																cartasMano2++;
																carta3Jugador2.imprimirCarta();
																valorMano2=SubprogramasBlackpackLuis.validarAS(carta1Jugador2, carta2Jugador2, carta3Jugador2, carta4Jugador2, carta5Jugador2, carta6Jugador2);
																//valorMano1=valorMano1+cartaRobada.getValor();
																//VALIDADOR DE AS
																/*if(cartaRobada.getValor()==11 && valorMano1>21){
																	cartaRobada.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}
																if(carta1Jugador.getValor()==11 && valorMano1>21){
																	carta1Jugador.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}
																if(carta2Jugador.getValor()==11 && valorMano1>21){
																	carta2Jugador.setAs1();
																	valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
																}*/
																
																System.out.println("El valor actual de su mano es "+valorMano2);
																apuesta2 = apuesta2*2;
																plantarse=true;
															}else{
																System.out.println("No tienes suficientes fondos para doblar la apuesta");
															}
														break;
														case 4:
															plantarse=true;
														break;
														case 5:
															SubprogramasBlackpack.consultarDinero(x1, apuesta1, apuesta2);
														break;
														case 6:
															SubprogramasBlackpack.verManoDividida(carta1Jugador1, carta2Jugador1,carta3Jugador1, carta4Jugador1, carta5Jugador1, carta6Jugador1, carta1Jugador2,  carta2Jugador2,  carta3Jugador2, carta4Jugador2, carta5Jugador2, carta6Jugador2);
														break;
														case 7:
															SubprogramasBlackpack.verManoActualCrupier(carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Crupier);
														break;
													}
												}while(valorMano2<=21 && plantarse==false);
											}		
										}else{
											if(carta1Jugador.getValorImpreso()!=carta2Jugador.getValorImpreso()){ 
												System.out.println("Solo se puede dividir cuando ambas cartas iniciales son iguales");
											}
											if(x1.getDinero()-apuesta1<apuesta1){
												System.out.println("No tienes suficientes fondos para dividir");
											}
										}
										break;
										case 3:
											if(x1.getDinero()-apuesta1>=apuesta1){
												carta3Jugador=SubprogramasBlackpackLuis.sacarCarta();
												cartasMano1++;
												carta3Jugador.imprimirCarta();
												valorMano1=SubprogramasBlackpackLuis.validarAS(carta1Jugador, carta2Jugador, carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
												//valorMano1=valorMano1+cartaRobada.getValor();
												//VALIDADOR DE AS
												/*if(cartaRobada.getValor()==11 && valorMano1>21){
													cartaRobada.setAs1();
													valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
												}
												if(carta1Jugador.getValor()==11 && valorMano1>21){
													carta1Jugador.setAs1();
													valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
												}
												if(carta2Jugador.getValor()==11 && valorMano1>21){
													carta2Jugador.setAs1();
													valorMano1=cartaRobada.getValor()+carta1Jugador.getValor()+carta2Jugador.getValor();
												}*/

												System.out.println("El valor actual de su mano es "+valorMano1);
												apuesta1 = apuesta1*2;
												plantarse=true;
											}else{
												System.out.println("No tienes suficientes fondos para doblar la apuesta");
											}
										break;
										case 4:
											plantarse=true;
										break;
										case 5:
											SubprogramasBlackpack.consultarDinero(x1, apuesta1, apuesta2);
										break;
										case 6:
											SubprogramasBlackpack.verManoActual(carta1Jugador, carta2Jugador, carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
										break;
										case 7:
											SubprogramasBlackpack.verManoActualCrupier(carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Crupier);
										break;
									}
								}while(valorMano1<=21 && valorMano2<=21 && plantarse == false);	
							}
									
							System.out.println("La segunda carta del crupier es");
							carta2Crupier.imprimirCarta();
							System.out.println("La mano del crupier vale "+valorManoCrupier);
							
							while(valorManoCrupier<17){
								if(cartasManoCrupier==2){
									carta3Crupier=SubprogramasBlackpackLuis.sacarCarta();
									cartasManoCrupier++;
									carta3Crupier.imprimirCarta();
									valorManoCrupier=SubprogramasBlackpackLuis.validarAS(carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Crupier);
								}else if(cartasManoCrupier==3){
									carta4Crupier=SubprogramasBlackpackLuis.sacarCarta();
									cartasManoCrupier++;
									carta4Crupier.imprimirCarta();
									valorManoCrupier=SubprogramasBlackpackLuis.validarAS(carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Crupier);
								}else if(cartasManoCrupier==4){
									carta5Crupier=SubprogramasBlackpackLuis.sacarCarta();
									cartasManoCrupier++;
									carta5Crupier.imprimirCarta();
									valorManoCrupier=SubprogramasBlackpackLuis.validarAS(carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Crupier);
								}else if(cartasManoCrupier==5){
									carta6Crupier=SubprogramasBlackpackLuis.sacarCarta();
									cartasManoCrupier++;
									carta6Crupier.imprimirCarta();
									valorManoCrupier=SubprogramasBlackpackLuis.validarAS(carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Crupier);
								}
								
								//valorManoCrupier=valorManoCrupier+cartaRobada.getValor();
								//VALIDADOR DE AS
								/*if(cartaRobada.getValor()==11 && valorManoCrupier>21){
									cartaRobada.setAs1();
									valorManoCrupier=cartaRobada.getValor()+carta1Crupier.getValor()+carta2Crupier.getValor();
								}
								if(carta1Crupier.getValor()==11 && valorManoCrupier>21){
									carta1Crupier.setAs1();
									valorManoCrupier=cartaRobada.getValor()+carta1Crupier.getValor()+carta2Crupier.getValor();
								}
								if(carta2Crupier.getValor()==11 && valorManoCrupier>21){
									carta2Crupier.setAs1();
									valorManoCrupier=cartaRobada.getValor()+carta1Crupier.getValor()+carta2Crupier.getValor();
								}*/

								System.out.println("La mano del crupier vale "+valorManoCrupier);
								if(valorManoCrupier>21){
									System.out.println("El crupier se ha pasado de 21");
								}
							}
							
							resultadoMano1=SubprogramasBlackpackLuis.comprobarMano(valorMano1,valorManoCrupier);
							resultadoMano2=SubprogramasBlackpackLuis.comprobarMano(valorMano2,valorManoCrupier);
							
							SubprogramasBlackpackLuis.imprimirResultado(resultadoMano1, resultadoMano2, blackpackMano1, blackpackMano2, manoDividida);
							SubprogramasBlackpackLuis.aplicarApuesta(resultadoMano1, resultadoMano2, blackpackMano1, blackpackMano2, manoDividida, apuesta1, apuesta2, x1);
							
							/*if(resultadoMano1==1){
								if(blackpackMano1==true){
									System.out.println("Has ganado con Blackpack en la mano 1!!!");
									x1.setDinero(x1.getDinero()+(apuesta1*1.5));
								}else{
									System.out.println("Has ganado con la mano 1!");
									x1.setDinero(x1.getDinero()+apuesta1);
								}
							}else if(resultadoMano1==-1){
								System.out.println("Has perdido con la mano 1!");
								x1.setDinero(x1.getDinero()-apuesta1);
							}else{
								System.out.println("Empate con la mano 1!");
							}
							
							if(manoDividida==true){
								if(resultadoMano2==1){
									if(blackpackMano2==true){
										System.out.println("Has ganado con Blackpack en la mano 2!!!");
										x1.setDinero(x1.getDinero()+(apuesta2*1.5));
									}else{
										System.out.println("Has ganado con la mano 2!");
										x1.setDinero(x1.getDinero()+apuesta2);
									}
								}else if(resultadoMano2==-1){
									System.out.println("Has perdido con la mano 2!");
									x1.setDinero(x1.getDinero()-apuesta2);
								}else{
									System.out.println("Empate con la mano 2!");
								}
							}*/
							
							System.out.println("Actualmente tiene "+x1.getDinero()+" euros");
							
							if(x1.getDinero()<=0){
								SubprogramasBlackpack.imprimirGameOver();
							}else{
								do{
									System.out.println("Jugar otra mano? s/n");
									seguir=Character.toLowerCase(teclado.next().charAt(0));
								}while(seguir!='s' && seguir!='n');
							}
						}while(seguir=='s' &&  x1.getDinero()>0);
					break;
				}
			}
			//if(opcion!=0){
				System.out.println("Desea volver a ejecutar el juego?");
				do{
					seguir=Character.toLowerCase(teclado.next().charAt(0));
				}while(seguir!='s' && seguir!='n');
			//}
		}while(seguir=='s');
	}
}


import java.util.*;
import java.io.*;

public class SubprogramasBlackpackLuis{

	//Pedir carta
	/*
	 * Estudio interfaz
	 * 	Necesidades: nada
	 * 	Devoluciones: la carta generada - AN
	 * 	Nec/Dev: nada
	 * 	Restricciones: nada
	 * 
	 * Descripcion: Genera una carta aleatoria sacada de la baraja
	 * Cabecera: Carta pedirCarta();
	 * Precondiciones: nada
	 * Entrada: nada
	 * Salida: Carta carta
	 * E/S: Nada
	 * Postcondiciones: Devolvera asociado al nombre la carta generada
	 */
	 /*	RESGUARDO
	  * public static Carta sacarCarta(){
	  * 	System.out.println("esta funcionalidad se encuentra en construccion");
	  * 	Carta carta = new Carta();
	  * 	return carta;
	  * }
	  */
	public static Carta sacarCarta(){
		Random aleatorio = new Random();
		int valorImpreso = aleatorio.nextInt(13)+1;
		int valorCarta = valorImpreso;
		
		if(valorImpreso>=11&&valorImpreso<=13){
			valorCarta=10;
		}else if(valorImpreso==1){
			valorCarta=11;
		}
		Carta carta = new Carta(valorCarta, valorImpreso);
		
		
		return carta;
	}
	
	//Comprobar Mano1
	/*
	 * Estudio interfaz
	 * 	Necesidades: 2 enteros (mano jugador, mano crupier) - por valor
	 * 	Devoluciones: 1 entero (resultado) - AN
	 * 	Nec/Dev: nada
	 * 	Restricciones: nada
	 * 
	 * Descripcion: Compara la mano del jugador con la mano del crupier para determinar un ganador
	 * Cabecera: int comprobarMano(int mano1Jugador, int manoCrupier);
	 * Precondiciones: nada
	 * Entrada: int manoJugador, int manoCrupier
	 * Salida: int manoGanadora
	 * E/S: Nada
	 * Postcondiciones: Devolvera cual es la mano ganadora; 1 si es la del jugador, -1 si es la del crupier, 0 si es empate
	 */
	 /* public static int comprobarMano(int manoJugador, int manoCrupier){
	  * 	System.out.println("esta funcionalidad se encuentra en construccion");
	  * 	return 2;
	  * }
	  * 
	  */
	  
	 public static int comprobarMano(int manoJugador, int manoCrupier){
		 int manoGanadora;
		 
		 if(manoJugador>21 || (manoJugador<manoCrupier && manoCrupier<=21)){
			 manoGanadora=-1;
		 }else if(manoJugador==manoCrupier){
			 manoGanadora=0;
		 }else{
			 manoGanadora=1;
		 }
		 return manoGanadora;
	 }
	
	//Validador AS
	/*
	 * Estudio interfaz
	 * 	Necesidades: 3 enteros (valor carta roobada, valor carta 1, valor carta 2) - por valor
	 * 	Devoluciones: 1 entero - AN
	 * 	Nec/Dev: nada
	 * 	Restricciones: nada
	 * 
	 * Descripcion: Suma los valores de las 3 cartas, y en caso de que haya un AS y la suma de los valores sea mayor que 21, cambia el valor del AS a 1, y devuelve el nuevo valor de la mano
	 * Cabecera: void validarAS(int valorCartaRobada, int valorCarta1, int ValorCarta2);
	 * Precondiciones: nada
	 * Entrada: int valorCartaRobada, int valorCarta1, int valorCarta2
	 * Salida: int valorMano
	 * E/S: Nada
	 * Postcondiciones: en caso de que se cumpla la condicion (valorCartaRobada+valorCarta1+valorCarta2>21) y que alguna de ellas sea AS, cambiara el valor del AS a 1
	 */
	 /*	RESGUARDO
	  * public static int validarAS(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5, Carta carta6){
	  * 	System.out.println("esta funcionalidad se encuentra en construccion");
	  * 	return 0;
	  * }
	  */
	 
	public static int validarAS(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5, Carta carta6){
		
		int valorMano=carta1.getValor()+carta2.getValor()+carta3.getValor()+carta4.getValor()+carta5.getValor()+carta6.getValor();

		if(carta1.getValor()==11 && valorMano>21){
			carta1.setAs1();
			valorMano=carta1.getValor()+carta2.getValor()+carta3.getValor()+carta4.getValor()+carta5.getValor()+carta6.getValor();
		}
		if(carta2.getValor()==11 && valorMano>21){
			carta2.setAs1();
			valorMano=carta1.getValor()+carta2.getValor()+carta3.getValor()+carta4.getValor()+carta5.getValor()+carta6.getValor();
		}
		if(carta3.getValor()==11 && valorMano>21){
			carta3.setAs1();
			valorMano=carta1.getValor()+carta2.getValor()+carta3.getValor()+carta4.getValor()+carta5.getValor()+carta6.getValor();
		}
		if(carta4.getValor()==11 && valorMano>21){
			carta4.setAs1();
			valorMano=carta1.getValor()+carta2.getValor()+carta3.getValor()+carta4.getValor()+carta5.getValor()+carta6.getValor();
		}
		if(carta5.getValor()==11 && valorMano>21){
			carta5.setAs1();
			valorMano=carta1.getValor()+carta2.getValor()+carta3.getValor()+carta4.getValor()+carta5.getValor()+carta6.getValor();
		}
		if(carta6.getValor()==11 && valorMano>21){
			carta6.setAs1();
			valorMano=carta1.getValor()+carta2.getValor()+carta3.getValor()+carta4.getValor()+carta5.getValor()+carta6.getValor();
		}
		return valorMano;
	}
	
	//Comprobar blackjack
	/*
	 * Estudio interfaz
	 * 	Necesidades: 2 enteros (valor carta 1, valor carta 2) - por valor
	 * 	Devoluciones: 1 booleano - AN
	 * 	Nec/Dev: nada
	 * 	Restricciones: nada
	 * 
	 * Descripcion: Comprueba si se ha producido un blackpack
	 * Cabecera: boolean comprobarBlackpack(int valorImpresoCarta1, int valorImpresoCarta2);
	 * Preciondiciones: nada
	 * Entrada: int valorCarta1, int valorCarta2
	 * E/S: nada
	 * Postcondiciones: devuelve true si se ha producido un Blackpack, si no devuelve false
	 */
	 /* RESGUARDO
	  * public static boolean comprobarBlackpack(int valorImpresoCarta1, int valorImpresoCarta2){
	  * 	System.out.println("esta funcion se encuentra en construccion");
	  * 	return 0
	  * }
	  */
	 public static boolean comprobarBlackpack(int valorImpresoCarta1, int valorImpresoCarta2){
		 boolean blackpack=false;
		 if(valorImpresoCarta1==1 && (valorImpresoCarta2>=11 && valorImpresoCarta2<=13)){
			 blackpack=true;
		 }else if(valorImpresoCarta2==1 && (valorImpresoCarta1>=11 && valorImpresoCarta1<=13)){
			 blackpack=true;
		 }
		 return blackpack;
	 }
	 //Imprimir resultado jugada
	 /* 
	  * Estudio interfaz
	  *  necesidades: enteros resultado de las manos, booleano de si se ha realizado un blackpack y de si se ha dividido la mano - por valor
	  *  devoluciones: nada
	  *  nec/dev: nada
	  *  restricciones: debemos conocer el resultado de la mano comparada con el crupier, si ha habido algun blackjack y si se ha dividido la mano
	  * 
	  * Descripcion: imprime el resultado de la mano del jugador
	  * cabecera: void imprimirResultado(int resultadoMano1, int resultadoMano2, boolean blackpackMano1, boolean blackpackMano2, boolean manoDividida);
	  * precondiciones: se debe conocer el resultado de las manos
	  * entradas: int resultadoMano1, int resultadoMano2, boolean blackpackMano1, boolean blackpackMano2, boolean manoDividida 
	  * Salidas: nada
	  * Postcondiciones: imprime los resultados de la jugada
	  */
	  /* RESGUARDO
	   * public static void imprimirResultado(resultadoMano1, resultadoMano2, boolean blackpackMano1, boolean blackpackMano2, boolean manoDividida){
	   * 	System.out.println("esta funcionalidad se encuentra en construccion");
	   * }
	   */
	public static void imprimirResultado(int resultadoMano1, int resultadoMano2, boolean blackpackMano1, boolean blackpackMano2, boolean manoDividida){
		if(resultadoMano1==1){
			if(blackpackMano1==true){
				System.out.println("Has ganado con Blackpack en la mano 1!!!");
			}else{
				System.out.println("Has ganado con la mano 1!");
			}
		}else if(resultadoMano1==-1){
			System.out.println("Has perdido con la mano 1!");
		}else{
			System.out.println("Empate con la mano 1!");
		}
		
		if(manoDividida==true){
			if(resultadoMano2==1){
				if(blackpackMano2==true){
					System.out.println("Has ganado con Blackpack en la mano 2!!!");
				}else{
					System.out.println("Has ganado con la mano 2!");
				}
			}else if(resultadoMano2==-1){
				System.out.println("Has perdido con la mano 2!");
			}else{
				System.out.println("Empate con la mano 2!");
			}
		}
	}
	
	//Aplicar Apuestas
	 /* 
	  * Estudio interfaz
	  *  necesidades: enteros resultado de las manos, booleano de si se ha realizado un blackpack y de si se ha dividido la mano, entero apuesta 1 y 2, Jugador jugador - por valor
	  *  devoluciones: nada
	  *  nec/dev: nada
	  *  restricciones: debemos conocer el resultado de las manos comparadas con el crupier, si ha habido algun blackjack, si se ha dividido la mano y la apuesta realizada
	  * 
	  * Descripcion: calcula el dinero restante del jugador segun el resultado
	  * cabecera: void aplicarApuesta(int resultadoMano1, int resultadoMano2, boolean blackpackMano1, boolean blackpackMano2, boolean manoDividida, int apuesta, int apuesta2, Jugador jugador);
	  * precondiciones: se debe conocer el resultado de las manos
	  * entradas: int resultadoMano1, int resultadoMano2, boolean blackpackMano1, boolean blackpackMano2, boolean manoDividida, int apuesta1, int apuesta2, Jugador jugador
	  * Salidas: nada
	  * Postcondiciones: aplica la cantidad apostada al dinero del jugador
	  */
	  /* RESGUARDO
	   * public static void imprimirResultado(resultadoMano1, resultadoMano2, boolean blackpackMano1, boolean blackpackMano2, boolean manoDividida, int apuesta1, int apuesta2, Jugador jugador){
	   * 	System.out.println("esta funcionalidad se encuentra en construccion");
	   * }
	   */
	public static void aplicarApuesta(int resultadoMano1, int resultadoMano2, boolean blackpackMano1, boolean blackpackMano2, boolean manoDividida, int apuesta1, int apuesta2, Jugador x1){
		if(resultadoMano1==1){
			if(blackpackMano1==true){
				x1.setDinero(x1.getDinero()+(apuesta1*1.5));
			}else{
				x1.setDinero(x1.getDinero()+apuesta1);
			}
		}else if(resultadoMano1==-1){
			x1.setDinero(x1.getDinero()-apuesta1);
		}
		
		if(manoDividida==true){
			if(resultadoMano2==1){
				if(blackpackMano2==true){
					x1.setDinero(x1.getDinero()+(apuesta2*1.5));
				}else{
					x1.setDinero(x1.getDinero()+apuesta2);
				}
			}else if(resultadoMano2==-1){
				x1.setDinero(x1.getDinero()-apuesta2);
			}
		}
	}
}

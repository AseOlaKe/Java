import java.util.*;
import java.io.*;

public class PruebaFalloBlackpack{
	public static void main(String[]args){
		int fallosJugador=0;
		int fallosCrupier=0;
		int valorManoJugador;
		int valorManoCrupier;
		int numeroPruebas=1000;
		Carta carta1Jugador;
		Carta carta2Jugador;
		Carta carta3Jugador;
		Carta carta4Jugador;
		Carta carta5Jugador;
		Carta carta6Jugador;
		Carta carta1Crupier;
		Carta carta2Crupier;
		Carta carta3Crupier;
		Carta carta4Crupier;
		Carta carta5Crupier;
		Carta carta6Crupier;
		
		for(int contador=1;contador<=numeroPruebas;contador++){
			carta1Jugador=SubprogramasBlackpackLuis.sacarCarta();
			carta2Jugador=SubprogramasBlackpackLuis.sacarCarta();
			carta3Jugador=SubprogramasBlackpackLuis.sacarCarta();
			carta4Jugador=SubprogramasBlackpackLuis.sacarCarta();
			carta5Jugador=SubprogramasBlackpackLuis.sacarCarta();
			carta6Jugador=SubprogramasBlackpackLuis.sacarCarta();
			valorManoJugador=SubprogramasBlackpackLuis.validarAS(carta1Jugador, carta2Jugador, carta3Jugador, carta4Jugador, carta5Jugador, carta6Jugador);
			carta1Crupier=SubprogramasBlackpackLuis.sacarCarta();
			carta2Crupier=SubprogramasBlackpackLuis.sacarCarta();
			carta3Crupier=SubprogramasBlackpackLuis.sacarCarta();
			carta4Crupier=SubprogramasBlackpackLuis.sacarCarta();
			carta5Crupier=SubprogramasBlackpackLuis.sacarCarta();
			carta6Crupier=SubprogramasBlackpackLuis.sacarCarta();
			valorManoCrupier=SubprogramasBlackpackLuis.validarAS(carta1Crupier, carta2Crupier, carta3Crupier, carta4Crupier, carta5Crupier, carta6Jugador);
			if(valorManoJugador<21){
				fallosJugador++;
			}
			if(valorManoCrupier<17){
				fallosCrupier++;
			}
		}
		
		System.out.println("Han habido "+fallosJugador+" fallos en la mano del jugador");
		System.out.println("Han habido "+fallosCrupier+" fallos en la mano del crupier");
		
		
	}
}

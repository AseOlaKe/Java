public class ConductoresBlackpack{
	public static void main(String[]args){
		Carta carta1 = new Carta(8,8);
		Carta carta2 = new Carta(8,8);
		Carta carta3 = new Carta(1,1);
		Carta carta4 = new Carta(1,1);
		Carta carta5 = new Carta(3,3);
		Carta carta6 = new Carta(5,5);
		Carta carta1Jugador1= new Carta(5,5);
		Carta carta2Jugador1= new Carta(7,7);
		Carta carta3Jugador1= new Carta(2,2);
		Carta carta4Jugador1= new Carta(3,3);
		Carta carta5Jugador1= new Carta(4,4);
		Carta carta6Jugador1= new Carta(6,6);
		Carta carta1Jugador2= new Carta(8,8);
		Carta carta2Jugador2= new Carta(9,9);
		Carta carta3Jugador2= new Carta(10,10);
		Carta carta4Jugador2= new Carta(2,2);
		Carta carta5Jugador2= new Carta(4,4);
		Carta carta6Jugador2= new Carta(7,7);
		Carta carta1Crupier= new Carta(2,2);
		Carta carta2Crupier= new Carta(2,2);
		Carta carta3Crupier= new Carta(2,2);
		Carta carta4Crupier= new Carta(2,2);
		Carta carta5Crupier= new Carta(2,2);
		Carta carta6Crupier= new Carta(2,2);
		Jugador paco=new Jugador();
		int valorMano;
		//System.out.println(SubprogramasBlackpackLuis.validarAS(carta1,carta2,carta3,carta4,carta5,carta6));
		//System.out.println(SubprogramasBlackpack.validarApuesta(3,paco));
		//SubprogramasBlackpack.presentarMenu();
		//SubprogramasBlackpack.presentarMenuCarta();
		//SubprogramasBlackpack.presentarMenuDividirMano();
		//SubprogramasBlackpack.presentarMenuTurno();
		//System.out.println(SubprogramasBlackpack.opcionValida(1));
		//System.out.println(SubprogramasBlackpack.opcionValidaTurno(7));
		//System.out.println(SubprogramasBlackpack.opcionValidaCarta(2));
		//System.out.println(SubprogramasBlackpack.opcionValidaDividirMano(2));
		//SubprogramasBlackpack.imprimirGameOver();
		//SubprogramasBlackpack.consultarDinero(paco,200,0);
		//SubprogramasBlackpack.verManoActual(carta1,carta2,carta3,carta4,carta5,carta6);
		/*SubprogramasBlackpack.verManoDividida(carta1Jugador1,
			carta2Jugador1,
			carta3Jugador1,
			carta4Jugador1,
			carta5Jugador1,
			carta6Jugador1,
			carta1Jugador2, 
			carta2Jugador2, 
			carta3Jugador2,
			carta4Jugador2,
			carta5Jugador2,
			carta6Jugador2);*/
		/*SubprogramasBlackpack.verManoActualCrupier(carta1Crupier,
			carta2Crupier,
			carta3Crupier,
			carta4Crupier,
			carta5Crupier,
			carta6Crupier);*/
		//System.out.println(SubprogramasBlackpackLuis.comprobarMano(21,21));
		//System.out.println(SubprogramasBlackpackLuis.comprobarBlackpack(1,11));	
		//SubprogramasBlackpackLuis.imprimirResultado(1, 1, true, true, false);	
		System.out.println(paco.getDinero());
		SubprogramasBlackpackLuis.aplicarApuesta(1, -1, false, false, true, 200, 0, paco);
		System.out.println(paco.getDinero());
		
		
	}
}

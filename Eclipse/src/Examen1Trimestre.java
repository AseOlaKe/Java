/*
 *	Nombre del alumno: Pablo José Jarana García
 * 	Nombre del programa: Examen1Trimestre
 * 
 * 	Análisis
 * 
 * 	Este programa es un menú con 4 opciones en el que en la primera pinta un cuadrado, la segunda calcula un número vampiro, en la tercera se juega a "Fuego, barco o agua" y la cuarta te da la opción de salir.
 * 
 * 	Entrada:
 * 		-Un número para elegir la opción deseada
 * 		-Primera opción: Un número y el carácter con el que se quiera pintar el cuadrado
 * 		-Tercera opción: Número de jugadas
 * 	Salida:
 * 		-Primera opción: Un cuadrado
 * 		-Tercera opción: Número de jugadas ganadas por jugador, número de empates y ganador final.
 * 	Restricciones:
 * 		-Primera opción: El número introducido debe ser impar y estar entre 5 y 30 (ambos incluidos). Además el carácter elegido será '*','+' o 'a'
 * 		-Tercera opción: El número de jugadas será mayor que 0 y menor o igual que 50.
 * 	
 * 	Pseudocódigo generalizado
 * 	Inicio
 * 		Leer y validar iniciar
 * 		Mientras quiera iniciar programa
 * 			Presentar menú y elegir y validar opción
 * 			Según (opcion)
 * 				Para opcion==1
 * 					Pintar cuadrado
 * 				Para opcion==2
 * 					Número Vampiro
 * 				Para opcion==3
 * 					Juego
 * 				Para opción==4
 * 					Salir del menú
 * 			Fin_Según
 * 			Leer y validar reiniciar
 * 		Fin_Mientras
 * 	Fin
 * 
 * ESTUDIOS DE BUCLE:
 * 
 * "Mientras quiera iniciar programa": 
 *  -Es un bucle controlado por suceso con una VCB de tipo centinela (ejecutar). 
 * 	-Se inicializa por lectura anticipada en el módulo "Leer y validar iniciar" y se actualiza por lectura final en "Leer y validar reiniciar".
 * 	-Condición de salida: ejecutar=='n'
 * 	-Condición de entrada: ejecutar=='s'
 * 
 * "Leer y validar iniciar" y "Leer y validar reinicar":
 * 	 -Es un bucle controlado por suceso con una VCB de tipo centinela(ejecutar). 
 * 	-Se inicializa por lectura anticipada y se actualiza por lectura final. En estos dos casos se inicializa y actualiza en la misma linea(ejecutar=Character.toLowerCase(teclado.next().charAt(0));)
 * 	-Condicion de salida: ejecutar=='s'||ejecutar=='n'
 * 
 * "Presentar menú y elegir y valdiar opcion"
 * 	-Es un bucle controlado por suceso con una VCB de tipo centinela (opcion). 
 * 	-Se inicializa por lectura anticipada y se actualiza por lectura final. En estos dos casos se inicializa y actualiza en la misma linea(opcion=teclado.nextInt();)
 * 	-Condicion de salida: opcion>=1&&opcion<=4
 * 
 * "Generar jugadas"
 * 	-Es un bulcle controlado por contador con una VCB de tipo contador (contador).
 * 	-Se inicializa antes de la primera iteración y se actualiza después de cada iteración.
 * 	-Condición de salida: contador==Númerojugadas
 * Línea 116
 * 	-Es un bucle controlado por suceso con una VCB de tipo centinela (caracterCuadrado). 
 * 	-Se inicializa por lectura anticipada y se actualiza por lectura final. En estos dos casos se inicializa y actualiza en la misma (lineacaracterCuadrado=Character.toLowerCase(teclado.next().charAt(0));)
 * 	-Condicion de salida: caracterCuadrado=='*'||caracterCuadrado=='+'||caracterCuadrado=='a'
 * 
 * Línea 125
 * 	-Es un bucle controlado por suceso con una VCB de tipo centinela (ladoCuadrado). 
 * 	-Se inicializa por lectura anticipada y se actualiza por lectura final. En estos dos casos se inicializa y actualiza en la misma (ladoCuadrado=teclado.nextInt();)
 * 	-Condicion de salida(ladoCuadrado%2!=0&&ladoCuadrado>=5&&ladoCuadrado<=30
 * 
 * "Elegir y valdiar numeros de jugadas"
 * 	-Es un bucle controlado por suceso con una VCB de tipo centinela (caracterCuadrado). 
 * 	-Se inicializa por lectura anticipada y se actualiza por lectura final. En estos dos casos se inicializa y actualiza en la misma (numeroJugadas=teclado.nextInt();)
 * 	-Condicion de salida: numeroJugadas>=1&&numeroJugadas<=50
 * 
 * 
 * 
 * 
 */
import java.io.*;
import java.util.*;

public class Examen1Trimestre {
	
	public static void main (String args[]) {
		
		char ejecutar=' ';
		int opcion=0;
		int ladoCuadrado=0;
		char caracterCuadrado=' ';
		int numeroJugadas=0;
		int contador;
		int eleccionUsuario=0;
		int aleatorioOrdenador;
		int contadorEmpates=0;
		int contadorVictoriasUsuario=0;
		int contadorVictoriasOrdenador=0;
		
		Scanner teclado=new Scanner(System.in);
		Random rnd=new Random();
		//Leer y validar iniciar
		do
		{
				System.out.println("Desea iniciar el programa? S/N");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		}while (ejecutar!='s' && ejecutar!='n');
		//Fin Leer y validar iniciar
		//Mientras quiera iniciar programa
		while (ejecutar=='s')
		{
			do //Presentar menú y elegir y validar opcion
			{	System.out.println("Elija una opcion:");
				System.out.println("-------------------------------------------------");
				System.out.println("1: Pintar un cuadrado");
				System.out.println("-------------------------------------------------");
				System.out.println("2: Calcular numero Vampiro");
				System.out.println("-------------------------------------------------");
				System.out.println("3: Fuego, barco o agua");
				System.out.println("-------------------------------------------------");
				System.out.println("4: SALIR");
				opcion=teclado.nextInt();
			}while(opcion<1||opcion>4);
			//Fin Presentar menú y elegir y validar opcion
			
			switch (opcion)
			{
				//Para opcion==1
				case 1:
					System.out.println("Ha elegido la opcion de pintar un cuadrado");
					do
					{
							System.out.println ("Elija el caracter con el que pintar el cuadrado: '*','+' o 'a'");
							caracterCuadrado=Character.toLowerCase(teclado.next().charAt(0));
					}while(caracterCuadrado!='*'&&caracterCuadrado!='+'&&caracterCuadrado!='a');
					do
					{
							System.out.println("Elija cuantos caracteres quiere por lado. Debe ser un numero impar entre 5 y 30(ambos incluidos):");
							ladoCuadrado=teclado.nextInt();
					}while(ladoCuadrado%2==0||ladoCuadrado<5||ladoCuadrado>30);
					System.out.println("EN CONSTRUCCION");
				break;
				//Para opcion==2
				case 2:
					System.out.println("Ha elegido la opcion de calcular si un numero es Vampiro");
					System.out.println("EN CONSTRUCCION");
				break;
				//Para opcion==3
				case 3:
					//Mostrar opcion elegida
					System.out.println("Ha elegido la opcion de Fuego, barco o agua");
					//Fin Mostrar opcion elegida
					//Elegir y validar numero de jugadas
					do
					{
						System.out.println("Introduzca el numero de jugadas entre 1 y 50, ambos incluidos");
						numeroJugadas=teclado.nextInt();
					}while(numeroJugadas<1||numeroJugadas>50);
					//Fin Elegir y validar numero de jugadas
					//Generar jugadas
					for(contador=1;contador<=numeroJugadas;contador++)
					{	//Leer eleccion del usuario
						do 
						{
							System.out.println("Elige que quieres sacar:");
							System.out.println("---1:fuego---");
							System.out.println("---2:barco---");
							System.out.println("---3:agua----");
							eleccionUsuario=teclado.nextInt();
						}while(eleccionUsuario<1||eleccionUsuario>3);
						//Fin leer eleccion del usuario
						//Generar eleccion aleatoria del ordenador
						aleatorioOrdenador=rnd.nextInt(3)+1;
						//Fin generar eleccion aleatoria del ordenador
					//Mostrar ganador por jugada
					if(eleccionUsuario==1&&aleatorioOrdenador==1)//fuego=1, barco=2 y agua=3
					{
						System.out.println( "Jugada numero "+contador+" , ambos habeis sacado fuego: empate.");
						contadorEmpates++;
					}
					else if(eleccionUsuario==2&&aleatorioOrdenador==2)
					{
						System.out.println( "Jugada numero "+contador+" , ambos habeis sacado barco: empate.");
						contadorEmpates++;
					}
					else if(eleccionUsuario==3&&aleatorioOrdenador==3)
					{
						System.out.println( "Jugada numero "+contador+" , ambos habeis sacado agua: empate.");
						contadorEmpates++;
					}
					else if(eleccionUsuario==1&&aleatorioOrdenador==2)
					{
						System.out.println( "Jugada numero "+contador+" , el usuario ha sacado fuego y el ordenador barco: gana usuario");
						contadorVictoriasUsuario++;
					}
					else if(eleccionUsuario==1&&aleatorioOrdenador==3)
					{
						System.out.println( "Jugada numero "+contador+" , el usuario ha sacado fuego y el ordenador agua: gana ordenador");
						contadorVictoriasOrdenador++;
					}
					else if(eleccionUsuario==2&&aleatorioOrdenador==1)
					{
						System.out.println( "Jugada numero "+contador+" , el usuario ha sacado barco y el ordenador fuego: gana ordenador");
						contadorVictoriasOrdenador++;
					}
					else if(eleccionUsuario==2&&aleatorioOrdenador==3)
					{
						System.out.println( "Jugada numero "+contador+" , el usuario ha sacado barco y el ordenador agua: gana usuario");
						contadorVictoriasUsuario++;
					}
					else if(eleccionUsuario==3&&aleatorioOrdenador==1)
					{
						System.out.println( "Jugada numero "+contador+" , el usuario ha sacado agua y el ordenador fuego: gana usuario");
						contadorVictoriasUsuario++;
					}
					else if(eleccionUsuario==3&&aleatorioOrdenador==2)
					{
						System.out.println( "Jugada numero "+contador+" , el usuario ha sacado agua y el ordenador barco: gana ordenador");
						contadorVictoriasOrdenador++;
					}
					//Fin mostrar ganador por jugada
					}
					//Fin Generar jugadas
					//Mostrar ganador, victorias de cada uno y empates
					if(contadorVictoriasUsuario>contadorVictoriasOrdenador)
					{
							System.out.println("EL GANADOR ES EL USUARIO");
							System.out.println("El usuario ha ganado "+contadorVictoriasUsuario+" jugadas");
							System.out.println("El ordenador ha ganado "+contadorVictoriasOrdenador+" jugadas");
							System.out.println("Han habido "+contadorEmpates+" empates");
					}
					else
					{
						System.out.println("EL GANADOR ES EL ORDENADOR");
						System.out.println("El usuario ha ganado "+contadorVictoriasUsuario+" jugadas");
						System.out.println("El ordenador ha ganado "+contadorVictoriasOrdenador+" jugadas");
						System.out.println("Han habido "+contadorEmpates+" empates");
					}
					
					if(contadorEmpates==numeroJugadas)
					{
						System.out.println("NADIE HA GANADO, TODO HAN SIDO EMPATES");
					}
					
					
					break;
				//Para opcion==4
				case 4:
					System.out.println("Ha elegido salir del menu");
				break;
			} //Fin_Según
			//Leer y validar reiniciar
			do
			{
				System.out.println("Desea reiniciar el programa? S/N");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			}while (ejecutar!='s' && ejecutar!='n');
			//Fin leer y valdiar reinicar
		}//Fin_mientras
	}
}//Fin


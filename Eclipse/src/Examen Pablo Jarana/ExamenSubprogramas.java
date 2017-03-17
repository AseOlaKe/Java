/*
 * Autor: Pablo José Jarana García
 * 
 */

import java.util.*;
public class ExamenSubprogramas {
	
	/*
	 * Interfaz
	 * 
	 * Este subprograma compara dos horas minutos y segundos del mismo día e indica si la primera introducida es anterior, posterior o igual a la segunda.
	 * Prototipo: void compareHours (int hours, int minutes, int seconds, int hours2, int minutes2, int seconds2)
	 * Precondiciones:No hay
	 * Entradas:6 números enteros
	 * Salida: Nada
	 * Entrada/Salida: Nada
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static void compareHours(int hours, int minutes, int seconds, int hours2, int minutes2, int seconds2){
	 * 		System.out.println("Esto es una prueba");
	 * }
	 */
	 public static void compareHours(int hours, int minutes, int seconds, int hours2, int minutes2, int seconds2){
		if (hours==hours2&&minutes==minutes2&&seconds==seconds2)
		{
		 System.out.println("Ambas horas son iguales");
		}
		else if (hours==hours2&&minutes==minutes2&&seconds>seconds2)
		{
			System.out.println("La primera hora introducida es posterior");
		}
		else if (hours==hours2&&minutes==minutes2&&seconds<seconds2)
		{
			System.out.println("La primera hora introducida es anterior");
		}
		if(hours>hours2)
		{
			System.out.println("La primera hora introducida es posterior");
		}
		else
		{
			System.out.println("La primera hora introducida es anterior");
		}
		if(hours==hours2&&minutes>minutes2)
		{
			System.out.println("La primera hora introducida es posterior");
		}
		else if(hours==hours2&&minutes<minutes2)
		{
			System.out.println("La primera hora introducida es anterior");
		}
		
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma pinta un triangulo en pantalla según la base introducida y el caracter
	 * Prototipo: void pintarTriangulo(int base, char caracter)
	 * Precondiciones: La base es impar entre 3 y 9 y el caracter es imprimible	 
	 * Entradas: Un número entero y un carácter
	 * Salidas: Nada
	 * Entradas/Salidas: Nada
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static void pintarTriangulo (int base, char caracterTriangulo){
	 * 		system.out.println("Esto es una prueba");
	 * }
	 */
	 
	 /*
	  * Interfaz
	  * 
	  * Este subprograma pinta un cuadrado
	  * Prototipo: void pintarCuadrado(int longitudCuadrado)
	  * Precondiciones: El número es mayor que 1
	  * Entradas: Un número entero
	  * Salidas: Nada
	  * Entradas/Salidas: Nada
	  * Postcondiciones: No hay
	  * 
	  *RESGUARDO
	  * public static void pintarCuadrado (int longitud Cuadrado){
	  * 	System.out.println("Esto es una prueba");
	  * }
	  */
		public static void pintarCuadrado (int longitudCuadrado)
		{
			int contador;
			for(contador=1;contador<=longitudCuadrado;contador++)
			{
				System.out.print(" * ");
			}
			for(contador=1;contador<=longitudCuadrado;contador++)
			{
				System.out.println("\n *");
			}
			for(contador=1;contador<=longitudCuadrado;contador++)
			{
				System.out.print(" * ");
			}
		}
	  
	  /*
	   * Interfaz
	   * 
	   * Este subprograma calcula la diferencia entre dos fechas introducidas
	   * Prototipo: void diferenceBetDates(int day,int month,int year, int day2,int month2,int year2, boolean esBisiesto, boolean esBisiesto2)
	   * Precondiciones: No hay
	   * Entrada: 6 numeros enteros y dos valores booleanos
	   * Salida: Nada
	   * Postcondiciones: No hay
	   * 
	   * RESGUARDO
	   * 
	   * public static void differenceBetDates(int day,int month,int year, int day2,int monthtwo,int year2, boolean esBisiesto, boolean esBisiesto2)
	   * {
	   * 	System.out.println("Esto es una prueba");
	   * }
	   */
	   public static void differenceBetDates(int day,int month,int year, int day2,int monthtwo,int year2, boolean esBisiesto, boolean esBisiesto2){
		   
		int resultadoDay=0;
		int resultadoMonth=0;
		int resultadoYear=0;
		
		if(esBisiesto==false&&day==29&&month==2){
			day=28;
		}
		if(esBisiesto==false&&day2==29&&monthtwo==2)
		{
			day2=28;
		}
			resultadoDay=day2-day;
			resultadoMonth=monthtwo-month;
			resultadoYear=year2-year;
			System.out.println("La diferencia es "+resultadoYear+" anyos, "+resultadoMonth+" mes/es, "+resultadoDay+" dias");
		
		
		}
	
	public static void main (String args[]) {
		
		/*Declaración de variables */
		int hours=0;
		int minutes=0;
		int seconds=0;
		int hours2=0;
		int minutes2=0;
		int seconds2=0;
		int day=0;
		int month=0;
		int year=0;
		int day2=0;
		int monthtwo=0; //Le he puesto monthtwo en vez de month2 porque me salía un error bastante raro que no me había salido nunca
		int year2=0;
		int base=0;
		char caracterTriangulo=' ';
		int opcion=0;
		char operacion=' ';
		char ejecutar=' ';
		int longitudCuadrado=0;
		boolean esBisiesto=false;
		boolean esBisiesto2=false;
		
		Scanner teclado=new Scanner(System.in);
		//Leer y validar iniciar
		do
		{
			System.out.println("Quiere ejecutar el menu? Si/No");
			ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		}while (ejecutar!='s' && ejecutar!='n');
		//Fin leer y validar iniciar
		//Mientras quiera iniciar
		while(ejecutar=='s')
		{	//Presentar menú y elegir y validar opcion
			do
			{
				System.out.println("Elija la opcion deseada:");
				System.out.println("1: Operaciones con fechas y horas");
				System.out.println("2: Pintar figuras geometricas");
				opcion=teclado.nextInt();
			}while (opcion<1||opcion>2);
			//Fin Presentar menu y elegir y validar opcion
			//Segun(opcion)
			switch(opcion)
			{	//Para opcion 1
				case 1:
					//Presentar menu y elegir y validar opcion
					do
					{
						System.out.println("Elija si quiere operar con horas o con fechas");
						System.out.println("H: Comparar horas");
						System.out.println("F: Diferencia entre fechas");
						operacion=Character.toLowerCase(teclado.next().charAt(0));
					}while (operacion!='h'&&operacion!='f');
					//Fin Presentar menu y elegir y validar opcion
					//Segun(operacion)
					switch (operacion)
					{	// PAra operacion=='h'
						case 'h':
							
							System.out.println("Ha elegido la opcion de comparar horas");
							//Leer y validar datos
							do
							{
								System.out.println("Introduzca una hora valida (de 1 a 24): ");
								hours=teclado.nextInt();
							}while(hours<0||hours>23);
							do
							{
								System.out.println("Introduzca minutos validos (de 0 a 59): ");
								minutes=teclado.nextInt();
							}while(minutes<0||minutes>59);
							do
							{
								System.out.println("Introduzca segundos validos (de 0 a 59): ");
								seconds=teclado.nextInt();
							}while(seconds<0||seconds>59);
							do
							{
								System.out.println("Introduzca la segunda hora valida (de 1 a 24): ");
								hours2=teclado.nextInt();
							}while(hours2<0||hours2>23);
							do
							{
								System.out.println("Introduzca los minutos validos de la siguiente hora (de 0 a 59): ");
								minutes2=teclado.nextInt();
							}while(minutes2<0||minutes2>59);
							do
							{
								System.out.println("Introduzca los segundos validos de la siguiente hora(de 0 a 59): ");
								seconds2=teclado.nextInt();
							}while(seconds2<0||seconds2>59);
							//Fin leer y validar datos
							//LLamada al subprograma
							compareHours(hours,minutes,seconds,hours2,minutes2,seconds2);
							
							break;
							
							case 'f':
									System.out.println("Ha elegido la opcion de calcular la diferencia fechas");
									//Leer y validar fechas
									do
									{
										System.out.println("Introduzca un anyo desde 1582: ");
										year=teclado.nextInt();
									}while(year<1582);
									if(year%400==0||(year%4==0&&year%100!=0))
									{
										esBisiesto=true;
									}
									do
									{
										System.out.println("Introduzca un mes valido (1 a 12): ");
										month=teclado.nextInt();
									}while(month<1||month>12);
									do
									{
										System.out.println("Introduzca un dia valido (de 1 a 31 o de 1 a 30 dependiendo del mes elegido): ");
										day=teclado.nextInt();
									}while((day==15&&month==7)||((day<1||day>29)&&month==2)||((day<1||day>31)&&month==1)||((day<1||day>31)&&month==3)||((day<1||day>30)&&month==4)||((day<1||day>31)&&month==5)||((day<1||day>30)&&month==6)||((day<1||day>31)&&month==7)||((day<1||day>30)&&month==8)||((day<1||day>31)&&month==9)||((day<1||day>31)&&month==10)||((day<1||day>30)&&month==11)||((day<1||day>31)&&month==12));
									do
									{
										System.out.println("Introduzca el segundo anyo desde 1582: ");
										year2=teclado.nextInt();
									}while(year2<1582);
									if(year2%400==0||(year2%4==0&&year2%100!=0))
									{
										esBisiesto2=true;
									}
									do
									{
										System.out.println("Introduzca el segundo mes valido (1 a 12): ");
										monthtwo=teclado.nextInt();
									}while(monthtwo<1||monthtwo>12);
									do
									{
										System.out.println("Introduzca un dia valido (de 1 a 31 o de 1 a 30 dependiendo del mes elegido): ");
										day2=teclado.nextInt();
									}while((day2==15&&monthtwo==7)||((day2<1||day2>29)&&monthtwo==2)||((day2<1||day2>31)&&monthtwo==1)||((day2<1||day2>31)&&monthtwo==3)||((day2<1||day2>30)&&monthtwo==4)||((day2<1||day2>31)&&monthtwo==5)||((day2<1||day2>30)&&monthtwo==6)||((day2<1||day2>31)&&monthtwo==7)||((day2<1||day2>30)&&monthtwo==8)||((day2<1||day2>31)&&monthtwo==9)||((day2<1||day2>31)&&monthtwo==10)||((day2<1||day2>30)&&monthtwo==11)||((day2<1||day2>31)&&monthtwo==12));
								differenceBetDates(day, month, year,day2,monthtwo,year2, esBisiesto, esBisiesto2);
						}
					//Fin_Segun
					break;
					case 2:
						//Presentar menu y elegir y validar opcion
						do
						{
							System.out.println("Elija si quiere pintar un triangulo o un prisma: ");
							System.out.println("T: Pintar un triangulo");
							System.out.println("C: Pintar un cuadrado");
							operacion=Character.toLowerCase(teclado.next().charAt(0));
						}while (operacion!='t'&&operacion!='c');
						//Fin presentar menu y elegir y validar opcion
						//Segun (operacion)
						switch(operacion)
						{	//Para operacion=='t'
							case 't':
							
									System.out.println("Ha elegido la opcion de pintar un Triangulo");
									//Leer y validar base
									do
									{
											System.out.println("Introduzca la base del triangulo(Numero impar entre 3 y 9)");
											base=teclado.nextInt();
									}while((base<3||base>9)&&base%2==0);
									//Fin leer y validar base
									//Leer caracter
									System.out.println("Introduzca un caracter imprimible");
									caracterTriangulo=teclado.next().charAt(0);
									//Fin leer caracter
									// pintarTiangulo(base, caracterTriangulo); Esta sería la supuesta llamada al subprograma para pintar el triangulo
							break;
							//Para operacion=='c'
							case 'c':
							
									System.out.println("Ha elegido la opcion de pintar un cuadrado");
									//Leer y validar longitud del cuadrado
									do
									{
										System.out.println("Introduzca la longitud del lado del cuadrado");
										longitudCuadrado=teclado.nextInt();
									}while (longitudCuadrado<1);
									//Fin Leer y validar longitud del cuadrado
									System.out.println("EN CONSTRUCCION"); //No he tenido tiempo
									pintarCuadrado(longitudCuadrado);
							break;
									
						}//Fin Segun
			}//Fin Segun
			//Leer y validar reiniciar
			do
			{
				System.out.println("Quiere reiniciar el menu? Si/No");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			}while (ejecutar!='s' && ejecutar!='n');
			//Fin leer y validar reiniciar
		}
			
		
	}
}//Fin


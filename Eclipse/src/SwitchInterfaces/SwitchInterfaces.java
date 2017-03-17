/*
 * Nombre: SwitchInterfaces
 * 
 * Análisis
 * 
 * Este programa es un menú con diversas funcionalidades
 * 
 * Entrada:
 * -Opción elegida 
 * -Opcion 1: Un número y un carácter
 * -Opcion2: Un número
 * -Opcion3:Una cadena
 * -Opcion4:Un número
 * -Opcion5: Un número
 * -Opcion6:4 números
 * -Opcion7: Un carácter
 * -Opcion8:Un número
 * -Opcion9:Un número
 * -Opcion10:Cuatro números
 * -opcion11: un número
 * -opcion12: tres números
 * 
 * Salida:
 * -opcion1: Una línea
 * -opcion2: Si es par o no
 * -opcion3:Una cadena
 * -opcion4:Si es bisiesto o no
 * -opcion5: si es hexadecimal o no
 * -opcion6: un número
 * -opcion7: Si es del alfabeto español o no
 * -opcion 8: Un número
 * -opcion9: si es compuesto o no
 * -opcion10: un número
 * -opcion11: como mínimo dos números
 * -opcion: de uno a dos números
 * 
 * Pseudocódigo generalizado
 * 
 * Inicio
 * 		Leer y validar iniciar
 * 		Mientras quiera iniciar programa
 * 			Presentar menú y elegir y validar opcion
 * 			Segun(opcion)
 * 				Para opcion==1
 * 					PintarLinea
 * 				Para opcion==2
 * 					NumeroPar
 * 				Para opcion==3
 * 					MínusMayús
 * 				Para opcion==4
 * 					Bisiesto
 * 				Para opcion==5
 * 					DigitoHex
 * 				Para opcion==6
 * 					DistanciaPuntos
 * 				Para opcion==7
 * 					CarácterAlfabetoEspañol
 * 				Para opcion==8
 * 					DeHectáreasAMetrosCuadrados
 * 				Para opcion==9
 * 					NúmeroCompuesto
 * 				Para opcion==10
 * 					PendienteRecta
 * 				Para opcion==11
 * 					FactoresPrimos
 * 				Para opcion==12
 * 					EcSegundoGrado
 * 			Fin_Segun
 * 		Leer y validar reiniciar
 * 		Fin_mientras
 * fin
 * 
 * 
 */
import java.util.*;

public class SwitchInterfaces {
	
	/*
	 * Interfaz
	 * 
	 * Prototipo: void PintarLinea(char caracterLinea)
	 * Comentario: Este subprograma pinta una línea según los parámetros introducidos
	 * Precondiciones: El número introducido es mayor que 0
	 * Entrada: Un carácter y un número
	 * Salida: Nada
	 * Postcondiciones: No hay
	 * E/S: Nada
	 * 
	 * RESGUARDO
	 * 
	 * public static void PintarLinea(char caracterLinea, int longitudLinea)
	 * {
	 * 		System.out.println("Pintando linea");
	 * }
	 */
	 public static void PintarLinea(char caracterLinea)
	 {
			System.out.print(caracterLinea);
		}
	/*
	 * Interfaz
	 * 
	 * Este subprograma presenta un menú
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salida: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static void PresentarMenu()
	 * {
	 * 		System.out.println("asfasfas");
	 * }
	 */
	public static void PresentarMenu()
	{
					System.out.println("Elige una opcion: ");
					System.out.println("1: Pintar una Linea");
					System.out.println("2: Numero Par");							
					System.out.println("3: Pasar de minus a Mayus");
					System.out.println("4: Verificar si un ano es bisiesto");
					System.out.println("5: Verificar si un digito es hexadecimal");
					System.out.println("6: Distancia entre dos puntos");
					System.out.println("7: Verificar si un caracter es del alfabeto espanol");
					System.out.println("8: Pasar de hectareas y areas a metros cuadrados");
					System.out.println("9: Verificar si un numero es compuesto");
					System.out.println("10: Calcular pendiente de un recta en un plano");
					System.out.println("11: Calcular factores primos de un numero");
					System.out.println("12: Realizar ecuaciones de Segundo Grado");		
					System.out.println("0: SALIR");
	}
	/*
	 * Interfaz
	 * 
	 * Prototipo: boolean NumeroPar(int numero)
	 * Comentario: Este subprograma verifica si un número es par o no
	 * Precondiciones: No hay
	 * Entrada: Un número
	 * Salida: Un valor booleano
	 * Postcondiciones:La variable booleana será true si el número es par y será false en el caso contrario
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static boolean NumeroPar (int numero)
	 * {
	 * 	esPar=false;
	 * 	return(esPar);
	 * } 
	 */
	 public static boolean NumeroPar(int numero)
	 {
			boolean esPar=false;
		 if (numero%2==0)
		 {
			 esPar=true;
		}
		return(esPar);
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma pasa un carácter de minúsculas a mayúsculas.
	 * Prototipo: void minusMayus(Cadena minus)
	 * Precondiciones: No hay
	 * Entrada/salida: Un carácter
	 * Postcondiciones: El carácter estará en mayúsculas si es correcto o se quedará igual si no lo es.
	 * 
	 * RESGUARDO
	 * 
	 * public static void minusMayus(char caracterMinus)
	 * {
	 * 		System.out.println("asdasdgwefg")
	 * }
	 */
	public static void minusMayus(char caracterMinus)
	  {
	  		char caracterMayus=' ';
	  		caracterMayus=Character.toUpperCase(caracterMinus);
			System.out.println(caracterMayus);
	  }
	  /*
	   * Interfaz
	   * 
	   * Este subprograma verifica si un año es bisiesto o no
	   * Prototipo: boolean bisiesto(int year)
	   * Precondiciones: El número es igual o mayor que 0
	   * Entrada: Un número
	   * Salida: Un valor booleano
	   * Postcondiciones: True si el año es bisiesto y false si no lo es
	   *
	   * RESGUARDO 
	   * 
	   * public static boolean bisiesto(int year)
	   *{
	   * 	return false;
	   * }
	   */
	   public static boolean bisiesto(int year)
	   {
			boolean esBisiesto=false;
			if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
			{
				esBisiesto=true;
			}
			return (esBisiesto);
		
		}
		/*
		 * Interfaz
		 * 
		 * Este subprograma verifica si un carácter es hexadecimal o no.
		 * prototipo: boolean digitoHex(char digito)
		 * Precondiciones:No hay
		 * Entrada: Un carácter
		 * Salida: Un valor booleano
		 * Postcondiciones:True si es un dígito hexadecimal y false si no lo es
		 * 
		 * RESGUARDO
		 * 
		 * public static boolean DigitoHex(char digito)
		 * {
		 * 	return false;
		 * }
		 */
		 public static boolean digitoHex(char digito)
		 {
			boolean esHex=false;
			if((digito>='0'&&digito<='9')||(digito>='a'&&digito<='f'))
			{
				esHex=true;
			}
			return(esHex);	
		}
		/*
		 * Interfaz
		 * 
		 * Este subprograma calcula la distancia entre dos puntos de un plano
		 * Prototipo: double distanciaPuntos(int coordenadaXPunto1, int coordenadaYPunto1, int coordenadaXPunto2, int coordenadaYPunto2)
		 * Precondiciones: Se han introducido 4 números
		 * Entrada: 4 números
		 * Salida: Un número
		 * Postcondiciones:El número resultante será la distancia entre los dos puntos
		 * 
		 * RESGUARDO
		 * 
		 * public static double distanciaPuntos(double coordenadaXPunto1, double coordenadaYPunto1, double coordenadaXPunto2, double coordenadaYPunto2)
		 * {
		 * 		return(1.0);
		 * }
		 */
		 public static double distanciaPuntos (double coordenadaXPunto1, double coordenadaYPunto1, double coordenadaXPunto2, double coordenadaYPunto2)
		 {
			return(Math.sqrt((Math.pow(coordenadaXPunto2-coordenadaXPunto1,2))+(Math.pow(coordenadaYPunto2-coordenadaYPunto1,2))));
			}
		
		/*
		 * Interfaz
		 * 
		 * Este subprograma verifica si un caracter es del alfabeto español
		 * Prototipo: boolean caracterAlfabeto(char caracter)
		 * Precondiciones:No hay
		 * Entrada: Un carácter
		 * Salida: Un valor booleano
		 * Postcondiciones: True si es un carácter del alfabeto español y false si no lo es
		 * 
		 * RESGUARDO
		 * 
		 * public static boolean caracterAlfabeto(char caracter)
		 * {
		 * 		return false;
		 * }
		 */
		 public static boolean caracterAlfabeto(char caracter)
		 {
			boolean esDeAlfabeto=false;
			if(caracter>='a'&&caracter<='z')
			{
				esDeAlfabeto=true;
			}
			return(esDeAlfabeto);
		}
		/*
		 * Interfaz
		 * 
		 * Este subprograma pasa de Hectáreas a metros cuadrados
		 * Prototipo: double numeroMetrosCuadrados(double numeroHectareaArea)
		 * Precondiciones: El número introducido es mayor que 0
		 * Entrada: Un número
		 * Salida: Un número
		 * Postcondiciones: Los números estarán en metros cuadrados
		 * 
		 * RESGUARDO
		 * 
		 * public static double numeroHectareasMetrosCuadrados(double numeroHectareaArea)
		 * {
		 * 		return (1);
		 * }
		 */
		 public static double numeroHectareasMetrosCuadrados(double numeroHectareaArea)
		 {	double resultadoHectareaMetro=0.0;
			resultadoHectareaMetro=numeroHectareaArea*10000;
			return(resultadoHectareaMetro);
			}
		/*
		 * Interfaz
		 * 
		 * Este subprograma pasa de áreas a metros cuadrados
		 * Prototipo: double numeroMetrosCuadrados(double numeroHectareaArea)
		 * Precondiciones: El número introducido es mayor que 0
		 * Entrada: Un número
		 * Salida: Un número
		 * Postcondiciones: El número estará en metros cuadrados
		 * 
		 * RESGUARDO
		 * 
		 * public static double numeroAreasMetrosCuadrados(double numeroHectareaArea)
		 * {
		 * 		return (1);
		 * }
		 */
		 
		 public static double numeroAreasMetrosCuadrados(double numeroHectareaArea)
		 {
			double resultadoAreaMetro=0.0;
			resultadoAreaMetro=numeroHectareaArea*100;
			return(resultadoAreaMetro);
		}
		
		/*
		 * Interfaz
		 * 
		 * Este subprograma verifica si un número es compuesto o no
		 * Prototipo: boolean numeroCompuesto(int numero)
		 * Precondiciones: No hay
		 * Entrada: Un número entero
		 * Salida: Un valor booleano
		 * Postcondiciones: True si es un numero compuesto y false si no lo es
		 * 
		 * RESGUARDO
		 * 
		 * public static boolean numeroCompuesto(int numero)
		 * {
		 * 		return false;
		 * }
		 */
		public static boolean numeroCompuesto(int numero)
		{
			boolean esCompuesto=false;
			int contadorPrimo;
			
				for(contadorPrimo=2;contadorPrimo<numero;contadorPrimo++)
				{
					if(numero%contadorPrimo==0)
					{
						numero=numero/contadorPrimo;
						esCompuesto=true;
					}
				}
			return (esCompuesto);
		}
		/*
		 * Interfaz
		 * 
		 * Comentario: Este subprograma calcula la pendiente de la recta que definen dos puntos
		 * Prototipo: double pendienteRecta(double coordenadaXPunto1, double coordenadaYPunto1, double coordenadaXPunto2, double coordenadaYPunto2)
		 * Precondiciones: No hay
		 * Entradas: Cuatro números reales
		 * E/S:No hay
		 * Salidas: Un número real
		 * Postcondiciones: Devuelve un número asociado al nombre
		 * 
		 * RESGUARDO
		 * 
		 * public static double pendienteRecta(double coordenadaXPunto1, double coordenadaYPunto1, double coordenadaXPunto2, double coordenadaYPunto2)
		 * {
		 * 	return(1);
		 * }
		 */
		 public static double pendienteRecta (double coordenadaXPunto1, double coordenadaYPunto1, double coordenadaXPunto2, double coordenadaYPunto2)
		 {
			double coeficienteA=0.0;
			double coeficienteB=0.0;
			double resultado=0.0;
			coeficienteB=coordenadaXPunto2-coordenadaXPunto1;
			coeficienteA=coordenadaYPunto2-coordenadaYPunto1;
			resultado=coeficienteA/coeficienteB;
			return(resultado);
			}
		/*
		 * Interfaz
		 * 
		 * Comentario: Este subprograma calcula los factores primos de un número
		 * Prototipo: void factoresPrimos(int numero)
		 * Precondiciones: No hay
		 * E/S: No hay
		 * Entradas: Un número entero
		 * Salida: Nada
		 * Postcondiciones: No hay
		 * 
		 * RESGUARDO
		 * 
		 * public static void factoresPrimos(int numero)
		 * {
		 * 	System.out.println("adsiofaso");
		 * }
		 */
		 public static void factoresPrimos(int numero)
		 {
		 
		 int contadorFactoresPrimo;
		 boolean esPrimo=true;
			for(contadorFactoresPrimo=2;contadorFactoresPrimo<numero;contadorFactoresPrimo++)
			{
					if(numero%contadorFactoresPrimo==0)
					{
						esPrimo=false;
					}
			}
			
			if(esPrimo==false)
			{
				do
				{	for(contadorFactoresPrimo=2;contadorFactoresPrimo<numero;contadorFactoresPrimo++)
					{
						if(numero%contadorFactoresPrimo==0&&numeroCompuesto(contadorFactoresPrimo)==false)
						{
							numero=numero/contadorFactoresPrimo;
							System.out.print(contadorFactoresPrimo+", ");
							contadorFactoresPrimo=2;
						}
					}
				}while(numero!=1);
			}
			else
			{
				System.out.println("El "+numero+" es primo");
			}
		}
		
		/*
		 * Interfaz
		 * 
		 * Comentario:Este subprograma calcula ecuaciones de Segundo Grado
		 * Prototipo: int ecuacionSegundoGrado(int coeficienteA, int coeficienteB, int coeficienteC)
		 * Precondiciones: El coeficiente A es diferente de 0 y el coeficiente B al cuadrado menos 4 por coeficiente A y coeficiente C es positivo o igual a 0
		 * Entradas: Tres números
		 * Salidas: Dos números
		 * Postcondiciones: Devuelve dos números asociados al nombre
		 * 
		 * RESGUARDO
		 * 
		 * public static int ecuacionSegundoGrado(int coeficienteA, int coeficienteB, int coeficienteC)
		 * {
		 * 		return(1,2);
		 * }
		 * 
		 */
		 
		 public static double ecuacionSegundoGradoX1(double coeficienteA, double coeficienteB, double coeficienteC)
		  {
		  		double resultado1=0;
		  		
		  		resultado1=(-coeficienteB-Math.sqrt(Math.pow(coeficienteB,2)-4*coeficienteA*coeficienteC))/(2*coeficienteA);
		  		
		  		return(resultado1);
		  }
		  /*
		 * Interfaz
		 * 
		 * Comentario:Este subprograma calcula ecuaciones de Segundo Grado
		 * Prototipo: int ecuacionSegundoGrado(int coeficienteA, int coeficienteB, int coeficienteC)
		 * Precondiciones: El coeficiente C es mayor que 0 
		 * Entradas: Tres números
		 * Salidas: Dos números
		 * Postcondiciones: Devuelve dos números asociados al nombre
		 * 
		 * RESGUARDO
		 * 
		 * public static int ecuacionSegundoGrado(int coeficienteA, int coeficienteB, int coeficienteC)
		 * {
		 * 		return(1,2);
		 * } 
		 * 
		 */
		  public static double ecuacionSegundoGradoX2(double coeficienteA, double coeficienteB, double coeficienteC)
		  {
		  		double resultado2=0;
		  		
		  		resultado2=(-coeficienteB+Math.sqrt(Math.pow(coeficienteB,2)-4*coeficienteA*coeficienteC))/(2*coeficienteA);
		  		
		  		return(resultado2);
		  }
	public static void main (String[] args) {
		
		
		char ejecutar=' ';
		int opcion=0;
		char caracterLinea=' ';
		int longitudLinea=0;
		int contadorLinea;
		int numero=0;
		boolean numeroEsPar;
		char caracterMinus=' ';
		int year=0;
		boolean yearBisiesto=false;
		char digito=' ';
		boolean digitoEsHex=false;
		double coordenadaXPunto1=0.0;
		double coordenadaYPunto1=0.0;
		double coordenadaXPunto2=0.0;
		double coordenadaYPunto2=0.0;
		double distanciaPunto=0.0;
		char caracter=' ';
		boolean esEspaniol=false;
		double numeroHectareaArea=0.0;
		double resultadoHectareaMetro=0.0;
		double resultadoAreaMetro=0.0;
		boolean esNumeroCompuesto=false;
		double resultadoPendiente=0.0;
		double coeficienteA=0.0;
		double coeficienteB=0.0;
		double coeficienteC=0.0;
		double resultadox1=0;
		double resultadox2=0;
		
		
		
		
		Scanner teclado=new Scanner(System.in);
		
		do
		{
				System.out.println("Quieres iniciar el programa? S/N");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		}while (ejecutar!='s'&&ejecutar!='n');
		
		while (ejecutar=='s')
		{
				do
				{
					PresentarMenu();
					opcion=teclado.nextInt();
								
				}while(opcion<0||opcion>12);
				
				switch(opcion)
				{
						case 1:
							System.out.println("Introduzca un caracter");
							caracterLinea=Character.toLowerCase(teclado.next().charAt(0));
							do
							{
								System.out.println("Introduzca cuantos caracteres quiere en la linea");
								longitudLinea=teclado.nextInt();
							}while (longitudLinea<=0);
							for(contadorLinea=0;contadorLinea<longitudLinea; contadorLinea++)
							 {
								PintarLinea(caracterLinea); 
							}
							System.out.println();
							break;
						case 2:
							do
							{	
								System.out.println("Introduzca un numero");
								numero=teclado.nextInt();
							}while (numero==0);
							numeroEsPar=NumeroPar(numero);
							if(numeroEsPar==true)
							{
								System.out.println("El "+numero+" es par");
							}
							else 
							{
								System.out.println("El "+numero+" es impar");
							}
							break;
						case 3:
							
								System.out.println("Introduzca un caracter: ");
								caracterMinus=teclado.next().charAt(0);
								minusMayus(caracterMinus);
							break;
						case 4:
						
							do
							{
								System.out.println("Introduce un ano a partir de despues de Cristo");
								year=teclado.nextInt();
							}while(year<0);
							yearBisiesto=bisiesto(year);
							if(yearBisiesto==true)
							{
								System.out.println("El anio "+year+" es bisiesto");
							}
							else
							{
								System.out.println("El anio "+year+" no es bisiesto");
							}
							break;
						case 5:
							System.out.println("Introduce un digito");
							digito=teclado.next().charAt(0);
							digitoEsHex=digitoHex(digito);
							if (digitoEsHex==true)
							{
								System.out.println(digito+" es hexadecimal");
							}
							else
							{
								System.out.println(digito+" no es hexadecimal");
							}
							break;
						case 6:
							System.out.println("Introduce la coordenada X del punto 1");
							coordenadaXPunto1=teclado.nextDouble();
							System.out.println("Introduce la coordenada Y del punto 1");
							coordenadaYPunto1=teclado.nextDouble();
							System.out.println("Introduce la coordenada X del punto 2");
							coordenadaXPunto2=teclado.nextDouble();
							System.out.println("Introduce la coordenada Y del punto 2");
							coordenadaYPunto2=teclado.nextDouble();
							distanciaPunto=distanciaPuntos(coordenadaXPunto1, coordenadaYPunto1, coordenadaXPunto2, coordenadaYPunto2);
							System.out.println("La distancia entre los puntos ("+coordenadaXPunto1+", "+coordenadaYPunto1+") y ("+coordenadaXPunto2+", "+coordenadaYPunto2+") es "+distanciaPunto);
							break;
						case 7:
						
							System.out.println("Introduce un caracter");
							caracter=Character.toLowerCase(teclado.next().charAt(0));
							esEspaniol=caracterAlfabeto(caracter);
							if(esEspaniol==true)
							{
								System.out.println("El caracter pertenece al alfabeto espaniol");
							}
							else
							{
								System.out.println("El caracter no pertenece al alfabeto espaniol");
							}
							break;
						case 8:
							do
							{
								System.out.println("Introduce un numero");
								numeroHectareaArea=teclado.nextDouble();
								
							}while(numeroHectareaArea<0);
							resultadoHectareaMetro=numeroHectareasMetrosCuadrados(numeroHectareaArea);
							resultadoAreaMetro=numeroAreasMetrosCuadrados(numeroHectareaArea);
							System.out.println(numeroHectareaArea+" hectareas son "+resultadoHectareaMetro+" Metros cuadrados");
							System.out.println(numeroHectareaArea+" areas son "+resultadoAreaMetro+" Metros cuadrados");
							break;
						
						case 9:
						
							System.out.println("Introduce un numero: ");
							numero=teclado.nextInt();
							System.out.println(numeroCompuesto(numero));
							break;
						case 10:
							System.out.println("Introduce la coordenada X del punto 1");
							coordenadaXPunto1=teclado.nextDouble();
							System.out.println("Introduce la coordenada Y del punto 1");
							coordenadaYPunto1=teclado.nextDouble();
							System.out.println("Introduce la coordenada X del punto 2");
							coordenadaXPunto2=teclado.nextDouble();
							System.out.println("Introduce la coordenada Y del punto 2");
							coordenadaYPunto2=teclado.nextDouble();
							resultadoPendiente=pendienteRecta(coordenadaXPunto1,coordenadaYPunto1,coordenadaXPunto2,coordenadaYPunto2);
							System.out.println("La pendiente de la recta que forman los puntos ("+coordenadaXPunto1+", "+coordenadaYPunto1+") y ("+coordenadaXPunto2+", "+coordenadaYPunto2+") es "+resultadoPendiente);
						break;
						case 11:
							do 
							{
								System.out.println("Introduce un numero mayor que 1: ");
								numero=teclado.nextInt();
							}while (numero<=1);
							factoresPrimos(numero);
						
						break;
						case 12:
							do
							{
								System.out.println("Introduce un coeficiente A diferente a 0: ");
								coeficienteA=teclado.nextInt();
							}while(coeficienteA==0);
							System.out.println("Introduce el coeficiente B: ");
							coeficienteB=teclado.nextInt();
							System.out.println("Introduce un coeficiente C diferente a 0: ");
							coeficienteC=teclado.nextInt();
							resultadox1=ecuacionSegundoGradoX1(coeficienteA,coeficienteB,coeficienteC);
							resultadox2=ecuacionSegundoGradoX2(coeficienteA,coeficienteB,coeficienteC);
							System.out.println("x1 es: "+resultadox1);
							System.out.println("x2 es: "+resultadox2);
						break;
				
				}
				do
				{
						System.out.println("Quieres reiniciar el programa? S/N");
						ejecutar=Character.toLowerCase(teclado.next().charAt(0));
				}while (ejecutar!='s'&&ejecutar!='n');
		}
		
	}
	
}

/*
 *
 * 
 * 
 */


public class SubprogramasNavidad {

/* Interfaz
 * 
 * Este subprograma imprime en pantalla el menú
 * Prototipo: public static void PresentarMenu()
 * Precondiciones: No hay
 * Entradas: No hay
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void PresentarMenu()
 * {
 * 		System.out.println("Esto es una prueba");
 * }
 * 
 */	
	public static void PresentarMenu()
	{
		System.out.println("Elija una opcion: ");
		System.out.println("1: Comparar dos caracteres del alfabeto espaniol");
		System.out.println("2: Comprobar si un caracter de nuestro alfabetos esta en minusculas o mayusculas");
		System.out.println("3: Comprobar si un digito esta entre 0 y 9");
		System.out.println("4: Comprobar si un caracter es un signo de puntuacion");
		System.out.println("5: Comprobar si un numero es compuesto");
		System.out.println("6: Comprobar si un numero perfecto, semiperfecto o no es nada");
		System.out.println("7: Comprobar si un numero es friki");
		System.out.println("8: Mensajes graciosillos");
		System.out.println("9: Comprobar si un numero es primo probable");
		System.out.println("10: Comparar dos fechas");
		System.out.println("11: Conversor de horas PM/AM");
		System.out.println("12: Comprobar los dias transcurridos entre dos fechas");
		System.out.println("13: Pintar un reloj de arena");
	}
/* Interfaz
 * 
 * Este subprograma valida la opción del menú
 * Prototipo: public static boolean OpcionValida(int opcion)
 * Precondiciones: No hay
 * Entradas: Un numero
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valida y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean OpcionValida(int opcion)
 * {
 * 		return false;
 * }
 * 
 */	
 
	public static boolean OpcionValida(int opcion)
	{
		boolean EsValida=true;
		
		if (opcion<1||opcion>14)
		{
			EsValida=false;
		}
		return EsValida;
	}
/* Interfaz
 * 
 * Este subprograma valida si el carácter es del alfabeto español o no
 * Prototipo: public static boolean CaracterValido1(char caracter1)
 * Precondiciones: No hay
 * Entradas: Un caracter
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valido y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean CaracterValido1(char caracter1)
 * {
 * 		return false;
 * }
 * 
 */	
	public static boolean CaracterValido1(char caracter1)
	{
		boolean EsValido=false;
		if(caracter1>='a'&&caracter1<='z'||caracter1=='\u00f1')
		{
			EsValido=true;
		}
		return EsValido;
	}
/* Interfaz
 * 
 * Este subprograma valida si el carácter es del alfabeto español o no
 * Prototipo: public static boolean CaracterValido2(char caracter2)
 * Precondiciones: No hay
 * Entradas: Un caracter
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valido y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean CaracterValido2(char caracter2)
 * {
 * 		return false;
 * }
 * 
 */	
	public static boolean CaracterValido2(char caracter2)
	{
		boolean EsValido=false;
		if(caracter2>='a'&&caracter2<='z'||caracter2=='\u00f1')
		{
			EsValido=true;
		}
		return EsValido;
	}
/*
 * Interfaz
 * 
 * Este subprograma determina si un caracter del alfabeto español es anterior, posterior o igual a otro
 * Prototipo: public static int CompararCaracteres(char caracter1, char caracter2)
 * Precondiciones: Ambos caracteres son del alfabeto español
 * Entradas: Dos caracteres
 * Salidas: Un número
 * Postcondiciones: 1 si es posterior, 0 si son iguales, -1 si es anterior
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static int CompararCaracteres(char caracter1, char caracter2)
 * {
 * 		return 1;
 * }
 */
	public static int CompararCaracteres(char caracter1, char caracter2)
	{
		int caracteresComparados=0;
		
		if(caracter1>caracter2)
		{
			caracteresComparados=1;
		}
		else if (caracter1==caracter2)
		{
			caracteresComparados=0;
		}
		else
		{
			caracteresComparados=-1;
		}
		return caracteresComparados;
	}
/* Interfaz
 * 
 * Este subprograma valida si el carácter es del alfabeto español o no
 * Prototipo: public static boolean CaracterValido(char caracterMinusMayus)
 * Precondiciones: No hay
 * Entradas: Un caracter
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valido y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean CaracterValido(char caracterMinusMayus)
 * {
 * 		return false;
 * }
 * 
 */	
	public static boolean CaracterValido(char caracterMinusMayus)
	{
		boolean EsValido=false;
		if((caracterMinusMayus>='a'&&caracterMinusMayus<='z'||caracterMinusMayus=='\u00f1')||(caracterMinusMayus>='A'&&caracterMinusMayus<='Z'||caracterMinusMayus=='\u00d1'))
		{
			EsValido=true;
		}
		return EsValido;
	}
/* Interfaz
 * 
 * Este subprograma determina si un caracter de nuestro alfabeto está en minúsculas o mayúsculas
 * Prototipo: public static int MinusOMayus(char caracterMinusMayus)
 * Precondiciones: El carácter pertenece al alfabeto español
 * Entradas: Un caracter
 * Salidas: Un número
 * Postcondiciones: 1 si es minúscula y 0 si es mayúscula
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static int MinusOMayus(char caracterMinusMayus)
 * {
 * 		return 1;
 * }
 * 
 */
	public static int MinusOMayus(char caracterMinusMayus)
	{
		int esMinusOMayus=0;
		if(caracterMinusMayus>='a'&&caracterMinusMayus<='z'||caracterMinusMayus=='\u00f1')
		{
			esMinusOMayus=1;
		}
		else if(caracterMinusMayus>='A'&&caracterMinusMayus<='Z'||caracterMinusMayus=='\u00d1')
		{
			esMinusOMayus=0;
		}
		return esMinusOMayus;
	}
/* Interfaz
 * 
 * Este subprograma determina si un dígito se encuentra entre 0 y 9
 * Prototipo: public static boolean ceroNueve(char caracter)
 * Precondiciones:
 * Entradas: Un caracter
 * Salidas: Un valor booleano
 * Postcondiciones: True si se encuentra entre 0 y 9 y false si no es así
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean ceroNueve(char caracter)
 * {
 * 		return false;
 * }
 * 
 */
	public static boolean ceroNueve(char caracter)
	{
		boolean esValido=false;
		
		if(caracter>='0'&&caracter<='9')
		{
			esValido=true;
		}
		return esValido;
	}
/* Interfaz
 * 
 * Este subprograma determina si un carácter es un signo de puntuación
 * Prototipo: public static boolean signoPuntuacion(char caracter)
 * Precondiciones: No hay
 * Entradas: Un caracter
 * Salidas: Un valor booleano
 * Postcondiciones: True si es un signo de puntuación y false si no es así
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean signoPuntuacion(char caracter)
 * {
 * 		return false;
 * }
 * 
 */
	public static boolean signoPuntuacion(char caracter)
	{
		boolean esValido=false;
		
		switch(caracter)
			{
				case '.':
				case':':
				case'(':
				case')':
				case',':
				case';':
				case'-':
				case '_':
				case'?':
				case'!':
				case'[':
				case']':
				case'{':
				case'}':
				case'"':
				case '/':
				case'*':
					esValido=true;
				break;
			}
		return esValido;
	}
/* Interfaz
 * 
 * Este subprograma valida si el número introducido es mayor que 0 o no
 * Prototipo: public static boolean numeroValido(int numero)
 * Precondiciones: No hay
 * Entradas: Un número
 * Salidas: Un valor booleano
 * Postcondiciones: True si es valido y false si no lo es
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static boolean numeroValido(int numero)
 * {
 * 		return false;
 * }
 * 
 */	
	public static boolean numeroValido(int numero)
	{
		boolean esValido=false;
		if(numero>0)
		{
			esValido=true;
		}
		return esValido;
	}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si un número es compuesto o no
 * Prototipo: boolean numeroCompuesto(int numero)
 * Precondiciones: El número es mayor que 0
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
						esCompuesto=true;
					}
				}
			return (esCompuesto);
		}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si un número es perfecto o no
 * Prototipo: boolean numeroPerfecto(int numero)
 * Precondiciones: El número es mayor que 0
 * Entrada: Un número entero
 * Salida: Un valor booleano
 * Postcondiciones: True si es un numero perfecto y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean numeroPerfecto(int numero)
 * {
 * 		return false;
 * }
 */
	public static boolean numeroPerfecto(int numero)
	{
		boolean esPerfecto=false;
		int contador;
		int sumaDivisores=0;
		
		
		for(contador=1;contador<numero;contador++)
		{
			if(numero%contador==0)
			{
				sumaDivisores=sumaDivisores+contador;
				if(numero==sumaDivisores)
				{
					esPerfecto=true;
				}
			}
		}
		return esPerfecto;
	}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si un número es semiperfecto o no
 * Prototipo: boolean numeroPerfecto(int numero)
 * Precondiciones: El número es mayor que 0
 * Entrada: Un número entero
 * Salida: Un valor booleano
 * Postcondiciones: True si es un numero semiperfecto y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean numeroPerfecto(int numero)
 * {
 * 		return false;
 * }
 *
	public static boolean numeroSemiperfecto(int numero)
	{
		boolean esSemiperfecto=false;
		int contador;
		int sumaDivisores=0;
		
		for(contador=1;contador<numero;contador++)
		{
			if(numero%contador==0)
			{	
				sumaDivisores=sumaDivisores+contador;
				if(numero==sumaDivisores)
				{
					esSemiperfecto=true;
					return esSemiperfecto;
				}
			}
		}
		return esSemiperfecto;
	}
*/
/*
 * Interfaz	
 * 
 * Este subprograma verifica si un número es friki o no
 * Prototipo: boolean numeroFriki(int numero)
 * Precondiciones: El número es mayor que 0
 * Entrada: Un número entero
 * Salida: Un valor booleano
 * Postcondiciones: True si es un numero friki y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean numeroFriki(int numero)
 * {
 * 		return false;
 * }
 */
	public static boolean numeroFriki(int numero)
	{
		boolean esFriki=false;
		int resultado=0;
		
		do
		{
			resultado=resultado+(numero%10);
			numero=numero/10;
		}while(numero>0);
		if (resultado==13)
		{
			esFriki=true;
		}
		return esFriki;
	}

/* Interfaz
 * 
 * Este subprograma imprime una frase segun el numero recibido
 * Prototipo: public static void mensajeGracioso(char caracter)
 * Precondiciones: El número se encuentra entre 0 y 9, ambosa incluidos
 * Entradas: Un número
 * Salidas: No hay
 * Postcondiciones: No hay
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static void mensajeGracioso(char caracter)
 * {
 * 		System.out.println("Es una prueba")
 * }
 * 
 */	
	public static void mensajeGracioso(char caracter)
	{
		switch(caracter)
		{
			case '0':
				System.out.println("En la esquina te espero");
			break;
			case '1':
				System.out.println("Po me bebo un zumo");
			break;
			case '2':
				System.out.println("Haces menos que en fol");
			break;
			case '3':
				System.out.println("Ponte a hacer press");
			break;
			case '4':
				System.out.println("Nos queda un buen rato");
			break;
			case '5':
				System.out.println("Premio (No me pude resistir)");
			break;
			case '6':
				System.out.println("y en cuanto me miro le dije: Hey!");
			break;
			case '7':
				System.out.println("Nos vemo en Umbrete");
			break;
			case '8':
				System.out.println("cho cho cho le pare el taxiiii");
			break;
			case '9':
				System.out.println("No veas como llueve");
			break;
		}
	}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si un número es primo probable o no
 * Prototipo: boolean numeroPrimoProbable(int numero)
 * Precondiciones: El número es mayor que 0
 * Entrada: Un número entero
 * Salida: Un valor booleano
 * Postcondiciones: True si es un numero primo probable y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean numeroPrimoProbable(int numero)
 * {
 * 		return false;
 * }
 */
	public static boolean numeroPrimoProbable(int numero)
	{
		boolean esPrimoProbable=false;
		int contador;
		for(contador=2;contador<numero;contador++)
		{
			if(numero%contador!=0)
			{
				esPrimoProbable=true;
			}
		}
		return esPrimoProbable;
	}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si el año es mayor que 1582 o no
 * Prototipo: boolean agnoValido(int agno1)
 * Precondiciones: No hay
 * Entrada: Un número entero
 * Salida: Un valor booleano
 * Postcondiciones: True si es un año valido y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean agnoValido(int agno1)
 * {
 * 		return false;
 * }
 */
	public static boolean agnoValido(int agno1)
	{
		boolean esValido=false;
		if(agno1>=1582)
		{
			esValido=true;
		}
		return esValido;
	}
	public static boolean agnoValido2(int agno2) //Es un subprograma para validar el año de la segunda fecha
	{
		boolean esValido=false;
		if(agno2>=1582)
		{
			esValido=true;
		}
		return esValido;
	}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si el mes es válido o no
 * Prototipo: boolean mesValido(int mes1)
 * Precondiciones: No hay
 * Entrada: Un número entero
 * Salida: Un valor booleano
 * Postcondiciones: True si es un mes valido y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean mesValido(int mes1)
 * {
 * 		return false;
 * }
 */
	public static boolean mesValido(int mes1)
	{
		boolean esValido=false;
		if(mes1>=1&&mes1<=12)
		{
			esValido=true;
		}
		return esValido;
	}
	public static boolean mesValido2(int mes2) //idem que boolean agnoValido2
	{
		boolean esValido=false;
		if(mes2>=1&&mes2<=12)
		{
			esValido=true;
		}
		return esValido;
	}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si el año es bisiesto o no
 * Prototipo: boolean agnoBisiesto(int agno1)
 * Precondiciones: el año es mayor que 1582
 * Entrada: Un número entero
 * Salida: Un valor booleano
 * Postcondiciones: True si es un año bisiesto y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean agnoBisiesto(int agno1)
 * {
 * 		return false;
 * }
 */
	public static boolean agnoBisiesto(int agno1)
	{
		boolean esBisiesto=false;
		if((agno1 % 4 == 0) && ((agno1% 100 != 0) || (agno1 % 400 == 0)))
		{
			esBisiesto=true;
		}
		return esBisiesto;
	}
	public static boolean agnoBisiesto2(int agno2) //idem que boolean agnoValido
	{
		boolean esBisiesto=false;
		if((agno2 % 4 == 0) && ((agno2% 100 != 0) || (agno2 % 400 == 0)))
		{
			esBisiesto=true;
		}
		return esBisiesto;
	}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si el dia es correcto segun el mes y año introducido
 * Prototipo: boolean diaValido(int dia1, int mes1, boolean esBisiesto)
 * Precondiciones: el año es mayor que 1582 y el mes se encuentra entre 1 y 12
 * Entrada: Dos números enteros y un valor booleano
 * Salida: Un valor booleano
 * Postcondiciones: True si es un dia y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean diaValido(int dia1, int mes1, boolean esBisiesto)
 * {
 * 		return false;
 * }
 */
	public static boolean diaValido(int dia1, int mes1, boolean esBisiesto)
	{
		boolean esValido=false;
		
		switch(mes1)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia1>=1&&dia1<=31)
					{
						esValido=true;
					}
				break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia1>=1&&dia1<=30)
					{
						esValido=true;
					}
				break;
				case 2:
					if((dia1>=1&&dia1<=28)||(dia1==29&&esBisiesto==true))
					{
						esValido=true;
					}
				break;
			}
		return esValido;
		
	}
	public static boolean diaValido2(int dia2, int mes2, boolean esBisiesto2)
	{
		boolean esValido=false;
		
		switch(mes2)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia2>=1&&dia2<=31)
					{
						esValido=true;
					}
				break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia2>=1&&dia2<=30)
					{
						esValido=true;
					}
				break;
				case 2:
					if((dia2>=1&&dia2<=28)||(dia2==29&&esBisiesto2==true))
					{
						esValido=true;
					}
				break;
			}
		return esValido;
		
	}
/*
 * Interfaz	
 * 
 * Este subprograma compara dos fechas introducidas
 * Prototipo: int comparaFechas(int dia1, int mes1, int agno1, int dia2, int mes2, int agno2)
 * Precondiciones: Los años introducidos son mayores o iguales que 1582, los meses están entre 1 y 12 (ambos inclusive) y los dias varian de rango dependiendo del año y mes (1 a 28, 1 a 29, 1 a 30 o 1 a 31)
 * Entrada: 6 números enteros
 * Salida: Un número
 * Postcondiciones: 1 si la primera fecha es anterior, 0 si son iguales y -1 si la primera fecha es posterior
 * 
 * RESGUARDO
 * 
 * public static int comparaFechas(int dia1, int mes1, int agno1, int dia2, int mes2, int agno2)
 * {
 * 		return 1;
 * }
 */
	public static int comparaFechas(int dia1, int mes1, int agno1, int dia2, int mes2, int agno2)
	{
		int comparar=0;
		if((agno1>agno2)||(mes1>mes2&&agno1==agno2)||(dia1>dia2&&mes1==mes2&&agno1==agno2))
		{
			comparar=-1;
		}
		else if(dia1==dia2&&mes1==mes2&&agno1==agno2)
		{
			comparar=0;
		}
		else if((agno2>agno1)||(mes2>mes1&&agno1==agno2)||(dia2>dia1&&mes1==mes2&&agno1==agno2))
		{
			comparar=1;
		}
		return comparar;
	}

/* Interfaz
 * 
 * Este subprograma convierte una hora PM en una hora AM
 * Prototipo: public static int conversor24hAMPM(int hora)
 * Precondiciones: La hora está entre 0 y 23
 * Entradas: Un número
 * Salidas: Un número
 * Postcondiciones: Se cambiará la hora en función del número introducido
 * E/S: No hay
 * 
 * RESGUARDO
 * 
 * public static int conversor24hAMPM(int hora)
 * {
 * 		return 1;
 * }
 * 
 */

	public static int conversor24hAMPM(int hora)
	{
		int AmPm=0;
		
		if(hora>=1&&hora<=12)
		{
			AmPm=hora;
		}
		else if (hora>=13&&hora<=23)
		{
			AmPm=hora-12;
		}
		else if(hora==0)
		{
			AmPm=12;
		}
		return AmPm;
		
	}
/*
 * Interfaz	
 * 
 * Este subprograma verifica si la hora es valida o no
 * Prototipo: boolean horaValida(int hora)
 * Precondiciones: No hay
 * Entrada: Un número entero
 * Salida: Un valor booleano
 * Postcondiciones: True si es una hora valida y false si no lo es
 * 
 * RESGUARDO
 * 
 * public static boolean horaValida(int hora)
 * {
 * 		return false;
 * }
 */
	public static boolean horaValida(int hora)
	{
		boolean esValida=false;
		
		if(hora>=0&&hora<=23)
		{
			esValida=true;
		}
		return esValida;
	}
}




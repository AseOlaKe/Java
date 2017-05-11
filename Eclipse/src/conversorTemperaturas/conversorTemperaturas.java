package conversorTemperaturas;
/*
 *  Diseñar un programa que permita cambiar de grados Celsius a Fahrenheit o Kelvin, o cualquier cambio posible entre ellos, según elija el usuario. 
 * Nombre: ConversorTemperaturas
 * 
 * Análisis
 * 
 * Este programa pasa de Celsius a Fahrenheit o Kelvin.
 *	Entrada: Un carácter indicando si se quiere pasar de Fahrenheit o a Kelvin y la temperatura en grados Celsius
 * Salida: Un número
 * Restricciones: 
 * 		-El carácter debe ser una letra ('F' o 'K')
 * 
 * Pseudocódigo generalizado:
 * Inicio
 * 		Leer y validar iniciar
 * 		Mientras quiera iniciar
 * 			Leer y validar unidad a introducir
 * 			Leer número
 * 			Leer y validar unidad a la que se quiere pasar el número
 * 			Calcular conversión
 * 			Mostrar Resultado
 * 			Leer y validar reiniciar
 * 		Fin_Mientras
 * Fin
 * 
 */
 

import java.util.*;
public class conversorTemperaturas {
/* Este subprograma pasa de grados Celsius a grados Kelvin
 * 
 * Interfaz:
 * 		 Este subprograma pasa de grados Celsius a grados Kelvin
 * 		-Prototipo: double conversionKelvin(double gradosCelsius)
 * 		-Precondiciones: El número está en Celsius
 * 		-Entrada: Un número.
 * 		-Salida: Un número.
 * 		-Postcondiciones: Devuelve los grados kelvin asociado al nombre.
 * 		-E/S: Nada.
 * RESGUARDO:
 * public static double conversionCelsiusKelvin(double gradosCelsius) {
*  			return(1);
*	}
 * 
 * 
 */	
	public static double conversionCelsiusKelvin(double gradosCelsius) {
		
		return (gradosCelsius+273);
	}
/*
 * 
 * 
 * Interfaz:
 * 		-Este subprograma pasa de grados Celsius a grados Fahrenheit
 * 		-Prototipo: double conversionCelsiusFahrenheit(double gradosCelsius)
 * 		-Precondiciones: El número está en Celsius
 * 		-Entrada: Un número.
 * 		-Salida: Un número.
 * 		-Postcondiciones: Devuelve los grados Farenheit asociado al nombre.
 * 		-E/S: Nada.
 * RESGUARDO:
 * public static double conversionCelsiusFahrenheit(double gradosCelsius) {
*  			return(1);
*	}
 */


	
	public static double conversionCelsiusFahrenheit(double gradosCelsius) {
		return(((9.0/5.0)*gradosCelsius)+32);
	}
/* 
 * 
 * Interfaz:
 * 		 Este subprograma pasa de grados Kelvin a grados Celsius
 * 		-Prototipo: double conversionKelvinCelsius(double gradosKelvin)
 * 		-Precondiciones: El número está en Kelvin
 * 		-Entrada: Un número.
 * 		-Salida: Un número.
 * 		-Postcondiciones: Devuelve los grados Celsius asociado al nombre.
 * 		-E/S: Nada.
 * 
 * RESGUARDO:
 * public static double conversionKelvinCelsius(double gradosKelvin) {
*  			return(1);
*	}
 * 
 */	
	
	public static double conversionKelvinCelsius(double gradosKelvin) {
			return(gradosKelvin-273);
	}
/* 
 * 
 * Interfaz:
 * 		 Este subprograma pasa de grados Kelvin a grados Fahrenheit
 * 		-Prototipo: double conversionKelvinFahrenheit(double gradosKelvin)
 * 		-Precondiciones: El número está en Fahrenheit
 * 		-Entrada: Un número.
 * 		-Salida: Un número.
 * 		-Postcondiciones: Devuelve los grados Fahrenheit asociado al nombre.
 * 		-E/S: Nada.
 * RESGUARDO:
 * public static double conversionKelvinFahrenheit(double gradosKelvin) {
*  			return(1);
*	}
 * 
 */	
	public static double conversionKelvinFahrenheit(double gradosKelvin){
			return(1.8 * (gradosKelvin - 273) + 32);
	}
/* 
 * 
 * Interfaz:
 * 		 Este subprograma pasa de grados Fahrenheit a grados Celsius
 * 		-Prototipo: double conversionFahrenheitCelsius(double gradosFahrenheit)
 * 		-Precondiciones: El número está en Fahrenheit
 * 		-Entrada: Un número.
 * 		-Salida: Un número.
 * 		-Postcondiciones: Devuelve los grados Celsius asociado al nombre.
 * 		-E/S: Nada.
 * 
 * RESGUARDO:
 * public static double conversionFahrenheitCelsius(double gradosFahrenheit) {
*  			return(1);
*	}
 */	
	public static double conversionFahrenheitCelsius(double gradosFahrenheit){
			return((gradosFahrenheit-32)*(5.0/9.0));
	}
/* 
 * 
 * Interfaz:
 * 		 Este subprograma pasa de grados Fahrenheit a grados Kelvin
 * 		-Prototipo: double conversionFahrenheitKelvin(double gradosFahrenheit)
 * 		-Precondiciones: el número está en Fahrenheit
 * 		-Entrada: Un número.
 * 		-Salida: Un número.
 * 		-Postcondiciones: Devuelve los grados Kelvin asociado al nombre.
 * 		-E/S: Nada.
 * 
 * RESGUARDO:
 * public static double conversionFahrenheitKelvin(double gradosFahrenheit) {
*  			return(1);
*	}
 */	
	public static double conversionFahrenheitKelvin(double gradosFahrenheit){
		return((gradosFahrenheit+459.67)/1.8);
	}
	public static void main (String[] args) {
		
		char ejecutar=' ';
		char conversion=' ';
		double gradosCelsius=0;
		double resultado=0;
		char unidadGrados=' ';
		double gradosKelvin=0;
		double gradosFahrenheit=0;
		Scanner teclado=new Scanner (System.in);
		//Inicio
		//Leer y validar iniciar
		do
		{
			System.out.println("Quieres iniciar el programa? S/N");
			ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		}while(ejecutar!='s'&&ejecutar!='n');
		//Fin Leer y validar iniciar
		//Mientras quiera iniciar programa
		while (ejecutar=='s')
		{	//Leer y validar unidad
			do
			{
				System.out.println("En que unidad vas a introducir los grados? Celsius/Kelvin/Fahrenheit");
				unidadGrados=Character.toLowerCase(teclado.next().charAt(0));
			}while(unidadGrados!='c'&&unidadGrados!='k'&&unidadGrados!='f');
			//Fin Leer y validar unidad
			
			if (unidadGrados=='c')
			{	//Leer numero
				System.out.println("Introduce los grados Celsius: ");
				gradosCelsius=teclado.nextDouble();
				//Fin Leer numero
				//Leer y validar unidad a pasar
				do
				{
						System.out.println("Los quieres pasar a grados Kelvin o a grados Fahrenheit? K/F");
						conversion=Character.toLowerCase(teclado.next().charAt(0));
				}while(conversion!='k'&&conversion!='f');
				//Fin leer y validar unidad a pasar
				if (conversion=='k')
				{	//Calcular conversion
					resultado= conversionCelsiusKelvin(gradosCelsius);
					//fin Calcular conversion
					//Mostrar resultado
					 System.out.println("Los grados en kelvin son: " + Math.floor(resultado*100)/100 +" K");
					//Mostrar resultado
				}
				
				else 
				{	//Calcular conversion
					resultado=conversionCelsiusFahrenheit(gradosCelsius);
					//Fin calcular conversion
					//Mostrar resultado
					System.out.println("Los grados en Fahrenheit son: " + Math.floor(resultado*100)/100 +" grados Fahrenheit");
					//Fin mostrar resultado
				}	
			}
			else if (unidadGrados=='k')
			{	//Leer nuemro
				System.out.println("Introduce los grados Kelvin: ");
				gradosKelvin=teclado.nextDouble();
				//Fin leer numero
				//Leer y validar unidad a pasar
				do
				{
						System.out.println("Los quieres pasar a grados Celsius o a grados Fahrenheit? C/F");
						conversion=Character.toLowerCase(teclado.next().charAt(0));
				}while(conversion!='c'&&conversion!='f');
				//Fin leer y validar unidad a pasar
				if (conversion=='c')
				{	//Calcular conversion
					resultado= conversionKelvinCelsius(gradosKelvin);
					//Fin calcular conversion
					//Mostrar resultado
					 System.out.println("Los grados en Celsius son: " + Math.floor(resultado*100)/100 +" grados Celsius");
					//Mostrar resultado
				}
				
				else 
				{	//Calcular conversion
					resultado=conversionKelvinFahrenheit(gradosKelvin);
					//Fin Calcular conversion
					//Mostrar resultado
					System.out.println("Los grados en Fahrenheit son: " + Math.floor(resultado*100)/100 + " grados Fahrenheit");
					//Fin mostrar resultado
					
				}
			}
			else if (unidadGrados=='f')
			{	//Leer numero
				System.out.println("Introduce los grados Fahrenheit: ");
				gradosFahrenheit=teclado.nextDouble();
				//Fin Leer numero
				 //Leer y validar unidad a pasar
				do
				{
						System.out.println("Los quieres pasar a grados Celsius o a grados Kelvin? C/K");
						conversion=Character.toLowerCase(teclado.next().charAt(0));
				}while(conversion!='c'&&conversion!='k');
				//Fin leer y validar unidad a pasar
				if (conversion=='c')
				{	//Calcular conversion
					resultado= conversionFahrenheitCelsius(gradosFahrenheit);
					//Fin Calcular conversion
					//Mostrar resultado
					 System.out.println("Los grados en Celsius son: " + Math.floor(resultado*100)/100 +" Grados Celsius");
					 //Fin Mostrar resultado
				}
				
				else 
				{	//Calcular conversion
					resultado=conversionFahrenheitKelvin(gradosFahrenheit);
					//Fin Calcular conversion
					//Mostrar resultado
					System.out.println("Los grados en Kelvin son: " + Math.floor(resultado*100)/100 + " K");
					//Fin Mostrar resultado
				}
			}
			//Leer y validar reiniciar
			do
			{
				System.out.println("Quieres reiniciar el programa? S/N");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
			}while(ejecutar!='s'&&ejecutar!='n');
			//Fin leer y validar reiniciar
			}
			//Fin_mientras
		}
	}
//Fin


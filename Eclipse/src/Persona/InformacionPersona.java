/*
 * Nombre: InformacionPersona
 * 
 * Análisis
 * 
 * Es un programa que al introducir todos los datos de una persona, te dice tu IMC, si estas con sobre peso y si eres mayor de edad
 * 
 * Entrada:
 * -> Dos cadenas (Nombre y DNI)
 * -> Un número entero (edad)
 * -> Dos números reales (Altura y peso)
 * -> Un carácter (sexo)
 * 
 * Salida:
 * 
 * -> Si es mayor de edad o no
 * -> Devuelve la información introducida
 * -> Un número real (IMC)
 * -> Si esta en su peso ideal o no
 * 
 * Restricciones
 * 
 * -El DNI no puede tener más de 9 caracteres
 * -La edad debe ser mayor o igual a 0 y menor o igual a 99
 * -El peso y la altura deben ser mayores a 0
 * -El carácter del sexo debe ser 'm' (mujer) o 'h' (hombre)
 * 
 * Pseudocódigo generalizado
 * 
 * Inicio
 * 		Leer y validar iniciar programa
 *		Mientras quiera iniciar nombre
 * 			Leer datos de persona
 * 			Imprimir IMC
 * 			Imprimir si es mayor de edad
 * 			Imprimir si está en el peso ideal
 * 			Imprimir datos de persona
 * 			Leer y validar reiniciar
 * 		Fin_Mientras
 * Fin
 * 			
 * 
 */

import java.util.*;
import java.io.*;

public class InformacionPersona {
	
	public static void main (String[] args) throws IOException{
		
		char seguir=' ';
		int pesoIdeal=0;
		boolean mayorEdad=false;
		Persona persona=new Persona();
		Scanner teclado= new Scanner(System.in);
		InputStreamReader corriente=new InputStreamReader(System.in);
		BufferedReader tecladoString=new BufferedReader(corriente);
		
		do
		{
			System.out.println("Desea introducir datos de una persona? Si/No");
			seguir=Character.toLowerCase(teclado.next().charAt(0));
		}while(seguir!='s'&& seguir!='n');
		
		while(seguir=='s')
		{
			System.out.println("Introduzca su nombre: ");
			persona.setNombre(teclado.next());
			//System.out.println(persona.getNombre());
				do
				{
					System.out.println("Introduzca su edad, debe estar comprendida entre 0 y 99: ");
					try
					{
						persona.setEdad(teclado.nextInt());
					}catch(ExcepcionPersona mensaje){}
				}while(persona.getEdad()<=0||persona.getEdad()>=99);
			
				System.out.println("Introduzca su DNI, debe tener 9 caracteres: ");
				try
				{	
					persona.setDNI(teclado.next());
				}catch(ExcepcionPersona mensaje){}
			
			
				System.out.println("Introduzca su sexo: ");
				try
				{
					persona.setSexo(Character.toLowerCase(teclado.next().charAt(0)));
				}catch(ExcepcionPersona mensaje){}
			
			
				System.out.println("Introduzca su peso en kilogramos, debe ser mayor que 0");
				try
				{
					persona.setPeso(teclado.nextDouble());
				}catch(ExcepcionPersona mensaje){}
			
			
				System.out.println("Introduzca su altura en metros, debe ser mayor que 0");
				try
				{
					persona.setAltura(teclado.nextDouble());
				}catch(ExcepcionPersona mensaje){}
			
			System.out.println("Nombre: "+persona.getNombre());
			System.out.println("Edad: "+persona.getEdad());
			System.out.println("DNI: "+persona.getDNI());
			System.out.println("Sexo: "+persona.getSexo());
			System.out.println("Peso: "+persona.getPeso());
			System.out.println("Altura: "+persona.getAltura());
			System.out.println("IMC: "+persona.getIMC());
			mayorEdad=persona.mayorEdad(persona.getEdad());
			if(mayorEdad==true)
			{
				System.out.println("Es mayor de edad");
			}
			else
			{
				System.out.println("No es mayor de edad");
			}
			pesoIdeal=persona.pesoIdeal();
			if(pesoIdeal==1)
			{
				System.out.println("Tienes sobrepeso");
			}
			else if(pesoIdeal==-1)
			{
				System.out.println("Estas por debajo de tu peso ideal");
			}
			else
			{
				System.out.println("Estas en tu peso ideal");
			}
			do
			{
				System.out.println("Desea introducir los datos de otra persona?");
				seguir=Character.toLowerCase(teclado.next().charAt(0));
			}while(seguir!='s' && seguir!='n');
		}
	}
}


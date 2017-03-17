/*
 * BUCLE INFINITO. Made by pjarana on 15/11/2016
 * 
 * 
 */

import java.util.*;
import java.io.*;
public class bucleinfinitoNOABRIR {
	
	public static void main (String[] args) {
		
		char ejecutar=' ';
		
		Scanner teclado=new Scanner (System.in);
		
		do
		{
				System.out.println("Quieres ejecutar el bucle infinito?");
				ejecutar=Character.toLowerCase(teclado.next().charAt(0));
		}while(ejecutar!='s'&&ejecutar!='n');
		
		while (ejecutar=='s')
		{
			System.out.println("Pac-Man");
			System.out.println("Pac to the future");
			System.out.println("Jurassic Pac");
			System.out.println("2Pac");
			System.out.println("Pacsturbating");
			System.out.println("Pacooky");
			System.out.println("Pacoism");
			System.out.println("Pacodick");
			System.out.println("Paco");
			System.out.println("Tumtumpac");
			System.out.println("Alexelpaco");
			System.out.println("Hewlett-Paco");
			System.out.println("Packord-Bell");
			System.out.println("My Little Paco");
			System.out.println("Paco de Familia (Family Pac)");
			System.out.println("South Pac");
			System.out.println("American Pac");
			System.out.println("Pac indivisible");
			System.out.println("Pechuga de Paco");
			System.out.println("Paco Mérmela (PacoMermelade)");
			System.out.println("Moco de Paco (Esto no es moco de Paco)");
			System.out.println("PacOS (Pac Operating System)"); 
		}
		
		
	}
}


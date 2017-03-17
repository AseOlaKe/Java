/*
 * Clase Vector
 * 
 * Propiedades relevantes:
 * 
 * coordenadaX -> Entero consultable y modificable
 * coordenadaY -> Entero consultable y modificable
 * coordenadaZ -> Entero consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * modulo -> Entero consultable
 * 
 * Getes y setes:
 * 
 * int getCoordenadaX();
 * void setCoordenada(int coordenadaX)
 * 
 * int getCoordenadaY();
 * void setCoordenada(int coordenadaY)
 * 
 * int getCoordenadaZ();
 * void setCoordenada(int coordenadaZ)
 * 
 * int getModulo();
 * 
 * Restricciones:
 * 
 * No hay
 * 
 * Métodos añadidos:
 * 
 * public void sumaVectores(Vector vector, Vector vector)
 * public void productoEscalarEntero(Vector vector,double numero)
 * public int productoEscalarDosVectores(Vector vector, Vector vector)
 * 
 */

import java.lang.*;
import java.util.*;
public class Vector implements Cloneable, Comparable<Vector> {
	
	private int coordenadaX;
	private int coordenadaY;
	private int coordenadaZ;
	
	//consultores
	
	public int getCoordenadaX()
	{
		return coordenadaX;
	}
	public void setCoordenadaX(int coordenadaX)
	{
		this.coordenadaX=coordenadaX;
	}
	public int getCoordenadaY()
	{
		return coordenadaY;
	}
	public void setCoordenadaY(int coordenadaY)
	{
		this.coordenadaY=coordenadaY;
	}
	public int getCoordenadaZ()
	{
		return coordenadaZ;
	}
	public void setCoordenadaZ(int coordenadaZ)
	{
		this.coordenadaZ=coordenadaZ;
	}
	public int getModulo()
	{
		return((int)Math.sqrt(Math.pow(coordenadaX,2)+Math.pow(coordenadaY,2)+Math.pow(coordenadaZ,2)));
	}
	//constructores
	
	public Vector()
	{
		coordenadaX=0;
		coordenadaY=0;
		coordenadaZ=0;
	}
	public Vector(Vector vector)
	{
		this.coordenadaX=vector.coordenadaX;
		this.coordenadaY=vector.coordenadaY;
		this.coordenadaZ=vector.coordenadaZ;
	}
	public Vector(int coordenadaX, int coordenadaY, int coordenadaZ)
	{
		this.coordenadaX=coordenadaX;
		this.coordenadaY=coordenadaY;
		this.coordenadaZ=coordenadaZ;
	}
	//Métodos sobreescritos y sobrecargados
	@Override
	public String toString()
	{
		String s="Coordenada X: "+getCoordenadaX()+", Coordenada Y: "+getCoordenadaY()+", Coordenada Z: "+getCoordenadaZ();
		return s;
	}
	@Override
	public int hashCode()
	{
		return ((int)((getCoordenadaX()*getCoordenadaY()*getCoordenadaZ()*11311)/7));
	}
	//Orden natural: Será mayor el vector que mayor módulo tenga
	public int compareTo(Vector vector)
	{
		int compara=0;
		
		if(this.getModulo()>vector.getModulo())
		{
			compara=1;
		}
		else if(this.getModulo()<vector.getModulo())
		{
			compara=-1;
		}
		return compara;
	}
	//Criterio de igualdad: Dos objetos serán  iguales si tienen las mismas coordenadas
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		
		if(x!=null && x instanceof Vector)
		{
			Vector vector= (Vector) x;
			if(getCoordenadaX()==vector.getCoordenadaX() && getCoordenadaY()==vector.getCoordenadaY() && getCoordenadaZ()==vector.getCoordenadaZ())
			{
				igual=true;
			}
		}
		return igual;
	}
	@Override
	public Vector clone()
	{
		Vector copia=null;
		
		try
		{
			copia=(Vector)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	//Métodos añadidos
	public int productoEscalarDosVectores(Vector vector)
	{
		return ((this.coordenadaX*vector.getCoordenadaX())+(this.coordenadaY*vector.getCoordenadaY())+(this.coordenadaZ*vector.getCoordenadaZ()));
	}
	public void productoEscalarEntero(int numero)
	{
		int coordenadaXx=0;
		int coordenadaYy=0;
		int coordenadaZz=0;
		coordenadaXx=this.coordenadaX*numero;
		coordenadaYy=this.coordenadaY*numero;
		coordenadaZz=this.coordenadaZ*numero;
		
		System.out.println("El producto escalar es ("+coordenadaX+", "+coordenadaY+", "+coordenadaZ+")");
	}
	public void sumaVectores(Vector vector)
	{
		int coordenadaXx=0;
		int coordenadaYy=0;
		int coordenadaZz=0;
		coordenadaXx=this.coordenadaX-vector.getCoordenadaX();
		coordenadaYy=this.coordenadaY-vector.getCoordenadaY();
		coordenadaZz=this.coordenadaZ-vector.getCoordenadaZ();
		System.out.println("El vector resultante ("+coordenadaXx+", "+coordenadaYy+", "+coordenadaZz+")");
	}
	
	
}


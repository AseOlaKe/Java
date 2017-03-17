/*
 * Clase Memoria
 * 
 * Propiedades básicas: 
 * 
 * -Tamaño: Entero consultable y modificable
 * -Tipo: String consultable y modificable
 * -Velocidad: Double consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * 	No hay
 * 
 * Consultores y modificadores:
 * 
 * int getTamanyo()
 * void setTamanyo(int tamanyo)
 * 
 * String getTipo()
 * void setTipo(String tipo)
 * 
 * double getVelocidad()
 * void setVelocidad(double velocidad)
 * 
 * Restricciones:
 * 
 * El tamaño debe ser mayor que 0
 * La velocidad debe ser mayor que 0
 * La memoria siempre es de un tipo determinado
 * 
 * Métodos añadidos:
 * 
 * No hay
 * 
 */

import java.util.*;
import java.io.*;

public class Memoria implements Comparable<Memoria>,Cloneable{
	
	private int tamanyo;
	private String tipo;
	private double velocidad;
	
	//Constructores
	//Vacío
	public Memoria()
	{
		tamanyo=16;
		tipo="RAM";
		velocidad=254.0;
	}
	//Por parámetros
	public Memoria(int tamanyo, String tipo, double velocidad) throws ExcepcionOrdenador
	{
		if(tamanyo>0)
		{
			this.tamanyo=tamanyo;
		}
		else
		{
			ExcepcionOrdenador ExcepcionTamanyo=new ExcepcionOrdenador("El tamanyo debe ser mayor que 0");
		}
		if(tipo!=null)
		{
			this.tipo=tipo;
		}
		else
		{
			ExcepcionOrdenador ExcepcionTipo=new ExcepcionOrdenador("La memoria debe ser de un tipo determinado");
		}
		if(velocidad>0)
		{
			this.velocidad=velocidad;
		}
		else
		{
			ExcepcionOrdenador ExcepcionVelocidad=new ExcepcionOrdenador("La velocidad debe ser mayor a 0");
		}
	}
	//De copia
	public Memoria (Memoria memoria)
	{
		this.tamanyo=memoria.tamanyo;
		this.tipo=memoria.tipo;
		this.velocidad=memoria.velocidad;
	}
	//Consultores
	public int getTamanyo()
	{
		return tamanyo;
	}
	public void setTamanyo(int tamanyo)throws ExcepcionOrdenador
	{
		if(tamanyo>0)
		{
			this.tamanyo=tamanyo;
		}
		else
		{
			ExcepcionOrdenador ExcepcionTamanyo=new ExcepcionOrdenador("El tamanyo debe ser mayor que 0");
		}
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String tipo)throws ExcepcionOrdenador
	{	
		if(tipo!=null)
		{
			this.tipo=tipo;
		}
		else
		{
			ExcepcionOrdenador ExcepcionTipo=new ExcepcionOrdenador("La memoria debe ser de un tipo determinado");
		}
	}
	public double getVelocidad()
	{
		return velocidad;
	}
	public void setVelocidad(double velocidad)throws ExcepcionOrdenador
	{
		if(velocidad>0)
		{
			this.velocidad=velocidad;
		}
		else
		{
			ExcepcionOrdenador ExcepcionVelocidad=new ExcepcionOrdenador("La velocidad debe ser mayor a 0");
		}
	}
	//Métodos sobrecargados y sobreescritos
	@Override
	public String toString()
	{
		String s="Tamanio: "+getTamanyo()+", Tipo: "+getTipo()+", Velocidad: "+getVelocidad();
		return s;
	}
	@Override
	public int hashCode()
	{
		return((int) ((getTamanyo()*getVelocidad()*11311)/3));
	}
	//Criterio de igualdad: Dos memorias serán iguales cuando sus atributos valgan lo mismo
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		
		if(x != null && x instanceof Memoria)
		{
			Memoria memoria=(Memoria) x;
			if(getVelocidad()==memoria.getVelocidad()&&getTipo()==memoria.getTipo()&&getTamanyo()==memoria.getTamanyo())
			{
				igual=true;
			}
		}
		return igual;
	}
	//Orden natural: La memoria mayor será la de mayor tamaño
	public int compareTo(Memoria memoria)
	{
		int compara=0;
		
		if(this.getTamanyo()>memoria.getTamanyo())
		{
			compara=1;
		}
		else if(this.getTamanyo()<memoria.getTamanyo())
		{
			compara=-1;
		}
		return compara;
	}
	public Memoria clone()
	{
		Memoria copia=null;
		try
		{
			copia=(Memoria)super.clone();
		}
		catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	
	
}


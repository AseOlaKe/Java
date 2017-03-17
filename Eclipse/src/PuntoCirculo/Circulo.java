/*
 *	Clase Punto
 * 
 * Propiedades relevantes:
 * 	
 * Centro: Punto, consultable y modificable
 * Radio: Real, consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * área: Real, consultable
 * Perímetro: Real, consultable
 * 
 * Propiedades compartidas:
 * 
 * PI Real, consultable
 * 
 * Restricciones:
 * 
 * Centro no puede ser null
 * radio no puede ser menor o igual a 0
 * 
 *	Getes y setes:
 * 
 * double getRadio();
 * double getPunto();
 * void setRadio(double radio);
 * void setCentro(Punto centro)
 * double getArea();
 * double getPerimetro();
 * 
 * Funcionalidades añadidas:
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.lang.*;
public class Circulo implements Cloneable, Comparable <Circulo>{
	
	private Punto centro;
	private double radio;
	private static double PI=3.14;
	
	//consultores
	public double getRadio()
	{
		return radio;
	}
	public void setRadio(double radio)
	{
		this.radio=radio;
	}
	public Punto getCentro()
	{
		return centro;
	}
	public void setCentro(Punto centro)
	{
		this.centro=centro;
	}
	
	public double getPerimetro()
	{
		return 2*getPi()*getRadio();
	}
	public double getArea()
	{
		return getPi()*Math.pow(getRadio(),2);
	}
	public static double getPi()
	{
		return PI;
	}
	//constructores
	// vacío
	public Circulo()
	{
		centro= new Punto(1.0,1.0);
		radio=1.0;
	}
	//de copia
	public Circulo(Circulo circulo)
	{
		this.centro=circulo.centro;
		this.radio=circulo.radio;
	}
	public Circulo(Punto centro, double radio)throws ExcepcionCirculo
	{	
		if( centro!=null)
		{
			this.centro=centro;
		}
		else
		{	
			ExcepcionCirculo ExcepcionCentro= new ExcepcionCirculo("Centro invalido, por defecto el punto sera (1,1)");
		}
		if(radio>0)
		{
			this.radio=radio;
		}
		else
		{
			ExcepcionCirculo ExcepcionRadio= new ExcepcionCirculo("Radio invalido, por defecto va a tomar valor 1");
		}
	}
	//Métodos sobreescritos y sobrecargados
	@Override
	public String toString()
	{
		String s=("Radio: "+getRadio()+", centro coordenadas: "+ centro);
		return s;
	}
	@Override
	public int hashCode ()
	{
		return((int)((centro.getX()*getRadio()+centro.getY()*909526)/3));
	}
	// El objeto mayor será el que tenga mayor radio 
	public int compareTo(Circulo circulo)
	{
		int compara=0;
		if(this.getRadio()>circulo.getRadio())
		{
			compara=1;
		}
		else if(this.getRadio()<circulo.getRadio())
		{
			compara=-1;
		}
		return compara;
	}
	//Criterio de igualdad: Dos objetos son iguales si tienen el mismo centro y radio
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		if (x!=null && x instanceof Circulo)
		{
			Circulo circulo=(Circulo) x;
			if(centro==circulo.centro && radio==circulo.radio)
			{
				igual=true;
			}
		}
		return igual;
	}
	@Override
	public Circulo clone()
	{
		Circulo copia=null;
		try
		{
			copia=(Circulo)super.clone();
			copia.centro=centro.clone();
		}
		catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	
	
}


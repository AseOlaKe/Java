/*
 * Clase discoDuro
 * 
 * Propiedades básicas:
 * 
 * Tamaño -> Entero consultable y modificable
 * Velocidad -> Double consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * No tiene
 * 
 * Consultores y modificadores:
 * 
 * int getTamanyo()
 * void setTamanyo(int tamanyo)
 * 
 * double getVelocidad()
 * void setVelocidad(double velocidad)
 * 
 * Restricciones:
 * 
 * La velocidad y el tamaño deben ser mayores que 0
 * 
 * Metodos añadidos:
 * 
 * No hay
 * 
 */


public class DiscoDuro implements Cloneable, Comparable<DiscoDuro>{
	
	private int tamanyo;
	private double velocidad;
	
	//constructores
	public DiscoDuro()
	{
		tamanyo=500;
		velocidad=20.5;
	}
	public DiscoDuro(DiscoDuro disco)
	{
		this.tamanyo=disco.tamanyo;
		this.velocidad=disco.velocidad;
	}
	public DiscoDuro(int tamanyo, double velocidad) throws ExcepcionOrdenador
	{
		if(tamanyo>0)
		{
			this.tamanyo=tamanyo;
		}
		else
		{
			ExcepcionOrdenador ExcepcionTamanyo=new ExcepcionOrdenador("El tamanyo debe ser mayor a 0");
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
	//Consultores y modificadores
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
			ExcepcionOrdenador ExcepcionTamanyo=new ExcepcionOrdenador("El tamanyo debe ser mayor a 0");
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
		String s="Tamanyo: "+getTamanyo()+", Velocidad: "+getVelocidad();
		return s;
	}
	@Override
	public int hashCode()
	{
		return((int)((getTamanyo()*getVelocidad()*11311)/3));
	}
	//Orden natural: Será mayor el disco duro con mayor tamaño
	public int compareTo(DiscoDuro disco)
	{
		int compara=0;
		if(this.tamanyo<disco.getTamanyo())
		{
			compara=-1;
		}
		else if(this.tamanyo>disco.getTamanyo())
		{
			compara=1;
		}
		return compara;
	}
	//Criterio de igualdad: Dos discos duros serán iguales si tienen la misma velocidad y tamaño
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		
		if(x!=null && x instanceof DiscoDuro)
		{
			DiscoDuro disco=(DiscoDuro) x;
			if(this.tamanyo==disco.getTamanyo()&&this.velocidad==disco.getVelocidad())
			{
				igual=true;
			}
		}
		return igual;
	}
	@Override
	public DiscoDuro clone()
	{
		DiscoDuro copia=null;
		try
		{
			copia=(DiscoDuro)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
}


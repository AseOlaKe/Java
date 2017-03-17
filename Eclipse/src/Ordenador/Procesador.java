/*
 * Clase Procesador
 * 
 * Propiedades básicas:
 * 
 * Modelo -> String consultable y modificable
 * Velocidad -> Double consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * No hay
 * 
 * Consultores y modificadores:
 * 
 * String getModelo()
 * void setModelo(String modelo)
 * 
 * double getVelocidad()
 * void setVelocidad(double velocidad)
 * 
 * Restricciones:
 * 
 * El procesador debe ser de un tipo determinado
 * La velocidad debe ser mayor a 0
 * 
 * Métodos añadidos:
 * 
 * No hay
 */


public class Procesador implements Cloneable, Comparable <Procesador>{
	
	private String modelo;
	private double velocidad;
	
	//constructores
	
	public Procesador()
	{
		modelo="Intel Core i7";
		velocidad=3600.5;
	}
	public Procesador( Procesador procesador)
	{
		this.modelo=procesador.modelo;
		this.velocidad=procesador.velocidad;
	}
	public Procesador(String modelo, double velocidad)throws ExcepcionOrdenador
	{
		if(modelo!=null)
		{
			this.modelo=modelo;
		}
		else
		{
			ExcepcionOrdenador ExcepcionModelo=new ExcepcionOrdenador("El procesador debe ser de un modelo determinado"); //throw new
		}
		if(velocidad>0)
		{
			this.velocidad=velocidad;
		}
		else
		{
			ExcepcionOrdenador ExcepcionVelocidad= new ExcepcionOrdenador("La velocidad debe ser mayor a 0");
		}
	}
	
	//Consultores y modificadores
	
	public String getModelo()
	{
		return modelo;
	}
	public void setModelo(String modelo)throws ExcepcionOrdenador
	{
		if(modelo!=null)
		{
			this.modelo=modelo;
		}
		else
		{
			ExcepcionOrdenador ExcepcionModelo=new ExcepcionOrdenador("El procesador debe ser de un modelo determinado");
		}
	}
	public double getVelocidad()
	{
		return velocidad;
	}
	public void setVelocidad(double velocidad) throws ExcepcionOrdenador
	{
		if(velocidad>0)
		{
			this.velocidad=velocidad;
		}
		else
		{
			ExcepcionOrdenador ExcepcionVelocidad= new ExcepcionOrdenador("La velocidad debe ser mayor a 0");
		}
	}
	//Métodos sobrecargados y sobreescritos
	@Override
	public String toString()
	{
		String s="Modelo: "+getModelo()+", Velocidad: "+getVelocidad();
		return s;
	}
	@Override
	public int hashCode()
	{
		return((int)((getVelocidad()*11311*7*3)/5));
	}
	//Orden natural: Será mayor el procesador de mayor velocidad
	public int compareTo(Procesador procesador)
	{
		int compara=0;
		
		if(this.velocidad>procesador.getVelocidad())
		{
			compara=1;
		}
		else if(this.velocidad<procesador.getVelocidad())
		{
			compara=-1;
		}
		
		return compara;
	}
	//Criterio de igualdad: Dos objetos serán iguales si son el mismo modelo y tienen la misma velocidad
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		
		if(x!=null && x instanceof Procesador)
		{
			Procesador procesador=(Procesador) x;
			
			if(this.velocidad==procesador.getVelocidad() && this.modelo==procesador.getModelo())
			{
				igual=true;
			}
		}
		
		return igual;
	}
	@Override
	public Procesador clone()
	{
		Procesador copia=null;
		
		try
		{
			copia=(Procesador)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println(" No se ha podido clonar");
		}
		return copia;
	}
}
	


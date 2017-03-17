/*
 * Clase ordenador
 * 
 * Propiedades básicas
 * 
 * 	Procesador -> Procesador consultable y modificable
 * 	Memoria -> Memoria consultable y modificable
 * 	Disco duro -> DiscoDuro consultable y modificable
 * 	Precio base -> double consultable y modificable
 * 
 * Propiedades compartidas:
 * 
 * 	IVA -> Entero consultable
 * 
 * Propiedades derivadas:
 * 
 * 	Precio de mercado -> double consultable
 * 
 * Restricciones:
 * 	
 * 	El precio base debe ser mayor a 0
 * 
 *  El ordenador siempre tiene un procesador, una memoria y un disco duro(cambiar)
 * 
 * Métodos añadidos:
 * 
 * 	No hay
 * 
 * 
 */


public class Ordenador implements Comparable <Ordenador>, Cloneable {
	
	//private static final double IVA=18.0;
	private Procesador procesadorOrdenador;
	private Memoria memoriaOrdenador;
	private DiscoDuro discoOrdenador;
	private double precioBase;
	private static final double IVA=18.0;
	
	//Constructores
	public Ordenador()
	{
		try
		{
			procesadorOrdenador=new Procesador("Intel Core i7",3600.5); //dejarlo por defecto de sus respectivas clases
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		try
		{
			memoriaOrdenador=new Memoria(32,"RAM",254.5);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		try
		{
			discoOrdenador=new DiscoDuro(1000,20.2);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		precioBase=200.0;
	}
	public Ordenador(Ordenador ordenador)
	{
		this.procesadorOrdenador=ordenador.procesadorOrdenador;
		this.memoriaOrdenador=ordenador.memoriaOrdenador;
		this.discoOrdenador=ordenador.discoOrdenador;
		this.precioBase=ordenador.precioBase;
	}
	public Ordenador(Procesador procesadorOrdenador, Memoria memoriaOrdenador, DiscoDuro discoOrdenador, double precioBase)throws ExcepcionOrdenador
	{
		if(procesadorOrdenador!=null)//no es null, no se crea ni el objeto
		{
			this.procesadorOrdenador=procesadorOrdenador;
		}
		else
		{
			ExcepcionOrdenador ExcepcionProcesador=new ExcepcionOrdenador("El ordenador debe tener un procesador");
		}
		if(memoriaOrdenador!=null)
		{
			this.memoriaOrdenador=memoriaOrdenador;
		}
		else
		{
			ExcepcionOrdenador ExcepcionMemoria=new ExcepcionOrdenador("El ordenador debe tener algun tipo de memoria");
		}
		if(discoOrdenador!=null)
		{
			this.discoOrdenador=discoOrdenador;
		}
		else
		{
			ExcepcionOrdenador ExcepcionDisco=new ExcepcionOrdenador("El ordenador debe tener un disco duro");
		}
		if(precioBase>0)
		{
			this.precioBase=precioBase;
		}
		else
		{
			ExcepcionOrdenador ExcepcionPrecio=new ExcepcionOrdenador("El precio debe ser mayor que 0");
		}
	}
	//Consultores y modificadores
	public Procesador getProcesador() //Aplicar patrón delegación
	{
		return procesadorOrdenador;
	}
	public Memoria getMemoria()
	{
		return memoriaOrdenador;
	}
	public DiscoDuro getDiscoDuro()
	{
		return discoOrdenador;
	}
	public double getPrecioBase()
	{
		return precioBase;
	}
	public void setPrecioBase(double precioBase)
	{
		this.precioBase=precioBase;
	}
	public void setProcesador(Procesador procesadorOrdenador)throws ExcepcionOrdenador
	{
		if(procesadorOrdenador!=null)
		{
			this.procesadorOrdenador=procesadorOrdenador;
		}
		else
		{
			ExcepcionOrdenador ExcepcionProcesador=new ExcepcionOrdenador("El ordenador debe tener un procesador");
		}
	}
	public void setMemoria(Memoria memoriaOrdenador)throws ExcepcionOrdenador
	{
		if(memoriaOrdenador!=null)
		{
			this.memoriaOrdenador=memoriaOrdenador;
		}
		else
		{
			ExcepcionOrdenador ExcepcionMemoria=new ExcepcionOrdenador("El ordenador debe tener algun tipo de memoria");
		}
	}
	public void setDiscoDuro(DiscoDuro discoOrdenador)throws ExcepcionOrdenador
	{
		if(discoOrdenador!=null)
		{
			this.discoOrdenador=discoOrdenador;
		}
		else
		{
			ExcepcionOrdenador ExcepcionDisco=new ExcepcionOrdenador("El ordenador debe tener un disco duro");
		}
	}
	public double getIVA()
	{
		return IVA;
	}
	public double getPrecioMercado()
	{
		double costeIVA=0.0;
		costeIVA=(precioBase*IVA)/100;
		return (precioBase+costeIVA);
	}
	//Métodos sobreescritos y sobrecargados
	@Override
	public String toString()
	{
		String s="Procesador: "+getProcesador()+", Memoria: "+getMemoria()+", Disco duro: "+getDiscoDuro()+", Precio base: "+getPrecioBase()+", Precio de mercado: "+getPrecioMercado();
		return s;
	}
	@Override
	public int hashCode()
	{
		return ((int)((getPrecioBase()*getPrecioMercado()*11311)/5)); //Puedo llamar al hashcode de los agregados
	}
	//Orden natural: Será mayor el ordenador que más cueste
	public int compareTo(Ordenador ordenador)
	{
		int compara=0;
		
		if(this.getPrecioMercado()>ordenador.getPrecioMercado())
		{
			compara=1;
		}
		else if (this.getPrecioMercado()<ordenador.getPrecioMercado())
		{
			compara=-1;
		}
		return compara;
	}
	@Override
	//Criterio de igualdad: Dos ordenadores serán iguales serán iguales si tienen el mismo procesador, la misma memoria y el mismo disco duro
	public boolean equals (Object x)
	{
		boolean igual=false;
		if(x!=null && x instanceof Ordenador)
		{
			Ordenador ordenador=(Ordenador) x;
			if(this.procesadorOrdenador==ordenador.procesadorOrdenador && this.memoriaOrdenador==ordenador.memoriaOrdenador && this.discoOrdenador==ordenador.discoOrdenador)
			{
				igual=true;
			}
		}
		return igual;
	}
	@Override
	public Ordenador clone()
	{
		Ordenador copia=null;
		
		try
		{
			copia=(Ordenador)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		
		return copia;
	}
	
}


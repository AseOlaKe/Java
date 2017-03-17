/*
 * CLASE PUNTO
 * 
 * Propiedades relevantes:
 * 
 * Coordenada X: Double, consultable y modificable
 * Coordenada Y: DOuble, consultable y modificable
 * 
 * Getes y setes:
 * 
 * double getX();
 * void setX(double x);
 * double getY();
 * void setY(double y);
 * 
 * Restricciones:
 * 
 * No hay
 * 
 * Métodos añadidos:
 * 
 * No hay
 * 
 */


public class Punto implements Cloneable, Comparable <Punto> {
	
	private double x;
	private double y;
	
	//getes y setes
	
	public double getX()
	{
		return x;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	//Constructores
	public Punto()
	{
		x=0.0;
		y=0.0;
	}
	public Punto (Punto punto)
	{
		this.x=punto.x;
		this.y=punto.y;
	}
	public Punto (double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	//Métodos añadidos
	@Override
	public String toString()
	{
		String s=("Coordenada X: "+getX()+", Coordenada Y: "+getY());
		return s;
	}
	@Override
	public int hashCode()
	{
		return((int)((getX()*getY()*977)/7));
	}
	@Override
	public boolean equals(Object z)
	{
		boolean igual=false;
		if (z!=null && z instanceof Punto)
		{
			Punto punto=(Punto) z;
			if(x==punto.x && y==punto.y)
			{
				igual=true;
			}
		}
		return igual;
	}
	public int compareTo(Punto punto)
	{
		int compara=0;
		if(this.x>punto.getX())
		{
			compara=1;
		}
		else if(this.x<punto.getY())
		{
			compara=-1;
		}
		return compara;
	}
	@Override
	public Punto clone()
	{
		Punto copia=null;
		try
		{
			copia=(Punto)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
}


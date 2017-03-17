/*
 * Clase fecha
 * 
 * Propiedades relevantes:
 * 
 * Dia -> Entero consultable y modificable
 * Mes -> Entero consultable y modificable
 * Año -> Entero consultable y modificable
 * 
 * Propiedades derivadas:
 * 
 * 
 * Restricciones:
 * 
 * El día debe estar situado entre 28 y 31 ambos inclusive dependiendo el mes y el año
 * El mes debe estar situado entre 1 y 12 ambos inclusive
 * El año debe ser mayor que 1582, incluyendo éste
 * 
 * Getes y setes:
 * 
 * int getDia();
 * void setDia(int dia);
 * int getMes();
 * void setMes(int mes);
 * int getAnyo();
 * void setAnyo(int anyo);
 * 
 * 
 * Métodos añadidos:
 * 
 * boolean esBisiesto(int anyo);
 * 
 */

package Fecha;

public class Fecha implements Cloneable, Comparable <Fecha> {
	

	private int dia;
	private int mes;
	private int anyo;
	
	
	//getes y setes
	public int getDia()
	{
		return dia;
	}
	public void setDia(int dia)
	{
		
			this.dia=dia;
		
	}
	public int getMes()
	{
		return mes;
	}
	public void setMes(int mes)
	{
		this.mes=mes;
	}
	public int getAnyo ()
	{
		return anyo;
	}
	public void setAnyo(int anyo)
	{
		this.anyo=anyo;
	}
	
	//constructores
	public Fecha()
	{
		dia=1;
		mes=1;
		anyo=1582;
	}
	public Fecha(int dia, int mes, int anyo) throws FechaExcepcion
	{
		if(anyo>=1582)
		{
			this.anyo=anyo;
		}
		else
		{
			FechaExcepcion anyoExcepcion = new FechaExcepcion("El anyo no es valido");
			//throw anyoExcepcion;
			//throw new FechaExcepcion("El anyo no es valido");
		}
		if(mes>=1&&mes<=12)
		{
			this.mes=mes;
		}
		else
		{
			FechaExcepcion mesExcepcion=new FechaExcepcion("El mes no es valido");
			//throw mesExcepcion;
			//throw new FechaExcepcion("El mes no es valido");
		}
		switch(mes)
		{		
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia>=1&&dia<=31)
					{
						this.dia=dia;
					}
					else
					{
						FechaExcepcion DiaExcepcion=new FechaExcepcion("El dia no es valido");
						//throw DiaExcepcion;
						//throw new FechaExcepcion("El dia no es valido");
					}
				break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia>=1&&dia<=30)
					{
						this.dia=dia;
					}
					else
					{
						FechaExcepcion DiaExcepcion=new FechaExcepcion("El dia no es valido");
						//throw DiaExcepcion;
						//throw new FechaExcepcion("El dia no es valido");
					}
				break;
				case 2:
					if((dia>=1&&dia<=28)||(dia==29&&esBisiesto(anyo)==true))
					{
						this.dia=dia;
					}
					else
					{
						FechaExcepcion DiaExcepcion= new FechaExcepcion("El dia no es valido");
						//throw DiaExcepcion;
						//throw new FechaExcepcion("El dia no es valido");
					}
				break;
		}
	}
	public Fecha(Fecha fecha)
	{
		this.dia=fecha.dia;
		this.mes=fecha.mes;
		this.anyo=fecha.anyo;
	}
	//Métodos añadidos
	public String toString()
	{
		String s=("Dia: "+getDia()+", Mes: "+getMes()+", Anyo: "+getAnyo());
		return s;
	}
	public int hashCode()
	{
		return((int)((getDia()*3)+getAnyo()*2)/(5*getAnyo()));
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método comprueba si dos objetos de esta clase son iguales o no
	 * Prototipo: public boolean equals(Object x)
	 * Precondiciones: El año es mayor que 1582, y el dia está entre 28 y 31 dependiendo del mes y el año. Los meses están entre 1 y 12
	 * Entrada: Un objeto de la clase Object
	 * Salida: Un valor booleano
	 * Postcondiciones: true si son iguales y false si no lo son.
	 * Criterio de igualdad: Los dos objetos serán iguales si los días, los meses y los años son iguales
	 * E/S: No hay
	 */
	public boolean equals(Object x)
	{
		boolean igual=false;
		if (x!=null && x instanceof Fecha)
		{
			Fecha fecha=(Fecha) x;
			if(dia==fecha.dia && mes==fecha.mes && anyo==fecha.anyo)
			{
				igual=true;
			}
		}
		return igual;
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método compara dos objetos 
	 * Prototipo: public int compareTo(Fecha fecha)
	 * Precondiciones: El año es mayor que 1582, y el dia está entre 28 y 31 dependiendo del mes y el año. Los meses están entre 1 y 12
	 * Entrada: Un objeto de la clase fecha
	 * Salida: Un número entero 
	 * Postcondiciones: 0 si son iguales, 1 si el año del primer objeto es mayor y -1 si el año del objeto con el que se compara es mayor
	 * Orden natural: La fecha mayor es la que tiene el año más alto
	 * E/S: No hay
	 */
	public int compareTo(Fecha fecha)
	{
		int compara=0;
		if(this.getAnyo()>fecha.getAnyo())
		{
			compara=1;
		}
		else if(this.getAnyo() < fecha.getAnyo())
		{
			compara=-1;	
		}
		return compara;
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método clona un objeto
	 * Prototipo: public Fecha clone()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: Un objeto 
	 * Postcondiciones: Si es posible clonar devuelve un objeto, si no es posible imprime en pantalla que no ha sido posible
	 * E/S: No hay
	 */
	public Fecha clone()
	{
		Fecha copia=null;
		try
		{
			copia=(Fecha)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	//Funcionalidades añadidas
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método comprueba si un año es bisiesto
	 * Prototipo: public boolean esBisiesto(int anyo)
	 * Precondiciones: El año es mayor o igual que 1582
	 * Entrada: Un número entero
	 * Salida: Un valor booleano
	 * Postcondiciones: true si es bisiesto y false si no lo es
	 * E/S: No hay
	 */
	public boolean esBisiesto(int anyo)
	{
		boolean esBisiesto=false;
		if((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0)))
		{
			esBisiesto=true;
		}
		return esBisiesto;
	}
	
}


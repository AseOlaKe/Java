package ligaFutbol;

import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades b�sicas:
 * 
 * - Identificador, entero consultable
 * - Nombre, String consultable y modificable
 * - Puntos, entero consultable y modificable
 * - partidosJugados, entero consultable y modificable
 * - golesMarcados, entero consultable y modificable
 * - golesRecibidos, entero consultable y modificable
 * - posicion, entero consultable
 *
 * Propiedades derivadas:
 * 
 * - diferenciaGoles, entero consultable
 * 
 * Propiedades compartidas:
 * 
 * - contador, entero consultable
 * 
 * M�todos consultables y modificadores:
 * 
 * int getIdentificador()
 * String getNombre()
 * void setNombre(String nombre)
 * void setPuntos(int puntos)
 * int getPuntos()
 * int getPartidosJugados()
 * void setPartidosJugados(int partidosJugados)
 * int getGolesMarcados()
 * void setGolesMarcados(int golesMarcados)
 * int getGolesRecibidos()
 * void setgolesRecibidos(int golesRecibidos)
 * int getDiferenciaGoles()
 * 
 * Restricciones:
 * 
 * Los goles, los puntos y los partidos jugados no pueden ser menores a 0
 * 
 * M�todos a�adidos:
 * 
 * 
 */
public class Equipo implements Cloneable, Comparable<Equipo>{
	
	private String nombre;
	private int puntos;
	private int partidosJugados;
	private int golesMarcados;
	private int golesRecibidos;
	private int identificador;
	private static int contador;
	private int posicion;
	
	//Constructores
	//Vac�o
	public Equipo ()
	{
		nombre="Default";
		puntos=0;
		partidosJugados=0;
		golesMarcados=0;
		golesRecibidos=0;
		identificador=contador;
		contador++;
		posicion=1;
	}
	//Por par�metros
	public Equipo(String nombre, int puntos, int partidosJugados, int golesMarcados, int golesRecibidos, int posicion) throws ligaException
	{
		this.nombre=nombre;
		if(puntos>=0)
		{
			this.puntos=puntos;
		}
		else
		{
			throw new ligaException("Los puntos deben ser positivos o valer 0");
		}
		if(partidosJugados>=0)
		{
			this.partidosJugados=partidosJugados;
		}
		else
		{
			throw new ligaException("Los partidos jugados deben ser positivos o valer 0");
		}
		if(golesMarcados>=0)
		{
			this.golesMarcados=golesMarcados;
		}
		else
		{
			throw new ligaException("Los goles deben ser positivos o valer 0");
		}
		if(golesRecibidos>=0)
		{
			this.golesRecibidos=golesRecibidos;
		}
		else
		{
			throw new ligaException("Los goles deben ser positivos o valer 0");
		}
		this.identificador=contador;
		this.posicion=posicion;
		contador++;
	}
	//De copia
	public Equipo(Equipo equipo)
	{
		this.nombre=equipo.nombre;
		this.puntos=equipo.puntos;
		this.partidosJugados=equipo.partidosJugados;
		this.golesMarcados=equipo.golesMarcados;
		this.golesRecibidos=equipo.golesRecibidos;
		this.identificador=equipo.identificador;
		this.posicion=equipo.posicion;
	}
	//M�todos modificadores y consultores
	public int getIdentificador()
	{
		return identificador;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setPuntos(int puntos) throws ligaException
	{
		if(puntos>=0)
		{
			this.puntos=puntos;
		}
		else
		{
			throw new ligaException("Los puntos deben ser positivos o valer 0");
		}
	}
	public int getPuntos()
	{
		return puntos;
	}
	public void setPartidosJugados(int partidosJugados) throws ligaException
	{
		if(partidosJugados>=0)
		{
			this.partidosJugados=partidosJugados;
		}
		else
		{
			throw new ligaException("Los partidos jugados deben ser positivos o valer 0");
		}
	}
	public int getPartidosJugados()
	{
		return partidosJugados;
	}
	public void setGolesMarcados(int golesMarcados) throws ligaException
	{
		if(golesMarcados>=0)
		{
			this.golesMarcados=golesMarcados;
		}
		else
		{
			throw new ligaException("Los goles deben ser positivos o valer 0");
		}
	}
	public int getGolesMarcados()
	{
		return golesMarcados;
	}
	public void setGolesRecibidos(int golesRecibidos) throws ligaException
	{
		if(golesRecibidos>=0)
		{
			this.golesRecibidos=golesRecibidos;
		}
		else
		{
			throw new ligaException("Los goles deben ser positivos o valer 0");
		}
	}
	public int getGolesRecibidos() 
	{
		return golesRecibidos;
	}
	public int getPosicion() 
	{
		return posicion;
	}
	public int getDiferenciaDeGoles()
	{
		return golesMarcados-golesRecibidos;
	}
	//M�todos sobrecargados y sobreescritos
	@Override
	public int hashCode() 
	{
		
		return Objects.hash(identificador,nombre,golesMarcados,golesRecibidos,puntos,partidosJugados,posicion);
	}
	//Criterio igualdad: Dos objetos ser�n iguales si est�n tienen los mismos puntos y tienen la misma diferencia de goles
	@Override
	public boolean equals(Object x) 
	{
		boolean igual=false;
		if(x!=null && x instanceof Equipo)
		{
			Equipo equipo= (Equipo)x;
			if(this.nombre==equipo.getNombre())
			{
				igual=true;
			}
		}
		return igual;
	}
	@Override
	public String toString() 
	{
		return  nombre + ", " + puntos + ", " + partidosJugados
				+ ", " + golesMarcados + ", " + golesRecibidos + ", "
				+ identificador + ", " + posicion;
	}
	@Override
	public Equipo clone()
	{
		Equipo copia=null;
		try
		{
			copia=(Equipo)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	//Criterio de comparaci�n: Ser� mayor el equipo que mayor puntos tenga, o si sus puntos son iguales, depender� del gol average
	public int compareTo(Equipo equipo)
	{
		int compara=0;
		if((this.puntos<equipo.puntos)||((this.puntos==equipo.puntos)&&(getDiferenciaDeGoles()<equipo.getDiferenciaDeGoles())))
		{
			compara=1;
		}
		else if((this.puntos>equipo.puntos)||((this.puntos==equipo.puntos)&&(getDiferenciaDeGoles()>equipo.getDiferenciaDeGoles())))
		{
			compara=-1;
		}
		return compara;
	}
	
	
	
	
	
	
}
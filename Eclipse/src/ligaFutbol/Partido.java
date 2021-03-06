package ligaFutbol;
/*
 * Interfaz
 * 
 * Propiedades b�sicas:
 * 
 * -equipoLocal, Equipo consultable
 * -equipoVisitante, Equipo consultable
 * -GolesLocal, Entero consultable y modificable
 * -GolesVisitante, Entero consultable
 * 
 * Propiedades derivadas:
 * - No hay
 * Propiedades compartidas:
 * - No hay
 * 
 * M�todos consultores y modificadores:
 * 
 * String getNombreLocal()
 * 
 * String getEquipoVisitante()
 * 
 * int getGolesLocal()
 * void setGolesLocal(int golesLocal)
 * 
 * int getGolesVisitante()
 * void setGolesVisitante(int golesvisitante)
 * 
 * M�todos a�adidos:
 * 
 *
 * 
 */

import java.util.Objects;

public class Partido implements Cloneable, Comparable<Partido> {
	
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	
	//Constructores
	//Vac�o
	public Partido() 
	{
		
		equipoLocal=new Equipo();
		equipoVisitante=new Equipo();
		golesLocal=0;
		golesVisitante=0;
	}
	//Por par�metros
	public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesLocal, int golesVisitante) throws ligaException
	{
		this.equipoLocal=equipoLocal;
		this.equipoVisitante=equipoVisitante;
		if(golesLocal>=0)
		{
			this.golesLocal=golesLocal;
		}
		else
		{
			throw new ligaException("Los goles deben ser mayores a 0");
		}
		if(golesVisitante>=0)
		{	
			this.golesVisitante=golesVisitante;
		}
		else
		{
			throw new ligaException("Los goles deben ser mayores a 0");
		}
	}
	//De copia
	public Partido(Partido partido)
	{
		this.equipoLocal=partido.equipoLocal;
		this.equipoVisitante=partido.equipoVisitante;
		this.golesLocal=partido.golesLocal;
		this.golesVisitante=partido.golesVisitante;
	}
	//M�todos consultores y modificadores
	
	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}
	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}
	public Equipo getEquipoLocal() 
	{
		return equipoLocal;
	}
	public Equipo getEquipoVisitante() 
	{
		return equipoVisitante;
	}
	public int getGolesLocal() 
	{
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) throws ligaException 
	{
		if(golesLocal>=0)
		{
			this.golesLocal=golesLocal;
		}
		else
		{
			throw new ligaException("Los goles deben ser mayores a 0");
		}
	}
	public int getGolesVisitante() 
	{
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) throws ligaException 
	{
		if(golesVisitante>=0)
		{	
			this.golesVisitante=golesVisitante;
		}
		else
		{
			throw new ligaException("Los goles deben ser mayores a 0");
		}
	}
	//M�todos sobrecargados y sobreescritos
	@Override
	public String toString() 
	{
		return equipoLocal + ", " + equipoVisitante + ", "+ golesLocal + ", " + golesVisitante;
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(equipoLocal,equipoVisitante,golesLocal,golesVisitante);
	}
	//Criterio de igualdad: Si los equipos son iguales, el partido es el mismo
	@Override
	public boolean equals(Object x) 
	{
		boolean igual=false;
		if(x!=null && x instanceof Partido)
		{
			Partido partido=(Partido)x;
			if(this.equipoLocal==partido.equipoLocal&&this.equipoVisitante==partido.equipoVisitante)
			{
				igual=true;
			}
		}
		return igual;
	}
	public int compareTo(Partido partido)
	{
		int compara=0;
		if(((this.golesLocal>partido.golesLocal)&&(this.golesLocal>this.golesVisitante))||((this.golesVisitante>partido.golesVisitante)&&(this.golesVisitante>this.golesLocal)))
		{
			compara=1;
		}
		else if(((this.golesLocal<partido.golesLocal)&&(partido.golesLocal>partido.golesVisitante))||((this.golesVisitante<partido.golesVisitante)&&(partido.golesVisitante>partido.golesLocal)))
		{
			compara=-1;
		}
		return compara;
	}
	@Override
	public Partido clone()
	{
		Partido copia=null;
		try
		{
			copia=(Partido)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	
	

}

//package hundirFlota;
package hundirLaFlota;
import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades básicas:
 * 
 * Tamaño, entero consultable
 * Direccion, String modificable y consultable
 * Posicion, String modificable y consultable
 * 
 * Propiedades derivadas:
 * 
 * No hay
 * 
 * Propiedades compartidas:
 * 
 * No hay
 * 
 * Consultores y modificadores:
 * 
 * int [] getTamanyo()
 * String getDireccion()
 * String getPosicion()
 * void setDireccion(String direccion)
 * void setPosicion(String posicion)
 * 
 * 
 * Restricciones:
 * 
 * El tamaño no puede ser menor o igual a 0
 * La posicion debe ser horizontal o vertical
 * La direccion debe ser arriba, abajo, izquierda o derecha
 * 
 * Métodos añadidos:
 * 
 * cargarArrayBarco(Barco barco)
 * 
 */
public class Barco implements Cloneable, Comparable<Barco> {


	private int[] tamanyo;
	private String posicion;
	private String direccion;

	// Constructores
	// Vacío
	public Barco() {
		tamanyo =null;
		posicion=null;
		direccion=null;
	}

	// Por parámetros
	//@SuppressWarnings("unused")
	public Barco(int[] tamanyo, String posicion, String direccion) throws FlotaExcepcion{
		

		this.tamanyo = tamanyo;
		if(posicion.equals("Horizontal")||posicion.equals("Vertical"))
		{
			this.posicion=posicion;
		}
		else
		{
			throw new FlotaExcepcion("El barco debe encontrarse en posicion horizontal o vertical");
		}
		if(((direccion.equals("Arriba")||direccion.equals("Abajo"))&&(posicion.equals("Vertical")))||((direccion.equals("Derecha")||direccion.equals("Izquierda"))&&(posicion.equals("Horizontal"))))
		{
			this.direccion=direccion;
		}
		else
		{
			throw new FlotaExcepcion("Si eliges que el barco lo quieres en vertical, solo puedes elegir ponerlo hacia arriba o hacia abajo. En el caso contrario, solo puedes ponerlo hacia la izquierda o hacia la derecha");
		}
	}

	// De copia
	public Barco(Barco barco) {
		this.tamanyo = barco.tamanyo;
		this.posicion=barco.posicion;
		this.direccion=barco.direccion;
	}

	// Consultores y modificadores
	public int[] getTamanyo() {
		return tamanyo;
	}
	public void setPosicion(String posicion)throws FlotaExcepcion{
		
		if(posicion.equals("Horizontal")||posicion.equals("Vertical"))
		{
			this.posicion=posicion;
		}
		else
		{
			throw new FlotaExcepcion("El barco debe encontrarse en posicion horizontal o vertical");
		}
	}
	public String getPosicion(){
		return posicion;
	}
	public void setDireccion(String direccion) throws FlotaExcepcion{
		
		if(((direccion.equals("Arriba")||direccion.equals("Abajo"))&&(posicion.equals("Vertical")))||((direccion.equals("Derecha")||direccion.equals("Izquierda"))&&(posicion.equals("Horizontal"))))
		{
			this.direccion=direccion;
		}
		else
		{
			throw new FlotaExcepcion("Si eliges que el barco lo quieres en vertical, solo puedes elegir ponerlo hacia arriba o hacia abajo. En el caso contrario, solo puedes ponerlo hacia la izquierda o hacia la derecha");
		}
	}
	public String getDireccion(){
		return direccion;
	}
	
	//Métodos sobrecargados y sobreescritos
	@Override
	public String toString()
	{
		return this.getTamanyo()+", "+this.getDireccion()+", "+this.getPosicion();
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(this.getTamanyo(), this.getDireccion(), this.getPosicion());
	}
	//Criterio de igualdad: Dos barcos serán iguales si son del mismo tamaño, tienen la misma posicion y estan en la misma direccion
	@Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		if(x!=null && x instanceof Barco)
		{
			Barco barco=(Barco) x;
			if(this.tamanyo.length==barco.tamanyo.length&&this.getDireccion()==barco.getDireccion()&&this.getPosicion()==barco.getPosicion())
			{
				igual=true;
			}
		}
		return igual;
	}
	@Override
	public Barco clone()
	{
		Barco copia=null;
		try
		{
			copia=(Barco)super.clone();
		}
		catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	//Orden natural: Será mayor el barco de mayor tamaño
	public int compareTo(Barco barco)
	{
		int compara=0;
		if(this.tamanyo.length>barco.tamanyo.length)
		{
			compara=1;
		}
		else if (this.tamanyo.length<barco.tamanyo.length)
		{
			compara=-1;
		}
		return compara;
	}
	//Métodos añadidos
	/*
	 * Interfaz
	 * 
	 * Este subprograma carga el array del atributo tamaño del objeto barco
	 * Prototipo: boolean[]cargarArrayBarco(Barco barco)
	 * Precondiciones: El tamaño del array de barco es entre 1 y 5
	 * Entradas: Un array booleano
	 * Salidas:
	 * Postcondiciones: Todos los elementos del atributo tamaño serán true
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static boolean[]cargarArrayBarco(Barco barco)
	 * {
	 * 		boolean[]array=null;
	 * 		return array;
	 * }
	 */
	public void cargarArrayBarco(Barco barco, String nombreBarco)
	{
		int i;
		
		switch(nombreBarco)
		{	
			case "Portaaviones":
				
				for(i=0;i<barco.getTamanyo().length;i++)
				{
					barco.getTamanyo()[i]=4;
				}
			break;
			case "Destructor":
				for(i=0;i<barco.getTamanyo().length;i++)
				{
					barco.getTamanyo()[i]=3;
				}
				
			break;
			case "Submarino":
				for(i=0;i<barco.getTamanyo().length;i++)
				{
					barco.getTamanyo()[i]=2;
				}
				
			break;
			case "Lancha":
				for(i=0;i<barco.getTamanyo().length;i++)
				{
					barco.getTamanyo()[i]=1;
				}
				
			break;
		}
	}

}

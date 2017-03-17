//package hundirFlota;
//package hundirLaFlota;

import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades basicas:
 * 
 * Nombre, String consultable y modificable
 * 
 * 
 * Propiedades derivadas: No hay
 * Propiedades compartidas: Barcos, Barco[] consultable
 * 
 * M�todos consultores y modificadores:
 * 
 * void setNombre(String nombre)
 * Barco getBarco()
 * String getNombre()
 * 
 * Restricciones: No hay
 * 
 * M�todos a�adidos: No hay
 * 
 */
public class Jugador implements Cloneable {

	private String nombre;
	private static final Barco[] BARCOS=new Barco[5];
	//Constructores
	public Jugador()
	{
		nombre=null;
	}
	public Jugador(String nombre)
	{
		this.nombre=nombre;
	}
	public Jugador(Jugador jugador)
	{
		this.nombre=jugador.nombre;
	}
	//M�todos consultores y modificadores
	public Barco[] getBarcos()
	{
		return BARCOS;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	//M�todos sobreescritos y sobrecargados
	@Override
	public int hashCode()
	{
		return Objects.hash(this.getNombre(),this.getBarcos());
	}
	@Override
	public String toString()
	{
		return this.getBarcos()+", "+this.getNombre();
	}
	/*
	 * No pongo equals ni compareTo, razones:
	 * 
	 * -No pongo equals porque creo que la clase deber�a de tener m�s atributos para hacer el equals
	 * -No pongo compareTo porque esta clase no tiene atributos con los que se pueda comparar, ya que el tama�o del array Barco[]barcos siempre va a ser de tama�o 5
	 */
	@Override
	public Jugador clone()
	{
		Jugador copia=null;
		try
		{
			copia=(Jugador)super.clone();
			//copia.BARCOS=copia.BARCOS.clone(); //Me da error, no se puede clonar algo final(?)
		}
		catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	
	

}

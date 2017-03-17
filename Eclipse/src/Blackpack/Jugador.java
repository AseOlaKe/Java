/*
 * Interfaz
 * 	
 * Propiedades
 * 	Basicas:
 * 	Nombre tipo String - consultable y modificable
 * 	Dinero tipo int - consultable y modificable
 * 
 * Getes y Setes
 * 	String getNombre();
 * 	void setNombre(String nombre);
 * 	
 * 	int getDinero();
 * 	void setDinero(int dinero);
 * 
 * Funcionalidades añadidas:
 * 	
 * Restricciones:
 * 	La longitud del nombre debe estar comprendida entre 3 y 20 caracteres
 * 	El dinero debe estar comprendido entre 0 y 2000
 * 
 */

public class Jugador implements Cloneable, Comparable <Jugador>{
	
	//Propiedades
	private String nombre;
	private double dinero;
	
	//Constructores
	public Jugador(){
		nombre="Pack";
		dinero=2000;
	}
	
	public Jugador(String nombre, int dinero){
		this.nombre=nombre;
		this.dinero=dinero;
	}
	
	public Jugador(Jugador x1)
	{
		this.nombre=x1.nombre;
		this.dinero=x1.dinero;
	}
	//Getes y Setes
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public double getDinero(){
		return dinero;
	}
	
	public void setDinero(double dinero){
		this.dinero=dinero;
	}
	//Métodos añadidos
	public String toString()
	{
		String s=("Nombre: "+getNombre()+", Dinero: "+getDinero());
		return s;
	}
	public int hashCode()
	{
		return((int)((getDinero()*664579)/7));
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método compara dos objetos 
	 * Prototipo: public int compareTo(Jugador x1)
	 * Precondiciones: El dinero siempre vale 2000
	 * Entrada: Un objeto de la clase Carta
	 * Salida: Un número entero 
	 * Postcondiciones: 0 si son iguales, 1 si el año del primer objeto es mayor y -1 si el año del objeto con el que se compara es mayor
	 * Orden natural: El objeto mayor es el que tenga más dinero
	 * E/S: No hay
	 */
	public int compareTo(Jugador x1)
	{
		int compara=0;
		if(this.getDinero()>x1.getDinero())
		{
			compara=1;
		}
		else if(this.getDinero()<x1.getDinero())
		{
			compara=-1;
		}
		return compara;
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método clona un objeto
	 * Prototipo: public Jugador clone()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: Un objeto 
	 * Postcondiciones: Si es posible clonar devuelve un objeto, si no es posible imprime en pantalla que no ha sido posible
	 * E/S: No hay
	 */
	 @Override
	public Jugador clone()
	{
		Jugador copia=null;
		try
		{
			copia=(Jugador)super.clone();
		}catch(CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar");
		}
		return copia;
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método comprueba si dos objetos de esta clase son iguales o no
	 * Prototipo: public boolean equals(Object x)
	 * Precondiciones: El dinero siempre vale 2000
	 * Entrada: Un objeto de la clase Object
	 * Salida: Un valor booleano
	 * Postcondiciones: true si son iguales y false si no lo son.
	 * Criterio de igualdad: Los dos objetos son iguales si tienen el mismo dinero y el mismo nombre
	 * E/S: No hay
	 */
	public boolean equals(Object x)
	{
		boolean igual=false;
		if (x!=null && x instanceof Jugador)
		{
			Jugador x1=(Jugador) x;
			if(dinero==x1.dinero && nombre==x1.nombre)
			{
				igual=true;
			}
		}
		return igual;
	}
}

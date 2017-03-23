package Cadenas;
/*
 * Interfaz
 * 
 * Propiedades B�sicas: cadena, String consultable y modificable
 * Propiedades derivadas: No tiene
 * Propiedades compartidas: No tiene
 * M�todos consultores y modificadores: void setCadena(String cadena), String getCadena()
 * M�todos a�adidos:
 * -Invertir cadena
 * -Poner en m�yus su primer caracter
 * -Eliminar espacios en blanco
 * -FormarPlural
 */
public class Cadena {
	
	private String cadena;
	
	//Constructores
	public Cadena()
	{
		cadena=" ";
	}
	public Cadena(String cadena)
	{
		this.cadena=cadena;
	}
	public Cadena(Cadena cadena)
	{
		this.cadena=cadena.cadena;
	}
	//M�todos consultores y modificadores
	public String getCadena()
	{
		return cadena;
	}
	public void setCadena(String cadena)
	{
		this.cadena=cadena;
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo invierte una cadena
	 * Prototipo: public void cadenaInv()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * E/S: Una cadena
	 * 
	 * RESGUARDO
	 * 
	 * public void cadenaInv()
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public void cadenaInv()
	{
		StringBuilder cadena= new StringBuilder(this.cadena);
		cadena.reverse();
		this.cadena=cadena.toString();
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo pone en may�sculas el primer car�cter de una cadena
	 * Prototipo: public void charMayus()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * E/S: Una cadena
	 * 
	 * RESGUARDO
	 * 
	 * public void cadenaInv()
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public void charMayus()
	{
		cadena=Character.toUpperCase(cadena.charAt(0))+cadena.substring(1);
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo elimina los espacios en blanco de una cadena
	 * Prototipo: public void eliminarEspacioBlanco()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * E/S: Una cadena
	 * 
	 * RESGUARDO
	 * 
	 * public void eliminarEspacioBlanco()
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public void eliminarEspacioBlanco()
	{
		cadena=cadena.replace(" ","");
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo escribe la �ltima palabra de la cadena en plural
	 * Prototipo: public void formarPlural()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * E/S: Una cadena
	 * 
	 * RESGUARDO
	 * 
	 * public void formarPlural()
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public void formarPlural()
	{
		cadena.toLowerCase();
		if(Character.isDigit(cadena.charAt(cadena.length()-1)))
		{
			System.out.println("Cadena no valida para formar el plural");
		}
		else if(cadena.endsWith("a")||cadena.endsWith("e")||cadena.endsWith("i")||cadena.endsWith("o")||cadena.endsWith("u"))		
		{
			cadena=cadena+"s";
		}
		else
		{
			cadena=cadena+"es";
		}
	}
}

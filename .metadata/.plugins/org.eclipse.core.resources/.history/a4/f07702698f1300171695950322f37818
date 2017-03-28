package ligaFutbol;
/*
 * Interfaz
 * 
 * Propiedades básicas:
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
 * Métodos consultables y modificadores:
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
 * 
 * Métodos añadidos:
 * 
 * 
 */
public class Equipo {
	
	private String nombre;
	private int puntos;
	private int partidosJugados;
	private int golesMarcados;
	private int golesRecibidos;
	private int identificador;
	private static int contador;
	private int posicion;
	
	//Constructores
	//Vacío
	public Equipo ()
	{
		nombre="Default";
		puntos=0;
		partidosJugados=0;
		golesMarcados=0;
		golesRecibidos=0;
		identificador=contador;
		contador++;
		posicion=0;
	}
	//Por parámetros
	public Equipo(String nombre, int puntos, int partidosJugados, int golesMarcados, int golesRecibidos, int posicion)
	{
		this.nombre=nombre;
		this.puntos=puntos;
		this.partidosJugados=partidosJugados;
		this.golesMarcados=golesMarcados;
		this.golesRecibidos=golesRecibidos;
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
	

}

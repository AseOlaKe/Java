/*
 * Interfaz
 * 
 * Propiedades:
 * 	Basicas: 
 * 	Valor tipo entero - consultable y modificable
 * 	Valor Impreso tipo entero - consultable y modificable
 * 
 * Getes y Setes:
 * 	int getValor();
 * 	int getValorImpreso();
 * 	void setVAlor(int valor);
 * 	void setValorImpreso(int valorImpreso);
 * 
 * Funcionalidades añadidas
 * 	int setAs1();
 * 
 * Restricciones:
 * 	El valor debe estar comprendido entre 1 y 11
 * 	
 */

public class Carta{
	
	//Propiedades
	private int valor;
	private int valorImpreso;
	
	//Constructores
	public Carta(){
		valor=0;
		valorImpreso=0;
	}
	
	public Carta(int valor, int valorImpreso){
		this.valor=valor;
		this.valorImpreso=valorImpreso;
	}
	public Carta(Carta carta1)
	{
		this.valor=carta1.valor;
		this.valorImpreso=carta1.valorImpreso;
	}
	
	//Consultores
	public int getValor(){
		return valor;
	}
	
	public int getValorImpreso(){
		return valorImpreso;
	}
	//Modificadores
	public void setValor(int valor){
		this.valor=valor;
	}
	
	public void setValorImpreso(int valorImpreso){
		this.valorImpreso=valorImpreso;
	}
	
	//Funcionalidades añadidas
	public void setAs1(){
		this.valor=1;
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método imprime una carta oculta
	 * Prototipo: public void imprimirCarta()
	 * Precondiciones: No hay
	 * Entrada: no hay
	 * Salida: No hay
	 * Postcondiciones: No hay
	 * E/S: No hay
	 */
	public void imprimirCarta()
	{
		switch(valorImpreso)
		{
			case 1:
				System.out.println("....###.....######.");
				System.out.println("...##.##...##....##");
				System.out.println("..##...##..##......");
				System.out.println(".##.....##..######.");
				System.out.println(".#########.......##");
				System.out.println(".##.....##.##....##");
				System.out.println(".##.....##..######.");
			break;
			case 2:
				System.out.println("..#######.");
				System.out.println(".##.....##");
				System.out.println("........##");
				System.out.println("..#######.");
				System.out.println(".##.......");
				System.out.println(".##.......");
				System.out.println(".#########");
			break;
			case 3:
				System.out.println("..#######.");
				System.out.println(".##.....##");
				System.out.println("........##");
				System.out.println("..#######.");
				System.out.println("........##");
				System.out.println(".##.....##");
				System.out.println("..#######.");
			break;
			case 4:
				System.out.println(".##.......");
				System.out.println(".##....##.");
				System.out.println(".##....##.");
				System.out.println(".##....##.");
				System.out.println(".#########");
				System.out.println(".......##.");
				System.out.println(".......##.");
			break;
			case 5:
				System.out.println(".########");
				System.out.println(".##......");
				System.out.println(".##......");
				System.out.println(".#######.");
				System.out.println(".......##");
				System.out.println(".##....##");
				System.out.println("..######.");
			break;
			case 6:
				System.out.println("..#######.");
				System.out.println(".##.....##");
				System.out.println(".##.......");
				System.out.println(".########.");
				System.out.println(".##.....##");
				System.out.println(".##.....##");
				System.out.println("..#######.");
			break;
			case 7:
				System.out.println(".########");
				System.out.println(".##....##");
				System.out.println(".....##..");
				System.out.println("....##...");
				System.out.println("...##....");
				System.out.println("...##....");
				System.out.println("...##....");
			break;
			case 8:
				System.out.println("..#######.");
				System.out.println(".##.....##");
				System.out.println(".##.....##");
				System.out.println("..#######.");
				System.out.println(".##.....##");
				System.out.println(".##.....##");
				System.out.println("..#######.");
			break;
			case 9:
				System.out.println("..#######.");
				System.out.println(".##.....##");
				System.out.println(".##.....##");
				System.out.println("..########");
				System.out.println("........##");
				System.out.println(".##.....##");
				System.out.println("..#######.");
			break;
			case 10:
				System.out.println("....##.....#####..");
				System.out.println("..####....##...##.");
				System.out.println("....##...##.....##");
				System.out.println("....##...##.....##");
				System.out.println("....##...##.....##");
				System.out.println("....##....##...##.");
				System.out.println("..######...#####..");
			break;
			case 11:
				System.out.println(".......##");
				System.out.println(".......##");
				System.out.println(".......##");
				System.out.println(".......##");
				System.out.println(".##....##");
				System.out.println(".##....##");
				System.out.println("..######.");
			break;
			case 12:
				System.out.println("..#######.");
				System.out.println(".##.....##");
				System.out.println(".##.....##");
				System.out.println(".##.....##");
				System.out.println(".##..##.##");
				System.out.println(".##....##.");
				System.out.println("..#####.##");
			break;
			case 13:
				System.out.println(".##....##");
				System.out.println(".##...##.");
				System.out.println(".##..##..");
				System.out.println(".#####...");
				System.out.println(".##..##..");
				System.out.println(".##...##.");
				System.out.println(".##....##");
			break;
			
			
		}
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método imprime una carta oculta
	 * Prototipo: public void imprimirCartaOculta()
	 * Precondiciones: No hay
	 * Entrada: no hay
	 * Salida: No hay
	 * Postcondiciones: No hay
	 * E/S: No hay
	 */
	public void imprimirCartaOculta(){
				System.out.println("..#######.");
				System.out.println(".##.....##");
				System.out.println(".......##.");
				System.out.println(".....###..");
				System.out.println("....##....");
				System.out.println("..........");
				System.out.println("....##....");
	}
	public String toString()
	{
		String s=("Valor: "+getValor()+", Valor impreso: "+getValorImpreso());
		return s;
	}
	public int hashCode()
	{
		return ((int)((getValor()*getValorImpreso()*664579)/getValor()));
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método compara dos objetos 
	 * Prototipo: public int compareTo(Carta carta1)
	 * Precondiciones: El valor de la carta está entre 1 y 10 y el valor impreso entre 1 y 13
	 * Entrada: Un objeto de la clase Carta
	 * Salida: Un número entero 
	 * Postcondiciones: 0 si son iguales, 1 si el año del primer objeto es mayor y -1 si el año del objeto con el que se compara es mayor
	 * Orden natural: El objeto mayor es el que tenga el valor de carta más alto
	 * E/S: No hay
	 */
	public int compareTo(Carta carta1)
	{
		int compara=0;
		if(this.getValorImpreso()>carta1.getValorImpreso())
		{
			compara=1;
		}
		else if(this.getValorImpreso()<carta1.getValorImpreso())
		{
			compara=-1;
		}
		return compara;
	}
	/*
	 * Interfaz
	 * 
	 * Comentario: Este método clona un objeto
	 * Prototipo: public Carta clone()
	 * Precondiciones: No hay
	 * Entrada: No hay
	 * Salida: Un objeto 
	 * Postcondiciones: Si es posible clonar devuelve un objeto, si no es posible imprime en pantalla que no ha sido posible
	 * E/S: No hay
	 */
	 @Override
	public Carta clone()
	{
		Carta copia=null;
		
		try
		{
			copia=(Carta)super.clone();
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
	 * Precondiciones: El valor de la carta está entre 1 y 10 y el valor impreso entre 1 y 13
	 * Entrada: Un objeto de la clase Object
	 * Salida: Un valor booleano
	 * Postcondiciones: true si son iguales y false si no lo son.
	 * Criterio de igualdad: Los dos objetos si el valor de las cartas son iguales
	 * E/S: No hay
	 */
	 @Override
	public boolean equals(Object x)
	{
		boolean igual=false;
		if (x!=null && x instanceof Carta)
		{
			Carta carta1=(Carta) x;
			if(valor==carta1.valor && valorImpreso==carta1.valorImpreso)
			{
				igual=true;
			}
		}
		return igual;
	}
}

package arboles;

import java.util.Objects;

/*
 * Interfaz
 * 
 * Propiedades b�sicas:
 * 
 * int numero, consultable y modificable
 * NodoArbol hijoDerecho, consultable y modificable
 * NodoArbol hijoIzquierdo, consultable y modificable
 * 
 * --No tiene propiedades compartidas ni derivadas
 * 
 * M�todos consultores y modificadores
 * 
 * int getNumero()
 * void setNumero(int numero)
 * 
 * M�todos a�adidos: No hay
 * Restricciones: No hay
 */
public class NodoArbol 
{
	
	
	private int numero;
	private NodoArbol hijoDerecho;
	private NodoArbol hijoIzquierdo;
	
	//Constructores
	//Vacio
	public NodoArbol()
	{
		numero=0;
		hijoDerecho=null;
		hijoIzquierdo=null;
	}
	//Por par�metros
	public NodoArbol(int numero)
	{
		this.numero=numero;
		this.hijoDerecho=null;
		this.hijoIzquierdo=null;
	}
	//De copia
	public NodoArbol(NodoArbol nodo)
	{
		this.numero=nodo.numero;
		this.hijoDerecho=nodo.hijoDerecho;
		this.hijoIzquierdo=nodo.hijoIzquierdo;
	}
	//M�todos consultores y modificadores
	public int getNumero() 
	{
		return numero;
	}
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	public NodoArbol getHijoDerecho() 
	{
		return hijoDerecho;
	}
	public NodoArbol getHijoIzquierdo() 
	{
		return hijoIzquierdo;
	}
	public void setHijoDerecho(NodoArbol hijoDerecho) 
	{
		this.hijoDerecho = hijoDerecho;
	}
	public void setHijoIzquierdo(NodoArbol hijoIzquierdo) 
	{
		this.hijoIzquierdo = hijoIzquierdo;
	}
	//M�todos sobreescritos y sobrecargados
	@Override
	public String toString()
	{
		return numero+"";
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(numero,hijoDerecho,hijoIzquierdo);
	}
	public int compareTo(NodoArbol nodo)
	{
		int compara=0;
		
		if(this.numero>nodo.numero)
		{
			compara=1;
		}
		else if(this.numero<nodo.numero)
		{
			compara=-1;
		}
		return compara;
	}
}

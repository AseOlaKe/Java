package arboles;
/*
 * Interfaz
 * 
 * Propiedades Básicas: NodoArbol nodoRaiz, consultable y modificable
 * 
 * --No propiedades derivadas ni compartidas.
 * 
 * Métodos añadidos:
 * 
 * -void agregarNodo(int numero)
 * -boolean buscarNodo(int numero)
 * -boolean estaVacio()
 */
public class ArbolBinario 
{
	private NodoArbol nodoRaiz; //Es la cabeza del árbol, si es null significa que el árbol está vacío
	
	public ArbolBinario() //Esta clase solo constará de este constructor vacío para crear el árbol, obviamente vacío.
	{
		nodoRaiz=null;
	}
	/*
	 * Interfaz
	 * 
	 * Este método comprueba si el arbol esta vacio
	 * Prototipo: boolean estaVacio()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: Un valor booleano
	 * Postcondiciones: True si esta vacio y false si no
	 * 
	 */
	public boolean estaVacio()
	{
		boolean vacio=false;
		if(nodoRaiz==null)
		{
			vacio=true;
		}
		return vacio;
	}
	/*
	 * Interfaz
	 * 
	 * Este método se encarga de agregar un nodo al árbol
	 * Prototipo: void agregarNodo(int numero)
	 * Precondiciones: No hay
	 * Entrada: Un entero
	 * Salida: Nada
	 * Postcondiciones: No hay
	 */
	public void agregarNodo(int numero)
	{
		NodoArbol nuevo= new NodoArbol(numero);
		boolean insertado=false;
		if(estaVacio())
		{
			nodoRaiz=nuevo;
		}
		else
		{
			NodoArbol aux=nodoRaiz;
			NodoArbol nodoPadre;
			while(!insertado)
			{
				nodoPadre=aux;
				if(numero<aux.getNumero())
				{
					aux=aux.getHijoIzquierdo(); //Si se da el caso de que hay una nueva iteracion, nodoPadre apuntará al hijo izquierdo de aux por lo que iremos recorriendo el arbol
					if(aux==null)
					{
						nodoPadre.setHijoIzquierdo(nuevo);
						insertado=true;
					}
				}
				else
				{
					aux=aux.getHijoDerecho();
					if(aux==null)
					{
						nodoPadre.setHijoDerecho(nuevo);
						insertado=true;
					}
				}
			}
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este método se encarga de buscar si un nodo existe en el arbol
	 * Prototipo: void buscarNodo(int numero)
	 * Precondiciones: No hay
	 * Entrada: Un entero
	 * Salida: Un valor booleano
	 * Postcondiciones: True si lo ha encontrado y false si no
	 */
	public boolean buscarNodo(int numero)
	{
		boolean encontrado=false;
		boolean finArbol=false;		//Para controlar el fin de Arbol, por si no encuentra el numero
		if(estaVacio())
		{
			finArbol=true;
		}
		else
		{	
			NodoArbol aux=nodoRaiz;
			while(!encontrado&&!finArbol)//!!!!!!!!!!!!!!!!!!!!!!!!!!
			{
				if(numero<aux.getNumero())
				{
					if(aux.getNumero()==numero)
					{
						encontrado=true;
					}
					else
					{
						aux=aux.getHijoIzquierdo();
						if(aux==null)
						{
							finArbol=true;
						}
					}
				}
				else
				{
						
					if(aux.getNumero()==numero)
					{
						encontrado=true;
					}
					else
					{
						aux=aux.getHijoDerecho();
						if(aux==null)
						{
							finArbol=true;
						}
					}
				}
			}
		}
		return encontrado;
		
	}
	
}

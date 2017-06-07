package arboles;
/*
 * Interfaz
 * 
 * Propiedades B�sicas: NodoArbol nodoRaiz, consultable y modificable
 * 
 * --No propiedades derivadas ni compartidas.
 * 
 * M�todos a�adidos:
 * 
 * -void agregarNodo(int numero)
 * -boolean buscarNodo(int numero)
 * -boolean estaVacio()
 */
public class ArbolBinario 
{
	private NodoArbol nodoRaiz; //Es la cabeza del �rbol, si es null significa que el �rbol est� vac�o
	
	public ArbolBinario() //Esta clase solo constar� de este constructor vac�o para crear el �rbol, obviamente vac�o.
	{
		nodoRaiz=null;
	}
	//M�todos consultores y modificadores
	public NodoArbol getNodoRaiz()
	{
		return nodoRaiz;
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo comprueba si el arbol esta vacio
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
	 * Este m�todo se encarga de agregar un nodo al �rbol
	 * Prototipo: void agregarNodo(int numero)
	 * Precondiciones: No hay
	 * Entrada: Un entero
	 * Salida: Nada
	 * Postcondiciones: No hay
	 */
	public void agregarNodo(int numero)
	{
		NodoArbol nuevo= new NodoArbol(numero);
		NodoArbol aux=nodoRaiz;
		NodoArbol nodoPadre;
		boolean insertado=false;
		if(estaVacio())
		{
			nodoRaiz=nuevo;
		}
		else
		{			
			while(!insertado)
			{
				nodoPadre=aux;
				if(numero<aux.getNumero())
				{
					aux=aux.getHijoIzquierdo(); //Si se da el caso de que hay una nueva iteracion, nodoPadre apuntar� al hijo izquierdo de aux por lo que iremos recorriendo el arbol
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
	 * Este m�todo se encarga de buscar si un nodo existe en el arbol		M�TODO QUE NO LE GUSTA A LEO
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
		NodoArbol aux=nodoRaiz;
		if(estaVacio())
		{
			finArbol=true;
		}
		else
		{			
			while(!encontrado&&!finArbol)//!!!!!!!!!!!!!!!!!!!!!!!!!!
			{
				if(numero<aux.getNumero())
				{
					
					aux=aux.getHijoIzquierdo();
					if(aux==null)
					{
						finArbol=true;
					}
				}
			
				else if (numero>aux.getNumero())
				{
						
	
					aux=aux.getHijoDerecho();
					if(aux==null)
					{
						finArbol=true;
					}
					
				}
				else
				{
					encontrado=true;
				}
			}
		}
		return encontrado;
		
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo recursivo recorre el �rbol InOrden e imprime los datos
	 * Precondiciones: No hay
	 * Entradas: Un nodo ra�z
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 */
	public void recorrerInOrden(NodoArbol nodoRaiz) //Caso base se dar� cuando llegue al fin del arbol
	{
		if(nodoRaiz!=null)
		{
			recorrerInOrden(nodoRaiz.getHijoIzquierdo());
			System.out.println(nodoRaiz.getNumero());
			recorrerInOrden(nodoRaiz.getHijoDerecho()); 
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo recursivo recorre el �rbol PreOrden e imprime los datos
	 * Precondiciones: No hay
	 * Entradas: Un nodo ra�z
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 */
	public void recorrerPreOrden(NodoArbol nodoRaiz)
	{
		if(nodoRaiz!=null)
		{
			System.out.println(nodoRaiz.getNumero());
			recorrerPreOrden(nodoRaiz.getHijoIzquierdo());		
			recorrerPreOrden(nodoRaiz.getHijoDerecho()); 
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo recursivo recorre el �rbol PostOrden e imprime los datos
	 * Precondiciones: No hay
	 * Entradas: Un nodo ra�z
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 */
	public void recorrerPostOrden(NodoArbol nodoRaiz)
	{
		if(nodoRaiz!=null)
		{
			recorrerPostOrden(nodoRaiz.getHijoIzquierdo());		
			recorrerPostOrden(nodoRaiz.getHijoDerecho());
			System.out.println(nodoRaiz.getNumero());
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo recursivo busca un dato InOrden
	 * Precondiciones: No hay
	 * Entradas: Un entero
	 * Salidas: Un valor booleano
	 * Postcondiciones: True si lo ha encontrado, false si no
	 */
	public boolean buscarInOrden(int numero, NodoArbol nodoRaiz)
	{
		boolean encontrado=false;
		if(nodoRaiz!=null)
		{
			if(nodoRaiz.getNumero()==numero)// VERSI�N ALPHA 0.0.0.1
			{
				encontrado=true;
			}
			else
			{	
				buscarInOrden(numero,nodoRaiz.getHijoIzquierdo());
				buscarInOrden(numero,nodoRaiz.getHijoDerecho());
			}
		}
		return encontrado;
	}
	
	
}

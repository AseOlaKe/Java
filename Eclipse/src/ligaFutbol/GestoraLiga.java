package ligaFutbol;

import java.util.Arrays;
import java.util.Random;

public class GestoraLiga 
{
	
	private Equipo[] clasificacion;
	
	//Constructores
	public GestoraLiga()
	{
		clasificacion=new Equipo[4];
	}
	public GestoraLiga(Equipo[]clasificacion)
	{
		this.clasificacion=clasificacion;
	}
	public GestoraLiga(GestoraLiga gestora)
	{
		this.clasificacion=gestora.clasificacion;
	}
	
	/*
	 * Interfaz
	 * 
	 * Este m�todo carga el array de clasificacion con los equipos ordenados aleatoriamente
	 * Prototipo: void cargarArray(Equipo equipo1, Equipo equipo2,Equipo equipo3,Equipo equipo4)
	 * Precondiciones: No hay
	 * Entradas: 4 objetos equipo
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * 	public void cargarArray(Equipo equipo1, Equipo equipo2,Equipo equipo3,Equipo equipo4)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void cargarArray(Equipo equipo1, Equipo equipo2, Equipo equipo3, Equipo equipo4)
	{
		Random aleatorio=new Random();
		int numero=0;
		int i=0;
		while(i<clasificacion.length)
		{
			numero=aleatorio.nextInt(4);
			if(numero==equipo1.getIdentificador())
			{
				if(buscarEquipo(equipo1)==-1)
				{
					clasificacion[i]=equipo1;
					i++;
				}
			}
			else if(numero==equipo2.getIdentificador())
			{
				if(buscarEquipo(equipo2)==-1)
				{
					clasificacion[i]=equipo2;
					i++;
				}
			}
			else if (numero==equipo3.getIdentificador())
			{
				if(buscarEquipo(equipo3)==-1)
				{	
					clasificacion[i]=equipo3;
					i++;
				}
			}
			else
			{
				if(buscarEquipo(equipo4)==-1)
				{
					clasificacion[i]=equipo4;
					i++;
				}
			}
		}
	}
	
	/*
	 * Interfaz
	 * 
	 * Este m�todo busca los equipos en la clasificacion
	 * Prototipo: int buscarEquipo (Equipo equipo)
	 * Precondiciones: No hay
	 * Entrada: un objeto equipo
	 * Salidas: Un entero
	 * Postcondiciones: -1 si no ha encontrado nada y del 0 al 3 si lo ha encontrado
	 * 
	 * RESGUARDO
	 * 
	 * public int buscarEquipo(Equipo equipo)
	 * {
	 * 		return 1;
	 * }
	 */
	public int buscarEquipo(Equipo equipo)
	{
		int i, encontrado=-1;
		for(i=0;encontrado==-1&&i<clasificacion.length;i++)
		{
			if(clasificacion[i]==equipo)
			{
				encontrado=i;
			}
		}
		return encontrado;
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo imprime la clasificaci�n de la liga
	 * Prototipo: void imprimirClasificacion()
	 * Precondiciones: No hay
	 * Entradas: No hay
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void imprimirClasificacion()
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void imprimirClasificacion()
	{
		int i;
		int contador=1;
		System.out.println("-----------------------------------------------------------");
		System.out.println("|                         CLASIFICACION                    |");
		System.out.println("| POS   |    N    |   P   |  PJ   |   GF  |  GC   |   DF   |");
		for(i=0; i<clasificacion.length;i++)
		{
			System.out.println("------------------------------------------------------------");
			System.out.println("|   "+contador+"   |   "+clasificacion[i].getNombre().substring(0,3)+"   |   "+clasificacion[i].getPuntos()+"   |   "+clasificacion[i].getPartidosJugados()+"   |   "+clasificacion[i].getGolesMarcados()+"   |   "+clasificacion[i].getGolesRecibidos()+"   |   "+clasificacion[i].getDiferenciaDeGoles()+"   |");
			contador++;
		}
		System.out.println("------------------------------------------------------------");
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo genera e imprime enfrentamientos aleatorios
	 * Prototipo: void generarImprimirEnfrentamientos(Partido partido1, Partido partido2)
	 * Precondiciones:No hay
	 * Entrada: Dos objetos Partido
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void generarImprimirEnfrentamientos(Partido partido1, Partido partido2)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 * 
	 */
	public void generarEnfrentamientos(Partido partido1, Partido partido2, Equipo equipo1, Equipo equipo2, Equipo equipo3, Equipo equipo4)
	{
		int numero=0;
		int i=0;
		int []arrayNumAnteriores={-1,-1,-1,-1}; //Pongo todos sus elementos a -1 ya que si no pongo nada, se inicializa a 0 y �ste es un valor de los que puede sacar el random
		Random aleatorio=new Random();
		int contadorEquiposPorPartido=0;
		while(contadorEquiposPorPartido<2)
		{
			numero=aleatorio.nextInt(4);
			if(buscarNumero(numero,arrayNumAnteriores)==-1)
			{
				if(contadorEquiposPorPartido==0)	
				{
					if(numero==equipo1.getIdentificador())
					{
						partido1.setEquipoLocal(equipo1);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo2.getIdentificador())
					{
						partido1.setEquipoLocal(equipo2);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo3.getIdentificador())
					{
						partido1.setEquipoLocal(equipo3);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo4.getIdentificador())
					{
						partido1.setEquipoLocal(equipo4);
						arrayNumAnteriores[i]=numero;
						i++;
					}
				}
				else
				{
					if(numero==equipo1.getIdentificador())
					{
						partido1.setEquipoVisitante(equipo1);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo2.getIdentificador())
					{
						partido1.setEquipoVisitante(equipo2);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo3.getIdentificador())
					{
						partido1.setEquipoVisitante(equipo3);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo4.getIdentificador())
					{
						partido1.setEquipoVisitante(equipo4);
						arrayNumAnteriores[i]=numero;
						i++;
					}
				}
				contadorEquiposPorPartido++;
				
			}
		}
		contadorEquiposPorPartido=0;
		while(contadorEquiposPorPartido<2)
		{
			numero=aleatorio.nextInt(4);
			if(buscarNumero(numero,arrayNumAnteriores)==-1)
			{
				if(contadorEquiposPorPartido==0)	
				{
					if(numero==equipo1.getIdentificador())
					{
						partido2.setEquipoLocal(equipo1);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo2.getIdentificador())
					{
						partido2.setEquipoLocal(equipo2);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo3.getIdentificador())
					{
						partido2.setEquipoLocal(equipo3);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo4.getIdentificador())
					{
						partido2.setEquipoLocal(equipo4);
						arrayNumAnteriores[i]=numero;
						i++;
					}
				}
				else
				{
					if(numero==equipo1.getIdentificador())
					{
						partido2.setEquipoVisitante(equipo1);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo2.getIdentificador())
					{
						partido2.setEquipoVisitante(equipo2);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo3.getIdentificador())
					{
						partido2.setEquipoVisitante(equipo3);
						arrayNumAnteriores[i]=numero;
						i++;
					}
					else if(numero==equipo4.getIdentificador())
					{
						partido2.setEquipoVisitante(equipo4);
						arrayNumAnteriores[i]=numero;
						i++;
					}
				}
				contadorEquiposPorPartido++;
			}
		}
		
	}
	/*
	 * Interfaz
	 * 
	 * Este m�todo busca si se encuentra el n�mero en ese array
	 * Prototipo: int buscarNumero (int numero, int[]array)
	 * Precondiciones: El n�mero est� entre 0 y 4
	 * Entrada: un entero y un array de enteros
	 * Salidas: Un entero
	 * Postcondiciones: -1 si no ha encontrado nada y del 0 al 3 si lo ha encontrado
	 * 
	 * RESGUARDO
	 * 
	 * public int buscarEquipo(Equipo equipo)
	 * {
	 * 		return 1;
	 * }
	 */
	public int buscarNumero(int numero, int[]array)
	{
		int i, encontrado=-1;
		for(i=0;encontrado==-1&&i<array.length;i++)
		{
			if(array[i]==numero)
			{
				encontrado=i;
			}
		}
		return encontrado;
	}
	/*
	 *Interfaz
	 *
	 * Este m�todo imprime los enfrentamientos generados
	 * Prototipo: void imprimirEnfrentamientos(partido1,partido2)
	 * Precondiciones: No hay
	 * Entradas: Dos objetos partido
	 * Salidas: Nada
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void imprimirEnfrentamientos(partido1,partido2)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void imprimirEnfrentamientos(Partido partido1, Partido partido2)
	{
		System.out.println("JORNADA");
		System.out.println();
		System.out.println(partido1.getEquipoLocal().getNombre()+" - "+partido1.getEquipoVisitante().getNombre());
		System.out.println(partido2.getEquipoLocal().getNombre()+" - "+partido2.getEquipoVisitante().getNombre());
		System.out.println();
	}
	/*
	 *Interfaz
	 *
	 * Este m�todo genera los resultados de los partidos
	 * Prototipo: void generarResultados(Partido partido1,Partido partido2)
	 * Precondiciones: No hay
	 * Entradas: Dos objetos partido
	 * Salidas: Nada
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void generarResultados(Partido partido1,Partido partido2)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void generarResultados(Partido partido) //Hacerlo con probabilidades
	{
		int numero=0;
		Random aleatorio=new Random();
		int contador;
		for(contador=0;contador<2;contador++)
		{
			numero=aleatorio.nextInt(5);
			if(contador==0)
			{
				try
				{
					partido.setGolesLocal(numero);
				}catch(ligaException mensaje)
				{
					System.out.println(mensaje);
				}	
			}
			else if(contador==1)
			{
				try
				{
					partido.setGolesVisitante(numero);
				}catch(ligaException mensaje)
				{
					System.out.println(mensaje);
				}
			}
		}
		
	}
	/*
	 *Interfaz
	 *
	 * Este m�todo imprime los resultados de la jornada
	 * Prototipo: void imprimirResultados(Partido partido1,Partido partido2)
	 * Precondiciones: No hay
	 * Entradas: Dos objetos partido
	 * Salidas: Nada
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void imprimirResultados(Partido partido1,Partido partido2)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void imprimirResultados(Partido partido1, Partido partido2)
	{
		System.out.println();
		System.out.println("RESULTADOS");
		System.out.println();
		System.out.println(partido1.getEquipoLocal().getNombre()+" "+partido1.getGolesLocal()+" - "+partido1.getEquipoVisitante().getNombre()+" "+partido1.getGolesVisitante());
		System.out.println(partido2.getEquipoLocal().getNombre()+" "+partido2.getGolesLocal()+" - "+partido2.getEquipoVisitante().getNombre()+" "+partido2.getGolesVisitante());
		System.out.println();
	}
	/*
	 *Interfaz
	 *
	 * Este m�todo aplica los goles de los partidos a los equipos
	 * Prototipo: void gestionarEquipos(Partido partido1,Partido partido2)
	 * Precondiciones: Los objetos no est�n vacios
	 * Entradas: Dos objetos partido
	 * Salidas: Nada
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void gestionarPartidos(Partido partido1,Partido partido2)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void gestionarPartidos(Partido partido)
	{
		if(partido.getGolesLocal()==partido.getGolesVisitante())
		{
			try
			{
				partido.getEquipoLocal().setGolesMarcados(partido.getGolesLocal()+partido.getEquipoLocal().getGolesMarcados());
				partido.getEquipoLocal().setGolesRecibidos(partido.getGolesVisitante()+partido.getEquipoLocal().getGolesRecibidos());
				partido.getEquipoVisitante().setGolesMarcados(partido.getGolesVisitante()+partido.getEquipoVisitante().getGolesMarcados());
				partido.getEquipoVisitante().setGolesRecibidos(partido.getGolesLocal()+partido.getEquipoVisitante().getGolesRecibidos());
				partido.getEquipoLocal().setPartidosJugados(1+partido.getEquipoLocal().getPartidosJugados());
				partido.getEquipoVisitante().setPartidosJugados(1+partido.getEquipoVisitante().getPartidosJugados());
				partido.getEquipoLocal().setPuntos(1+partido.getEquipoLocal().getPuntos());
				partido.getEquipoVisitante().setPuntos(1+partido.getEquipoVisitante().getPuntos());
				
			}catch(ligaException mensaje)
			{
				System.out.println(mensaje);
			}
		}
		else if(partido.getGolesLocal()>partido.getGolesVisitante())
		{
			try
			{
				partido.getEquipoLocal().setGolesMarcados(partido.getGolesLocal()+partido.getEquipoLocal().getGolesMarcados());
				partido.getEquipoLocal().setGolesRecibidos(partido.getGolesVisitante()+partido.getEquipoLocal().getGolesRecibidos());
				partido.getEquipoVisitante().setGolesMarcados(partido.getGolesVisitante()+partido.getEquipoVisitante().getGolesMarcados());
				partido.getEquipoVisitante().setGolesRecibidos(partido.getGolesLocal()+partido.getEquipoVisitante().getGolesRecibidos());
				partido.getEquipoLocal().setPartidosJugados(1+partido.getEquipoLocal().getPartidosJugados());
				partido.getEquipoVisitante().setPartidosJugados(1+partido.getEquipoVisitante().getPartidosJugados());
				partido.getEquipoLocal().setPuntos(3+partido.getEquipoLocal().getPuntos());
				
			}catch(ligaException mensaje)
			{
				System.out.println(mensaje);
			}
		}
		else
		{
			try
			{
				partido.getEquipoLocal().setGolesMarcados(partido.getGolesLocal()+partido.getEquipoLocal().getGolesMarcados());
				partido.getEquipoLocal().setGolesRecibidos(partido.getGolesVisitante()+partido.getEquipoLocal().getGolesRecibidos());
				partido.getEquipoVisitante().setGolesMarcados(partido.getGolesVisitante()+partido.getEquipoVisitante().getGolesMarcados());
				partido.getEquipoVisitante().setGolesRecibidos(partido.getGolesLocal()+partido.getEquipoVisitante().getGolesRecibidos());
				partido.getEquipoLocal().setPartidosJugados(1+partido.getEquipoLocal().getPartidosJugados());
				partido.getEquipoVisitante().setPartidosJugados(1+partido.getEquipoVisitante().getPartidosJugados());
				partido.getEquipoVisitante().setPuntos(3+partido.getEquipoVisitante().getPuntos());
				
			}catch(ligaException mensaje)
			{
				System.out.println(mensaje);
			}
		}
		Arrays.sort(clasificacion);
	}
}

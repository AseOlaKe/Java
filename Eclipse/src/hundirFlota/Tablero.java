



/*
 * Interfaz
 * 
 * Propiedades básicas:
 * 
 * tablero, Array bidimensional de enteros consultable
 * 
 * Propiedades Derivadas:
 * No tiene
 * Propiedades Compartidas:
 * No tiene
 * 
 * Métodos consultores/modificadores:
 * 
 * int[][]getTablero()
 * 
 * 
 * Métodos añadidos:
 * 
 * void imprimirTablero()
 * boolean comprobarArray(int fila, int columna)
 * boolean comprobarArrayBarcoEntero(Barco barco, int fila, int columna,String nombreBarco)
 */

public class Tablero  {
	
	private int[][]tablero;

	//Constructores
	public Tablero() {
		tablero=null;
	}
	public Tablero(int[][]tablero)
	{
		this.tablero=tablero;
	}
	public Tablero(Tablero tablero)
	{
		this.tablero=tablero.tablero;
	}
	//Métodos consultores y modificadores
	public int[][] getTablero()
	{
		return tablero;
	}
	//Métodos sobreescritos y sobrecargados
	//No pongo ninguno, no tiene mucho sentido.
	
	//Métodos añadidos
	/*
	 * Interfaz
	 * 
	 * Este subprograma imprime el tablero
	 * prototipo: void imprimirTablero()
	 * Precondiciones: No tiene
	 * Entradas: Nada
	 * Salidas: Nada
	 * Postcondiciones: Nada
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void imprimirTablero()
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void imprimirTablero()
	{
		int i;
		int j;
		int contador=1;
		System.out.println("   A    B    C    D    E    F    G    H    I    J");
		for(i=0;i<tablero.length;i++)
		{
			for(j=0;j<tablero.length;j++)
			{
				System.out.print(" ----");
			}
			System.out.println();
			for(j=0;j<tablero.length;j++)
			{
				
				if(tablero[i][j]==1||tablero[i][j]==2||tablero[i][j]==3||tablero[i][j]==4)
				{
					System.out.print("| #  ");
				}
				else
				{
					System.out.print("|    ");
				}
			}
			System.out.println("| "+contador);
			contador++;
		}
		for(j=0;j<tablero.length;j++)
		{
			System.out.print(" ----");
		}
		System.out.println();
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma imprime el backup
	 * prototipo: void imprimirBackup()
	 * Precondiciones: No tiene
	 * Entradas: Nada
	 * Salidas: Nada
	 * Postcondiciones: Nada
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void imprimirBackup()
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */
	public void imprimirBackup()
	{
		int i;
		int j;
		int contador=1;
		System.out.println("   A    B    C    D    E    F    G    H    I    J");
		for(i=0;i<tablero.length;i++)
		{
			for(j=0;j<tablero.length;j++)
			{
				System.out.print(" ----");
			}
			System.out.println();
			for(j=0;j<tablero.length;j++)
			{
				
				if(tablero[i][j]==5)
				{
					System.out.print("| X  ");
				}
				else if(tablero[i][j]==6)
				{
					System.out.print("| O  ");
				}
				else
				{
					System.out.print("|    ");
				}
			}
			System.out.println("| "+contador);
			contador++;
		}
		for(j=0;j<tablero.length;j++)
		{
			System.out.print(" ----");
		}
		System.out.println();
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma comprueba si una posicion del array está ocupada o no
	 * Prototipo: boolean comprobarArray(int fila, int columna)
	 * Precondiciones: los enteros van entre 0 y 9 ambos inclusive
	 * Entradas: Un array bidimensional de enteros y dos enteros
	 * Salidas: Un valor booleano
	 * Postcondiciones: True si esa posicion del array está ocupada y false si esa posicion del array es no lo está
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static boolean comprobarArray(int fila, int columna)
	 * {
	 * 		return false;
	 * }
	 */
	public boolean comprobarArray(int fila, int columna)
	{
		boolean ocupada=false;
		
		if(tablero[fila][columna]==1||tablero[fila][columna]==2||tablero[fila][columna]==3||tablero[fila][columna]==4)
		{
					ocupada=true;
		}
			
		
		return ocupada;
	}
	/*
	 * Interfaz
	 * 
	 * Este subprograma comprueba si un barco entero pisa a otro barco o no
	 * Prototipo: comprobarArrayBarcoEntero(Barco barco, int fila, int columna, String nombreBarco)
	 * Precondiciones: los dos enteros están entre 0 y 9 ambos incluidos
	 * Entradas: un objeto barco, una cadena y dos enteros
	 * Salida: Un valor booleano
	 * Postcondiciones: True si las posiciones que va a ocupar un barco están ocupadas y false si no.
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static boolean comprobarArrayBarcoEntero(Barco barco, int fila, int columna,String nombreBarco)
		{
			return false;
		}
	 */
	public boolean comprobarArrayBarcoEntero(Barco barco, int fila, int columna,String nombreBarco)//*
	{
		int i;
		int j;
		
		boolean ocupada=false;
		boolean ocupadaDefinitiva=false;
		int posicionFinal=0;
		
		if(barco.getPosicion().equals("vertical"))
		{
			if(barco.getDireccion().equals("abajo"))
			{
				switch (nombreBarco)
				{
					case "portaaviones":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=i+3;
									for(i=fila;ocupada==false&&i<posicionFinal;i++) //cambiar índice
									{
											ocupada=comprobarArray(i, j);
											/*if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}*/	
									}
									i=fila; //Actualizamos el índice, ya que si no puede ocurrir un bucle infinito
								}
							}
						}
					break;
					case "destructor":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=i+2;
									for(i=fila;ocupada==false&&i<posicionFinal;i++)
									{
											ocupada=comprobarArray(i, j);
											/*if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}*/	
									}
									i=fila;
								}
							}
						}
					break;
					case "submarino":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=i+1;
									for(i=fila;ocupada==false&&i<posicionFinal;i++)
									{
											ocupada=comprobarArray(i, j);
											/*if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}*/	
									}
									i=fila;
								}
							}
						}
					break;
					case "lancha":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{
									ocupada=comprobarArray( i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}	
								}
							}
						}
					break;
				}
			
			}
			else
			{
				switch (nombreBarco)
				{
					case "portaaviones":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=i-3;
									for(i=fila;ocupada==false&&i>posicionFinal;i--)
									{
											ocupada=comprobarArray( i, j);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									i=fila; //Actualizamos el índice, ya que si no puede ocurrir un bucle infinito
								}
							}
						}
					break;
					case "destructor":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=i-2;
									for(i=fila;ocupada==false&&i>posicionFinal;i--)
									{
											ocupada=comprobarArray( i, j);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									i=fila;
								}
							}
						}
					break;
					case "submarino":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=i-1;
									for(i=fila;ocupada==false&&i>posicionFinal;i--)
									{
											ocupada=comprobarArray( i, j);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									i=fila;
								}
							}
						}
					break;
					case "lancha":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{
									ocupada=comprobarArray( i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}	
								}
							}
						}
					break;
				}
			}
		}
		else
		{
			if(barco.getDireccion().equals("derecha"))
			{
				switch (nombreBarco)
				{
					case "portaaviones":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=j+3;
									for(j=columna;ocupada==false&&j<posicionFinal;j++)
									{
											ocupada=comprobarArray( fila, columna);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									j=columna;
								}
							}
						}
					break;
					case "destructor":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=j+2;
									for(j=columna;ocupada==false&&j<posicionFinal;j++)
									{
											ocupada=comprobarArray(i,j);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									j=columna;
								}
							}
						}
					break;
					case "submarino":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=j+1;
									for(j=columna;ocupada==false&&j<posicionFinal;j++)
									{
											ocupada=comprobarArray( i,j);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									j=columna;
								}
							}
						}
					break;
					case "lancha":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{
									ocupada=comprobarArray(i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}	
								}
							}
						}
					break;
				
				}
			}
			else
			{
				switch (nombreBarco)
				{
					case "portaaviones":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=j-3;
									for(j=columna;ocupada==false&&j>posicionFinal;j--)
									{
											ocupada=comprobarArray(fila, columna);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									j=columna;
								}
							}
						}
					break;
					case "destructor":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=j-2;
									for(j=columna;ocupada==false&&j>posicionFinal;j--)
									{
											ocupada=comprobarArray(i,j);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									j=columna;
								}
							}
						}
					break;
					case "submarino":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{	posicionFinal=j-1;
									for(j=columna;ocupada==false&&j>posicionFinal;j--)
									{
											ocupada=comprobarArray( i,j);
											if(ocupada==true)
											{
												ocupadaDefinitiva=ocupada;
											}	
									}
									j=columna;
								}
							}
						}
					break;
					case "lancha":
						for(i=0;i<tablero.length;i++)
						{
							for(j=0;j<tablero.length;j++)
							{
								if(i==fila&&j==columna)
								{
									ocupada=comprobarArray(i, j);
									if(ocupada==true)
									{
										ocupadaDefinitiva=ocupada;
									}	
								}
							}
						}
					break;
				}
			}
		}
		return ocupada;
	}
	/*
	 * Interfaz 
	 * 
	 * Este subprograma carga el array de tablero
	 * Prototipo: void cargarArray(Barco barco, int fila, int columna)
	 * Precondiciones: Los dos enteros están entre 0 y 9 ambos inclusive.
	 * Entradas: Un objeto barco y dos enteros
	 * Salidas: No
	 * Postcondiciones: Se cargará el tablero con el tamaño del barco
	 * E/S: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public static void cargarArray( Barco barco, int fila, int columna)
	 * {
	 * 		System.out.println("En construccion");
	 * }
	 */
	public void cargarArray(Barco barco, int fila, int columna)
	{
		int i;
		int j;
		int k;
		
		if(barco.getPosicion().equals("vertical"))
		{
			if(barco.getDireccion().equals("abajo"))
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
							for(k=0;k<barco.getTamanyo().length;k++)
							{
	
										tablero[i][j]=barco.getTamanyo()[k];
										i++;
							}
							i=fila;
						}
					}
				}
			}
			else
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
							for(k=0;k<barco.getTamanyo().length;k++)
							{
	
										tablero[i][j]=barco.getTamanyo()[k];
										i--;
							}
							i=fila;
						}
					}
				}
			}
		}
		else
		{
			if(barco.getDireccion().equals("derecha"))
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
								for(k=0;k<barco.getTamanyo().length;k++)
								{
									tablero[i][j]=barco.getTamanyo()[k];
									j++;
								}
								j=columna;
						}
					}
				}
			}
			else
			{
				for(i=0;i<tablero.length;i++)
				{
					for(j=0;j<tablero.length;j++)
					{
						if(i==fila&&j==columna)
						{
								for(k=0;k<barco.getTamanyo().length;k++)
								{
									tablero[i][j]=barco.getTamanyo()[k];
									j--;
								}
								j=columna;
						}
					}
				}
			}
		}
	}
/*
 * Interfaz
 * 
 * Este método comprueba si el barco se sale del tablero
 * Precondiciones: los enteros están entre 0 y 9.
 * Entradas: Un objeto barco, dos enteros y una cadena
 * Salidas: Un valor booleano
 * Postcondiciones: True si se sale del tablero y false si no se sale
 * E/S: No tiene
 * 
 * RESGUARDO
 * 
 * public boolean comprobarSiSeSale(Barco barco, int fila, int columna, String nombreBarco)
 * {
 * 		return false;
 * }
 */
	public boolean comprobarSiSeSale(Barco barco, int fila, int columna,String nombreBarco)
	{
		boolean seSale=false;
		int posicionFinal=0;
		
		if(barco.getPosicion().equals("vertical"))
		{
			if(barco.getDireccion().equals("abajo"))
			{
				switch (nombreBarco)
				{
					case "portaaviones":
							posicionFinal=fila+3;
							if(posicionFinal<0||posicionFinal>9)
							{
								seSale=true;
							}
					
					break;
					case "destructor":
							posicionFinal=fila+2;
							if(posicionFinal<0||posicionFinal>9)
							{
								seSale=true;
							}
						
					break;
					case "submarino":
							posicionFinal=fila+1;
							if(posicionFinal<0||posicionFinal>9)
							{
								seSale=true;
							}
				
					break;
				}
			
			}
			else
			{
				switch (nombreBarco)
				{
					case "portaaviones":
							posicionFinal=fila-3;
							if(posicionFinal<0||posicionFinal>9)
							{
								seSale=true;
							}

					break;
					case "destructor":
						posicionFinal=fila-2;
						if(posicionFinal<0||posicionFinal>9)
						{
							seSale=true;
						}
				
					break;
					case "submarino":
						posicionFinal=fila-1;
						if(posicionFinal<0||posicionFinal>9)
						{
							seSale=true;
						}
					break;
					
				}
			}
		}
		else
		{
			if(barco.getDireccion().equals("derecha"))
			{
				switch (nombreBarco)
				{
					case "portaaviones":
							posicionFinal=columna+3;
							if(posicionFinal<0||posicionFinal>9)
							{
								seSale=true;
							}

					break;
					case "destructor":
						posicionFinal=columna+2;
						if(posicionFinal<0||posicionFinal>9)
						{
							seSale=true;
						}

					break;
					case "submarino":
						posicionFinal=columna+1;
						if(posicionFinal<0||posicionFinal>9)
						{
							seSale=true;
						}

					break;
				
				}
			}
			else
			{
				switch (nombreBarco)
				{
					case "portaaviones":
							posicionFinal=columna-3;
							if(posicionFinal<0||posicionFinal>9)
							{
								seSale=true;
							}
					break;
					case "destructor":
							posicionFinal=columna-2;
							if(posicionFinal<0||posicionFinal>9)
							{
								seSale=true;
							}

					break;
					case "submarino":
						posicionFinal=columna-1;
						if(posicionFinal<0||posicionFinal>9)
						{
							seSale=true;
						}

					break;
				}
			}
		}
		return seSale;
	
	}

}

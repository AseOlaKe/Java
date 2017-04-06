package ExamenPabloJarana;
public class UtilExamen {

	/*
	 * Interfaz
	 * 
	 * Este método ordena un array recibido como parámetro
	 * Prototipo: int[]Recuento(int[]arrayInicial)
	 * Precondiciones: El array no tiene elementos repetidos
	 * Entradas: Un array de enteros
	 * Salida: Un array de enteros
	 * Postcondciones: El array estará ordenado
	 * 
	 * RESGUARDO
	 * 
	 * private int[]Recuento(int[]arrayInicial)
	 * {
	 * 	int[] array1= {1,2};
	 * 	return array1;
	 * }
	 */
	
	public int[]Recuento(int[]arrayInicial)
	{
		int [] aux=new int[arrayInicial.length];
		int[] arrayFinal=new int[arrayInicial.length];
		int contadorElementosMenores=0;
		int i,j;
		for(i=0;i<arrayInicial.length;i++)
		{
			for(j=0;j<arrayInicial.length;j++)
			{
				if(arrayInicial[i]>arrayInicial[j])
				{
					contadorElementosMenores++;
				}
			}
			aux[i]=contadorElementosMenores;
			contadorElementosMenores=0;//Actualizamos el contador a 0, para volver a contar los que son menores a la siguiente casilla del arrayInicial	
			arrayFinal[aux[i]]=arrayInicial[i];
		}
		return arrayFinal;
	}
	/*
	 * Interfaz
	 * 
	 * Este método crea a partir de hace que dos cadenas sean anagramas una de la otra
	 * Prototipo: void anagrama(String cadena1, String cadena2)
	 * Precondiciones: No hay
	 * Entradas: Dos cadenas
	 * Salidas: Nada
	 * Postcondiciones: Nada
	 * 
	 * RESGUARDO
	 * public void anagrama(String cadena1, String cadena2)
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 * 
	 */
	public void anagrama(String cadena1, String cadena2) throws anagramaException
	{
		if((cadena1.isEmpty()||cadena2.isEmpty())||(cadena1.contains("1")||cadena1.contains("2")||cadena1.contains("3")||cadena1.contains("4")||cadena1.contains("5")||cadena1.contains("6")||cadena1.contains("7")||cadena1.contains("8")||cadena1.contains("9")||cadena1.contains("0"))||(cadena2.contains("1")||cadena2.contains("2")||cadena2.contains("3")||cadena2.contains("4")||cadena2.contains("5")||cadena2.contains("6")||cadena2.contains("7")||cadena2.contains("8")||cadena2.contains("9")||cadena2.contains("0")))
		{
			throw new anagramaException ("Las cadenas no deben estar vacías y tienen que tener solo letras");
		}
		else
		{
				//No he podido hacer el anagrama, aunque tengo controladas las excepciones correctamente. Dejo el método en construcción
				System.out.println("En construccion");
		}
	}
}

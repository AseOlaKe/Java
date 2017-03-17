package ordenacionArrays;

public class Avanzados {
	
	//A continuaci�n vemos el m�todo de ordenaci�n de Inserci�n para entender mejor el Shell, ya que �ste es una versi�n mejorada de Inserci�n
	public static int[] metodoInsercion(int[]array, int tamanyo)
	{
		int i, j, aux;
		for(i=1;i<tamanyo;i++)
		{
			for(j=i;array[j-1]>array[j]&&j>0;j--)
			{
				aux = array[j]; 
				array[j] = array[j-1];
				array[j-1] = aux;
			}
		}
		return array;
	}
	

}
package ordenacionArrays;

public class Avanzados {
	
	//i se inicializa a 1(2da posicion del array), j se inicializa a i y va avanzando hasta la posicion 1 intercambiando los elementos que sean menores
	public static void metodoInsercion(int[]array)
	{
		int i, j, aux;
		
		for(i=1;i<array.length;i++)
		{
			for(j=i;j>0&&array[j-1]>array[j];j--)
			{
				aux = array[j]; 
				array[j] = array[j-1];
				array[j-1] = aux;
			}
		}
	}
	public static void shell(int []A){
		   int salto, aux, i;
		   boolean cambios;
		   for(salto=A.length/2; salto!=0; salto/=2){
		           cambios=true;
		           while(cambios){ // Mientras se intercambie algún elemento
		                       cambios=false;
		                       for(i=salto; i< A.length; i++) // se da una pasada
		                               if(A[i-salto]>A[i]){ // y si están desordenados
		                                     aux=A[i]; // se reordenan
		                                     A[i]=A[i-salto];
		                                     A[i-salto]=aux;
		                                     cambios=true; // y se marca como cambio.
		                               }
		                        }
		            }
		}
}
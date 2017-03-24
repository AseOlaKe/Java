package ordenacionArrays;

public class Avanzados {
	
	//i se inicializa a 1(2da posicion del array), j se inicializa a i y va avanzando hasta la posicion 1 intercambiando los elementos que sean menores
	public static void Insercion(int[]array)
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

	public static void mergeSort(int[]A, int izq, int der)
	{
		int puntoMedio;
		if(izq<der)
		{
			puntoMedio=(izq+der)/2;
            mergeSort(A,izq, puntoMedio);
            mergeSort(A,puntoMedio+1, der);
            merge(A,izq, puntoMedio, der);
		}
	}
	public static void shell(int []A){
		   int salto, aux, i, j;
		  
		   for(salto=A.length/2; salto!=0; salto/=2)
		   {
		         for(i=salto;i<A.length;i++)
		         { 
		        	aux=A[i];
		        	for(j=i;j>=salto&&aux<A[j-salto];j=j-salto)
		        	{
		        		A[j]=A[j-salto];
		        	}
		        	A[j]=aux;
		         }                   
		    }
	}
	public static void mergesort(int A[],int izq, int der)
	{
	    if (izq<der){
	            int m=(izq+der)/2;
	            mergesort(A,izq, m);
	            mergesort(A,m+1, der);
	            merge(A,izq, m, der);
	    }
	}
	public static void merge(int A[],int izq, int puntoMedio, int der)

	{
		   int i, j, k;
		   int [] B = new int[A.length]; //array auxiliar
		   for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
		             B[i]=A[i];


		             i=izq; j=puntoMedio+1; k=izq;
		             while (i<=puntoMedio && j<=der) //copia el siguiente elemento más grande

		             i=izq; j=puntoMedio+1; k=izq;
		             while (i<=puntoMedio && j<=der) //copia el siguiente elemento más grande

		             if (B[i]<=B[j])
		                     A[k++]=B[i++];
		             else
		                     A[k++]=B[j++];

		             while (i<=puntoMedio) //copia los elementos que quedan de la
		                           A[k++]=B[i++]; //primera mitad (si los hay)
	
	

		             while (i<=puntoMedio) //copia los elementos que quedan de la
		                           A[k++]=B[i++]; //primera mitad (si los hay)
	 }
	public static int busquedaSec(int []a,int dato)
	{
		int i, encontrado=-1;
		for(i=0;encontrado==-1&&i<a.length;i++)
		{
			if(a[i]==dato)
			{
				encontrado=i;
			}
		}
		return encontrado;
	}
	public static int busquedaBin(int[]a,int dato)
	{
		int inicio=0, fin=a.length-1, med=(inicio+fin)/2, encontrado=-1;
		while(inicio<=fin&&encontrado==-1)
		{
			if(a[med]==dato)
			{
				encontrado=med;
			}
			else if(a[med]>dato)
			{
				fin=med-1;
			}
			else
			{
				inicio=med+1;
			}
			med=(inicio+fin)/2;
		}
		return encontrado;
	}
	

	
}
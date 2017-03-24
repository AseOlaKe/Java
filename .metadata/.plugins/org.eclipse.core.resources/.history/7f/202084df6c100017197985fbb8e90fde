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
<<<<<<< HEAD
	public static void shell(int[]a)
	{
		int aux,i,j,salto;
		
		for(salto=a.length/2;salto!=0;salto=salto/2)
		{
			for(i=salto;i<a.length;i++)
			{
				aux=a[i];
				for(j=i;j>=salto&&aux<a[j-salto];j = j - salto)
				{
					a[j]=a[j-salto];
				}
				a[j]=aux;
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
	public static void merge(int A[],int izq, int puntoMedio, int der)
=======
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
	public static void merge(int A[],int izq, int m, int der)
>>>>>>> origin/master
	{
		   int i, j, k;
		   int [] B = new int[A.length]; //array auxiliar
		   for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
		             B[i]=A[i];

<<<<<<< HEAD
		             i=izq; j=puntoMedio+1; k=izq;
		             while (i<=puntoMedio && j<=der) //copia el siguiente elemento más grande
=======
		             i=izq; j=m+1; k=izq;
		             while (i<=m && j<=der) //copia el siguiente elemento más grande
>>>>>>> origin/master
		             if (B[i]<=B[j])
		                     A[k++]=B[i++];
		             else
		                     A[k++]=B[j++];
<<<<<<< HEAD
		             while (i<=puntoMedio) //copia los elementos que quedan de la
		                           A[k++]=B[i++]; //primera mitad (si los hay)
	}
	
=======
		             while (i<=m) //copia los elementos que quedan de la
		                           A[k++]=B[i++]; //primera mitad (si los hay)
	 }
>>>>>>> origin/master
	
}
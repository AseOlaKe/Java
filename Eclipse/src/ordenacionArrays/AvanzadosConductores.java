package ordenacionArrays;

public class AvanzadosConductores {
	public static void main(String[]args)
	{
	
		int i;
		int tamanyo=12;
		int[]array={7,4,23,18,12,32,14,23,64,14,10,95};
		int[]arrayOrdenado=Avanzados.metodoInsercion(array, tamanyo);
		
		for(i=0;i<tamanyo;i++)
		{
			System.out.println(arrayOrdenado[i]);
		}
	}
}

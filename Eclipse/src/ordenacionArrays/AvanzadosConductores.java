package ordenacionArrays;



public class AvanzadosConductores {
	public static void main(String[]args)
	{
	
		int i;
		
		int[]array={7,4,23,18,12,32,14,23,64,14,10,95};
		int der=array.length-1;
		int izq=0;
	
		Avanzados.shell(array);
		for(i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println(Avanzados.busquedaBin(array,10));
	}
}

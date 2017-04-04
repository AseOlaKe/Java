package ExamenPabloJarana;

import java.util.Arrays;

public class TestUtilExamen {

	public static void main(String[] args) {
		int[]array={17,3,28,1,44,16,5};
		String cadena1="ra1ton5es";
		String cadena2="ga4tos";
		UtilExamen util=new UtilExamen();
		array=util.Recuento(array);
		System.out.println(Arrays.toString(array));
		try
		{
			util.anagrama(cadena1, cadena2);
		}catch(anagramaException mensaje)
		{
			System.out.println(mensaje);
		}
			
	}

}

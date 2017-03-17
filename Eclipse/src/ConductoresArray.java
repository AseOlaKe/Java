
public class ConductoresArray {

	public static void main(String[] args) {
		
		int contador=0;
		int tamaño=20;
		
		int[]arrayNoRepetido=UtilidadesArray.arrayNoRepetido();
		int[]arrayGeneral=UtilidadesArray.cargarArray(tamaño);
		contador=UtilidadesArray.contadorPar(arrayGeneral);
		int[]arrayPar=UtilidadesArray.cargarArrayPar(arrayGeneral, contador);
		int[]arrayAlReves=UtilidadesArray.arrayAlReves(arrayGeneral);
		System.out.println("Array general: ");
		UtilidadesArray.PintarArray(arrayGeneral);
		System.out.println("Array par: ");
		UtilidadesArray.PintarArray(arrayPar);
		System.out.println("Array no repetido: ");
		UtilidadesArray.PintarArray(arrayNoRepetido);
		System.out.println("Array al reves");
		UtilidadesArray.PintarArray(arrayAlReves);
	}

}


public class TestTablero {

	public static void main(String[] args) {
		
		
		int columna=5;
		int fila=1;
		String nombreBarco="lancha";
		Barco lancha=null;
		try
		{
			lancha=new Barco(new int[1],"vertical","arriba");
		}catch(FlotaExcepcion mensaje)
		{
			System.out.println(mensaje);
		}
		lancha.cargarArrayBarco(lancha, nombreBarco);
		Tablero tablero= new Tablero(new int[10][10]);
		Tablero backup=new Tablero(new int [10][10]);
		
		System.out.println("Array tablero: "+tablero.getTablero());
		System.out.println("Tablero y backup vacios");
		backup.imprimirBackup();
		tablero.imprimirTablero();
		tablero.cargarArray(lancha, 0, 5);//Cargamos el array tablero en la posicion F1 ([0][5] en el array)
		System.out.println("Tablero cargado: ");
		backup.imprimirBackup();
		tablero.imprimirTablero();
		System.out.println("Comprobamos si la posicion F2 está ocupada: "+tablero.comprobarArray(fila, columna));
		System.out.println("Comprobamos si todo lo que ocupa el barco ya está ocupado por otro: "+tablero.comprobarArrayBarcoEntero(lancha, fila, columna, nombreBarco));
		System.out.println("Comprobamos si el barco se sale del tablero: "+tablero.comprobarSiSeSale(lancha, fila, columna, nombreBarco));

	}

}

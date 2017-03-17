/*
 * Test Jugador
 * 
 * 
 */


public class TestJugador {
	
	public static void main (String[] args) {
		
		Jugador x1 = new Jugador("Paco",2000);
		Jugador x = new Jugador("Paquito",3000);
		
		System.out.println("Nombre: "+x1.getNombre());
		x1.setNombre("Luisitor");
		System.out.println("Nuevo nombre: "+x1.getNombre());
		System.out.println("Dinero: "+x1.getDinero());
		x1.setDinero(1000);
		System.out.println("Nuevo dinero: "+x1.getDinero());
		System.out.println("toString: "+x1.toString());
		System.out.println("hashCode: "+x1.hashCode());
		System.out.println("compareTo "+x1.compareTo(x));
		System.out.println("equals: "+x1.equals(x));
	}
}


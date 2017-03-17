package hundirLaFlota;

public class TestJugador {

	public static void main(String[] args) {
		
		Jugador pablo=new Jugador("Pablo");
		
			
		System.out.println("Nombre: "+pablo.getNombre());
		pablo.setNombre("Jarana");
		System.out.println("Nuevo nombre: "+pablo.getNombre());
		System.out.println("Código array barcos: "+pablo.getBarcos());
		System.out.println("hashCode: "+pablo.hashCode());
		System.out.println("toString: "+pablo.toString());
		System.out.println("clone: "+pablo.clone());
		

	}

}

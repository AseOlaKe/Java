/*
 * TEST VECTOR
 * 
 * 
 */


public class TestVector {
	
	public static void main (String[] args) {
		
		int numero=4;
		Vector vector1= new Vector(-3,6,4);
		Vector vector2= new Vector(1,1,-7);
		
		System.out.println("Coordenada X: "+vector1.getCoordenadaX());
		vector1.setCoordenadaX(-5);
		System.out.println("Nueva Coordenada X: "+vector1.getCoordenadaX());
		System.out.println("Coordenada Y: "+vector1.getCoordenadaY());
		vector1.setCoordenadaY(2);
		System.out.println("Nueva Coordenada Y: "+vector1.getCoordenadaY());
		System.out.println("Coordenada Z: "+vector1.getCoordenadaZ());
		vector1.setCoordenadaZ(3);
		System.out.println("Nueva Coordenada Z: "+vector1.getCoordenadaZ());
		System.out.println("Modulo: "+vector1.getModulo());
		System.out.println("Producto escalar de dos vectores: "+vector1.productoEscalarDosVectores(vector2));
		vector1.productoEscalarEntero(numero);
		vector1.sumaVectores(vector2);
		System.out.println("toString: "+vector1.toString());
		System.out.println("hashCode: "+vector1.hashCode());
		System.out.println("equals: "+vector1.equals(vector2));
		System.out.println("compareTo: "+vector1.compareTo(vector2));
		System.out.println("clone: "+vector1.clone());
	}
}


/*
 * TEST PUNTO
 * 
 * 
 */


public class TestPunto{
	
	public static void main (String[] args) {
		
		Punto punto1=new Punto(4,6);
		Punto punto2=new Punto (7,1);
		
		System.out.println("Coordenada X: "+punto1.getX());
		punto1.setX(9);
		System.out.println("Coordenada X: "+punto1.getX());
		System.out.println("Coordenada Y: "+punto1.getY());
		punto1.setY(5);
		System.out.println("Coordenada X: "+punto1.getY());
		System.out.println("toString: "+punto1.toString());
		System.out.println("hashCode: "+punto1.hashCode());
		System.out.println("equals:"+punto1.equals(punto2));
		System.out.println("compareTo:"+punto1.compareTo(punto2));
	}
}


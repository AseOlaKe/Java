/*
 * TestCirculo
 * 
 * 
 */


public class TestCirculo {
	
	public static void main (String[] args) {
		
		Punto centro=null;
		Punto centro2=null;
		Circulo circulo=null; 
		Circulo circulo2=null;
		try
		{
			 centro= new Punto(1.0,3.0);
			 centro2=new Punto(5.0,6.0);
		}catch(ExcepcionCirculo mensaje)
		{
			System.out.println(mensaje);
		}
		
		
		try
		{
			circulo=new Circulo (centro, 1.0);
			circulo2=new Circulo (centro2, 2.0);
		}catch(ExcepcionCirculo mensaje)
		{
			System.out.println(mensaje);
		}
		
		
		System.out.println("Radio: "+circulo.getRadio());
		circulo.setRadio(3.0);
		System.out.println("Nuevo Radio: "+circulo.getRadio());
		System.out.println("Punto del centro: "+circulo.getCentro());
		centro.setY(8.0);
		centro.setX(1.0);
		System.out.println("Nuevo punto del centro: "+circulo.getCentro());
		System.out.println("toString: "+circulo.toString());
		System.out.println("hashCode: "+circulo.hashCode());
		System.out.println("equals: "+circulo.equals(circulo2));
		System.out.println("compareTo: "+circulo.compareTo(circulo2));
		System.out.println("clone: "+circulo.clone());
		
	}
}


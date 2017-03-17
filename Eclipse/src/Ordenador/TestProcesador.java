/*
 * TestProcesador
 * 
 * 
 */


public class TestProcesador {
	
	public static void main (String[] args) {
		
		Procesador procesador=null;
		Procesador procesador1=null;
		
		try
		{
			procesador=new Procesador("Intel Core i5",2800.2);
			procesador1=new Procesador("Pentium II",1500.7);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Modelo: "+procesador.getModelo());
		try
		{
			procesador.setModelo("Intel Core i7");
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Modelo: "+procesador.getModelo());
		System.out.println("Velocidad: "+procesador.getVelocidad());
		try
		{	
			procesador.setVelocidad(3600.5);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nueva Velocidad: "+procesador.getVelocidad());
		System.out.println("toString: "+procesador.toString());
		System.out.println("hashCode: "+procesador.hashCode());
		System.out.println("compareTo: "+procesador.compareTo(procesador1));
		System.out.println("equals: "+procesador.equals(procesador1));
		System.out.println("Clone: "+procesador.clone());
		
		
	}
}


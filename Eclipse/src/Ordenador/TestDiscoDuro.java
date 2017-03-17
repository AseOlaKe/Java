/*
 * 
 * TestDiscoDuro
 * 
 * 
 */


public class TestDiscoDuro {
	
	public static void main (String[] args) {
		
		DiscoDuro disco=null;
		DiscoDuro disco1=null;
		
		try
		{
			disco=new DiscoDuro(1000,15000.5);
			disco1=new DiscoDuro(500,20000.0);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		
		System.out.println("Tamanyo: "+disco.getTamanyo());
		try
		{
			disco.setTamanyo(2000);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Tamanyo: "+disco.getTamanyo());
		System.out.println("Velocidad: "+disco.getVelocidad());
		try
		{
			disco.setVelocidad(25.0);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nueva Velocidad: "+disco.getVelocidad());
		System.out.println("toString: "+disco.toString());
		System.out.println("hashCode: "+disco.hashCode());
		System.out.println("compareTo: "+disco.compareTo(disco1));
		System.out.println("equals: "+disco.equals(disco1));
		System.out.println("Clone: "+disco.clone());
	}
}


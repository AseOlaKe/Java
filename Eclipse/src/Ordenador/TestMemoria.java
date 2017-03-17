/*
 * Test Memoria
 * 
 * 
 */


public class TestMemoria {
	
	public static void main (String[] args) {
		
		Memoria memoria=null;
		Memoria memoria1=null;
		
		try
		{
			memoria=new Memoria(32,"RAM",254.5);
			memoria1=new Memoria(1000,"Disco duro",20.2);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		
		System.out.println("Tamanyo: "+memoria.getTamanyo());
		try
		{
			memoria.setTamanyo(1000);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Tamanyo: "+memoria.getTamanyo());
		System.out.println("Tipo: "+memoria.getTipo());
		try
		{
			memoria.setTipo("Disco duro");
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Tipo: "+memoria.getTipo());
		System.out.println("Velocidad: "+memoria.getVelocidad());
		try
		{
			memoria.setVelocidad(20.2);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nueva Velocidad: "+memoria.getVelocidad());
		System.out.println("toString: "+memoria.toString());
		System.out.println("hashCode: "+memoria.hashCode());
		System.out.println("equals: "+memoria.equals(memoria1));
		System.out.println("compareTo: "+memoria.compareTo(memoria1));
		System.out.println("Clone: "+memoria.clone());
	}
}


/*
 * TestOrdenador
 * 
 * 
 */


public class TestOrdenador {
	
	public static void main (String[] args) {
		
		Ordenador ordenador=null;
		Ordenador ordenador1=null;
		Procesador procesador=null;
		Procesador procesador1=null;
		Memoria memoria=null;
		Memoria memoria1=null;
		DiscoDuro disco=null;
		DiscoDuro disco1=null;
		
		try //Un try/catch para todo
		{
			procesador=new Procesador("Intel Core i7", 3600.5);
			procesador1=new Procesador("Pentium II", 500.2);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		try
		{
			memoria=new Memoria(16,"RAM",250.5);
			memoria1=new Memoria(32,"RAM",300.2);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		try
		{
			disco=new DiscoDuro(1000,7200.0);
			disco1=new DiscoDuro(2000,10000.0);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		try
		{
			ordenador=new Ordenador(procesador,memoria,disco,1500.50);
			ordenador1=new Ordenador(procesador1,memoria1,disco1,2200.75);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		
		System.out.println("Procesador: "+ordenador.getProcesador());
		try
		{
			ordenador.setProcesador(procesador1);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo procesador: "+ordenador.getProcesador());
		System.out.println("Memoria: "+ordenador.getMemoria());
		try
		{
			ordenador.setMemoria(memoria1);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nueva memoria: "+ordenador.getMemoria());
		System.out.println("Disco duro: "+ordenador.getDiscoDuro());
		try
		{	
			ordenador.setDiscoDuro(disco1);
		}catch(ExcepcionOrdenador mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nuevo Disco duro: "+ordenador.getDiscoDuro());
		System.out.println("Precio Base: "+ordenador.getPrecioBase());
		System.out.println("Precio Mercado: "+ordenador.getPrecioMercado());
		ordenador.setPrecioBase(700.90);
		System.out.println("Nuevo Precio base: "+ordenador.getPrecioBase());
		System.out.println("Nuevo Precio de mercado: "+ordenador.getPrecioMercado());
		System.out.println("toString: "+ordenador.toString());
		System.out.println("hashCode: "+ordenador.hashCode());
		System.out.println("equals: "+ordenador.equals(ordenador1));
		System.out.println("compareTo: "+ordenador.compareTo(ordenador1));
		System.out.println("Clone: "+ordenador.clone());
	}
}


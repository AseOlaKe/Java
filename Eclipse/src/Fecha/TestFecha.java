/*
 * 
 * 
 * 
 */

package Fecha;
public class TestFecha {
	
	public static void main (String[] args) {
		
		Fecha fecha=null;
		Fecha fecha2=null;
		
		try
		{
			 fecha=new Fecha(12,2,2011);
		}catch(FechaExcepcion mensaje)
		{
			System.out.println(mensaje);
		}
		try
		{
			 fecha2=new Fecha(11,2,2011);
		}catch(FechaExcepcion mensaje)
		{
			System.out.println(mensaje);
		}
		
		System.out.println("Dia: "+fecha.getDia());
		fecha.setDia(10);
		System.out.println("Dia: "+fecha.getDia());
		System.out.println("Mes: "+fecha.getMes());
		fecha.setMes(12);
		System.out.println("Mes: "+fecha.getMes());
		System.out.println("Anyo: "+fecha.getAnyo());
		fecha.setAnyo(2016);
		System.out.println("Anyo: "+fecha.getAnyo());
		System.out.println("Bisiesto: "+fecha.esBisiesto(fecha.getAnyo()));
		System.out.println("toString: "+fecha.toString());
		System.out.println("hashCode: "+fecha.hashCode());
		System.out.println("equals: "+fecha.equals(fecha2));
		System.out.println("compareTo: "+fecha.compareTo(fecha2));
		
		
	}
}


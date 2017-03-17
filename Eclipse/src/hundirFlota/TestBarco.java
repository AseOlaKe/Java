//package hundirFlota;
//package hundirLaFlota;

public class TestBarco {


	public static void main(String[] args) {
		
		Barco barco=null;
		Barco barco2=null;
		try
		{
			barco=new Barco(new int[1],"vertical","abajo");
			barco2=new Barco(new int[3],"horizontal","izquierda");
		}catch(FlotaExcepcion mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Tamanyo: "+barco.getTamanyo());
		System.out.println("Direccion: "+barco.getDireccion());
		System.out.println("Posicion: "+barco.getPosicion());
		try
		{
			
			barco.setPosicion("Diagonal");
		}catch(FlotaExcepcion mensaje)
		{
			System.out.println(mensaje);
		}
		System.out.println("Nueva direccion: "+barco.getDireccion());
		System.out.println("Nueva posicion: "+barco.getPosicion());
		System.out.println("toString: "+barco.toString());
		System.out.println("hashCode: "+barco.hashCode());
		System.out.println("equals: "+barco.equals(barco2));
		System.out.println("compareTo: "+barco.compareTo(barco2));
		System.out.println("clone: "+barco.clone());
		
	}

}

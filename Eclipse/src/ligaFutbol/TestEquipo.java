package ligaFutbol;

public class TestEquipo {

	public static void main(String[] args) {
		
		Equipo mancity=null;
		Equipo monaco=null;
		try
		{
			mancity=new Equipo("Manchester City",50,0,47,22,0);
			monaco=new Equipo("Monaco",50,0,30,42,0);
		}catch(ligaException mensaje)
		{
			System.out.println(mensaje);
		}
		
		System.out.println("Nombre: "+mancity.getNombre());
		System.out.println("Puntos: "+mancity.getPuntos());
		System.out.println("Goles a Favor: "+mancity.getGolesMarcados());
		System.out.println("Goles en contra: "+mancity.getGolesRecibidos());
		System.out.println("Gol Average: "+mancity.getDiferenciaDeGoles());
		System.out.println("Gol Average del Monaco: "+monaco.getDiferenciaDeGoles());
		System.out.println("Identificador: "+mancity.getIdentificador());
		System.out.println("Identificador Monaco: "+monaco.getIdentificador());
		System.out.println("Posicion: "+mancity.getPosicion());
		System.out.println("toString: "+mancity.toString());
		System.out.println("hashCode: "+mancity.hashCode());
		System.out.println("equals: "+mancity.equals(monaco));
		System.out.println("compareTo: "+mancity.compareTo(monaco));
		System.out.println("clone: "+mancity.clone());

	}

}

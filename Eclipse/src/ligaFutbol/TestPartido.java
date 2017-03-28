package ligaFutbol;

public class TestPartido {

	public static void main(String[] args) {
		
		Equipo sevilla=null;
		Equipo betis= null;
		Equipo alaves=null;
		Equipo deportivo=null;
		Partido partido1=null;
		Partido partido2=null;
		
		try
		{
			sevilla=new Equipo("Sevilla",0,0,0,0,0);
			betis=new Equipo("Betis",0,0,0,0,0);
			alaves=new Equipo("Alaves",0,0,0,0,0);
			deportivo=new Equipo("Depotivo",0,0,0,0,0);
			partido1=new Partido(sevilla,betis,3,0);
			partido2=new Partido(alaves,deportivo,1,2);
		}catch(ligaException mensaje)
		{
			System.out.println(mensaje);
		}
		
		System.out.println("Equipo Local: "+partido1.getEquipoLocal());
		System.out.println("Equipo visitante: "+partido1.getEquipoVisitante());
		System.out.println("Goles Local: "+partido1.getGolesLocal());
		System.out.println("Goles Visitante: "+partido1.getGolesVisitante());
		System.out.println("toString: "+partido1.toString());
		System.out.println("hashCode: "+partido1.hashCode());
		System.out.println("equals: "+partido1.equals(partido2));
		System.out.println("compareTo: "+partido1.compareTo(partido2));
		System.out.println("clone: "+partido1.clone());
	}

}

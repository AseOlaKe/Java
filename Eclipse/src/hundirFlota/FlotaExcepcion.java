//package hundirLaFlota;
//package hundirFlota;
public class FlotaExcepcion extends Exception {

	private static final long serialVersionUID = 1L; //Al no poner esto me salía un warning, se explicó ya en clase

	public FlotaExcepcion(String mensaje)
	{
		super(mensaje);
	}

}

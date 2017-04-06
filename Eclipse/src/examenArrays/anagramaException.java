package ExamenPabloJarana;

public class anagramaException extends Exception {

	private static final long serialVersionUID = 1L; //Me sale un warning si no lo pongo
	
	public anagramaException (String mensaje)
	{
		super(mensaje);
	}
	

}

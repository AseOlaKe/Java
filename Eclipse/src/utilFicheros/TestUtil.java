package utilFicheros;



public class TestUtil {

	public static void main(String[] args) 
	{
		UtilFicheros util= new UtilFicheros();
		System.out.println("Introduce las rutas: ");
		String ruta1="C:\\Windows\\system.ini";
		String ruta2="C:\\Windows\\win.ini";
		util.fileProperties(ruta1,ruta2);
		try 
		{
			util.listarDirectorio();
		} catch (UtilException e) 
		{
			e.printStackTrace();
		}
		

	}

}
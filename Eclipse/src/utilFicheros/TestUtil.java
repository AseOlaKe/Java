package utilFicheros;

public class TestUtil {

	public static void main(String[] args) {
		UtilFicheros util= new UtilFicheros();
		
		try {
			util.listarDirectorio();
		} catch (UtilException e) {

			e.printStackTrace();
		}

	}

}

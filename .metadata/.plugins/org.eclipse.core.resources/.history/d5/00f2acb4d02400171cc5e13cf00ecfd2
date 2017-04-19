package utilFicheros;
import java.io.*;
public class UtilFicheros {
	/*
	 * Interfaz
	 * 
	 * Este método lista los ficheros de un directorio
	 * Prototipo: void listarDirectorio()
	 * Precondiciones/Entrada/Salida/Postcondiciones: No hay
	 * RESGUARDO
	 * 
	 * public void listarDirectorio()
	 * {
	 * 		System.out.println("EN CONSTRUCCION");
	 * }
	 */

	public void listarDirectorio() throws UtilException
	{
		File ruta=new File(".\\src\\utilFicheros");
		File[]archivos=ruta.listFiles();
		if(archivos==null)
		{
			throw new UtilException("El directorio debe contener archivos");
		}
		else
		{
			for(int i=0; i<archivos.length;i++)
			{
				System.out.println(archivos[i]);
			}
		}
	}
	/*
	 * Interfaz
	 * 
	 * Este método indica las propiedades y lista el contenido de win.ini y system.ini de Windows
	 * Precondiciones: No hay
	 * Entradas: Dos archivos 
	 * Salidas: No hay
	 * Postcondiciones: No hay
	 * 
	 * RESGUARDO
	 * 
	 * public void fileProperties(String win, String system)
	 * {
	 * 		System.out.println("EN CONSTRUCCIÓN");
	 * }
	 * 
	 */
	
}

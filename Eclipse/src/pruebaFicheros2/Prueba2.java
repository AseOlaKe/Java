package pruebaFicheros2;
import java.io.*;
public class Prueba2 {

	public static void main(String[] args) {
		
		String ruta=".\\src\\pruebaFicheros2\\prueba2.txt";
		File archivo=new File(ruta);
		FileWriter fw=null;
		FileReader fr = null;
		String linea="------------------";
		
		try
		{
			if(!archivo.exists())
			{
				fw=new FileWriter(archivo);
				fw.write("ivan maricona");
				fw.close();
				fr=new FileReader(archivo);
				int valor=fr.read();
				while(valor!=-1)
				{
					System.out.print((char)valor);
					valor=fr.read();
				}
			}
			else
			{
				
				fw=new FileWriter(archivo,true);
				fw.write(linea);
				fw.close();
				fr=new FileReader(archivo);
				int valor=fr.read();
				while(valor!=-1)
				{
					System.out.print((char)valor);
					valor=fr.read();
				}
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}finally{
			
			try 
			{
					fr.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}

	}

}

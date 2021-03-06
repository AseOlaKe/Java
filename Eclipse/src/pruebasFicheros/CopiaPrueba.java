package pruebasFicheros;
import java.io.*;
public class CopiaPrueba {
	
	public static void main(String[]args){
		
	
		String rutaIn=".\\src\\pruebasFicheros\\prueba.txt";
		String rutaOut=".\\src\\pruebasFicheros\\FicheroCopiado.txt";
		FileWriter fw=null;
		FileReader fr=null;
		int linea;
		try
		{
			fw=new FileWriter(rutaOut);
			fr=new FileReader(rutaIn);
			linea=fr.read();
			while(linea!=-1)
			{
				fw.write(linea);
				linea=fr.read();
			}
			
		}catch(IOException e)
		{
			System.out.println("Error en E/S: "+e);
		}
		finally  
		{ 
			if (fw != null) 
			{
				try
				{
					fw.close(); 
				}catch(IOException e)
				{
					e.printStackTrace();
				}
				
			} 
			if (fr != null) 
			{ 
				try
				{
					fr.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

package pruebasFicheros;
import java.io.*;
public class Prueba {

	public static void main(String[] args) 
	{
		//int valor;
		String ruta=".\\src\\pruebasFicheros\\prueba.txt";
		String linea;
		String linea2;
		File archivo=new File(ruta);
		FileWriter fw=null;
		FileReader fr=null;
		BufferedReader bf= null;
		try 
		{
			
			 fr=new FileReader(ruta);
			 bf=new BufferedReader(fr);
			 linea= bf.readLine();
			 while(linea!=null)
			 {
				 System.out.println(linea);
				 linea=bf.readLine();
			 }
			 fr.close();
			
			 
			 /*while(valor!=-1)
			 {
	         System.out.print((char)valor);
	         valor=fr.read();
			 }
			 fr.close();*/
			 
			 fw=new FileWriter(ruta,true);
			 fw.write("\n ivan maricona");
			 fw.close();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
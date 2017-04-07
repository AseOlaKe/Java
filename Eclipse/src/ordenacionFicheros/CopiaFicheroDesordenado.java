package ordenacionFicheros;
import java.io.*;
public class CopiaFicheroDesordenado {

	public static void main(String[] args) {
		
		String in=".\\src\\ordenacionFicheros\\ficheroAOrdenar.txt";
		String out=".\\src\\ordenacionFicheros\\copiaDesordenado.txt";
		File archivo=new File(out);
		FileWriter fw= null;
		FileReader fr=null;
		BufferedReader br=null;
		String linea;
		try
		{
			fw=new FileWriter(out);
			fr=new FileReader(in);
			//bw=new BufferedWriter(fw);
			br= new BufferedReader(fr);
			linea=br.readLine();
			while(linea!=null)
			{
				fw.write(linea+"\r\n");
				linea=br.readLine();
				//bw.newLine();
			}
			
		}catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}finally
		{
			try {
				br.close();
				//bw.close(); //Hay que cerrarlos en el orden contrario al que se abren
				fr.close();
				fw.close();
			}catch(IOException e)
			{
				System.out.println("Error E/S: "+e);
			}
		}
	}

}
package ordenacionFicheros;
import java.io.*;
public class UtilFicheros {
	
	public static void main(String[]args)
	{
		String ruta=".\\src\\ordenacionFicheros\\ficheroAOrdenar.txt";
		File archivo=new File(ruta);
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter(ruta);
			bw=new BufferedWriter(fw);
			bw.write("5");
			bw.newLine();
			bw.write("1");
			bw.newLine();
			bw.write("30");
			bw.newLine();
			bw.write("4");
			bw.newLine();
			bw.write("2");
			bw.newLine();
			bw.write("78");
			bw.newLine();
			bw.write("40");
			bw.close();
			fw.close();
		}catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
}

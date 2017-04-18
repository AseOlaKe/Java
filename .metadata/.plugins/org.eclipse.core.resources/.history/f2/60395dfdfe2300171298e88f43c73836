package ordenacionFicheros;
import java.io.*;
public class Merge {

			   
			
			   public  void run() {
				   String INPUT= ".\\src\\ordenacionFicheros\\ficheroAOrdenar.txt" ;
				   String AUX1  =  ".\\src\\ordenacionFicheros\\aux1.txt" ;
				   String AUX2  =  ".\\src\\ordenacionFicheros\\aux2.txt" ;
			     try {
			       boolean sorted = split(INPUT, AUX1, AUX2);
			       while (!sorted) { //Mientras no estén ordenados, divide y vencerás
			         merge(AUX1, AUX2, INPUT);
			         sorted = split(INPUT, AUX1, AUX2);
			       }
			       System.out.println("Ya esta chavale ya esta ordenao del to, o no ");//Ea con dio
			     } catch (IOException ex) {
			       System.out.println("No se pudo ordenar el fichero: "+ex);
			     }
			   }
			   /*
			    * Interfaz
			    * 
			    * Este método divide un fichero en otros dos, colocando en éstos los números en secuencias ordenadas
			    * prototipo: boolean split(String input,String output1,String output2)
			    * Precondiciones: Las cadenas no pueden estar vacías
			    * Entrada: 3 cadenas
			    * Salidas: Un valor booleano
			    * Postcondiciones: True si el fichero está ordenado y false si no
			    * 
			    * RESGUARDO
			    * 
			    * public boolean split(String input,String output1,String output2)
			    * {
			    * 	return false;
			    * }
			    */
			
			    public boolean split(String input,String output1,String output2) throws IOException {
			
			     BufferedReader in = new BufferedReader(new FileReader(input)); 
			     BufferedWriter out = new BufferedWriter(new FileWriter(output1));
			     BufferedWriter other = new BufferedWriter(new FileWriter(output2));
		
			     boolean sorted = true;
			     String previous = "";
			     String current = in.readLine();
			     out.write(current);
			     out.newLine();
			     previous = current;
			     current = in.readLine();
			     while (current != null) { //Paso las cadenas a enteros ya que el compareTo de String compara solo el primer carácter, entonces si escribo "20" y "3" me dirá que 20 es menor que 3
			    	 int previousNumber=Integer.parseInt(previous);
				     int currentNumber=Integer.parseInt(current);
			       if (previousNumber>currentNumber) {
			         sorted = false;
			        BufferedWriter tmp = out;//Si el número previo es mayor al actual, significa que no está ordenado y escribimos en el otro fichero
			         out = other;
			         other = tmp;
			       }
			       out.write(current);
			       out.newLine();
			
			       previous = current;
			       current = in.readLine();
			     }
			
			     in.close();
			     out.close();
			     other.close();
			
			     return sorted;
			   }
			
			   public void merge(String input1,String input2, String output) throws IOException {
			
			     BufferedReader in1 = new BufferedReader(new FileReader(input1));
			     BufferedReader in2 = new BufferedReader( new FileReader(input2));
			     BufferedWriter out = new BufferedWriter(new FileWriter(output));
			
			     String current1 = in1.readLine();
			     String current2 = in2.readLine();
			
			     while (current1 != null && current2 != null) { //Vamos escribiendo en el fichero original en orden
			    	 int currentNumber1=Integer.parseInt(current1);
			    	 int currentNumber2=Integer.parseInt(current2);
			    	        if (currentNumber1<=currentNumber2) {
			         out.write(current1);
			         out.newLine();
			         current1 = in1.readLine();
			       } else {
			         out.write(current2);
			         out.newLine();
			         current2 = in2.readLine();
			       }
			     }
			
			     while (current1 != null) {
			       out.write(current1);
			       out.newLine();
			       current1 = in1.readLine();
			     }
			
			     while (current2 != null) {
			       out.write(current2);
			       out.newLine();
			       current2 = in2.readLine();
			     }
			     in1.close();
			     in2.close();
			     out.close();
			   }
}

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reloj {

	public static void main(String[] args) throws InterruptedException{
		
		
		for(int contador=0; contador<=1;)
		{
			Calendar calendario=GregorianCalendar.getInstance();
			System.out.print("\r------"+calendario.getTime().toString().substring(10,19)+"--------");
			Thread.sleep(1000);
		}
		
		
		
		
		

	}

}

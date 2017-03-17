/*
 * 
 * 
 * 
 */


public class TestCarta {
	
	public static void main (String[] args) {
		
		Carta carta1= new Carta(10,10);
		Carta carta2= new Carta(10,12);
		
		System.out.println("Valor: "+carta1.getValor());
		carta1.setValor(1);
		System.out.println("Valor: "+carta1.getValor());
		System.out.println("Valor impreso: "+carta1.getValorImpreso());
		carta1.imprimirCarta();
		carta1.setValorImpreso(12);
		System.out.println("Valor impreso: "+carta1.getValorImpreso());
		carta1.imprimirCarta();
		carta1.imprimirCartaOculta();
		System.out.println("toString: "+carta1.toString());
		System.out.println("hashCode: "+carta1.hashCode());
		System.out.println("equals: "+carta1.equals(carta2));
		System.out.println("compareTo: "+carta1.compareTo(carta2));
		
	}
}


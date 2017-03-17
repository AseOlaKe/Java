/*
 * Test clase persona
 * 
 * 
 */


public class TestPersona {
	
	public static void main (String[] args) {
		
		Persona persona=null;
		Persona persona1=null;
		
		try
		{
			persona=new Persona("Paco",69,"12345678E",'m',58.3,1.72);
			persona1=new Persona("Luisitor-3000",48,"53286193M",'h',89.7,1.94);
		}catch(ExcepcionPersona mensaje){}
		
		System.out.println("Nombre: "+persona.getNombre());
		persona.setNombre("Alvarillolag1");
		System.out.println("Nuevo nombre: "+persona.getNombre());
		System.out.println("Edad: "+persona.getEdad());
		try
		{
			persona.setEdad(30);
		}catch(ExcepcionPersona mensaje){}
		System.out.println("Nueva edad: "+persona.getEdad());
		System.out.println("DNI: "+persona.getDNI());
		try
		{
			persona.setDNI("98765432P");
		}catch(ExcepcionPersona mensaje){}
		System.out.println("Nuevo DNI: "+persona.getDNI());
		System.out.println("Sexo: "+persona.getSexo());
		try
		{
			persona.setSexo('P');
		}catch(ExcepcionPersona mensaje){}
		System.out.println("Nuevo sexo: "+persona.getSexo());
		System.out.println("Peso: "+persona.getPeso());
		try
		{
			persona.setPeso(75.0);
		}catch(ExcepcionPersona mensaje){}
		System.out.println("Nuevo peso: "+persona.getPeso());
		System.out.println("Altura: "+persona.getAltura());
		try
		{
			persona.setAltura(1.80);
		}catch(ExcepcionPersona mensaje){}
		System.out.println("Nueva Altura: "+persona.getAltura());
		System.out.println("IMC: "+persona.getIMC());
		System.out.println("Mayor de edad?: "+persona.mayorEdad(persona.getEdad()));
		System.out.println("toString: "+persona.toString());
		System.out.println("hashCode: "+persona.hashCode());
		System.out.println("equals: "+persona.equals(persona1));
		System.out.println("compareTo: "+persona.compareTo(persona1));
		System.out.println("Clone: "+persona.clone());
	}
}


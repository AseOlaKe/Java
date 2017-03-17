package Fecha;

import static org.junit.Assert.*;

import org.junit.Test;

public class FechaTestJUnit {
	
/*
	
	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDia() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDia() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMes() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMes() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnyo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAnyo() {
		fail("Not yet implemented");
	}

	@Test
	public void testFecha() {
		fail("Not yet implemented");
	}

	@Test
	public void testFechaIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFechaFecha() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testEqualsObject() {
		
		Fecha fecha=null;
		Fecha fecha1=null;
		try
		{
			fecha= new Fecha(25,2,2016);
			fecha1=new Fecha(25,2,2016);
		}catch(FechaExcepcion mensaje)
		{
			System.out.println(mensaje);
		}
			assertEquals(fecha, fecha1);
			
		
			fecha.setDia(12);
			fecha.setMes(6);
			fecha.setAnyo(2016);
		
			assertNotEquals(fecha, fecha1);
	}

	/*@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsBisiesto() {
		fail("Not yet implemented");
	}

	@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject1() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone1() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString1() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}
*/
}

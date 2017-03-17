package NotasArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNotasArray {

	@Test
	public void ArrayString() {
		String[]NotasArray={"Paco","Luisitor"};
		String[]OtrasNotas={"Paco","Luisitor"};
		assertArrayEquals(NotasArray,OtrasNotas);
	}
	@Test
	public void ArrayInteger() {
		int[]NotasArray={4,3,2,6,5};
		int[]OtrasNotas={6,2,3,5,4};
		assertEquals(4,UtilNotasArray.notaMedia(OtrasNotas),0.0001);
		assertEquals(4,UtilNotasArray.notaMedia(NotasArray),0.0001);
	}
	@Test
	public void NotasPorEncima()
	{
		int[]NotasArray={6,7,8,9,10};
		assertEquals(5,UtilNotasArray.notaPorEncima(NotasArray, 5.0));
	}
	@Test
	public void asdasdas()
	{
		assert
	}
} 

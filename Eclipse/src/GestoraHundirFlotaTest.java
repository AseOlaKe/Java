package hundirLaFlota;

import static org.junit.Assert.*;

import org.junit.Test;

public class GestoraHundirFlotaTest {

	@Test
	public void cargarArray() {
		boolean[][] tablero=new boolean[10][10];
		Barco barco=new Barco(new int[3],"Horizontal","Arriba");
		GestoraHundirFlota.cargarArrayBarco(barco);
		assertArrayEquals(tablero,GestoraHundirFlota.cargarArray(tablero, barco, 0, 0, "Vertical"));
	}

}

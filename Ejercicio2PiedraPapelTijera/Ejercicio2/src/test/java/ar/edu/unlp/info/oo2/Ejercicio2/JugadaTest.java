package ar.edu.unlp.info.oo2.Ejercicio2;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JugadaTest {

		
		Papel jugarpapel;
		Piedra jugarpiedra;
		Tijera jugartijera;
		
		@BeforeEach
		void setUp() throws Exception {
			jugarpapel = new Papel();
			jugarpiedra = new Piedra();
			jugartijera = new Tijera();
		}
	    @Test
	    public void testPapel() {
	        assertEquals("Gana Tijera", jugarpapel.recibirJugada(jugartijera));
	        assertEquals("Gana Papel", jugarpapel.recibirJugada(jugarpiedra));
	        assertEquals("Empate", jugarpapel.recibirJugada(jugarpapel));
	    }
	    @Test
	    public void testPiedra() {
	        assertEquals("Gana Piedra", jugarpiedra.recibirJugada(jugartijera));
	        assertEquals("Empate", jugarpiedra.recibirJugada(jugarpiedra));
	        assertEquals("Gana Papel", jugarpiedra.recibirJugada(jugarpapel));
	    }
	    @Test
	    public void testTijera() {
	        assertEquals("Empate", jugartijera.recibirJugada(jugartijera));
	        assertEquals("Gana Piedra", jugartijera.recibirJugada(jugarpiedra));
	        assertEquals("Gana Tijera", jugartijera.recibirJugada(jugarpapel));
	    }
	
}



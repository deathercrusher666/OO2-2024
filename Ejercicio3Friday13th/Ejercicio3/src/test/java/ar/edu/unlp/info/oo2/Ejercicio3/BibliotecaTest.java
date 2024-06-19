package ar.edu.unlp.info.oo2.Ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {
	
	Biblioteca b;
	Biblioteca b2;

	String resultado;
	String separator = System.lineSeparator();
	
	@BeforeEach
	void setUp() throws Exception {
		b = new Biblioteca();
		b.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		b.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com","2345-2"));

/*			"\t{" + separator
			+ "\t\t\"nombre\": \"" + socio.getNombre() + "\"," + separator
			+ "\t\t\"email\": \"" + socio.getEmail() + "\"," + separator
			+ "\t\t\"legajo\": \"" + socio.getLegajo() + "\"" + separator
			+ "\t}";
*/
		resultado = "["+separator+"\t{" + separator	+ "\t\t\"nombre\": \"" + "Arya Stark" + "\"," + separator + "\t\t\"email\": \"" + "needle@stark.com" + "\"," + separator
				+ "\t\t\"legajo\": \"" + "5234-5" + "\"" + separator + "\t}" +","+separator+"\t{" + separator	+ "\t\t\"nombre\": \"" + "Tyron Lannister" + "\"," + separator + "\t\t\"email\": \"" + "tyron@thelannisters.com" + "\"," + separator
				+ "\t\t\"legajo\": \"" + "2345-2" + "\"" + separator + "\t}" + separator + "]";
	}
    @Test
    public void testBiblioteca() {
    	assertNotEquals(" ", b.exportarSocios());
        assertEquals(resultado, b.exportarSocios());
        b.agregarSocio(new Socio("jere","jere@jere.com","12345"));
        assertNotEquals(resultado, b.exportarSocios());
    }


}

package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	
	User juan;
	User juli;

	@BeforeEach
	void setUp() throws Exception {
		juan = new User("juan");
		juli = new User("juli");
	}
    @Test
    public void testNombreCompleto() {
        assertEquals("juan", juan.getScreenName());
        assertEquals("juli", juli.getScreenName());
        assertEquals(false, juan.equals(juli));
        assertEquals(true, juan.equals(juan));
        
    }

}

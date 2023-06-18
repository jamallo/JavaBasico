package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.ContactosService;

class testContac {
	
	ContactosService contactosService;

	@BeforeEach
	void setUp() throws Exception {
		

	}

	@Test
	void testGuardarContacto() {
		assertTrue(contactosService.guardarContacto(666666666, "alba", "alba@algo.com", 38));
		assertTrue(contactosService.guardarContacto(666666666, "María", "maria@algo.com", 34));
		assertFalse(contactosService.guardarContacto(777777777, "Daniel", "maria@algo.com", 34));
	}

	@Test
	void testBuscarContacto() {
	}

	@Test
	void testEliminarContacto() {
	}

	@Test
	void testContactos() {
	}

}

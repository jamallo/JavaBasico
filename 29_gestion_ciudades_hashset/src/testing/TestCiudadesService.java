package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.CiudadesService;

class TestCiudadesService {
	
	CiudadesService ciudadesService;

	@BeforeEach
	void setUp() throws Exception {
		ciudadesService=new CiudadesService();
		ciudadesService.altaCiudad("Paris", "Francia", 7_000_000);
		ciudadesService.altaCiudad("Burgos", "España", 70_000);
		ciudadesService.altaCiudad("Liverpol", "England", 1_000_000);
		ciudadesService.altaCiudad("Sevilla", "España", 1_200_000);
		ciudadesService.altaCiudad("Berna", "Suiza", 600_000);




	}

	@Test
	void testMasPoblada() {
		assertEquals("Paris", ciudadesService.masPoblada());
	}

	@Test
	void testPorPais() {
		assertEquals(2, ciudadesService.porPais("España").size());
	}

}

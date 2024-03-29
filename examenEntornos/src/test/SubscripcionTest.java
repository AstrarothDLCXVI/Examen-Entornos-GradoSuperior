package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Subscripcion;

class SubscripcionTest {

	@Test
	void testPrecioPorMes() {
		Subscripcion s = new Subscripcion(-1, 2);
		
		assertEquals(0, s.precioPorMes());
	}

	
	@Test
	void testPrecioPorMes2() {
		Subscripcion s = new Subscripcion(2, -2);
		
		assertEquals(0, s.precioPorMes());
	}
	
	
	@Test
	void testPrecioPorMes3() {
		Subscripcion s = new Subscripcion(2, 2);
		
		assertEquals(1, s.precioPorMes());
	}
	
	
	@Test
	void testPrecioPorMes4() {
		Subscripcion s = new Subscripcion(234, 22);
		
		assertEquals(11, s.precioPorMes());
	}
	
	
	@Test
	void testCancel() {
		Subscripcion s = new Subscripcion(2, 2);
		
		s.cancel();
	}
}

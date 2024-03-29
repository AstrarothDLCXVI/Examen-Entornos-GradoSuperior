package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Calculadora;


class CalculadoraTest {

	@Test
	void testsumar() {
		Calculadora c = new Calculadora();
		
		assertEquals(0, c.sumar(-1, 3));
		assertEquals(0, c.sumar(2, -2));
		assertEquals(4, c.sumar(2, 2));
	}
	
	@Test
	void testMultiplicar() {
		Calculadora c = new Calculadora();
		
		assertEquals(4, c.multiplicar(2, 2));
		
	}
	
	
	@Test
	void testDividir() {
		Calculadora c = new Calculadora();
		
		assertEquals(1, c.dividir(2, 2));
		assertEquals(0, c.dividir(2, 0));
	}
	
	
	@Test
	void testRaiz() {
		Calculadora c = new Calculadora();
		
		assertEquals(0, c.raiz(4, 0));
		assertEquals(0, c.raiz(-1, 2));
		assertEquals(2.0, c.raiz(4, 2));
		assertEquals(0, c.raiz(0, 1));
	}
	
	
	@Test
	void testCalcularRaicesSegundoGrado() {
		Calculadora c = new Calculadora();
		
		assertEquals(0, c.calcularRaicesSegundoGrado(4, -2, 5));
		assertEquals(1252, c.calcularRaicesSegundoGrado(4, 100, 5));
		assertEquals(-9, c.calcularRaicesSegundoGrado(10, 2, 5));
		assertEquals(-10, c.calcularRaicesSegundoGrado(10, 0, 5));
	}
	

}

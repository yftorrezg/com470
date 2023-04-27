package com470.primerParcial2022;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void testTipoTriangulo_1() {
		Triangulo triangulo = new Triangulo(10, 20, 20);
		assertEquals("Isosceles", triangulo.TipoTriangulo());
	}

	@Test
	public void testEsTriangulo_1() {
		Triangulo triangulo = new Triangulo(10, 20, 20);
		assertTrue(triangulo.esTriangulo());
	}
	
	@Test
	public void testTipoTriangulo_2() {
		Triangulo triangulo = new Triangulo(8, 12, 16);
		assertEquals("Escaleno", triangulo.TipoTriangulo());
	}

	@Test
	public void testEsTriangulo_2() {
		Triangulo triangulo = new Triangulo(8, 12, 16);
		assertTrue(triangulo.esTriangulo());
	}
	
	@Test
	public void testTipoTriangulo_3() {
		Triangulo triangulo = new Triangulo(10, 10, 10);
		assertEquals("Equilatero", triangulo.TipoTriangulo());
	}

	@Test
	public void testEsTriangulo_3() {
		Triangulo triangulo = new Triangulo(10, 10, 10);
		assertTrue(triangulo.esTriangulo());
	}
	
	
	@Test
	public void testTipoTriangulo_4() {
		Triangulo triangulo = new Triangulo(10, 10, 20);
		assertEquals("Isosceles", triangulo.TipoTriangulo());
	}

	@Test
	public void testEsTriangulo_4() {
		Triangulo triangulo = new Triangulo(10, 10, 20);
		assertFalse(triangulo.esTriangulo());
	}

}

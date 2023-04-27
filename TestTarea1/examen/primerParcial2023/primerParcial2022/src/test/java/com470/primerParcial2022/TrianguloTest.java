package com470.primerParcial2022;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void testTipoTriangulo() {
		// el primero
		Triangulo triangulo = new Triangulo(10, 20, 20);
		assertEquals("Isosceles", triangulo.TipoTriangulo());
	}

	@Test
	public void testEsTriangulo() {
		Triangulo triangulo = new Triangulo(10, 20, 20);
		assertTrue(triangulo.esTriangulo());
	}
	
	@Test
	public void testNoEsTriangulo() {
		Triangulo triangulo = new Triangulo(10, 20, 30);
		assertFalse(triangulo.esTriangulo());
	}

}

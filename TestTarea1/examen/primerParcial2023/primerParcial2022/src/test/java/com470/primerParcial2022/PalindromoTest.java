package com470.primerParcial2022;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromoTest {

	@Test
	public void testBuscaPalindromo() {
		Palindromo palindromo = new Palindromo();
		assertTrue(palindromo.buscaPalindromo("somos"));
	}

	@Test
	public void testMurcielagoPalindromo() {
		Palindromo palindromo = new Palindromo();
		assertFalse(palindromo.buscaPalindromo("murcielago"));
	}
}

package com470.primerParcial2022;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromoTest {

	@Test
	public void testBuscaPalindromo_1() {
		Palindromo palindromo = new Palindromo();
		assertTrue(palindromo.buscaPalindromo("Somos"));
	}
	
	@Test
	public void testBuscaPalindromo_2() {
		Palindromo palindromo = new Palindromo();
		assertFalse(palindromo.buscaPalindromo("Murcielago"));
	}

	@Test
	public void testBuscaPalindromo_3() {
		Palindromo palindromo = new Palindromo();
		assertTrue(palindromo.buscaPalindromo("Ana"));
	}
	
	@Test
	public void testBuscaPalindromo_4() {
		Palindromo palindromo = new Palindromo();
		assertFalse(palindromo.buscaPalindromo("Alfredo"));
	}
	
	@Test
	public void testBuscaPalindromo_5() {
		Palindromo palindromo = new Palindromo();
		assertTrue(palindromo.buscaPalindromo("Reconocer"));
	}
	
	@Test
	public void testBuscaPalindromo_6() {
		Palindromo palindromo = new Palindromo();
		assertFalse(palindromo.buscaPalindromo("Sapos"));
	}
	
	@Test
	public void testBuscaPalindromo_7() {
		Palindromo palindromo = new Palindromo();
		assertFalse(palindromo.buscaPalindromo("Sevilla"));
	}
	
}

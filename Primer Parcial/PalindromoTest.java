package com470.primerParcial2022;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromoTest {
	Palindromo palindromo = new Palindromo();
	@Test
	public void testBuscaPalindromo() {
		
		assertTrue(palindromo.buscaPalindromo("Somos"));
	}
	
	@Test
	public void testBuscaPalindromo1() {
		
		assertFalse(palindromo.buscaPalindromo("Murcielago"));
	}
	
	@Test
	public void testBuscaPalindromo2() {
		
		assertTrue(palindromo.buscaPalindromo("Ana"));
	}
	
	@Test
	public void testBuscaPalindromo3() {
		
		assertFalse(palindromo.buscaPalindromo("Alfredo"));
	}
	
	@Test
	public void testBuscaPalindromo4() {
		
		assertTrue(palindromo.buscaPalindromo("Reconocer"));
	}
	
	@Test
	public void testBuscaPalindromo5() {
		
		assertFalse(palindromo.buscaPalindromo("sapos"));
	}
	
	@Test
	public void testBuscaPalindromo6() {
		
		assertFalse(palindromo.buscaPalindromo("sevilla"));
	}
	

}

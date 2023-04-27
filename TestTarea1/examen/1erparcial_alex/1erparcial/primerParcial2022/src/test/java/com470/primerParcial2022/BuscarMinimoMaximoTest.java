package com470.primerParcial2022;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com470.primerParcial2022.model.MinimoMaximo;

public class BuscarMinimoMaximoTest {
	
	BuscarMinimoMaximo buscarMinimoMaximo= new BuscarMinimoMaximo();
	
	@Test
	public void testBuscaMinimoMaximo() {
		List<Integer> lista = Arrays.asList(3,2,1,55,2,4);
		
		MinimoMaximo resultado = buscarMinimoMaximo.buscaMinimoMaximo(lista);
		MinimoMaximo esperado = new MinimoMaximo(1,55);
		
		assertEquals(resultado, esperado);
	}

	
	@Test
	public void testBuscaMinimoMaximo1() {
		List<Integer> lista = Arrays.asList(3,2,1,55,2,4,100,-888);
		
		MinimoMaximo resultado = buscarMinimoMaximo.buscaMinimoMaximo(lista);
		MinimoMaximo esperado = new MinimoMaximo(-888,100);
		
		assertEquals(resultado, esperado);
	}
	
	@Test
	public void testBuscaMinimoMaximo2() {
		List<Integer> lista = Arrays.asList(0,2,1,55,2,4,100,8889);
		
		MinimoMaximo resultado = buscarMinimoMaximo.buscaMinimoMaximo(lista);
		MinimoMaximo esperado = new MinimoMaximo(0,8889);
		
		assertEquals(resultado, esperado);
	}
}

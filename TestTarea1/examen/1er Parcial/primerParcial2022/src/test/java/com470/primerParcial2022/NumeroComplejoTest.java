package com470.primerParcial2022;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NumeroComplejoTest {
	
	@Parameters
	public static List<Object[]> datos(){
		//devolvera una lista
		return Arrays.asList(new Object[][] {
			{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 8, 7, 6},
			{10, 12, 23, 14}, {25, 16, 17, 18}, {39, 38, 47, 26},
			{15, 26, 33, 41}, {50, 60, 70, 80}, {91, 82, 75, 36},
			{100, 52, 33, 49}, {45, 68, 75, 89}, {96, 18, 72, 64},
			{91, 42, 35, 74}, {55, 66, 87, 58}, {49, 48, 79, 67}
		});
	}
	
	int v1,v2,v3,v4;
	

	public NumeroComplejoTest(int valor1, int valor2, int valor3, int valor4) {
		//super();
		v1 = valor1;
		v2 = valor2;
		v3 = valor3;
		v4 = valor4;
	}
	

	@Test
	public void testSumar() {
		NumeroComplejo reales = new NumeroComplejo(v1, v2);
		NumeroComplejo imaginarios = new NumeroComplejo(v3, v4);
		NumeroComplejo resultado;
		NumeroComplejo esperado = new NumeroComplejo(v1+v3, v2+v4);
		
		resultado = reales.sumar(imaginarios);
		System.out.println(resultado);

		assertEquals(esperado.getParteReal(), resultado.getParteReal());
		assertEquals(esperado.getParteImaginaria(), resultado.getParteImaginaria());
	}

	@Test
	public void testRestar() {
		NumeroComplejo reales = new NumeroComplejo(v1, v2);
		NumeroComplejo imaginarios = new NumeroComplejo(v3, v4);
		NumeroComplejo resultado;
		NumeroComplejo esperado = new NumeroComplejo(v1-v3, v2-v4);
		
		resultado = reales.restar(imaginarios);
		System.out.println(resultado);

		assertEquals(esperado.getParteReal(), resultado.getParteReal());
		assertEquals(esperado.getParteImaginaria(), resultado.getParteImaginaria());
	}

}

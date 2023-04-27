package com470.primerParcial2022;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;


@RunWith(Parameterized.class)
public class UtilidadesTest {
	@Parameterized.Parameters
	
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[] [] {{"a","b","c"}, {"d","e","f"}});	
	}

	@Parameter(0)
	public String valor1;
	@Parameter(1)
	public String valor2;
	@Parameter(2)
	public String valor3;
	

	@Test
	public void testConcatenar() {
		System.out.println("Los parametros de v1="+valor1+" v2="+valor2+" v3="+valor3);
		Utilidades utilidades = new Utilidades();
		assertEquals(valor1+" "+valor2+" "+valor3, utilidades.concatenar(valor1, valor2, valor3));
	}

}

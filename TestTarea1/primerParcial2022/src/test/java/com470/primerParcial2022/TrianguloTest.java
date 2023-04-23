/* 
 * 	public String TipoTriangulo() {
		if (LadoA == LadoB && LadoA == LadoC) {
			return "Equilatero";
		} else if (LadoA != LadoB && LadoA != LadoC && LadoB != LadoC) {
			return "Escaleno";
		} else
			return "Isosceles";
	}

	public boolean esTriangulo() {
		if (LadoA + LadoB > LadoC && LadoA + LadoC > LadoB && LadoB + LadoC > LadoA) {
			return true;
		}
		return false;
	}
}
 */

package com470.primerParcial2022;

import static org.junit.Assert.assertEquals;

public class TrianguloTest {
  
  /*
   * Pruebas a realizar
   * Triangulo
   * 
   * LadoA        LadoB       LadoC       Es Triangulo SI/NO        Resultado Esperado          Resultado Ejecucion
   * 10           20          20
   * 10           10          20
   * 10           10          5
   * 20           20          5
   * 10           10          20
   * 10           20          30
   * 10           10          20
   * 
   */

  //  TIPO DE TRIANGULO
  // 10 20 20
  @Test
  public void testTipoTriangulo1() {
    Triangulo t = new Triangulo(10, 20, 20);
    assertEquals("Isosceles", t.TipoTriangulo());
  }

  // 10 10 20
  @Test
  public void testTipoTriangulo2() {
    Triangulo t = new Triangulo(10, 10, 20);
    assertEquals("Isosceles", t.TipoTriangulo());
  }

  // 10 10 5
  @Test
  public void testTipoTriangulo3() {
    Triangulo t = new Triangulo(10, 10, 5);
    assertEquals("Isosceles", t.TipoTriangulo());
  }

  // 20 20 5
  @Test
  public void testTipoTriangulo4() {
    Triangulo t = new Triangulo(20, 20, 5);
    assertEquals("Isosceles", t.TipoTriangulo());
  }

  // 10 10 20
  @Test
  public void testTipoTriangulo5() {
    Triangulo t = new Triangulo(10, 10, 20);
    assertEquals("Isosceles", t.TipoTriangulo());
  }

  // 10 20 30
  @Test
  public void testTipoTriangulo6() {
    Triangulo t = new Triangulo(10, 20, 30);
    assertEquals("Escaleno", t.TipoTriangulo());
  }

  // 10 10 20
  @Test
  public void testTipoTriangulo7() {
    Triangulo t = new Triangulo(10, 10, 20);
    assertEquals("Isosceles", t.TipoTriangulo());
  }

  // 10 10 10
  @Test
  public void testTipoTriangulo8() {
    Triangulo t = new Triangulo(10, 10, 10);
    assertEquals("Equilatero", t.TipoTriangulo());
  }

  // ES TRIANGULO
  // 10 20 20
  @Test
  public void testEsTriangulo1() {
    Triangulo t = new Triangulo(10, 20, 20);
    assertEquals(true, t.esTriangulo());
  }

  // 10 10 20
  @Test
  public void testEsTriangulo2() {
    Triangulo t = new Triangulo(10, 10, 20);
    assertEquals(true, t.esTriangulo());
  }

  // 10 10 5
  @Test
  public void testEsTriangulo3() {
    Triangulo t = new Triangulo(10, 10, 5);
    assertEquals(false, t.esTriangulo());
  }

  // 20 20 5
  @Test
  public void testEsTriangulo4() {
    Triangulo t = new Triangulo(20, 20, 5);
    assertEquals(false, t.esTriangulo());
  }

  // 10 10 20
  @Test
  public void testEsTriangulo5() {
    Triangulo t = new Triangulo(10, 10, 20);
    assertEquals(true, t.esTriangulo());
  }

  // 10 20 30
  @Test
  public void testEsTriangulo6() {
    Triangulo t = new Triangulo(10, 20, 30);
    assertEquals(false, t.esTriangulo());
  }

  // 10 10 20
  @Test
  public void testEsTriangulo7() {
    Triangulo t = new Triangulo(10, 10, 20);
    assertEquals(true, t.esTriangulo());
  }

  // 10 10 10
  @Test
  public void testEsTriangulo8() {
    Triangulo t = new Triangulo(10, 10, 10);
    assertEquals(true, t.esTriangulo());
  }



}

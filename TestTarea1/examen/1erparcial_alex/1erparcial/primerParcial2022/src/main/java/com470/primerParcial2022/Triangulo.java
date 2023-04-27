package com470.primerParcial2022;

public class Triangulo {
	private int LadoA;
	private int LadoB;
	private int LadoC;
	

	public Triangulo(int ladoA, int ladoB, int ladoC) {
		super();
		LadoA = ladoA;
		LadoB = ladoB;
		LadoC = ladoC;
	}

	public int getLadoA() {
		return LadoA;
	}

	public void setLadoA(int ladoA) {
		LadoA = ladoA;
	}

	public int getLadoB() {
		return LadoB;
	}

	public void setLadoB(int ladoB) {
		LadoB = ladoB;
	}

	public int getLadoC() {
		return LadoC;
	}

	public void setLadoC(int ladoC) {
		LadoC = ladoC;
	}

	public Triangulo() {
		super();
	}

	public String TipoTriangulo() {
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

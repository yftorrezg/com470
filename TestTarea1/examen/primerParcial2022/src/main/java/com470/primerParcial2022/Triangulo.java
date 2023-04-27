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

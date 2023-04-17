package com.example.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.model.OperationModel;

public class CalculateSimpleTest {
	
	CalculateSimple calculateSimple = new CalculateSimple();

	@Test
	public void testAdd() {
		OperationModel operationModel = new OperationModel(5,2);
		// int resultadoEsperado = 7;
		// int resultado = calculateSimple.add(operationModel);
		
		assertEquals(7, calculateSimple.add(operationModel));
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSubtract() {
		OperationModel operationModel = new OperationModel(5,2);
		assertEquals(3, calculateSimple.subtract(operationModel));
	}
 
	@Test
	public void testMultiply() {
		OperationModel operationModel = new OperationModel(3, 3);
		assertEquals(9, calculateSimple.multiply(operationModel));
	}

	@Test
	public void testDivide() {
		OperationModel operationModel = new OperationModel(9, 3);
		assertEquals(3, calculateSimple.divide(operationModel), 0);
	}
	
	@Test
	public void testDivideA0() {
		OperationModel operationModel = new OperationModel(0, 3);
		assertEquals(0, calculateSimple.divide(operationModel), 0);
	}
	
	@Test
	public void testDivideB0() {
		OperationModel operationModel = new OperationModel(3, 0);
		assertEquals(0, calculateSimple.divide(operationModel), 0);
	}

	@Test
	public void testFactorialOperationModel() {
		OperationModel operationModel = new OperationModel(3);
		assertEquals(6, calculateSimple.factorial(operationModel));
	}


	@Test
	public void testFibonacciOperationModelCero() {
		OperationModel operationModel = new OperationModel(0);
		
		assertEquals(0, calculateSimple.fibonacci(operationModel));
		
	}
	
	@Test
	public void testFibonacciOperationModelUno() {
		OperationModel operationModel = new OperationModel(1);
		
		assertEquals(1, calculateSimple.fibonacci(operationModel));
		
	}
	
	@Test
	public void testFibonacciOperationModelDos() {
		OperationModel operationModel = new OperationModel(2);
		assertEquals(1, calculateSimple.fibonacci(operationModel));
	}

	@Test
	public void testFibonacciOperationModelDies() {
		OperationModel operationModel = new OperationModel(10);
		assertEquals(55, calculateSimple.fibonacci(operationModel));
	}
	
	@Test
	public void testSqrt() {
		OperationModel operationModel = new OperationModel(9);
		assertEquals(3.0, calculateSimple.sqrt(operationModel), 0);
	}

	@Test
	public void testPower() {
		OperationModel operationModel = new OperationModel(5);
		assertEquals(25, calculateSimple.power(operationModel));
	}

	@Test
	public void testClearSimple() {
		OperationModel operationModel = new OperationModel(2, 3);
		assertEquals(operationModel, calculateSimple.clearSimple(operationModel));
	}

	@Test
	public void testClearAdvanced() {
		OperationModel operationModel = new OperationModel(2);
		assertEquals(operationModel, calculateSimple.clearAdvanced(operationModel));
	}
	
	@Test
	public void testClearAdvanced2() {
		OperationModel operationModel = new OperationModel(null);
		assertEquals(operationModel, calculateSimple.clearAdvanced(operationModel));
	}
	
	@Test
	public void testClearAdvanced3() {
		OperationModel operationModel = new OperationModel();
		assertEquals(operationModel, calculateSimple.clearAdvanced(operationModel));
	}

}

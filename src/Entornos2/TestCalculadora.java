package Entornos2;

import static org.junit.Assert.*;

import org.junit.Test;

import Entornos1.Calculadora;

public class TestCalculadora {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int operador = 10;
		int operador2 = 15;
		
		int expected_value = 25;
assertEquals(expected_value, calc.Sumar(operador, operador2));
	}

}

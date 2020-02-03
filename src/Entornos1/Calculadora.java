package Entornos1;

public class Calculadora {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int operador = 10;
		int operador2 = 15;
		
		int resultado_esperado = 25;
		
		
		int suma = Sumar(operador, operador2);
		System.out.println(suma);
		
		if (suma==resultado_esperado) {
			System.out.println("Prueba correcta");
		}else {
			System.out.println("Prueba incorrecta");
		}
	}
	
	public Calculadora(){
		super();
	}
	
	public static int Sumar(int num1, int num2) {
		int suma = num1 + num2 ;
		
		return suma;
		
	}
	
	public static int Restar(int num1, int num2) {
		int resta = num1 - num2 ;
		return resta;
		
	}
	
	
	
	
	
	
	

}

package sesion8;
/**
 * Clase Main donde utilizamos la calculadoraPRO
 * @author LuisGarcia
 * @see CalculadoraPRO
 */

public class main {

		/**
		 * Main de la clase prueba de calculadoraPRO
		 * @see CalculadoraPRO
		 * @param args
		 */
		@SuppressWarnings("deprecation")
		public main(String[] args) {
			
			CalculadoraPRO calc = new CalculadoraPRO();
			
			calc.Sumar(4, 4);
			
			calc.sleep1s();
			
		}

	}



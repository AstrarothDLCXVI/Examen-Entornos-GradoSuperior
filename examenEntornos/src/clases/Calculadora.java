package clases;

/**
 * @author astra
 * @version 29/3/2024
 * **/

public class Calculadora {

	/**
	 * Metodo que devuelce el resultado de la suma de 2 numero
	 * @param double a; numero con decimales que va a participar en la suma 
	 * @param double b; numero con decimales que va a participar en la suma
	 * @param double sol; parametro que va a mostrar la solucion
	 * @return devuleve la suma en cado de que los 2 numeros sean mayor a 0
	 * @return devuelve 0 si algun numero es menor que 0**/
	public double sumar(double a, double b) {

		double sol = 0;

		if (a > 0 && b > 0) {
			sol = a + b;
		}
		return sol;
	}
	
	
	/**
	 * Metodo que devuelve el resultado de una programacion
	 * @param double a; numero con decimales que va a participar en la multiplicacion
	 * @param double b; numero con decimales que va a participar en la multiplicacion
	 * @return devuelve el resultado de la multiplicacion
	 * **/
	public double multiplicar(double a, double b) {
		return a * b;
	}

	
	/**
	 * Metodo que devuelve el resultado de una division
	 * @param double a; el dividendo de la division
	 * @param double b; el divisor de la division
	 * @param double solucion; parametro que va a mostrar la solucion
	 * @return Si el divisor es distinto a 0 devuelve el resultado de la division
	 * @return Si el divisor es 0 devuelve 0**/
	public double dividir(double a, double b) {
		double solucion = 0;

		if (b != 0) {
			solucion = a / b;
		}
		return solucion;
	}

	
	/**
	 * Metodo que devuelve los resultados de una raiz o no devuelve nada dependiendo del valor de sus parametros
	 * @param int b; numero entero encargado de realizar varios calculos 
	 * @param double a; numero con decimales en cargado de varios calculo
	 * @param double solucion; parametro que va a mostrar la solucion
	 * @return Si b es 0 te devuelve 0
	 * @return Si b es 2 y a es menor que 0 te devuelve 0
	 * @return Si b es 2 y a es mayor o igual a 0 te devuelve la raiz de a
	 * @return Si b es distinto a 0 y a 2 tr devuelve el resultado de Math.pow(a, (((double) 1) / b))**/
	public double raiz(double a, int b) {
		double solucion = 0;

		if (b == 0) {
			System.out.println("Eso no existe.");
		} else if (b == 2) {
			if (a < 0) {
				System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
			} else {
				solucion = Math.sqrt(a);
			}
		} else {
			solucion = Math.pow(a, (((double) 1) / b));
		}
		return solucion;
	}
	
	
	/**
	 * Metodo encargado de realizar el calculo de una raiz de segundo grado
	 * @param int a; numero entero encargado de hacer calculos
	 * @param int b; numero entero encargado de hacer calculos
	 * @param int c; numero entero encargado de hacer calculos
	 * @param double solucion; parametro que va a mostrar la solucion
	 * @param int elevado; va a encargarse de guardar el valor de b para hacer el calculo de b elevado a 2
	 * @param superior; calcula la parte superior de la raiz de segundo grado
	 * 
	 * @return si b es menor a 0 te devuelve 0 porque no tiene solucion el polinomio
	 * @return si b es mayor a 0 hace el calculo de la parte superior, si la parte superior es positiva hace la parte de la suma y devulve numero positivo
	 * @return si b es mayor a 0 hace el calculo de la parte superior, si la parte superior es negativo hace la parte de la resta y devulve numero negativo
	 * @return si b es igual a 0 hace el calculo de la parte superior en negativo y devuelve resultado negativo
	 * **/
	public int calcularRaicesSegundoGrado(int a, int b, int c) {
		int solucion = 0;
		int elevado = b;
		
		if (b < 0) {
			System.out.println("El polinomio no tiene solución real.");
		}
		else if (b>0) {
			
			int superior =  (elevado * elevado) - (4 * a *c);
			
			if (superior > 0) {
				
				solucion = (superior + b) / (2 * a);
			}
			else if (superior < 0) {
				
				solucion = (superior - b) / (2 * a);
			}
			
		}else if (b == 0) {
			int superior =  (elevado * elevado) - (4 * a *c);
			solucion = (superior + b) / (2 * a);
			
		}		
		
		return solucion;
	}

}

package clases;

/**
 * @author astra
 * @version 29/3/2024
 * **/

public class Subscripcion {
	
	/*Atributos de la clase*/
	private int precio; // precio total de la subscripción euro-cent
	private int periodo; // periodo de subscripcion en meses

	/*
	 * El constructor para crear una subscripción.
	 */
	public Subscripcion(int p, int n) {
		precio = p;
		periodo = n;
	}

	/**
	 * Calcula el precio de la subscripción mensual en euros, redondeándolo por
	 * arriba al céntimo más cercano.
	 * @param int p; numero entero del precio 
	 * @param int n numero entero del periodo
	 * @param double sol; la solucion que va ser devuelta
	 * 
	 * @return si alguno de los 2 parametros es menor igual a 0 te devuelve 0
	 * @return si los 2 son mayor a 0 hace el calculo, si el resto es mayor hace otro calculo mas
	 **/
	public double precioPorMes() {
		double sol;
		if (periodo <= 0 || precio <= 0) {
			sol=0;
		} else {
			double r = (double) precio / (double) periodo;
			double resto = r % 1;
			//Nunca se cumple
			if (resto > 0) {
				sol= (int)r + 1;
			}else {
				sol= r;
			}
		}
		System.err.println(sol);
		return sol;
	}

	/**
	 * Este método cancela la subscripción.
	 * @param periodo; le da el valor 0 para negar la subscripcion
	 * @return no devuelve nada
	 **/
	public void cancel() {
		periodo = 0;
	}
}

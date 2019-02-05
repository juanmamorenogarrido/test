package examenJAVA2311;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numeroPrimo = 0, k = 2, i = 0, carDesplazadoNumero = 0;
		char car = ' ', carDesplazado = ' ', carDesplazadoMayor = ' ';

		while (i == 0) {
			numeroPrimo = (int) (Math.random() * (25 - 1 + 1) + 1);

			while (k <= (numeroPrimo / 2) && numeroPrimo % k != 0) {
				k++;
			}
			if (k > numeroPrimo / 2) {
				System.out.println("El número primo secreto es " + numeroPrimo);
				i++;
			}

		}

		System.out.println("Escribe una letra en minuscula");
		car = Entrada.caracter();
		carDesplazadoNumero = (int) (car + numeroPrimo);
		if (carDesplazadoNumero > 122) {
			carDesplazadoMayor = (char) carDesplazadoNumero;
			carDesplazado = 'a';
			carDesplazadoMayor = (char) ((carDesplazadoMayor - 'z' - 1) + carDesplazado);
			System.out.println("La letra '" + car + "' encriptada pasará a se la letra '" + carDesplazadoMayor + "'");
		} else {
			carDesplazado = (char) (car + numeroPrimo);
			System.out.println("La letra '" + car + "' encriptada pasará a se la letra '" + carDesplazado + "'");
		}
	}

}

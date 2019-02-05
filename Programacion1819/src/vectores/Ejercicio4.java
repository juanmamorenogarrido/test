package vectores;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[] numerosPositivos = new int[10];
		int i = 0, sumaPares = 0, sumaImpares = 0;
		for (i = 0; i < numerosPositivos.length; i++) {
			System.out.println("Introduce un número del 1 al 20");
			numerosPositivos[i] = Entrada.entero();
		}

		for (i = 0; i < numerosPositivos.length; i++) {
			if (numerosPositivos[i] % 2 == 0)
				sumaPares = sumaPares + numerosPositivos[i];
			else
				sumaImpares = sumaImpares + numerosPositivos[i];
		}
		System.out.println("La suma de los números pares del vector es igual a " + sumaPares
				+ " y la suma de los impares es " + sumaImpares);
	}

}

package examenJAVA2311;


public class Ejercicio1 {

	public static void main(String[] args) {
		int numero = 0, i = 0, j = 0, posicion = 0;
		String cuadrante = " ";

		while (numero < 10 || numero % 2 == 0) {
			System.out.println("Introduce el tamaño de tu ventana");
			numero = Entrada.entero();
		}

		System.out.println("Elige cuadrante a romper");
		cuadrante = Entrada.cadena().toUpperCase();
		switch (cuadrante) {
		case "ARRIBA IZQUIERDA":
			posicion = 1;
			break;
		case "ABAJO IZQUIERDA":
			posicion = 2;
			break;
		case "ARRIBA DERECHA":
			posicion = 3;
			break;
		case "ABAJO DERECHA":
			posicion = 4;
			break;
		default:
			posicion = 0;
		}

		while (i < numero) {
			while (j < numero) {

				if (posicion == 1) {
					if (i == 0 || i == numero / 2 || i == numero - 1 || j == 0 || j == numero - 1 || j == numero / 2
							|| (i < numero / 2 && j < numero / 2)) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					j++;

				}

				if (posicion == 2) {
					if (i == 0 || i == numero / 2 || i == numero - 1 || j == 0 || j == numero - 1 || j == numero / 2
							|| (i > numero / 2 && j < numero / 2)) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					j++;

				}

				if (posicion == 3) {
					if (i == 0 || i == numero / 2 || i == numero - 1 || j == 0 || j == numero - 1 || j == numero / 2
							|| (i < numero / 2 && j > numero / 2)) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					j++;

				}

				if (posicion == 4) {
					if (i == 0 || i == numero / 2 || i == numero - 1 || j == 0 || j == numero - 1 || j == numero / 2
							|| (i > numero / 2 && j > numero / 2)) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					j++;

				}
				if (posicion == 0) {
					if (i == 0 || i == numero / 2 || i == numero - 1 || j == 0 || j == numero - 1 || j == numero / 2) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					j++;

				}
			}
			j = 0;
			System.out.println(" ");
			i++;

		}
	}

}

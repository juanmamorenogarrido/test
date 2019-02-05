package matrices;

public class DosCorredores {

	public static void main(String[] args) {
		double[][] matrizTiempo = new double[2][5];
		int[] vectorPuntuacion = new int[2];
		System.out.println("Pidiendo tiempos corredor 1: \n");
		pideTiempos(matrizTiempo, 1); //pedir tiempos corredor1
		muestraMatrices(matrizTiempo, 1);
		
		System.out.println("Pidiendo tiempos corredor 2: \n");
		pideTiempos(matrizTiempo, 2);//pedir tiempos corredor2
		muestraMatrices(matrizTiempo, 2);
		
		vectorPuntuacion = calculaPuntos(matrizTiempo);
		muestraVectores(vectorPuntuacion);

		if (vectorPuntuacion[0] > vectorPuntuacion[1]) {
			System.out.println("Gana el corredor 1");
		} else if (vectorPuntuacion[0] < vectorPuntuacion[1]) {
			System.out.println("Gana el corredor 2");
		} else if (corredorConMenorTiempo(matrizTiempo) != 0) {
			System.out.println("Empate en puntos \nGana el corredor "+corredorConMenorTiempo(matrizTiempo)+" ha tardado menos en las carreras");
		} else {
			System.out.println("Empate");
		}
	}

	public static void muestraMatrices(double matriz[][], int num) {

		for (int j = 0; j < matriz[num - 1].length; j++) {
			System.out.println(
					"Mostrando tiempo jugador " + num + " carrera " + (j+1) + " \nSegundos: " + matriz[num - 1][j]);
		}
	}

	public static void muestraVectores(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			System.out.println("Los puntos del jugador " + (i + 1) + " son: " + vector[i]);
		}
	}

	public static void pideTiempos(double matriz[][], int num) {
		for (int j = 0; j < matriz[num - 1].length; j++) {
			System.out.println("Introduce el tiempo");
			matriz[num - 1][j] = Entrada.real();
		}
	}

	public static int[] calculaPuntos(double[][] matriz) {
		int[] aux = new int[2];
		for (int j = 0; j < matriz[0].length; j++) {
			if (matriz[0][j] < matriz[1][j]) {
				aux[0] += 3;
				aux[1] += 1;
			} else if (matriz[0][j] > matriz[1][j]) {
				aux[0] += 1;
				aux[1] += 3;
			} else if (matriz[0][j] == matriz[1][j]) {
				aux[0] += 2;
				aux[1] += 2;
			}
		}
		return aux;
	}

	public static int corredorConMenorTiempo(double[][] matriz) {
		double J1 = 0, J2 = 0;

		for (int j = 0; j < matriz[0].length; j++) {
			J1 += matriz[0][j];
			J2 += matriz[1][j];
		}

		if (J1 < J2) {
			return 1;
		} else if (J2 < J1) {
			return 2;
		}else {
			return 0;
			}
	}
}

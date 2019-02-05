package golfistas;

public class Golfistas {
	public static final int N = 2, M = 4;
	public static int[][] golfistasJornadas = new int[N][M];

	public static void main(String[] args) {

		rellenaMatriz();
		muestraMatriz();

	}

	public static void rellenaMatriz() {

		for (int i = 0; i < golfistasJornadas.length; i++) {
			System.out.println("Jugador " + (i + 1));
			for (int j = 0; j < golfistasJornadas[i].length; j++) {
				System.out.println("Introduzca el número de golpes para la jornada " + (j + 1));
				golfistasJornadas[i][j] = Entrada.entero();
			}
		}
	}
	
	public static void muestraMatriz() {
		for(int i=0; i< golfistasJornadas.length; i++) {
			System.out.println("Jornadas "+i);
			for(int j=0; j< golfistasJornadas[i].length; j++) {
				System.out.println("jugador "+(i+1)+"\t "+golfistasJornadas[i][j]);
			}
		}
	}

}

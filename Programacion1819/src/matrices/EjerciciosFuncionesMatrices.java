package matrices;

public class EjerciciosFuncionesMatrices {

	public static void main(String[] args) {
		int[][] matriz1 = new int[10][5];
		int numero=4;
		boolean cuadrada=false;
		rellenoMatriz(matriz1);
		//muestraMatriz(matriz1);
		//int suma = sumaMatriz(matriz1);
		//System.out.println("La suma de la amtriz es: " + suma);
		//buscaElemento(matriz1,numero);
		
		if(esMatrizCuadrada(matriz1))
			System.out.println("Matriz cuadrada");
		else
			System.out.println("No cuadrada");
	}

	// Rellenando matriz1
	public static void rellenoMatriz(int[][] matriz) {
		System.out.println("\n\nRellenando matriz1...\n\n");
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 5) + 1;
			}
	}

	// Mostrando matriz1
	public static void muestraMatriz(int[][] matriz) {
		System.out.println("\n\nMostrando matriz1...\n\n");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Mostrando fila " + i + " columna " + j + ", valor: " + matriz[i][j]);
			}
			System.out.println("\n");
		}

	}

	public static int sumaMatriz(int[][] matriz) {
		int suma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}

	public static void buscaElemento(int[][] matriz, int numero) {
		int apariciones=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numero) {
					System.out.println("El número "+numero+" se encuentra en la fila "+i+" y la columna "+j);
					apariciones++;
				}
			}
		}
		System.out.println("El número "+numero+" ha aparecido "+apariciones+" veces");
	}
	public static boolean esMatrizCuadrada (int[][] matriz) {
		int filas=0, columnas=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				columnas++;
			}
			filas++;
	}
		if(columnas/filas==filas)
			return true;
	return false;
	}	
}

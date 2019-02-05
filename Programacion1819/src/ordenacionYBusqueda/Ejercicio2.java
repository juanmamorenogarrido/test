package ordenacionYBusqueda;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] vector1=new int [100];
		int[] vector2=new int [100];
		
		rellenaVector(vector1);
		vector2= insercion(vector1);
		System.out.println("Sin ordenar... ");
		muestraValoresVector(vector1);
		System.out.println("Ordenado... \n" );
		muestraValoresVector(vector2);
	}
	public static void rellenaVector(int[] vector) {
		for(int  i=0; i<vector.length; i++) {
			vector[i] = (int) (Math.random() * 100) + 1;
		}
	}
	static int[] insercion(int vector[]){
		int i, temp, j;
		int[] vectorOrdenado=vector.clone();
		for (i = 1; i < vectorOrdenado.length; i++) {
			temp = vectorOrdenado[i];
			j = i - 1;
			while ((j >= 0) && (vectorOrdenado[j] > temp)) {
				vectorOrdenado[j + 1] = vectorOrdenado[j];
				j--;
			}
			vectorOrdenado[j + 1] = temp;
		}
		return vectorOrdenado;
	}
	public static void  muestraValoresVector(int[]vector) {
		for (int i = 0; i < vector.length; i++)
			System.out.println("En la posicion " + i + " está el número " + vector[i]+" ");
	}

}

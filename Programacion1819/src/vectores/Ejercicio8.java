package vectores;

public class Ejercicio8 {

	public static void main(String[] args) {
		int[] vectorDelDerecho;
		int[] vectorDelReves;
		int tamanio = 0, i = 0, j = 0;

		System.out.println("Indica el tamaño del vector");
		tamanio = Entrada.entero();
		vectorDelDerecho = new int[tamanio];

		for (i = 0; i < vectorDelDerecho.length; i++) {
			System.out.println("Introduce un número");
			vectorDelDerecho[i] = Entrada.entero();
		}
		for (i = 0; i < vectorDelDerecho.length; i++)
			System.out.print("En la posicion " + i + " está el número " + vectorDelDerecho[i]+" ");

		vectorDelReves = new int[vectorDelDerecho.length];
		i = vectorDelDerecho.length-1;
		while (j < vectorDelReves.length) {
			vectorDelReves[j] = vectorDelDerecho[i];
			i--;
			j++;
		}
		System.out.println(" ");
		for (j = 0; j < vectorDelReves.length; j++)
			System.out.print("En la posicion " + j + " está el número " + vectorDelReves[j]+" ");
	}

}

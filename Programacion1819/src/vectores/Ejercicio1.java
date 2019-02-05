package vectores;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] vectorAleatorio= new int [10];
		int i=0, pares=0, impares=0;
		for( i=0; i<vectorAleatorio.length; i++) {
			vectorAleatorio[i] = (int) (Math.random() * 20) + 1;
		}
			
		for( i=0; i<vectorAleatorio.length; i++) {

			if(vectorAleatorio[i]%2==0)
				pares++;
			else 
				impares++;
		}
		for( i=0; i<vectorAleatorio.length; i++) {

			System.out.println("En la posicion "+i+" está el número "+vectorAleatorio[i]);
		}
		
		System.out.println("Hay "+pares+" números pares y "+impares+" números impares.");
	}

}
	

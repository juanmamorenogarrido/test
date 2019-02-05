package vectores;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] vectorInicial=new int[10];
		int[] vectorPares=new int [10];
		int[] vectorImpar=new int [10];
		int j=0, k=0;
		
		for(int i=0; i<vectorInicial.length; i++) {
			System.out.println("Introduce un número");
			vectorInicial[i]=Entrada.entero();
		}
		for(int i=0; i<vectorInicial.length; i++) {
			if(vectorInicial[i]%2==0) {
				vectorPares[j]=vectorInicial[i];
				j++;
			}
			else {
				vectorImpar[k]=vectorInicial[i];
				k++;
			}
		}
		for(j=0; j<vectorPares.length; j++ ) {
			System.out.println("El vector pares es "+vectorPares[j]);
		
		}
		for(k=0; k<vectorPares.length; k++ ) {
			System.out.println("El vector impar es "+vectorImpar[k]);
			
		}
	}

}

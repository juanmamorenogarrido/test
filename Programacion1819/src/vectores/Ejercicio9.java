package vectores;

public class Ejercicio9 {

	public static void main(String[] args) {
		int[] vectorAleatorio=new int [20];
		int i=0, j=2;
		for(i=0; i<vectorAleatorio.length; i++) {
			vectorAleatorio[i]=(int) (Math.random() * 50) + 1;
		}
		for(i=0; i<vectorAleatorio.length; i++) {
			while(j<=(i/2) && i%j!=0) {
				j++;
			}
			if(j>i/2 && i!=0) {
				System.out.println("La posición "+i+" es primo y contiene el valor "+vectorAleatorio[i]);
			}
			j=2;
		}
	}

}

package vectores;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[] numerosOrdenados=new int [10];
		int i=1, numeroAleatorio=0;
		
		numerosOrdenados[0]=(int) (Math.random() * 50) + 1;
		while(i<numerosOrdenados.length) {
			numeroAleatorio=(int) (Math.random() * 50) + 1;
			if(numeroAleatorio>=numerosOrdenados[i-1]) {
				numerosOrdenados[i]=numeroAleatorio;
				i++;
			}
		}
		for(i=0; i<numerosOrdenados.length;i++)
			System.out.println("En la posicion "+i+" está el número "+numerosOrdenados[i]);
	}

}

package ejerciciosPseudocodigosIII;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long acumulador=1,i=1;
		final int MULT_HASTA=20;
		while(i<=MULT_HASTA) {
			acumulador=acumulador*i;
			i++;
		}
		System.out.println("La multiplicacion de los números desde el 1 hasta "+MULT_HASTA+" es "+acumulador);
	}

}

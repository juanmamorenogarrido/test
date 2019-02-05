package ejerciciosPseudocodigosIII;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SUMA_HASTA=20;
		int acumulador=0,i=1;
		while(i<=SUMA_HASTA) {
			acumulador=acumulador+i;
			i++;
		}
		System.out.println("La suma de los números desde el 1 hasta el "+SUMA_HASTA+" es: "+acumulador);
	}

}

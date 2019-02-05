package ejerciciosPseudocodigosIII;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM_TOPE=20;
		int sumaPares=0,i=1, multiplicaImpares=1;
		
		while(i<=NUM_TOPE) {
			if(i%2==0) {
				sumaPares=sumaPares+i;
			}
			else {
				multiplicaImpares=multiplicaImpares*i;
			}
			i++;	
		}
		
		System.out.println("La suma de los números PARES desde el 1 hasta el "+NUM_TOPE+" es: "+sumaPares);
		System.out.println("Las multiplicaciones de los IMPARES desde el 1 al "+NUM_TOPE+" es: "+multiplicaImpares);
	}

}

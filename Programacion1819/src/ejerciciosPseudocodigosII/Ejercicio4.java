package ejerciciosPseudocodigosII;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA=0, numB=0, resto=0;
		System.out.println("Introduzca un n�mero entero");
		numA=Entrada.entero();
		System.out.println("Introduzca otro n�mero entero");
		numB=Entrada.entero();
		if(numA==numB) {
			System.out.println("Ambos n�meros son iguales por lo que son m�ltiplos mutuos");
		}
		else {
			resto=numA%numB;
			if(resto==0) {
				System.out.println("El n�mero "+numA+" es multiplo del n�mero "+numB);
			}
			else {
				System.out.println("El n�mero "+numA+" no es multiplo del n�mero "+numB);
			}
			if(resto==0) {
				System.out.println("El n�mero "+numB+" es multiplo del n�mero "+numA);
			}
			else {
				System.out.println("El n�mero "+numB+" no es multiplo del n�mero "+numA);
			}
		}
	}

}

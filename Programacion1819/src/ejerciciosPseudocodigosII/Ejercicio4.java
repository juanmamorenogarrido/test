package ejerciciosPseudocodigosII;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA=0, numB=0, resto=0;
		System.out.println("Introduzca un número entero");
		numA=Entrada.entero();
		System.out.println("Introduzca otro número entero");
		numB=Entrada.entero();
		if(numA==numB) {
			System.out.println("Ambos números son iguales por lo que son múltiplos mutuos");
		}
		else {
			resto=numA%numB;
			if(resto==0) {
				System.out.println("El número "+numA+" es multiplo del número "+numB);
			}
			else {
				System.out.println("El número "+numA+" no es multiplo del número "+numB);
			}
			if(resto==0) {
				System.out.println("El número "+numB+" es multiplo del número "+numA);
			}
			else {
				System.out.println("El número "+numB+" no es multiplo del número "+numA);
			}
		}
	}

}

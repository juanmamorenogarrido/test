package ejerciciosPseudocodigosII;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroA=0, numeroB=0;
		System.out.println("Escribe un número");
		numeroA=Entrada.entero();
		System.out.println("Escribe otro número");
		numeroB=Entrada.entero();
		if(numeroA%numeroB==0) {
			System.out.println("El número "+numeroA+" es multiplo de "+numeroB);
		}
		else {
			System.out.println("El número "+numeroA+" no es multiplo de "+numeroB);
		}
	}

}

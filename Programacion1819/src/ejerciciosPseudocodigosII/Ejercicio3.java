package ejerciciosPseudocodigosII;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroA=0, numeroB=0;
		System.out.println("Escribe un n�mero");
		numeroA=Entrada.entero();
		System.out.println("Escribe otro n�mero");
		numeroB=Entrada.entero();
		if(numeroA%numeroB==0) {
			System.out.println("El n�mero "+numeroA+" es multiplo de "+numeroB);
		}
		else {
			System.out.println("El n�mero "+numeroA+" no es multiplo de "+numeroB);
		}
	}

}

package ejerciciosPseudocodigosIII;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Introduzca un número");
		num=Entrada.entero();
		while(num!=0) {
			if(num%2==0) {
				System.out.println(num+" es un número PAR");
			}
			else {
				System.out.println(num+" es un número IMPAR");
			}
			System.out.println("Introduzca un número");
			num=Entrada.entero();
		}
		System.out.println("Has introducido un 0, Adiós");
	}

}

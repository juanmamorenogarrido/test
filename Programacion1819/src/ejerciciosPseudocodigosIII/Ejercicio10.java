package ejerciciosPseudocodigosIII;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("Introduzca un n�mero");
		num=Entrada.entero();
		while(num!=0) {
			if(num%2==0) {
				System.out.println(num+" es un n�mero PAR");
			}
			else {
				System.out.println(num+" es un n�mero IMPAR");
			}
			System.out.println("Introduzca un n�mero");
			num=Entrada.entero();
		}
		System.out.println("Has introducido un 0, Adi�s");
	}

}

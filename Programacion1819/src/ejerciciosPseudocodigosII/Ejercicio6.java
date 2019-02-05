package ejerciciosPseudocodigosII;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		System.out.println("Introduzca un número entero entre 0 y el 9999");
		numero=Entrada.entero();
		if(numero>=0 && numero<=9999) {
			if(numero>=1000) {
				System.out.println("Tiene 4 cifras");
			}
			else {
				if(numero>=100) {
					System.out.println("Tiene 3 cifras");
				}
				else {
					if(numero>=10) {
						System.out.println("Tiene 2 cifras");
					}
					else {
						System.out.println("Tiene 1 cifra");
					}
				}
			}
		}
	}

}

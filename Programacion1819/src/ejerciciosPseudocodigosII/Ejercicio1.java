package ejerciciosPseudocodigosII;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=0;
		System.out.println("Introduce un n�mero");
		num=Entrada.real();
		if(num>0) {
			System.out.println("El n�mero es positivo");
		}
		else {
			if(num==0) {
				System.out.println("El n�mero es cero");
			}
			else {
				System.out.println("El n�mero es negativo");
			}
		}
	}

}

package ejerciciosPseudocodigosIII;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, i=0;
		System.out.println("Introduzca un n�mero");
		num=Entrada.entero();
		while(num>0) {
			i++;
			System.out.println("Introduzca otro n�mero");
			num=Entrada.entero();
		}
		System.out.println("Ha escrito un n�mero negativo o un 0");
		System.out.println("Ha escrito "+i+" n�meros positivos.");
	}

}

package ejerciciosPseudocodigosIII;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, suma=0;
		do {
			suma=suma+num;
			System.out.println("Introduzca un número");
			num=Entrada.entero();
		}while(num>=0);
		System.out.println("La suma de todos los números es: "+suma);
	}

}

package ejerciciosJAVA;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numUsuario = 0, unidades = 0, decenas = 0, centenas=0, suma=0, i=0,
				acumuladorUnidades=1, acumuladorDecenas = 1, acumuladorCentenas = 1;
		System.out.println("Introduce un número de tres cifras");
		numUsuario = Entrada.entero();

		unidades = numUsuario % 10;
		decenas = (numUsuario / 10) % 10;
		centenas = numUsuario / 100;
		while (suma != numUsuario && suma>=i) {
			suma = 0;
			suma = acumuladorUnidades + acumuladorDecenas + acumuladorCentenas;
			acumuladorUnidades = acumuladorUnidades * unidades;
			acumuladorDecenas = acumuladorDecenas * decenas;
			acumuladorCentenas = acumuladorCentenas * centenas;
			i++;
		}
		if (suma == numUsuario) {
			System.out.println("El número " + numUsuario + " es un número Amstrong");
		} else {
			System.out.println("El número " + numUsuario + " no es un número Amstrong");
		}
	}

}

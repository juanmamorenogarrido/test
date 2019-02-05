package ejerciciosJAVA;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, i=0, numFilas=0;
		System.out.println("Introduce el número de filas que quieres tener");
		numFilas=Entrada.entero();
		while(num<numFilas) {
			while(i<=num) {
				System.out.print("*");
				i++;
			}
			i=0;
			num++;
			System.out.println(" ");
		}
	}

	}


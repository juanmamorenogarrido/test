package masEjerciciosJava;

public class NumerosPrimos {

	public static void main(String[] args) {
		int numero=0, i=2;
		
		System.out.println("Introduzca un numero");
		numero=Entrada.entero();
		
		while(i<=(numero/2) && numero%i!=0) {
			i++;
		}
		if(i>numero/2) {
			System.out.println("numero primo");
		}
		else {
			System.out.println("numero NO primo");
		}

	}

}

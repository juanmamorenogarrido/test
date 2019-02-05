package ejerciciosJAVA;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numColumnas=0, i=0;
		final int NUMFILAS=5;
		while(numColumnas<NUMFILAS) {
			while(i<=numColumnas) {
				System.out.print("*");
				i++;
			}
			i=0;
			numColumnas++;
			System.out.println(" ");
		}
	}

}


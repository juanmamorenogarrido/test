package masEjerciciosFunciones;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numeroTuplas=0;
		System.out.println("Introduzca el número de tuplas");
		numeroTuplas=Entrada.entero();
		numerosPrimosGemelos(numeroTuplas);

	}
	
	public static boolean esPrimo(int numero) {
		int i=2;
		boolean primo;
		while(i<=(numero/2) && numero%i!=0) {
			i++;
		}
		if(i>numero/2) {
			primo=true;	
		}
		else {
			primo=false;
		}
		return primo;
	}
	public static int siguientePrimo (int numero) {
		numero++;
		while(!esPrimo(numero)) {
			numero++;
		}
		return numero;
	}
	public static void numerosPrimosGemelos(int numeroTuplas) {
		int primo1=1, primo2=1;
		while(numeroTuplas!=0) {
			primo2=siguientePrimo(primo2);
			if(primo2-primo1==2) {
				System.out.println("("+primo1+","+primo2+")");
				numeroTuplas--;
			}
			primo1=primo2;
		}
	}
	
}

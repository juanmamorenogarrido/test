package funcionesRecursivasEjemplosYEjercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero=0;
		System.out.println("Introduce un número");
		numero=Entrada.entero();
		imprimeCifrasNumero(numero);
		
	}
	public static void imprimeCifrasNumero(int num) {
		int cifra=0, restoNumero=0;
		
		if(num<10) {//caso base 
			System.out.print(num);
		}
		else {//caso recursivo
			cifra=num%10;
			restoNumero=num/10;
			imprimeCifrasNumero(restoNumero);
			System.out.print(" "+cifra);
		}
			
	}

}

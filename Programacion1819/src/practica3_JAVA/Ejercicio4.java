package practica3_JAVA;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numero=0, i=0, j=0;
		
		
		while (numero<5 || numero%2==0) {
			System.out.println("Introduce un número impar mayor o igual a 5");
			numero=Entrada.entero();}
		
			while(i<numero) {
				while(j<numero) {
					if(i==0 || i==numero/2 || i==numero-1 || (i+j+1==numero)  ) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
					j++;
					
				}
				j=0;
				System.out.println(" ");
				i++;
			}
		
	
		}
	

}

package masEjerciciosJava;


public class Ejercicio1Examen {

	public static void main(String[] args) {
int numero=0, i=0, j=0;
		
		
		while (numero<10 || numero%2==0) {
			System.out.println("Introduce un número impar mayor o igual a 10");
			numero=Entrada.entero();}
		
			while(i<numero) {
				while(j<numero) {
					if(i==0 || i==numero/2 || i==numero-1 || (i+j+1==numero) || i==j || j==0 || j==numero-1 || j==numero/2) {
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



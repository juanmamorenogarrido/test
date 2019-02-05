package practica3_JAVA;

public class Ejercicio2 {

	public static void main(String[] args) {
	int numeroTablas=0, numeroHastaLlegar=0, i=1, j=1, z=2, numeroCifras=0;
	boolean primo=true;
	
	System.out.println("¿Hasta qué número desea hacer las tablas de multiplicar?");
	numeroTablas=Entrada.entero();
	System.out.println("Hasta qué número quierer llegar a multiplicar los números?");
	numeroHastaLlegar=Entrada.entero();
	
	while(i<=numeroTablas) {
		
		while(j<=numeroHastaLlegar) {
			while(z<=(i/2) && i%z!=0) {
			z++;
			}
			if(z>i/2) {
				primo=true;
			}
			else {
				primo=false;
			}
			if(primo) {
				numeroCifras=i*j;
				if(numeroCifras<10) {
					System.out.print(j+" x "+i+" = "+i*j+"   \t");
				}
				
				if(numeroCifras<100 && numeroCifras>9) {
					System.out.print(j+" x "+i+" = "+i*j+"  \t");
				}
				
				if(numeroCifras<1000 && numeroCifras>99) {
					System.out.print(j+" x "+i+" = "+i*j+" \t");
				}
				
				if(numeroCifras>999)
					System.out.print(j+" x "+i+" = "+i*j);
				}
				
				j++;
				z=2;
			}
		j=1;
		i++;
		if(primo) {
			System.out.println(" ");

		}
		}
	}
}
	



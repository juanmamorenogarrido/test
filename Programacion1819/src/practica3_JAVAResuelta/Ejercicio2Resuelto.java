package practica3_JAVAResuelta;

public class Ejercicio2Resuelto {
	public static void main(String[] args) {
		
		int num=0,llegarHasta=0,i=2;
				
		System.out.println("Introduzca hasta qué número quiere hacer las tablas de multiplicar");
		num=Entrada.entero();
		
		System.out.println("Introduzca hasta qué número quiere llegar a multiplicar los números");
		llegarHasta=Entrada.entero();
		
		for(int posiblePrimo=1;posiblePrimo<=llegarHasta;posiblePrimo++) {
			
			while(i<=(posiblePrimo/2) && posiblePrimo%i!=0)
				i++;
			
			if(i>(posiblePrimo/2)) {
				for(int j=1;j<=num;j++)
					if(j*posiblePrimo<10)					
						System.out.print(j+"*"+posiblePrimo+"="+(j*posiblePrimo)+"   \t");
					else if(j*posiblePrimo<100)
						System.out.print(j+"*"+posiblePrimo+"="+(j*posiblePrimo)+"  \t");
					else if(j*posiblePrimo<1000)
						System.out.print(j+"*"+posiblePrimo+"="+(j*posiblePrimo)+" \t");
					else if(j*posiblePrimo<10000)
						System.out.print(j+"*"+posiblePrimo+"="+(j*posiblePrimo)+"\t");
				
				System.out.println();
				i=2;
			}
		
		}
	}
}

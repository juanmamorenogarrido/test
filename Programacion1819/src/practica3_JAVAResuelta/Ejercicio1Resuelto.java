package practica3_JAVAResuelta;

public class Ejercicio1Resuelto {
	public static void main(String[] args) {
		int numCifras=0,i=1;
		long numero=0;
		String cifraAnterior="AAAAAA",cifra=" ";
		
		System.out.println("¿De cuantas cifras quieres construir el número?");
		numCifras=Entrada.entero();
		
		System.out.println("\nIntroduzca cifra: ");
		cifra=Entrada.cadena().toUpperCase();
		
		switch(cifra){
			case "UNO": numero=1;break;
			case "DOS": numero=2;break;
			case "TRES": numero=3;break;
			case "CUATRO": numero=4;break;
			case "CINCO": numero=5;break;
			case "SEIS": numero=6;break;
			case "SIETE": numero=7;break;
			case "OCHO": numero=8;break;
			case "NUEVE": numero=9;break;
			case "CERO": numero=0;break;
		}
	
		System.out.println("\nPRIMERA CIFRA INTRODUCIDA es: "+cifra);
		System.out.println("Su número parcialmente es: "+numero);
		cifraAnterior=cifra;
		
		
		
		while(i<numCifras)
		{
			System.out.println("\nIntroduzca cifra: ");
			cifra=Entrada.cadena().toUpperCase();
			
			if(cifra.compareTo(cifraAnterior)>=0) {
				switch(cifra){
					case "UNO": numero=1*(long)(Math.pow(10, i))+numero;break;
					case "DOS": numero=2*(long)(Math.pow(10, i))+numero;break;
					case "TRES": numero=3*(long)(Math.pow(10, i))+numero;break;
					case "CUATRO": numero=4*(long)(Math.pow(10, i))+numero;break;
					case "CINCO": numero=5*(long)(Math.pow(10, i))+numero;break;
					case "SEIS": numero=6*(long)(Math.pow(10, i))+numero;break;
					case "SIETE": numero=7*(long)(Math.pow(10, i))+numero;break;
					case "OCHO": numero=8*(long)(Math.pow(10, i))+numero;break;
					case "NUEVE": numero=9*(long)(Math.pow(10, i))+numero;break;
				}
				
				System.out.println("\nCIFRA VÁLIDA porque la cadena introducida antes fue "+cifraAnterior+" y es menor o igual que "+cifra);
				System.out.println("Su número parcialmente es: "+numero);
				cifraAnterior=cifra;
				i++;
			}
			else {
				System.out.println("\nCIFRA NO VÁLIDA porque la cadena introducida antes fue "+cifraAnterior+" y es mayor que "+cifra);
				System.out.println("Su número parcialmente es: "+numero);
			}
		}
		
		System.out.println("\n\nSu número completo es: "+numero);
	}
}
